package org.cs362.dominion;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.cs362.dominion.Card.CardName;
import org.cs362.dominion.Card.Type;

public class Player implements Cloneable{
	List<Card> hand = new ArrayList<Card>();// int hand[MAX_PLAYERS][MAX_HAND];
	LinkedList<Card> deck = new LinkedList<Card>();// int
													// deck[MAX_PLAYERS][MAX_DECK];
	List<Card> discard = new ArrayList<Card>(); // int
												// discard[MAX_PLAYERS][MAX_DECK];
	List<Card> playedCards = new ArrayList<Card>();

	String player_username;

	int numActions;
	int numBuys;
	int coins;

	   final GameState gameState;

	
	public Player(GameState gameState,String player_username) {
		this.player_username = player_username;
		this.gameState=gameState;
	}



	final Card drawCard() {
		if (deck.isEmpty()) {// Deck is empty
			// Step 1 Shuffle the discard pile back into a deck
			System.out.println("reshuffle the deck of the player "
					+ player_username + " to draw FIVE cards");
			while (discard.size() > 0) {
				int ndx = (int) Randomness.nextRandomInt(discard.size());
				// Move discard to deck
				deck.add(discard.remove(ndx));
			}
		}

		Card toDraw = deck.poll();
		hand.add(toDraw);// Add card to hand and hand count automatically will
							// be incremented since we use List
		System.out.println(this.player_username + " draws " + toDraw);
		Collections.sort(hand);
		return toDraw;
	}
	
	   final void initializePlayerTurn() {
		   //initialize first player's turn
//		   state->numnumActions = 1;
//		   state->numnumBuys = 1;
		      numActions = 1;
		      coins = 0;
		      numBuys = 1;
		      //Shuffle your starting 10 cards (7 Coppers & 3 Estates) and place them face-down as your Deck. Draw the top
		      //5 cards as your starting hand
		      for (int i = 0; i < 5; i++) {
		    	  drawCard();
		      }
		   }

	 //card goes in discard,
	   final boolean gain(Card card) {
		     if(gameState.gameBoard.containsKey(card)){
				  Integer numPile = gameState.gameBoard.get(card);
				  System.out.println("numPile: " + numPile.intValue());
				  gameState.gameBoard.replace(card,(numPile.intValue() - 1));
			      discard.add(card);
		      }else{
		    	  System.out.println("The " + card.getCardName() + " pile is empty.");
				  return false;
		      }
		      System.out.println(this.player_username+" gains "+ card.toString());
		      return true;
		   }		   
		 //Discard hand
	   public void discard(Card card) {
		     hand.remove(card);
		      discard.add(card);
		      System.out.println(player_username+" discards "+card);
		   }
	   public void trash(Card card) {
		      gameState.trashPile.add(card);
		      hand.remove(card);
		      System.out.println(player_username+" trashes "+card);
		   }
	   public void playKingdomCard() {
		      while (numActions > 0) {
		         List<Card> actionCards = Card.filter(hand, Type.ACTION);
		   
		         if (actionCards.size() == 0)
		            return;
		         
		         Card c = (Card)actionCards.get(0);
		         if (c == null)
			           return;
		         System.out.println("Player.actionPhase Card:" + c.toString());

			      playedCards.add(c);
			      numActions -= 1;

			      c.play(this, gameState);
				  gameState.updateBoard();
		      }
		   }
	   final int scoreFor() { 
		   int score = 0;
		   //score from hand
		      for (Card c : hand){
		    	  score += c.score();
		    	  if(c.equals(Card.getCard(gameState.Supply, CardName.Gardens))){
		    		  score += ((this.deck.size() + this.discard.size() + this.hand.size())/10);
		    	  }
		      }

		      //score from discard
		      for (Card c : discard){
		    	  score += c.score();
		    	  if(c.equals(Card.getCard(gameState.Supply, CardName.Gardens))){
		    		  score += ((this.deck.size() + this.discard.size() + this.hand.size())/10);
		    	  }
		      }
		      //score from deck
		      for (Card c : deck){
		    	  score += c.score();
		    	  if(c.equals(Card.getCard(gameState.Supply, CardName.Gardens))){
		    		  score += ((this.deck.size() + this.discard.size() + this.hand.size())/10);
		    	  }
		      }

		      return score;
	   }  

	   public int lowestCost(List<Card> list){
		   int min = 10;
		   for (int i = 0; i < list.size(); i++){
				if (min > list.get(i).getCost()){
					min = list.get(i).getCost();
				}
		   }
		   return min;
	   }	   
	   
