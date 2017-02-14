package org.cs362.dominion;

import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.TreeMap;



public class GameState {
    public List<Player> players = new ArrayList<Player>(); ;
    public final List<Card> cards ;
    public HashMap<Card, Integer> gameBoard = new HashMap<Card, Integer>();
    public HashMap<Card, Integer> embargoes = new HashMap<Card, Integer>();
    public Random rand = new Random();


    public GameState(List<Card> cards) {
        this.cards=cards;

    }
    public void addPlayer(Player player) {
        players.add(player);
    }

	   /*	   initializing all supplies, and shuffling deck and
	   drawing starting hands for all players.  Check that 10 cards selected
	   are in fact (different) kingdom cards, and that numPlayers is valid.*/

    public void initializeGame() {




        //initialize supply

        //check number of players
        if (players.size() > 2 || players.size() < 2)
        {
            System.err.println("the number of players mus be between 2 and 4 ");
            return ;
        }
        //initialize supply for only two players
        int selectedKindom=0;
        int Kingdom_Cards_Selected=10;// We only defined Adventurer, smithy, and Village. We need to define more kingdom cards the Card class
        // we should change 3 to the  exact of the number of
        //kingdom cards. look at the requirements of the assignment-1
        while (selectedKindom < Kingdom_Cards_Selected) {
            //int random = (int)  Randomness.random.nextInt(cards.size());//
            int random = rand.nextInt(cards.size());
            Card tmp = cards.get(random);
            if(tmp.getType()!=Card.Type.ACTION) continue;
            if(gameBoard.containsKey(tmp)) continue;
            gameBoard.put(tmp, 10);
            embargoes.put(tmp, 0);
            selectedKindom++;
        }
        //set number of Curse cards the default number of players is 2
        gameBoard.put(Card.getCard(cards, Card.CardName.Curse), 10);
        embargoes.put(Card.getCard(cards, Card.CardName.Curse), 0);

        //set number of Victory cards
        gameBoard.put(Card.getCard(cards, Card.CardName.Province), 8);
        gameBoard.put(Card.getCard(cards, Card.CardName.Duchy), 8);
        gameBoard.put(Card.getCard(cards, Card.CardName.Estate), 8);
        //set number of Treasure cards
        gameBoard.put(Card.getCard(cards, Card.CardName.Gold), 30);
        gameBoard.put(Card.getCard(cards, Card.CardName.Silver), 40);
        gameBoard.put(Card.getCard(cards, Card.CardName.Copper), 46);

        //set number of Victory card embargoes
        embargoes.put(Card.getCard(cards, Card.CardName.Province), 0);
        embargoes.put(Card.getCard(cards, Card.CardName.Duchy), 0);
        embargoes.put(Card.getCard(cards, Card.CardName.Estate), 0);
        //set number of Treasure card embargoes
        embargoes.put(Card.getCard(cards, Card.CardName.Gold), 0);
        embargoes.put(Card.getCard(cards, Card.CardName.Silver), 0);
        embargoes.put(Card.getCard(cards, Card.CardName.Copper), 0);


        for (Player player : players) {
            for (int i = 0; i < 7; i++)
                player.gain(Card.getCard(cards, Card.CardName.Copper));
            for (int i = 0; i < 3; i++)
                player.gain(Card.getCard(cards,Card.CardName.Estate));

            player.initializePlayerTurn();
        }



    }

    public HashMap<Player, Integer>  play() {

        int turn =0;
        while (!isGameOver()) {
            turn++;
            for (Player player : players) {
                System.out.println("Player: "+ player.player_username + " is playing");
                for(Card c: player.hand){
                    System.out.println(c.toString());
                }
                //player p plays action card
                player.playKingdomCard();
                //player plays treasure card
                player.playTtreasureCard();
                System.out.println("left in hand:");
                for(Card c: player.hand){
                    System.out.println(c.toString());
                }
                System.out.println("played this turn:");
                for(Card c: player.playedCards){
                    System.out.println(c.toString());
                }
                //player buy cards
                player.buyCard();
                //player ends turn
                player.endTurn();
            }
            if(turn==3)
                break;
        }
        return this.getWinners();
    }
    public boolean isGameOver() {
        //if stack of Province cards is empty, the game ends
        if((gameBoard.get(Card.getCard(cards, Card.CardName.Province))==null)||(gameBoard.get(Card.getCard(cards, Card.CardName.Province))== 0))
            return true;
        //if three supply pile are at 0, the game ends
        int emptySupplyPile = 0;
        for (int i : gameBoard.values()){
            if (i == 0)
                emptySupplyPile++;
            if ( emptySupplyPile >= 3)
            {
                return true;
            }
        }
        return false;
    }

    /* Set HashMap  of each player and the score (remember ties!) */
    public HashMap<Player, Integer>  getWinners() {
        HashMap<Player, Integer> playerScore = new HashMap<Player, Integer>();

        //get score for each player
        for (Player p : players) {
            int score = p.scoreFor();
            playerScore.put(p, score);
        }

        return playerScore;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        if (gameBoard.isEmpty())
            sb.append("The board game is embty you need to intialize the game!!!!");
        else {
            for (Player player : players)
                sb.append(" --- " + player.toString() + "\n");
            sb.append(" --- gameBoard --- \n");
            sb.append("Cards on the table: \n");
            sb.append("Card Name \t\t NumberCards: \n");
            Map<Card, Integer> treeMap = new TreeMap<Card, Integer>(gameBoard);
            for (Card card : treeMap.keySet())
                sb.append("\t " + card.getCardName() + "\t\t "
                        + treeMap.get(card) + "\n");
        }
        return sb.toString();
    }

}
