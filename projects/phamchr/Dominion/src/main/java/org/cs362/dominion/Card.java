package org.cs362.dominion;
import java.util.*;



public final class Card implements Comparable<Card>, Cloneable{
	public static enum Type {
		ACTION, TREASURE, VICTORY;
	}

	public static enum CardName {
		/** The Treasure cards */
		Gold, Silver, Copper, 
		/** The Victory cards */
		Province,Duchy,Estate,Curse,
		/** The Kingdom cards */
		Adventurer, Ambassador, Baron, Council_Room, Cutpurse, Embargo, Feast, Gardens, Great_Hall, Mine, Salvager, Smithy, Village;
	}
	/**
	 * @param enum CardName the name of the card (GOLD, SILVER, COPPER, 
	 * @param enum Type the type of the card (Victory, Treasure, or Kingdom
	 * @param int cost the cost of the card
	 * @param int score the score of the card, when the game is finished
	 * @param treasureValue  the treasure value of the treasure cards (cooper, silver, and gold cards)
	 */
	private final Type realType;
	private final CardName cardName;
	private final int cost, score, treasureValue;
	private Random generator = new Random();

	private Card(CardName cardName, Type type, int cost, int score, int treasureValue) {
		this.cost = cost;
		this.score = score;
		this.treasureValue = treasureValue;
		this.realType = type;
		this.cardName = cardName;
	}

	/**
	 * Returns the type
	 */
	public Type getType() {
		return realType;
	}

	/**
	 * Returns the cardName
	 */
	public CardName getCardName() {
		return cardName;
	}
	/**
	 * Returns the cost
	 */
	public int getCost() {
		return cost;
	}


	/**
	 * Returns the treasureValue
	 */
	public int getTreasureValue() {
		return treasureValue; 
	}
	public int score() { 
			return score; 
		}
	
	public static List<Card> createCards() {
		List<Card> ret = new LinkedList<Card>();

		/** The Treasure cards  */
		Card o = new Card(CardName.Gold, Type.TREASURE, 6, 0, 3);
		ret.add(o);
		o = new Card(CardName.Silver, Type.TREASURE, 3, 0, 2);
		ret.add(o);
		o = new Card(CardName.Copper, Type.TREASURE, 0, 0, 1);
		ret.add(o);

		/** The Victory cards  */ 
		o = new Card(CardName.Province,Type.VICTORY, 	8, 6, 0);
		ret.add(o);
		o = new Card(CardName.Duchy,Type.VICTORY,		5, 1, 0);
		ret.add(o);		
		o = new Card(CardName.Estate,Type.VICTORY,		2, 3, 0);
		ret.add(o);		
		o = new Card(CardName.Curse,Type.VICTORY,		0, -1, 0);
		ret.add(o);				
		/** The Kingdom cards , it should more than 10 cards*/ 	
		
		o = new Card(CardName.Salvager,Type.ACTION,4,0,0);
		ret.add(o);
		o = new Card(CardName.Adventurer,Type.ACTION,6,0,0);
		ret.add(o);
		o = new Card(CardName.Smithy,Type.ACTION,4,0,0);
		ret.add(o);	
		o = new Card(CardName.Village,Type.ACTION,3,0,0);
		ret.add(o);	
		o = new Card(CardName.Council_Room,Type.ACTION,5,0,0);
		ret.add(o);
		o = new Card(CardName.Feast,Type.ACTION,4,0,0);
		ret.add(o);
		o = new Card(CardName.Ambassador,Type.ACTION,3,0,0);
		ret.add(o);
		o = new Card(CardName.Baron,Type.ACTION,4,0,0);
		ret.add(o);
		o = new Card(CardName.Cutpurse,Type.ACTION,4,0,0);
		ret.add(o);
		o = new Card(CardName.Embargo,Type.ACTION,2,0,0);
		ret.add(o);
		o = new Card(CardName.Great_Hall,Type.ACTION,3, 1, 0);
		ret.add(o);
		o = new Card(CardName.Mine,Type.ACTION,5,0,0);
		ret.add(o);
		o = new Card(CardName.Gardens,Type.VICTORY,5,0,0);
		ret.add(o);
		return ret;
	}
	