	   public void playTreasureCard() {
		   System.out.println(" --- --------------------------- --- ");
    		System.out.println("TO-DO playTreasureCard "); 
    		System.out.println(" --- --------------------------- --- ");
			List<Card> treasureCards = Card.filter(hand, Type.TREASURE);
		         if (treasureCards.size() == 0)
		            return;
		         while (treasureCards.size()>0){
					 Card c = (Card)treasureCards.get(0);
					 if (c == null)
						   return;
					 System.out.println("Player.playTreasure Card:" + c.toString());
					  hand.remove(c);
					  treasureCards.remove(c);
					  playedCards.add(c);
					  coins += c.getTreasureValue();
				 }
			discard.addAll(Card.filter(playedCards, Type.TREASURE));
	   }
	   public void buyCard() {
		   System.out.println(" --- --------------------------- --- ");
   			System.out.println("TO-DO buyCard "); 
   			System.out.println(" --- --------------------------- --- ");
			Card c = Randomness.randomMember(gameState.onBoard);
			if(Randomness.nextChoice10()){
				System.out.println("numBuys: " + numBuys);
				while(numBuys > 0){
					if (c == null)
							   return;
					System.out.println("Player.buyCard Card:" + c.toString());
					if (c.getCost() <= coins){
						if((c.equals(Card.getCard(gameState.onBoard, CardName.Curse))) && (Randomness.nextChoice10())){
							System.out.println("Player opted to not buy a Curse");
							gameState.updateBoard();
							while(c.equals(Card.getCard(gameState.onBoard, CardName.Curse))){
								c = Randomness.randomMember(gameState.onBoard);
							}
							continue;
						}
						coins = (coins - c.getCost());
						Card curse = Card.getCard(gameState.onBoard, CardName.Curse);
						if(curse != null){
							System.out.println("Curses? "+ gameState.embargoed.get(c).intValue());
							for(int i=0; i < gameState.embargoed.get(c).intValue(); i++){
								gameState.loseCard(curse);
								gain(curse);
							}
						}else{
							System.out.println("There are no more curse cards to gain.");
						}

						gameState.loseCard(c);
						gain(c);
						numBuys--;
					}
					if((coins == 0)&&(numBuys>0)){
						System.out.println("Player can't afford to buy anything other than copper");
						gameState.updateBoard();
						c = Card.getCard(gameState.onBoard, CardName.Copper);
						continue;
					}
					if(coins < lowestCost(gameState.onBoard)){
						System.out.println("Player can't afford to buy anything");
						numBuys = 0;
					}
					gameState.updateBoard();
					c = Randomness.randomMember(gameState.onBoard);
				}	
			}else{
				System.out.println("Player opted to not buy anything");
			}
			gameState.updateBoard();
	   }
	   final void endTurn() {
		   System.out.println(" --- --------------------------- --- ");
  			System.out.println("TO-DO endTurn "); 
  			System.out.println(" --- --------------------------- --- ");
			playedCards.clear();
			while (hand.size() > 0){
				discard(hand.get(0));
			}
			while (hand.size() < 5){
				drawCard();
			}
			numBuys = 1;
			coins = 0;
			numActions = 1;
	   }
	   
	   
	   public void printStateGame(){
		   System.out.println(" --- " + this.player_username + " --- ");
		   System.out.println(" --- --------------------------- --- ");
     		System.out.println(this.gameState.toString()); 
     		System.out.println(" --- --------------------------- --- ");
	   }
	   @Override
		public String toString() {
		     StringBuilder sb = new StringBuilder();
		     
       	 sb.append(" --- " + this.player_username + " --- ");
       	 sb.append(" --- --------------------------- --- ");

       	 sb.append("Hand: " + this.hand);
       	 sb.append("Discard: " + this.discard);
       	 sb.append("Deck: " + this.deck);
       	 sb.append("Played Cards: " + this.playedCards);
       	 sb.append("numActions: " + this.numActions);
       	 sb.append("coinss: " + this.coins);
       	 sb.append("numBuys: " + this.numBuys);
       	 sb.append("\n");     

		     return sb.toString();

		}
	   
	    protected Player clone(GameState cloneState) throws CloneNotSupportedException {
	    	Player clonePlayer= new Player(cloneState,("clone"+this.player_username));
	    	clonePlayer.hand = new ArrayList<Card>(hand);// int hand[MAX_PLAYERS][MAX_HAND];
			clonePlayer.deck = new LinkedList<Card>(deck);// int
															// deck[MAX_PLAYERS][MAX_DECK];
			clonePlayer.discard = new ArrayList<Card>(discard); // int
														// discard[MAX_PLAYERS][MAX_DECK];
			clonePlayer.playedCards = new ArrayList<Card>(playedCards);
			clonePlayer.coins = this.coins;
			clonePlayer.numActions = this.numActions;
			clonePlayer.numBuys = this.numBuys;
			return clonePlayer;
	    } 	   
}
