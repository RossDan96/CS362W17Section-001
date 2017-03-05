package org.cs362.dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.TreeMap;




//struct gameState {
//	  int numPlayers; //number of players
//	  int supplyCount[treasure_map+1];  //this is the amount of a specific type of card given a specific number.
//	  int embargoTokens[treasure_map+1];
//	  int outpostPlayed;
//	  int outpostTurn;
//	  int whoseTurn;
//	  int phase;
//	  int numActions; /* Starts at 1 each turn */
//	  int coins; /* Use as you see fit! */
//	  int numBuys; /* Starts at 1 each turn */
//	  int hand[MAX_PLAYERS][MAX_HAND];
//	  int handCount[MAX_PLAYERS];
//	  int deck[MAX_PLAYERS][MAX_DECK];
//	  int deckCount[MAX_PLAYERS];
//	  int discard[MAX_PLAYERS][MAX_DECK];
//	  int discardCount[MAX_PLAYERS];
//	  int playedCards[MAX_DECK];
//	  int playedCardCount;
//	};

public class GameState implements Cloneable{
	   public List<Player> players = new ArrayList<Player>(); ;
	   public List<Card> Supply;
	   public HashMap<Card, Integer> gameBoard = new HashMap<Card, Integer>();	
	   public List<Card> onBoard = new ArrayList<Card>();
	   public List<Card> trashPile = new ArrayList<Card>();
	   public HashMap<Card, Integer> embargoed = new HashMap<Card, Integer>();

	   public GameState(List<Card> Supply) {
		   this.Supply=Supply;
		   
	   }
	   public void addPlayer(Player player) {
		      players.add(player);
	   }   

	   /*	   initializing all supplies, and shuffling deck and
	   drawing starting hands for all players.  Check that 10 cards selected
	   are in fact (different) kingdom cards, and that numPlayers is valid.*/
	   
	   public void initializeGame(){		

			      //initialize supply 
			   //check number of players
			   if (players.size() > 4 || players.size() < 2)
			    {
				   System.err.println("the number of players must be between 2 and 4 ");
			      return ;
			    }
			  // System.out.println("Initialization Start"); 
				
			 //initialize supply for only two players
				  int selectedKindom=0;
				   int Kingdom_Cards_Selected=13;// We only defined Adventurer, smithy, and Village. We need to define more kingdom cards the Card class
				   								// we should change 3 to the  exact of the number of 
				   								//kingdom cards. look at the requirements of the assignment-1
		      while (selectedKindom < Kingdom_Cards_Selected) {
			         int random = (int)  Randomness.random.nextInt(Supply.size()-7);//
			         random += 7;
			        //System.out.println(random); 
			         Card tmp = Supply.get(random);
			         if(gameBoard.containsKey(tmp)) continue;
			         gameBoard.put(tmp, 10);
			         selectedKindom++;
			      }
		        //set number of Curse cards the default number of players is 2			   
		      gameBoard.put(Card.getCard(Supply, Card.CardName.Curse), 10);
		      
		      //set number of Victory cards
		      gameBoard.put(Card.getCard(Supply, Card.CardName.Province), 8);
		      gameBoard.put(Card.getCard(Supply, Card.CardName.Duchy), 8);
		      gameBoard.put(Card.getCard(Supply, Card.CardName.Estate), 8);
		    //set number of Treasure cards
		      gameBoard.put(Card.getCard(Supply, Card.CardName.Gold), 30);
		      gameBoard.put(Card.getCard(Supply, Card.CardName.Silver), 40);
		      gameBoard.put(Card.getCard(Supply, Card.CardName.Copper), 46);
			

			  onBoard = new ArrayList<Card>(gameBoard.keySet());

			  embargoed.putAll(gameBoard);
			  Integer zero = new Integer(0);
			  for(Card k : embargoed.keySet()){
				  embargoed.replace(k, zero);
			  }


		      for (Player player : players) {
			         for (int i = 0; i < 7; i++)
			            player.gain(Card.getCard(Supply, Card.CardName.Copper));
			         for (int i = 0; i < 3; i++)
			            player.gain(Card.getCard(Supply,Card.CardName.Estate));
			         
			         player.initializePlayerTurn();
			      }
 
	   }
	   
	   public void updateBoard(){
		   Integer numLeft;
		   for (int i = 0; i < gameBoard.size(); i++){
			    numLeft = gameBoard.get(onBoard.get(i));
				if (numLeft == null) {
					System.err.println("Empty Hash in gameBoard");
					return;
				} else if (numLeft.intValue() == 0) {
					gameBoard.remove(onBoard.get(i));
					onBoard.remove(i);
					embargoed.remove(i);
					i--;
				}
		   }
		   return;
	   }
	   