	public void play(Player player, GameState state) {
		
		switch(this.cardName) {
		case Adventurer:
	    	  //Reveal cards from your deck until you reveal 2 Treasure cards. Put those Treasure cards into your hand and discard the other revealed cards.
	    	 
	    	  System.out.println("Reveal cards from the player deck until player reveal 2 Treasure cards. " +
	    	  		"Put those Treasure cards into player hand and discard the other revealed cards.");
	    	  int treasureCount = 0;
	    	  Iterator<Card> cards = player.deck.iterator();
	    	  while(cards.hasNext()){
	    		  Card obj = cards.next();
	    		  if(obj.getTreasureValue() != 0){
	    			  treasureCount++;
	    			  player.hand.add(obj);
	    			  cards.remove();
	    			  if (treasureCount == 2)
	    				  break;
	    		  } else {
	    			  System.out.println("Discarded: " + obj.getCardName());
	    			  player.discard(obj);
	    			  cards.remove();
	    		  }
	    	  }
			return;
			
		case Ambassador:
			//Return up to two cards of your hand 
			if (player.hand.size() > 0){
				if(getCard(player.hand, CardName.Curse) != null){
					System.out.println("Getting rid of one curse.");
					player.hand.remove(getCard(player.hand, CardName.Curse));
					//check again to throw away another curse
					if(getCard(player.hand, CardName.Curse) != null){
						System.out.println("Getting rid of one curse.");
						player.hand.remove(getCard(player.hand, CardName.Curse));
					}
				for(Player players: state.players){
					if(players != player){
						state.gameBoard.put(Card.getCard(state.cards, Card.CardName.Curse), state.gameBoard.get(Card.getCard(state.cards, Card.CardName.Curse)) - 1 );
						players.gain(getCard(state.cards, CardName.Curse));
					}
				}
				} else {
					Card card = player.hand.get(0);
					state.gameBoard.put(card, state.gameBoard.get(card) + 1);
					player.hand.remove(card);
					for(Player players: state.players){
						if(players != player){
							players.gain(card);
							state.gameBoard.put(card, state.gameBoard.get(card)-1);
						}
					}
				}
			}
			return;
			
		case Baron:
			player.numBuys++;
			if(getCard(player.hand, CardName.Estate) != null){
				player.discard(getCard(player.hand, CardName.Estate));
				player.coins += 4;
			} else {
				System.out.println("Gaining a Estate from Baron");
				player.gain(getCard(state.cards, CardName.Estate));
				state.gameBoard.put(getCard(state.cards, CardName.Estate), state.gameBoard.get(getCard(state.cards, CardName.Estate))-1);
			}
			return;
			
		case Council_Room:
			System.out.println("The player draw +4 cards, Everyone else draw +1");
			System.out.println("The player gets +1 buy");
			player.drawCard();
			player.drawCard();
			player.drawCard();
			player.numBuys++;
			for(Player everyone : state.players){
				everyone.drawCard(); 
			}
			return;
			
		case Cutpurse:
			player.coins += 2;
			for(Player players : state.players){
				players.discard(getCard(players.hand, CardName.Copper));
			}
			return;
			
		case Embargo:
			player.coins += 2;
			player.playedCards.remove(getCard(state.cards, CardName.Embargo));
			int rand = generator.nextInt(10);
			List<Card> holder = filter(state.cards, Type.ACTION);
			state.addEmbargo(holder.get(rand));
			return;
			
		case Feast:
			System.out.println("The player is now trashing this card for a card that costs 5 or less");
			player.playedCards.remove(getCard(player.playedCards, CardName.Feast));
			player.coins += 5;
			//Add a temp 5 gold
			//this should obtain instantly and then throw into discard, but would do it later.
			return;		
			
		case Great_Hall:
			player.coins++;
			player.numActions++;
			return;
			
		case Mine:
			if (player.hand.size() > 0){
				List<Card> treasures = filter(player.hand, Type.TREASURE);
				for(int i = 0; i < treasures.size(); i++){
					if(treasures.get(i).getCardName() == CardName.Copper){
						player.hand.remove(getCard(state.cards, CardName.Copper));
						player.gain(getCard(state.cards, CardName.Silver));
						state.gameBoard.put(getCard(state.cards, CardName.Silver), state.gameBoard.get(getCard(state.cards, CardName.Silver))-1);
						return;
					}
					if(treasures.get(i).getCardName() == CardName.Silver){
						player.hand.remove(getCard(state.cards, CardName.Silver));
						player.gain(getCard(state.cards, CardName.Gold));
						state.gameBoard.put(getCard(state.cards, CardName.Gold), state.gameBoard.get(getCard(state.cards, CardName.Gold))-1);
						return;
					}
				}
			}
			return;
			
		case Smithy:
	        player.drawCard();
	        player.drawCard();
	        player.drawCard();
			return;
			
		case Village:
	    	System.out.println("The player draw +1 Card.");
	    	System.out.println("The player gets +2 play Actions.");
	    	player.drawCard();
	    	player.numActions += 2;
			return;
			
		case Salvager:
			player.numBuys++;
			//randomly discard something
			int rando = generator.nextInt(player.hand.size());
			player.coins += player.hand.get(rando).getCost();
			player.hand.remove(rando);
			return;
			
		default: return;
		}
	}

	public static Card getCard(List<Card> cards,CardName cardName) {
		for(int i=0; i<cards.size();i++){
			if(cards.get(i).cardName.equals(cardName))
					return 	cards.get(i);
		}
		
		return null;
	}
		
		public static int getCardIndex(List<Card> cards,CardName cardName) {
			for(int i=0; i<cards.size();i++){
				if(cards.get(i).cardName.equals(cardName))
						return 	i;
			}
			
			return -1;
		
	}

	   public static List<Card> filter(Iterable<Card> cards, Type target) {
		      List<Card> out = new ArrayList<Card>();
		      for (Card c : cards)
		         if (c.getType() == target)
		            out.add(c);
		      return out;
		   }
	// this method will print out all the constant cards ENUM
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append(" \n\t" + this.getCardName());
//		sb.append("-" + this.getType() + " ");
//		sb.append("\t\t Cost: " + this.cost + " ");
//		sb.append("\t\t Score: " + this.score + " ");
//		sb.append("\tTreasure Value: " + this.treasureValue);

		return sb.toString();

	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!super.equals(obj)) return false;
		if(!(obj instanceof Card)) return false;

		return cardName.equals(((Card) obj).cardName);
	}

	@Override
	public int compareTo(Card o) {
		// TODO Auto-generated method stub
		return cardName.compareTo(o.cardName);
	}
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    } 

}
