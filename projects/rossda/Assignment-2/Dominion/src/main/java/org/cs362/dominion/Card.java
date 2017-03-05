package org.cs362.dominion;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


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
		Adventurer, Smithy, Ambassador, Baron, Council_Room, Cutpurse, Embargo, Feast, Gardens, Great_Hall, Mine, Remodel, Tribute;
	}
	/**
	 * @param enum CardName the name of the card (GOLD, SILVER, COPPER, 
	 * @param enum Type the type of the card (Victory, Treasure, or Kingdom
	 * @param int cost the cost of the card
	 * @param int score the score of the card, when the game is finished
	 * @param treasureValue  the treasure value of the treasure cards (Copper, silver, and gold cards)
	 */
	private final Type realType;
	private final CardName cardName;
	private final int cost, score, treasureValue;

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
		
		o = new Card(CardName.Adventurer,Type.ACTION,6,0,0);
		ret.add(o);
		o = new Card(CardName.Smithy,Type.ACTION,4,0,0);
		ret.add(o);	
		o = new Card(CardName.Ambassador,Type.ACTION,3,0,0);
		ret.add(o);	
		o = new Card(CardName.Baron,Type.ACTION,4,0,0);
		ret.add(o);
		o = new Card(CardName.Council_Room,Type.ACTION,5,0,0);
		ret.add(o);
		o = new Card(CardName.Cutpurse,Type.ACTION,4,0,0);
		ret.add(o);
		o = new Card(CardName.Embargo,Type.ACTION,2,0,0);
		ret.add(o);
		o = new Card(CardName.Feast,Type.ACTION,4,0,0);
		ret.add(o);
		o = new Card(CardName.Gardens,Type.VICTORY,4,0,0);
		ret.add(o);
		o = new Card(CardName.Great_Hall,Type.ACTION,4,1,0);
		ret.add(o);
		o = new Card(CardName.Mine,Type.ACTION,5,0,0);
		ret.add(o);
		o = new Card(CardName.Remodel,Type.ACTION,4,0,0);
		ret.add(o);
		o = new Card(CardName.Tribute,Type.ACTION,5,0,0);
		ret.add(o);
		return ret;
	}
	
	public void play(Player player, GameState state) {
		List<Card> revealed = new LinkedList<Card>();
		List<Card> revTreasure = new LinkedList<Card>();
		List<Card> revSet = new LinkedList<Card>();
		Integer numPile;
		Card original;
		boolean found = false;
		switch(this.cardName) {
		case Adventurer:
	    	  //Reveal cards from your deck until you reveal 2 Treasure cards. Put those Treasure cards into your hand and discard the other revealed cards.
	    	  System.out.println("TODO Adventurer Code******************************************");
	    	  System.out.println("Reveal cards from the player deck until player reveal 2 Treasure cards. " +
	    	  		"Put those Treasure cards into player hand and discard the other revealed cards.");
			  int numTreasure = 0;
			  while(numTreasure < 2){
				  if(!(player.deck.isEmpty())){
					revealed.add(player.deck.removeFirst());
					if(revealed.get(revealed.size() - 1).getType() == Type.TREASURE){
						System.out.println(player.player_username +" reveals " + revealed.get(revealed.size() - 1).getCardName());
						revTreasure.add(revealed.remove(revealed.size() - 1));
						numTreasure++;
					}
				  }
				  else{
					  	while (player.discard.size() > 0) {
							int ndx = (int) Randomness.nextRandomInt(player.discard.size());
							// Move discard to deck
							player.deck.add(player.discard.remove(ndx));
						}
					}
			  }
			  player.hand.addAll(revTreasure);
			  player.discard.addAll(revealed);
			  revTreasure.clear();
			  revealed.clear();
			  player.discard(this);
			return;
			
		case Ambassador:
	    	  System.out.println("TODO Ambassador Code******************************************");
	    	  System.out.println("Reveal a card from your hand.");
			  revealed.add(Randomness.randomMember(player.hand));
	    	  System.out.println("Return up to 2 copies of it to the Supply.");
			  int numRet;
			  for(Card c : player.hand){
				if(c.equals(revealed.get(revealed.size() - 1))){
					revSet.add(c);
				}
			  }
			  if(revSet.size() >= 2){
				numRet = Randomness.nextRandomInt(2);  
			  }else{
				numRet = Randomness.nextRandomInt(1);
			  }
			  for(int i =0; i < numRet; i++){
				  System.out.println("Last Card in revSet"+ revSet.get(revSet.size() - 1).toString());
				player.hand.remove(revSet.get(revSet.size() - 1));
				if(state.gameBoard.containsKey(revSet.get(revSet.size() - 1))){
					numPile=state.gameBoard.get(revSet.get(revSet.size() - 1));
					state.gameBoard.replace(revSet.get(revSet.size() - 1),(numPile.intValue()+1));
				}else{
					state.gameBoard.replace(revSet.get(revSet.size() - 1),1);
				}
			  }
			  System.out.println("Then each other player gains a copy of it.");
			  if(!(numRet == 0)){
				  for (Player opponent : state.players){
					  if(opponent != player){
						  state.loseCard(revSet.get(revSet.size() - 1));
						  opponent.gain(revSet.get(revSet.size() - 1));
					  }
				  }
			  }
			  revSet.clear();
			  player.discard(this);
			return;
		
		case Baron:
	    	  System.out.println("TODO Baron Code******************************************");
	    	  System.out.println("+1 Buy");
			  player.numBuys +=1;
			  System.out.println("You may discard an Estate for +4 Gold.");
			  found = false;
			  Boolean noEstates = false;
			  Card esta;
			  if(Card.getCard(state.onBoard, CardName.Estate) == null){
				  noEstates = true;
			  }
			  if(Card.getCard(player.hand, CardName.Estate) != null){
				  found = true;
				  esta = getCard(player.hand, CardName.Estate);
			  }else if(!(noEstates)){
				  esta = getCard(state.onBoard, CardName.Estate);
			  }else{
				  esta = getCard(state.Supply, CardName.Estate);
			  }
			  System.out.println(found);
			  if((Randomness.nextBoolean())&&(found)){
				  player.discard(esta);
				  player.coins += 4;
			  }else if(!(noEstates)){
				  System.out.println("in gameBoard: " + state.gameBoard.containsKey(esta));
				  state.loseCard(esta);
				  player.gain(esta);
			  }
	    	  System.out.println("If you don't, gain an Estate.");
			return;
			
		case Council_Room:
	    	  System.out.println("TODO Council Room Code******************************************");
	    	  System.out.println("+4 Cards");
			  player.drawCard();
			  player.drawCard();
			  player.drawCard();
			  player.drawCard();
			  System.out.println("+1 Buy");
			  player.numBuys += 1;
	    	  System.out.println("Each other player draws a card.");
			  for (Player opponent : state.players){
				  if(!(opponent.equals(player)))
					  opponent.drawCard();
			  }
			  player.discard(this);
			return;
			
		case Cutpurse:
	    	  System.out.println("TODO Cutpurse Code******************************************");
	    	  System.out.println("+2 Gold");
			  player.coins += 2;
	    	  System.out.println("Each other player discards a Copper card (or reveals a hand with no Copper).");
			  for (Player opponent : state.players){
				  if(opponent != player){
					  if(getCard(opponent.hand,CardName.Copper) != null){
						  Card cCopper = getCard(opponent.hand,CardName.Copper);
						  opponent.discard(cCopper);
					  }else{
						  revealed.addAll(opponent.hand);
						  System.out.println(opponent.player_username + "reveals their hand");
						  for(Card reveal: revealed){
							  System.out.println(reveal.toString());
						  }
					  }
				  }
			  }
			  revealed.clear();
			  player.discard(this);
			return;

		case Embargo:
	    	  System.out.println("TODO Embargo Code******************************************");
	    	  System.out.println("+2 Gold.");
			  player.coins += 2;
	    	  System.out.println("Trash this card. Put an Embargo token on top of a Supply pile.");
	    	  System.out.println(this.cardName);
			  player.trash(this);
			  
			  Card c = Randomness.randomMember(state.onBoard);
			  Integer numTok = state.embargoed.get(c);
			 System.out.println("Player "+ player.player_username +" put an embargo counter on "+ c.toString() + "----------------------------------------------------------------------------");
			  state.embargoed.replace(c, (numTok.intValue()+1));
			  System.out.println("When a player buys a card, he gains a Curse card per Embargo token on that pile.");
			return;
			
		case Feast:
	    	  System.out.println("TODO Feast Code******************************************");
	    	  System.out.println("Trash this card.");
			  player.trash(this);
	    	  System.out.println("Gain a card costing up to 5 Gold");
			  found = false;
			  while (!found){
				Card p = Randomness.randomMember(state.onBoard);
				if(p.getCost() <= 5){
					numPile = state.gameBoard.get(p);
					state.gameBoard.replace(p,(numPile.intValue() - 1));
					player.gain(p);
					found = true;
				}
			  }

			return;
			
		case Great_Hall:
	    	  System.out.println("TODO Great Hall Code******************************************");
	    	  System.out.println("The player draw +1 Card.");
			  player.drawCard();
	    	  System.out.println("The player gets +1 play Actions.");
			  player.numActions++;
			  System.out.println("Worth 1 Victory Point");
			  player.discard(this);
			return;
		
		case Mine:
	    	  System.out.println("TODO Mine Code******************************************");
	    	  System.out.println("You may trash a Treasure from your hand. Gain a Treasure to your hand costing up to 3 more than it.");
			  revTreasure.addAll(filter(player.hand,Type.TREASURE));
			  found = false;
			  if(revTreasure.size() >0){
				  found = true;
			  }
			  System.out.println(found);
			  if((Randomness.nextBoolean())&&(found)){
				  original = Randomness.randomMember(revTreasure);
				  player.trash(original);
				  List<Card> treasures = filter(state.onBoard, Type.TREASURE);
				  Card upgrade = Randomness.randomMember(treasures);
				  while(upgrade.getCost() > (original.getCost() +3)){
					  upgrade = Randomness.randomMember(treasures);
				  }
				  state.loseCard(upgrade);
				  System.out.println(player.player_username +"adds " + upgrade.getCardName() + " to their hand.");
				  player.hand.add(upgrade);
				}
			  revTreasure.clear();
			  player.discard(this);
			return;
			
		case Remodel:
	    	  System.out.println("TODO Remodel Code******************************************");
	    	  System.out.println("You may trash a card from your hand. Gain a card costing up to 2 more than it.");
	    	  player.discard(this);
	    	  if(Randomness.nextBoolean()){
				  original = Randomness.randomMember(player.hand);
				  player.trash(original);
				  Card upgrade = Randomness.randomMember(state.onBoard);
				  while(upgrade.getCost() > (original.getCost() +2)){
					  upgrade = Randomness.randomMember(state.onBoard);
				  }
				  state.loseCard(upgrade);
				  player.gain(upgrade);
				}
			return;
		
		case Smithy:
	         player.drawCard();
	         player.drawCard();
	         player.drawCard();
			 player.discard(this);
			return;
			
		case Tribute:
	    	  System.out.println("TODO Tribute Code******************************************");
	    	  System.out.println("The player to your left reveals then discards the top two cards of his deck.");
	    	  System.out.println("For each differently named card revealed, if it is an...");
			  System.out.println("Action Card, +2 Actions");
			  System.out.println("Treasure Card, +2 Gold");
			  System.out.println("Victory card, +2 Cards");
			  player.discard(this);
	    	  int playerNum = state.players.indexOf(player);
	    	  int leftIndex = (playerNum + 1)%(state.players.size());
			  while(revealed.size() < 2){
				  if(!(state.players.get(leftIndex).deck.isEmpty())){
					System.out.println(state.players.get(leftIndex).player_username +" reveals " + state.players.get(leftIndex).deck.getFirst().getCardName());
					revealed.add(state.players.get(leftIndex).deck.removeFirst());
					state.players.get(leftIndex).discard.add(revealed.get(revealed.size() - 1));
				  }
				  else{
					  	while (state.players.get(leftIndex).discard.size() > 0) {
							int ndx = (int) Randomness.nextRandomInt(state.players.get(leftIndex).discard.size());
							// Move discard to deck
							state.players.get(leftIndex).deck.add(state.players.get(leftIndex).discard.remove(ndx));
						}
					}
			  }
			  Card first = revealed.remove(revealed.size() - 1);
			  Card second = revealed.get(revealed.size() - 1);
			  if(first.getType() == Type.TREASURE){
				System.out.println(player.player_username +"gains 2 coins ");
				player.coins +=2;
			  }else if(first.getType() == Type.ACTION){
				System.out.println(player.player_username +"gains 2 actions ");
				player.numActions +=2;
			  }else if(first.getType() == Type.VICTORY){
				System.out.println(player.player_username +"draws 2 cards");
				player.drawCard();
				player.drawCard();
			  }
			if(!(first.equals(second))){
				if(second.getType() == Type.TREASURE){
					System.out.println(player.player_username +"gains 2 coins ");
					player.coins +=2;
				  }else if(second.getType() == Type.ACTION){
					  System.out.println(player.player_username +"gains 2 actions ");
					player.numActions +=2;
				  }else if(second.getType() == Type.VICTORY){
					System.out.println(player.player_username +"draws 2 cards");
					player.drawCard();
					player.drawCard();
				  }
			}

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
    	Card cloned = new Card(this.cardName,this.realType,this.cost,this.score,this.treasureValue);
        return cloned;
    } 

}