	   public void  loseCard(Card card) {
		   //	System.out.println("LOSE Card called ");
		      if(gameBoard.containsKey(card)){
				  Integer numPile = gameBoard.get(card);
				  System.out.println("numPile: " + numPile.intValue());
				  gameBoard.replace(card,(numPile.intValue() - 1));
		      }else{
		    	  System.out.println("That pile is empty.");
		      }
			  this.updateBoard();
		   	 return;
		   }
	   
	   public HashMap<Player, Integer>  play() {
			 
		   	  int turn =0;	
		      while (!isGameOver()) {
		    	  turn++;
		         for (Player player : players) {
		        	 	System.out.println("Player: "+ player.player_username + " is playing");
		   				//player p plays action card
		        	 	player.playKingdomCard();
		        	 	//player plays treasure card
		   			    player.playTreasureCard();
		   			    //player buy cards
		        	    player.buyCard();
		        	  //player ends turn
		        	    player.endTurn();
		         }
		         if(turn==400){
		        	 System.out.println("That's 400 turns");
		        	 break;
		         }

		      }
		      return this.getWinners();
		   }
	   public boolean isGameOver() {
		 //if stack of Province cards is empty, the game ends
		   if((this.gameBoard.get(Card.getCard(Supply, Card.CardName.Province))==null)||(this.gameBoard.get(Card.getCard(Supply, Card.CardName.Province))== 0))
			   return true;
		 //if three supply pile are at 0, the game ends
		      if(this.onBoard.size() == 17)
		    	  return true;
		    	  
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
			sb.append("The board game is empty you need to intialize the game!!!!");
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
	   /*
	   private GameState(List<Card> Supply, List<Player> players, HashMap<Card, Integer> gameBoard) {
		   this.Supply=Supply;
		   this.players=players;
		   this.gameBoard=gameBoard;
		   
	   }*/

	   public GameState clone() throws CloneNotSupportedException {
		   List<Player> clonePlayers = new ArrayList<Player>();
		   List<Card> cloneCards = new ArrayList<Card>();
		   HashMap<Card, Integer> cloneGmeBoard = new HashMap<Card, Integer>();	
		   List<Card> cloneTrashPile = new ArrayList<Card>();
		   HashMap<Card, Integer> cloneEmbargoed = new HashMap<Card, Integer>();
		   for (Card card : Supply) 
		    	cloneCards.add((Card) card.clone());
		   final GameState cloneState = new GameState(cloneCards);
		    for (Player player : players) 
		    	clonePlayers.add((Player) player.clone(cloneState));
		    cloneGmeBoard.clear();
		    for (Card card : gameBoard.keySet()){
		    	//System.out.println("gameBoard.get(card) "+ gameBoard.get(card).intValue());
		    	//System.out.println("(Card) card.clone() "+ ((Card) card.clone()).toString());
		    	Card clonedCard = (Card) card.clone();
		    	Integer clonedInt = gameBoard.get(card);
		     	cloneGmeBoard.put(clonedCard, clonedInt);
		    	//System.out.println("clonegameBoard.get(card) "+ cloneGmeBoard.get(clonedCard).intValue());
		    	//System.out.println("(Card) card.clone() "+ (clonedCard).toString());
		    }
		   
		    for (Card card : trashPile)
		    	cloneTrashPile.add((Card) card.clone());
		    for (Card card : embargoed.keySet())
		    	cloneEmbargoed.put((Card) card.clone(),embargoed.get(card));
		    
		    
		    cloneState.players.addAll(clonePlayers);
		    List<Card> cloneOnBoard = new ArrayList<Card>();
		    for (Card card : cloneGmeBoard.keySet()){
			  //  System.out.println("cloneGmeBoard ints"+ cloneGmeBoard.get(card).intValue());
			    cloneOnBoard.add(card);
		    }
		    
		    //List<Card> cloneOnBoard = new ArrayList<Card>(cloneGmeBoard.keySet());
		    
		    cloneState.gameBoard.putAll(cloneGmeBoard);
			cloneState.onBoard.addAll(cloneOnBoard);
			cloneState.trashPile.addAll(cloneTrashPile);
			cloneState.embargoed.putAll(cloneEmbargoed);
			System.out.println("Player 1: "+ cloneState.players.get(0).player_username);
			System.out.println("Player 2: "+ cloneState.players.get(1).player_username);
	        return  cloneState;
	    }
}
