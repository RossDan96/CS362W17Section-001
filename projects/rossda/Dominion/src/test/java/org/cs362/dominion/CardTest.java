package org.cs362.dominion;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.cs362.dominion.Card.CardName;
import org.junit.Test;

public class CardTest {

	
	@Test
	public void testDominionLong() throws Throwable {
		List<Card> cards;
	    GameState state;
		Randomness.reset(10);	
		
	 // initialize a game state and player cards
		cards = new ArrayList<Card>(Card.createCards());
		 state = new GameState(cards);  			
	      Player player = new Player(state, "player-1");

	         state.addPlayer(player);
	       player = new Player(state, "player-2");
	         state.addPlayer(player);
	         
	      //Initialize the game!
			  state.initializeGame();
			  
			  //PLAY
		   	  int turn =0;	
		      while (!(state.isGameOver())) {
		    	  turn++;
		         for (Player playing : state.players) {
		        	 	System.out.println("Player: "+ playing.player_username + " is playing");
		   				//player p plays action card
		        	 	playing.playKingdomCard();
		        	 	//player plays treasure card
		   			    playing.playTreasureCard();
		   			    //player buy cards
		        	    playing.buyCard();
		        	  //player ends turn
		        	    playing.endTurn();
		         }
		         if(turn==35)
		        	 break;
		      }
			  
			  HashMap<Player, Integer> winners=state.getWinners();
		      System.out.println ("Finished game.\n");
		    
		      for(Player p: winners.keySet()){
		    	  System.out.println ("Player name: "+ p.player_username + " , Score: "+ winners.get(p) );
		    	  assertTrue(winners.get(p) != null);
		      }
		
	}
	
	@Test
	public void testDominionShort() throws Throwable {
		List<Card> cards;
	    GameState state;
		Randomness.reset(10);	
		
	 // initialize a game state and player cards
		cards = new ArrayList<Card>(Card.createCards());
		 state = new GameState(cards);  			
	      Player player = new Player(state, "player-1");

	         state.addPlayer(player);
	       player = new Player(state, "player-2");
	         state.addPlayer(player);
	         
	      //Initialize the game!
			  state.initializeGame();

			  HashMap<Player, Integer> winners=state.play();
		      System.out.println ("Finished game.\n");
		    
		      for(Player p: winners.keySet()){
		    	  System.out.println ("Player name: "+ p.player_username + " , Score: "+ winners.get(p) );
		    	  assertTrue(winners.get(p) != null);
		      }
		
	}
	
	@Test
	public void gameStateStringTest() throws Throwable {
		List<Card> cards;
	    GameState state;
		Randomness.reset(10);	
		
	 // initialize a game state and player cards
		cards = new ArrayList<Card>(Card.createCards());
		 state = new GameState(cards);  			
	      Player player = new Player(state, "player-1");

	         state.addPlayer(player);
	       player = new Player(state, "player-2");
	         state.addPlayer(player);
	         
	      //Initialize the game!
			  state.initializeGame();
			  System.out.println(state.toString());
			  
	}
	
	@Test
	public void testPlayerPrint() throws Throwable {
		List<Card> cards;
	    GameState state;
		Randomness.reset(10);	
		
	 // initialize a game state and player cards
		cards = new ArrayList<Card>(Card.createCards());
		 state = new GameState(cards);  			
	      Player player = new Player(state, "player-1");

	         state.addPlayer(player);
	       player = new Player(state, "player-2");
	         state.addPlayer(player);
	         
	      //Initialize the game!
			  state.initializeGame();
			  state.players.get(0).printStateGame();
			  
	}
	

	
	@Test
	public void gardensTest()  throws Throwable  {
			List<Card> cards;
		    GameState state,testState;
			Randomness.reset(10);	
			
			int gardenPoints = 11;
		 // initialize a game state and player cards
			cards = new ArrayList<Card>(Card.createCards());
			 state = new GameState(cards);  			
		      Player player = new Player(state, "player-1");

		         state.addPlayer(player);
		       player = new Player(state, "player-2");
		         state.addPlayer(player);
		         
		      //Initialize the game!
				  state.initializeGame();
			         
				for(int add =0; add < 50; add++){
						  state.players.get(0).deck.add(Card.getCard(cards,Card.CardName.Copper));
						  state.players.get(0).deck.add(Card.getCard(cards,Card.CardName.Silver));
				}

		      System.out.println(state.players.get(0).player_username + "hand count = " + state.players.get(0).hand.size());
		      System.out.println(state.players.get(0).player_username + "deck = " + state.players.get(0).deck.size());
		      System.out.println(state.players.get(0).player_username + "coins = " + state.players.get(0).coins);
		      System.out.println(state.players.get(0).player_username + "numActions = " + state.players.get(0).numActions);
		      System.out.println(state.players.get(0).player_username + "numBuys = " + state.players.get(0).numBuys);
		      
		      System.out.println(state.players.get(1).player_username + "hand count = " + state.players.get(1).hand.size());
		      System.out.println(state.players.get(1).player_username + "deck = " + state.players.get(1).deck.size());
		      System.out.println(state.players.get(1).player_username + "coins = " + state.players.get(1).coins);
		      System.out.println(state.players.get(1).player_username + "numActions = " + state.players.get(1).numActions);
		      System.out.println(state.players.get(1).player_username + "numBuys = " + state.players.get(1).numBuys);
		      
		      //copy or clone the game state to a test case
		      testState= (GameState) state.clone();

		     //	play the game 
		      state.players.get(0).deck.add(Card.getCard(cards,Card.CardName.Gardens));
		      
		      System.out.println("  *****    "+state.players.get(0).player_username +" Status ***** " );
		     System.out.println("With Gardens " + state.players.get(0).scoreFor() + "  Without Gardens " + testState.players.get(0).scoreFor() );
		      /*
		      System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = "+ ( testState.players.get(0).hand.size() - tributeCount + drawCount) );
		      System.out.println("numActions = " + state.players.get(0).numActions + ", expected = "+ ( testState.players.get(0).numActions + 1 ) );
		     
		      System.out.println("deck count = " + state.players.get(0).deck.size() + ", expected = "+ ( testState.players.get(0).deck.size()) );
		      System.out.println("discard count = " + state.players.get(0).discard.size() + ", expected = "+ ( testState.players.get(0).discard.size() ) );
		      
		      
		      System.out.println("  *****    "+state.players.get(1).player_username +" Status *****" );
		      System.out.println("hand count = " + state.players.get(1).hand.size() + ", expected = "+ ( testState.players.get(1).hand.size()  ) );
		      System.out.println("deck count = " + state.players.get(1).deck.size() + ", expected = "+ ( testState.players.get(1).deck.size()  ) );
		      System.out.println("discard count = " + state.players.get(1).discard.size() + ", expected = "+ ( testState.players.get(1).discard.size()  ) );
		      System.out.println("numActions = " + state.players.get(1).numActions + ", expected = "+ ( testState.players.get(1).numActions  ) );
		     */
		   assertEquals(state.players.get(0).scoreFor(),( testState.players.get(0).scoreFor()  + gardenPoints) );
	}
	
	
	 @Test
	  public void adventurerTest()  throws Throwable  {	   
		    List<Card> cards;
		    GameState state,testState;
			Randomness.reset(10);	   

		    int newCards = 2;
		    int adventurerCount = 1;
		    int revealedCount = 3;
//		 // initialize a game state and player cards
			cards = new ArrayList<Card>(Card.createCards());
			 state = new GameState(cards);  
//			
		      Player player = new Player(state, "player-1");

		         state.addPlayer(player);
		       player = new Player(state, "player-2");
		         state.addPlayer(player);
		         
		      //Initialize the game!

			      //initialize supply 
			   //check number of players
			   if (state.players.size() > 4 || state.players.size() < 2)
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
			         int random = (int)  Randomness.random.nextInt(state.Supply.size()-7);//
			         random += 7;
			        //System.out.println(random); 
			         Card tmp = state.Supply.get(random);
			         if(state.gameBoard.containsKey(tmp)) continue;
			         state.gameBoard.put(tmp, 10);
			         selectedKindom++;
			      }
		        //set number of Curse cards the default number of players is 2			   
		      state.gameBoard.put(Card.getCard(state.Supply, Card.CardName.Curse), 10);
		      
		      //set number of Victory cards
		      state.gameBoard.put(Card.getCard(state.Supply, Card.CardName.Province), 8);
		      state.gameBoard.put(Card.getCard(state.Supply, Card.CardName.Duchy), 8);
		      state.gameBoard.put(Card.getCard(state.Supply, Card.CardName.Estate), 8);
		    //set number of Treasure cards
		      state.gameBoard.put(Card.getCard(state.Supply, Card.CardName.Gold), 30);
		      state.gameBoard.put(Card.getCard(state.Supply, Card.CardName.Silver), 40);
		      state.gameBoard.put(Card.getCard(state.Supply, Card.CardName.Copper), 46);
			

		      state.onBoard = new ArrayList<Card>(state.gameBoard.keySet());

		      state.embargoed.putAll(state.gameBoard);
			  Integer zero = new Integer(0);
			  for(Card k : state.embargoed.keySet()){
				  state.embargoed.replace(k, zero);
			  }
			  
		         state.players.get(0).numActions = 1;
		         state.players.get(0).coins = 0;
		         state.players.get(0).numBuys = 1;
			  
			  state.players.get(0).deck.add(Card.getCard(state.Supply,Card.CardName.Estate));
			  state.players.get(0).deck.add(Card.getCard(state.Supply,Card.CardName.Estate));
			  state.players.get(0).deck.add(Card.getCard(state.Supply,Card.CardName.Gold));
			  state.players.get(0).deck.add(Card.getCard(state.Supply,Card.CardName.Estate));
			  state.players.get(0).deck.add(Card.getCard(state.Supply,Card.CardName.Silver));
			  state.players.get(0).deck.add(Card.getCard(state.Supply,Card.CardName.Estate));
			  state.players.get(0).hand.add(Card.getCard(state.Supply,Card.CardName.Adventurer));

		      
		      System.out.println(state.players.get(0).player_username + "hand count = " + state.players.get(0).hand.size());
		      System.out.println(state.players.get(0).player_username + "deck = " + state.players.get(0).deck.size());
		      System.out.println(state.players.get(0).player_username + "coins = " + state.players.get(0).coins);
		      System.out.println(state.players.get(0).player_username + "numActions = " + state.players.get(0).numActions);
		      System.out.println(state.players.get(0).player_username + "numBuys = " + state.players.get(0).numBuys);
		      
		      System.out.println(state.players.get(1).player_username + "hand count = " + state.players.get(1).hand.size());
		      System.out.println(state.players.get(1).player_username + "deck = " + state.players.get(1).deck.size());
		      System.out.println(state.players.get(1).player_username + "coins = " + state.players.get(1).coins);
		      System.out.println(state.players.get(1).player_username + "numActions = " + state.players.get(1).numActions);
		      System.out.println(state.players.get(1).player_username + "numBuys = " + state.players.get(1).numBuys);
		      
		      //copy or clone the game state to a test case
		      testState=(GameState) state.clone();

		     //	play the game 
		      state.players.get(0).playKingdomCard();
		      

		      
		      System.out.println("  *****    "+state.players.get(0).player_username +" Status ***** " );
		      System.out.println(" expected = "+  testState.players.get(0).hand.size() + "newCards" + newCards + "Adventurer" + adventurerCount );
		      System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = "+ ( testState.players.get(0).hand.size() + newCards - adventurerCount) );
		      System.out.println("deck count = " + state.players.get(0).deck.size() + ", expected = "+ ( testState.players.get(0).deck.size() - (newCards + revealedCount) ) );
		      System.out.println("discard count = " + state.players.get(0).discard.size() + ", expected = "+( testState.players.get(0).discard.size()  + adventurerCount + revealedCount) );
		      System.out.println("numActions = " + state.players.get(0).numActions + ", expected = "+ ( testState.players.get(0).numActions ) );
		      
		      System.out.println("  *****    "+state.players.get(1).player_username +" Status *****" );
		      System.out.println("hand count = " + state.players.get(1).hand.size() + ", expected = "+ ( testState.players.get(1).hand.size()  ) );
		      System.out.println("deck count = " + state.players.get(1).deck.size() + ", expected = "+ ( testState.players.get(1).deck.size()  ) );
		      System.out.println("discard count = " + state.players.get(1).discard.size() + ", expected = "+ ( testState.players.get(1).discard.size()  ) );
		      System.out.println("numActions = " + state.players.get(1).numActions + ", expected = "+ ( testState.players.get(1).numActions  ) );
		      
		      assertEquals((state.players.get(0).hand.size()), (testState.players.get(0).hand.size() - adventurerCount + newCards ));		      
		      assertEquals((state.players.get(0).deck.size()),( testState.players.get(0).deck.size() - (newCards + revealedCount)) );		      
		      assertEquals(state.players.get(0).discard.size(),( testState.players.get(0).discard.size()  + adventurerCount + revealedCount) );
		      assertEquals(state.players.get(1).hand.size(),( testState.players.get(1).hand.size()));
		      assertEquals(state.players.get(1).deck.size(),( testState.players.get(1).deck.size() ));


	   }
	 
	 
	 @Test
	  public void ambassadorTest()  throws Throwable  {	   
		    List<Card> cards;
		    GameState state,testState;
			Randomness.reset(10);	   

		    int lostCards = 1;
		    int ambassadorCount = 1;
		    int gainedCount = 1;
//		 // initialize a game state and player cards
			cards = new ArrayList<Card>(Card.createCards());
			 state = new GameState(cards);  
//			
		      Player player = new Player(state, "player-1");

		         state.addPlayer(player);
		       player = new Player(state, "player-2");
		         state.addPlayer(player);
		         
		      //Initialize the game!

			      //initialize supply 
			   //check number of players
			   if (state.players.size() > 4 || state.players.size() < 2)
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
			         int random = (int)  Randomness.random.nextInt(state.Supply.size()-7);//
			         random += 7;
			        //System.out.println(random); 
			         Card tmp = state.Supply.get(random);
			         if(state.gameBoard.containsKey(tmp)) continue;
			         state.gameBoard.put(tmp, 10);
			         selectedKindom++;
			      }
		        //set number of Curse cards the default number of players is 2			   
		      state.gameBoard.put(Card.getCard(state.Supply, Card.CardName.Curse), 10);
		      
		      //set number of Victory cards
		      state.gameBoard.put(Card.getCard(state.Supply, Card.CardName.Province), 8);
		      state.gameBoard.put(Card.getCard(state.Supply, Card.CardName.Duchy), 8);
		      state.gameBoard.put(Card.getCard(state.Supply, Card.CardName.Estate), 8);
		    //set number of Treasure cards
		      state.gameBoard.put(Card.getCard(state.Supply, Card.CardName.Gold), 30);
		      state.gameBoard.put(Card.getCard(state.Supply, Card.CardName.Silver), 40);
		      state.gameBoard.put(Card.getCard(state.Supply, Card.CardName.Copper), 46);
			

		      state.onBoard = new ArrayList<Card>(state.gameBoard.keySet());

		      state.embargoed.putAll(state.gameBoard);
			  Integer zero = new Integer(0);
			  for(Card k : state.embargoed.keySet()){
				  state.embargoed.replace(k, zero);
			  }
			  
		         state.players.get(0).numActions = 1;
		         state.players.get(0).coins = 0;
		         state.players.get(0).numBuys = 1;
		         
		      state.players.get(0).hand.add(Card.getCard(state.Supply,Card.CardName.Estate));
			  state.players.get(0).hand.add(Card.getCard(state.Supply,Card.CardName.Estate));
			  state.players.get(0).hand.add(Card.getCard(state.Supply,Card.CardName.Ambassador));

		      
		      System.out.println(state.players.get(0).player_username + "hand count = " + state.players.get(0).hand.size());
		      System.out.println(state.players.get(0).player_username + "deck = " + state.players.get(0).deck.size());
		      System.out.println(state.players.get(0).player_username + "coins = " + state.players.get(0).coins);
		      System.out.println(state.players.get(0).player_username + "numActions = " + state.players.get(0).numActions);
		      System.out.println(state.players.get(0).player_username + "numBuys = " + state.players.get(0).numBuys);
		      
		      System.out.println(state.players.get(1).player_username + "hand count = " + state.players.get(1).hand.size());
		      System.out.println(state.players.get(1).player_username + "deck = " + state.players.get(1).deck.size());
		      System.out.println(state.players.get(1).player_username + "coins = " + state.players.get(1).coins);
		      System.out.println(state.players.get(1).player_username + "numActions = " + state.players.get(1).numActions);
		      System.out.println(state.players.get(1).player_username + "numBuys = " + state.players.get(1).numBuys);
		      
		      //copy or clone the game state to a test case
		      testState=(GameState) state.clone();

		     //	play the game 
		      state.players.get(0).playKingdomCard();
		      

		     /* 
		      System.out.println("  *****    "+state.players.get(0).player_username +" Status ***** " );
		      System.out.println(" expected = "+  testState.players.get(0).hand.size() + "newCards" + lostCards + "Ambassador" + ambassadorCount );
		      System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = "+ ( testState.players.get(0).hand.size() - lostCards - ambassadorCount) );
		      System.out.println("deck count = " + state.players.get(0).deck.size() + ", expected = "+ ( testState.players.get(0).deck.size() ) );
		      System.out.println("discard count = " + state.players.get(0).discard.size() + ", expected = "+( testState.players.get(0).discard.size()  + ambassadorCount) );
		      System.out.println("numActions = " + state.players.get(0).numActions + ", expected = "+ ( testState.players.get(0).numActions -1) );
		      
		      System.out.println("  *****    "+state.players.get(1).player_username +" Status *****" );
		      System.out.println("hand count = " + state.players.get(1).hand.size() + ", expected = "+ ( testState.players.get(1).hand.size()  ) );
		      System.out.println("deck count = " + state.players.get(1).deck.size() + ", expected = "+ ( testState.players.get(1).deck.size()  ) );
		      System.out.println("discard count = " + state.players.get(1).discard.size() + ", expected = "+ ( testState.players.get(1).discard.size() + gainedCount ) );
		      System.out.println("numActions = " + state.players.get(1).numActions + ", expected = "+ ( testState.players.get(1).numActions  ) );
		      */
		      System.out.println("Estate to be discarded = " + Card.getCard(state.onBoard,CardName.Estate).toString() );
		      System.out.println("Value = " + state.gameBoard.get(Card.getCard(state.onBoard,CardName.Estate)).intValue() );
		      System.out.println("Estate to be discarded = " + Card.getCard(testState.onBoard,CardName.Estate).toString() );
		      System.out.println("Value = " + testState.gameBoard.get(Card.getCard(testState.onBoard,CardName.Estate)).intValue() );
		      assertTrue(((state.players.get(0).hand.size()) == (testState.players.get(0).hand.size() - ambassadorCount))||((state.players.get(0).hand.size()) == (testState.players.get(0).hand.size() - ambassadorCount - lostCards ))||((state.players.get(0).hand.size()) == (testState.players.get(0).hand.size() - ambassadorCount - lostCards*2 )));		      
		      assertEquals((state.players.get(0).deck.size()),( testState.players.get(0).deck.size() ) );
		      assertTrue( (  (state.gameBoard.get(Card.getCard(state.onBoard,CardName.Estate)).intValue()) == (testState.gameBoard.get(Card.getCard(testState.onBoard,CardName.Estate)).intValue())  )
		    		  ||(  (state.gameBoard.get(Card.getCard(state.onBoard,CardName.Estate)).intValue()) == (testState.gameBoard.get(Card.getCard(testState.onBoard,CardName.Estate)).intValue() - lostCards)) );
		      assertTrue(state.players.get(0).discard.size() == (testState.players.get(0).discard.size() + ambassadorCount));
		      assertEquals(state.players.get(1).hand.size(),( testState.players.get(1).hand.size()));
		      assertEquals(state.players.get(1).deck.size(),( testState.players.get(1).deck.size() ));
		      assertEquals(state.players.get(1).discard.size(),( testState.players.get(1).discard.size()  + gainedCount ) );

	   }
	 
	 @Test
	  public void baronTest()  throws Throwable  {	   
		    List<Card> cards;
		    GameState state,testState;
			Randomness.reset(10);	   

		    int lostCards = 1;
		    int baronCount = 1;
		    int gainedCount = 4;
//		 // initialize a game state and player cards
			cards = new ArrayList<Card>(Card.createCards());
			 state = new GameState(cards);  
//			
		      Player player = new Player(state, "player-1");

		         state.addPlayer(player);
		       player = new Player(state, "player-2");
		         state.addPlayer(player);
		         
		      //Initialize the game!

			      //initialize supply 
			   //check number of players
			   if (state.players.size() > 4 || state.players.size() < 2)
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
			         int random = (int)  Randomness.random.nextInt(state.Supply.size()-7);//
			         random += 7;
			        //System.out.println(random); 
			         Card tmp = state.Supply.get(random);
			         if(state.gameBoard.containsKey(tmp)) continue;
			         state.gameBoard.put(tmp, 10);
			         selectedKindom++;
			      }
		        //set number of Curse cards the default number of players is 2			   
		      state.gameBoard.put(Card.getCard(state.Supply, Card.CardName.Curse), 10);
		      
		      //set number of Victory cards
		      state.gameBoard.put(Card.getCard(state.Supply, Card.CardName.Province), 8);
		      state.gameBoard.put(Card.getCard(state.Supply, Card.CardName.Duchy), 8);
		      state.gameBoard.put(Card.getCard(state.Supply, Card.CardName.Estate), 8);
		    //set number of Treasure cards
		      state.gameBoard.put(Card.getCard(state.Supply, Card.CardName.Gold), 30);
		      state.gameBoard.put(Card.getCard(state.Supply, Card.CardName.Silver), 40);
		      state.gameBoard.put(Card.getCard(state.Supply, Card.CardName.Copper), 46);
			

		      state.onBoard = new ArrayList<Card>(state.gameBoard.keySet());

		      state.embargoed.putAll(state.gameBoard);
			  Integer zero = new Integer(0);
			  for(Card k : state.embargoed.keySet()){
				  state.embargoed.replace(k, zero);
			  }
			  
		         state.players.get(0).numActions = 1;
		         state.players.get(0).coins = 0;
		         state.players.get(0).numBuys = 1;
		         
			  state.players.get(0).hand.add(Card.getCard(state.Supply,Card.CardName.Estate));
			  state.players.get(0).hand.add(Card.getCard(state.Supply,Card.CardName.Baron));

		      
		      System.out.println(state.players.get(0).player_username + "hand count = " + state.players.get(0).hand.size());
		      System.out.println(state.players.get(0).player_username + "deck = " + state.players.get(0).deck.size());
		      System.out.println(state.players.get(0).player_username + "coins = " + state.players.get(0).coins);
		      System.out.println(state.players.get(0).player_username + "numActions = " + state.players.get(0).numActions);
		      System.out.println(state.players.get(0).player_username + "numBuys = " + state.players.get(0).numBuys);
		      
		      System.out.println(state.players.get(1).player_username + "hand count = " + state.players.get(1).hand.size());
		      System.out.println(state.players.get(1).player_username + "deck = " + state.players.get(1).deck.size());
		      System.out.println(state.players.get(1).player_username + "coins = " + state.players.get(1).coins);
		      System.out.println(state.players.get(1).player_username + "numActions = " + state.players.get(1).numActions);
		      System.out.println(state.players.get(1).player_username + "numBuys = " + state.players.get(1).numBuys);
		      
		      //copy or clone the game state to a test case
		      testState=(GameState) state.clone();

		     //	play the game 
		      state.players.get(0).playKingdomCard();
		      

		     
		      System.out.println("  *****    "+state.players.get(0).player_username +" Status ***** " );
		     // System.out.println(" expected = "+  testState.players.get(0).hand.size() + "newCards" + lostCards + "Ambassador" + baronCount );
		      System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = "+ ( testState.players.get(0).hand.size() - lostCards - baronCount) );
		      //System.out.println("deck count = " + state.players.get(0).deck.size() + ", expected = "+ ( testState.players.get(0).deck.size() ) );
		      System.out.println("discard count = " + state.players.get(0).discard.size() + ", expected = "+( testState.players.get(0).discard.size()  + baronCount) );
		      System.out.println("coins = " + state.players.get(0).coins + ", expected = "+ ( testState.players.get(0).coins + gainedCount) + ", or expected = "+ ( testState.players.get(0).coins));
		      /*
		      System.out.println("  *****    "+state.players.get(1).player_username +" Status *****" );
		      System.out.println("hand count = " + state.players.get(1).hand.size() + ", expected = "+ ( testState.players.get(1).hand.size()  ) );
		      System.out.println("deck count = " + state.players.get(1).deck.size() + ", expected = "+ ( testState.players.get(1).deck.size()  ) );
		      System.out.println("discard count = " + state.players.get(1).discard.size() + ", expected = "+ ( testState.players.get(1).discard.size() + gainedCount ) );
		      System.out.println("numActions = " + state.players.get(1).numActions + ", expected = "+ ( testState.players.get(1).numActions  ) );
		      
		      System.out.println("Estate to be discarded = " + Card.getCard(state.onBoard,CardName.Estate).toString() );
		      System.out.println("Value = " + state.gameBoard.get(Card.getCard(state.onBoard,CardName.Estate)).intValue() );
		      System.out.println("Estate to be discarded = " + Card.getCard(testState.onBoard,CardName.Estate).toString() );
		      System.out.println("Value = " + testState.gameBoard.get(Card.getCard(testState.onBoard,CardName.Estate)) );
		      */
		      assertTrue(((state.players.get(0).hand.size()) == (testState.players.get(0).hand.size() - baronCount))||((state.players.get(0).hand.size()) == (testState.players.get(0).hand.size() - baronCount - lostCards )) );		      
		      assertEquals((state.players.get(0).deck.size()),( testState.players.get(0).deck.size() ) );
		      assertTrue( (  (state.gameBoard.get(Card.getCard(state.onBoard,CardName.Estate)).intValue()) == (testState.gameBoard.get(Card.getCard(testState.onBoard,CardName.Estate)).intValue())  )
		    		  ||(  (state.gameBoard.get(Card.getCard(state.onBoard,CardName.Estate)).intValue()) == (testState.gameBoard.get(Card.getCard(testState.onBoard,CardName.Estate)).intValue() - lostCards)) );
		      assertTrue(state.players.get(0).discard.size() == (testState.players.get(0).discard.size() + baronCount));
		      assertTrue((state.players.get(0).coins == (testState.players.get(0).coins ) )||(state.players.get(0).coins == (testState.players.get(0).coins + gainedCount )));
		      assertEquals(state.players.get(1).hand.size(),( testState.players.get(1).hand.size()));
		      assertEquals(state.players.get(1).deck.size(),( testState.players.get(1).deck.size() ));
		      assertEquals(state.players.get(1).discard.size(),( testState.players.get(1).discard.size() ) );

	   }
	 
	@Test
	public void smithyTest()  throws Throwable  {	   
		    List<Card> cards;
		    GameState state,testState;
			Randomness.reset(10);	   

		    int newCards = 3;
		    int smithyCount = 1;
		 // initialize a game state and player cards
			cards = new ArrayList<Card>(Card.createCards());
			 state = new GameState(cards);  			
		      Player player = new Player(state, "player-1");
		         player.hand.add(Card.getCard(cards,Card.CardName.Smithy));

		         state.addPlayer(player);
		       player = new Player(state, "player-2");
		         state.addPlayer(player);
		         
		      //Initialize the game!
		      state.initializeGame();
		      
		      System.out.println(state.players.get(0).player_username + "hand count = " + state.players.get(0).hand.size());
		      System.out.println(state.players.get(0).player_username + "deck = " + state.players.get(0).deck.size());
		      System.out.println(state.players.get(0).player_username + "coins = " + state.players.get(0).coins);
		      System.out.println(state.players.get(0).player_username + "numActions = " + state.players.get(0).numActions);
		      System.out.println(state.players.get(0).player_username + "numBuys = " + state.players.get(0).numBuys);
		      
		      System.out.println(state.players.get(1).player_username + "hand count = " + state.players.get(1).hand.size());
		      System.out.println(state.players.get(1).player_username + "deck = " + state.players.get(1).deck.size());
		      System.out.println(state.players.get(1).player_username + "coins = " + state.players.get(1).coins);
		      System.out.println(state.players.get(1).player_username + "numActions = " + state.players.get(1).numActions);
		      System.out.println(state.players.get(1).player_username + "numBuys = " + state.players.get(1).numBuys);
		      
		      //copy or clone the game state to a test case
		      testState=(GameState) state.clone();

		     //	play the game 
		      state.players.get(0).playKingdomCard();
		      
		      System.out.println("  *****    "+state.players.get(0).player_username +" Status ***** " );
		      System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = "+ ( testState.players.get(0).hand.size() + newCards - smithyCount) );
		      System.out.println("deck count = " + state.players.get(0).deck.size() + ", expected = "+ ( testState.players.get(0).deck.size() - newCards ) );
		      System.out.println("discard count = " + state.players.get(0).discard.size() + ", expected = "+ ( testState.players.get(0).discard.size()  + smithyCount) );
		      System.out.println("numActions = " + state.players.get(0).numActions + ", expected = "+ ( testState.players.get(0).numActions - 1 ) );
		      
		      System.out.println("  *****    "+state.players.get(1).player_username +" Status *****" );
		      System.out.println("hand count = " + state.players.get(1).hand.size() + ", expected = "+ ( testState.players.get(1).hand.size()  ) );
		      System.out.println("deck count = " + state.players.get(1).deck.size() + ", expected = "+ ( testState.players.get(1).deck.size()  ) );
		      System.out.println("discard count = " + state.players.get(1).discard.size() + ", expected = "+ ( testState.players.get(1).discard.size()  ) );
		      System.out.println("numActions = " + state.players.get(1).numActions + ", expected = "+ ( testState.players.get(1).numActions  ) );
		      assertEquals(state.players.get(0).hand.size(),( testState.players.get(0).hand.size() + newCards - smithyCount))      ;
		      assertEquals(state.players.get(0).deck.size(),( testState.players.get(0).deck.size() - newCards ))      ;
		      assertEquals(state.players.get(0).discard.size(),( testState.players.get(0).discard.size()  + smithyCount) );
		      assertEquals(state.players.get(1).hand.size(),( testState.players.get(1).hand.size()))      ;
		      assertEquals(state.players.get(1).deck.size(),( testState.players.get(1).deck.size() ))      ;

	   }
	
	 @Test
	  public void councilTest()  throws Throwable  {	   
		    List<Card> cards;
		    GameState state,testState;
			Randomness.reset(10);	   

		    int oppCards = 1;
		    int councilCount = 1;
		    int gainedCount = 4;
//		 // initialize a game state and player cards
			cards = new ArrayList<Card>(Card.createCards());
			 state = new GameState(cards);  
//			
		      Player player = new Player(state, "player-1");

		         state.addPlayer(player);
		       player = new Player(state, "player-2");
		         state.addPlayer(player);
		         
		      //Initialize the game!

			      //initialize supply 
			   state.initializeGame();
		         
			  state.players.get(0).hand.add(Card.getCard(state.Supply,Card.CardName.Council_Room));

		      
		      System.out.println(state.players.get(0).player_username + "hand count = " + state.players.get(0).hand.size());
		      System.out.println(state.players.get(0).player_username + "deck = " + state.players.get(0).deck.size());
		      System.out.println(state.players.get(0).player_username + "coins = " + state.players.get(0).coins);
		      System.out.println(state.players.get(0).player_username + "numActions = " + state.players.get(0).numActions);
		      System.out.println(state.players.get(0).player_username + "numBuys = " + state.players.get(0).numBuys);
		      
		      System.out.println(state.players.get(1).player_username + "hand count = " + state.players.get(1).hand.size());
		      System.out.println(state.players.get(1).player_username + "deck = " + state.players.get(1).deck.size());
		      System.out.println(state.players.get(1).player_username + "coins = " + state.players.get(1).coins);
		      System.out.println(state.players.get(1).player_username + "numActions = " + state.players.get(1).numActions);
		      System.out.println(state.players.get(1).player_username + "numBuys = " + state.players.get(1).numBuys);
		      
		      //copy or clone the game state to a test case
		      testState=(GameState) state.clone();

		     //	play the game 
		      state.players.get(0).playKingdomCard();
		      

		     
		      System.out.println("  *****    "+state.players.get(0).player_username +" Status ***** " );
		     // System.out.println(" expected = "+  testState.players.get(0).hand.size() + "newCards" + oppCards + "Ambassador" + councilCount );
		      System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = "+ ( testState.players.get(0).hand.size() + gainedCount) );
		      //System.out.println("deck count = " + state.players.get(0).deck.size() + ", expected = "+ ( testState.players.get(0).deck.size() ) );
		      System.out.println("discard count = " + state.players.get(0).discard.size() + ", expected = "+( testState.players.get(0).discard.size()  + councilCount) );
		      //System.out.println("coins = " + state.players.get(0).coins + ", expected = "+ ( testState.players.get(0).coins + gainedCount) + ", or expected = "+ ( testState.players.get(0).coins));
		      /*
		      System.out.println("  *****    "+state.players.get(1).player_username +" Status *****" );
		      System.out.println("hand count = " + state.players.get(1).hand.size() + ", expected = "+ ( testState.players.get(1).hand.size()  ) );
		      System.out.println("deck count = " + state.players.get(1).deck.size() + ", expected = "+ ( testState.players.get(1).deck.size()  ) );
		      System.out.println("discard count = " + state.players.get(1).discard.size() + ", expected = "+ ( testState.players.get(1).discard.size() + gainedCount ) );
		      System.out.println("numActions = " + state.players.get(1).numActions + ", expected = "+ ( testState.players.get(1).numActions  ) );
		      
		      System.out.println("Estate to be discarded = " + Card.getCard(state.onBoard,CardName.Estate).toString() );
		      System.out.println("Value = " + state.gameBoard.get(Card.getCard(state.onBoard,CardName.Estate)).intValue() );
		      System.out.println("Estate to be discarded = " + Card.getCard(testState.onBoard,CardName.Estate).toString() );
		      System.out.println("Value = " + testState.gameBoard.get(Card.getCard(testState.onBoard,CardName.Estate)) );
		      */
		      assertTrue(((state.players.get(0).hand.size()) == (testState.players.get(0).hand.size() - councilCount))||((state.players.get(0).hand.size()) == (testState.players.get(0).hand.size() - councilCount + gainedCount )) );		      
		      assertEquals((state.players.get(0).deck.size()),( testState.players.get(0).deck.size() - gainedCount) );
		      assertTrue(state.players.get(0).discard.size() == (testState.players.get(0).discard.size() + councilCount));
		      assertTrue(state.players.get(0).numBuys == (testState.players.get(0).numBuys + 1));
		     // assertTrue((state.players.get(0).coins == (testState.players.get(0).coins ) )||(state.players.get(0).coins == (testState.players.get(0).coins + gainedCount )));
		      assertEquals(state.players.get(1).hand.size(),( testState.players.get(1).hand.size() + oppCards));
		      assertEquals(state.players.get(1).deck.size(),( testState.players.get(1).deck.size() - oppCards));
		      assertEquals(state.players.get(1).discard.size(),( testState.players.get(1).discard.size() ) );

	   }
	 
	 @Test
	  public void cutpurseTest()  throws Throwable  {	   
		    List<Card> cards;
		    GameState state,testState;
			Randomness.reset(10);	   

		    int newCoins = 2;
		    int cutpurseCount = 1;
		    int revealedCount = 1;
//		 // initialize a game state and player cards
			cards = new ArrayList<Card>(Card.createCards());
			 state = new GameState(cards);  
//			
		      Player player = new Player(state, "player-1");

		         state.addPlayer(player);
		       player = new Player(state, "player-2");
		         state.addPlayer(player);
		         
		      //Initialize the game!

			      state.initializeGame();
			  

			  state.players.get(0).hand.add(Card.getCard(state.Supply,Card.CardName.Cutpurse));
			  state.players.get(1).hand.add(Card.getCard(state.Supply,Card.CardName.Copper));

		      
		      System.out.println(state.players.get(0).player_username + "hand count = " + state.players.get(0).hand.size());
		      System.out.println(state.players.get(0).player_username + "deck = " + state.players.get(0).deck.size());
		      System.out.println(state.players.get(0).player_username + "coins = " + state.players.get(0).coins);
		      System.out.println(state.players.get(0).player_username + "numActions = " + state.players.get(0).numActions);
		      System.out.println(state.players.get(0).player_username + "numBuys = " + state.players.get(0).numBuys);
		      
		      System.out.println(state.players.get(1).player_username + "hand count = " + state.players.get(1).hand.size());
		      System.out.println(state.players.get(1).player_username + "deck = " + state.players.get(1).deck.size());
		      System.out.println(state.players.get(1).player_username + "coins = " + state.players.get(1).coins);
		      System.out.println(state.players.get(1).player_username + "numActions = " + state.players.get(1).numActions);
		      System.out.println(state.players.get(1).player_username + "numBuys = " + state.players.get(1).numBuys);
		      
		      //copy or clone the game state to a test case
		      testState=(GameState) state.clone();

		     //	play the game 
		      state.players.get(0).playKingdomCard();
		      

		      /*
		      System.out.println("  *****    "+state.players.get(0).player_username +" Status ***** " );
		      System.out.println(" expected = "+  testState.players.get(0).hand.size() + "newCards" + newCards + "Adventurer" + cutpurseCount );
		      System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = "+ ( testState.players.get(0).hand.size() + newCards - cutpurseCount) );
		      System.out.println("deck count = " + state.players.get(0).deck.size() + ", expected = "+ ( testState.players.get(0).deck.size() - (newCards + revealedCount) ) );
		      System.out.println("discard count = " + state.players.get(0).discard.size() + ", expected = "+( testState.players.get(0).discard.size()  + cutpurseCount + revealedCount) );
		      System.out.println("numActions = " + state.players.get(0).numActions + ", expected = "+ ( testState.players.get(0).numActions ) );
		      
		      System.out.println("  *****    "+state.players.get(1).player_username +" Status *****" );
		      System.out.println("hand count = " + state.players.get(1).hand.size() + ", expected = "+ ( testState.players.get(1).hand.size()  ) );
		      System.out.println("deck count = " + state.players.get(1).deck.size() + ", expected = "+ ( testState.players.get(1).deck.size()  ) );
		      System.out.println("discard count = " + state.players.get(1).discard.size() + ", expected = "+ ( testState.players.get(1).discard.size()  ) );
		      System.out.println("numActions = " + state.players.get(1).numActions + ", expected = "+ ( testState.players.get(1).numActions  ) );
		      */
		      assertEquals((state.players.get(0).hand.size()), (testState.players.get(0).hand.size() - cutpurseCount));		      
		      assertEquals((state.players.get(0).deck.size()),( testState.players.get(0).deck.size()) );		      
		      assertEquals(state.players.get(0).discard.size(),( testState.players.get(0).discard.size()  + cutpurseCount ) );
		      assertEquals(state.players.get(0).coins,( testState.players.get(0).coins  + newCoins ) );
		      assertEquals(state.players.get(1).hand.size(),( testState.players.get(1).hand.size() - revealedCount));
		      assertEquals(state.players.get(1).deck.size(),( testState.players.get(1).deck.size() ));


	   }
	 
	 @Test
	  public void embargoTest()  throws Throwable  {	   
		    List<Card> cards;
		    GameState state,testState;
			Randomness.reset(10);	   

		    int treasureSpent = 4;
		    int embargoCount = 1;
		    int gainedCount = 2;
//		 // initialize a game state and player cards
			cards = new ArrayList<Card>(Card.createCards());
			 state = new GameState(cards);  
//			
		      Player player = new Player(state, "player-1");

		         state.addPlayer(player);
		       player = new Player(state, "player-2");
		         state.addPlayer(player);
		         
		      //Initialize the game!

			      //initialize supply 
			   //check number of players
			   if (state.players.size() > 4 || state.players.size() < 2)
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
			         int random = (int)  Randomness.random.nextInt(state.Supply.size()-7);//
			         random += 7;
			        //System.out.println(random); 
			         Card tmp = state.Supply.get(random);
			         if(state.gameBoard.containsKey(tmp)) continue;
			         state.gameBoard.put(tmp, 10);
			         selectedKindom++;
			      }
		        //set number of Curse cards the default number of players is 2			   
		      state.gameBoard.put(Card.getCard(state.Supply, Card.CardName.Curse), 10);
		      
		      //set number of Victory cards
		      state.gameBoard.put(Card.getCard(state.Supply, Card.CardName.Province), 8);
		      state.gameBoard.put(Card.getCard(state.Supply, Card.CardName.Duchy), 8);
		      state.gameBoard.put(Card.getCard(state.Supply, Card.CardName.Estate), 8);
		    //set number of Treasure cards
		      state.gameBoard.put(Card.getCard(state.Supply, Card.CardName.Gold), 30);
		      state.gameBoard.put(Card.getCard(state.Supply, Card.CardName.Silver), 40);
		      state.gameBoard.put(Card.getCard(state.Supply, Card.CardName.Copper), 46);
			

		      state.onBoard = new ArrayList<Card>(state.gameBoard.keySet());

		      state.embargoed.putAll(state.gameBoard);
			  Integer one = new Integer(1);
			  for(Card k : state.embargoed.keySet()){
				  state.embargoed.replace(k, one);
			  }
			  
		         state.players.get(0).numActions = 1;
		         state.players.get(0).coins = 0;
		         state.players.get(0).numBuys = 1;
		         
			  state.players.get(0).hand.add(Card.getCard(state.Supply,Card.CardName.Copper));
			  state.players.get(0).hand.add(Card.getCard(state.Supply,Card.CardName.Gold));
			  state.players.get(0).hand.add(Card.getCard(state.Supply,Card.CardName.Gold));
			  state.players.get(0).hand.add(Card.getCard(state.Supply,Card.CardName.Gold));
			  state.players.get(0).hand.add(Card.getCard(state.Supply,Card.CardName.Embargo));

		      
		      System.out.println(state.players.get(0).player_username + "hand count = " + state.players.get(0).hand.size());
		      System.out.println(state.players.get(0).player_username + "deck = " + state.players.get(0).deck.size());
		      System.out.println(state.players.get(0).player_username + "coins = " + state.players.get(0).coins);
		      System.out.println(state.players.get(0).player_username + "numActions = " + state.players.get(0).numActions);
		      System.out.println(state.players.get(0).player_username + "numBuys = " + state.players.get(0).numBuys);
		      
		      System.out.println(state.players.get(1).player_username + "hand count = " + state.players.get(1).hand.size());
		      System.out.println(state.players.get(1).player_username + "deck = " + state.players.get(1).deck.size());
		      System.out.println(state.players.get(1).player_username + "coins = " + state.players.get(1).coins);
		      System.out.println(state.players.get(1).player_username + "numActions = " + state.players.get(1).numActions);
		      System.out.println(state.players.get(1).player_username + "numBuys = " + state.players.get(1).numBuys);
		      
		      //copy or clone the game state to a test case
		      testState=(GameState) state.clone();

		     //	play the game 
		      state.players.get(0).playKingdomCard();
		      assertEquals((state.players.get(0).coins),(testState.players.get(0).coins + gainedCount ));
		      state.players.get(0).playTreasureCard();
		      state.players.get(0).buyCard();
		      

		     
		      System.out.println("  *****    "+state.players.get(0).player_username +" Status ***** " );
		     // System.out.println(" expected = "+  testState.players.get(0).hand.size() + "newCards" + treasureSpent + "Ambassador" + embargoCount );
		      System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = "+ ( testState.players.get(0).hand.size() - treasureSpent - embargoCount) );
		      //System.out.println("deck count = " + state.players.get(0).deck.size() + ", expected = "+ ( testState.players.get(0).deck.size() ) );
		      System.out.println("discard count = " + state.players.get(0).discard.size() + ", expected = "+( testState.players.get(0).discard.size()  + embargoCount) );
		      System.out.println("coins = " + state.players.get(0).coins + ", expected = "+ ( testState.players.get(0).coins + gainedCount) + ", or expected = "+ ( testState.players.get(0).coins));
		      /*
		      System.out.println("  *****    "+state.players.get(1).player_username +" Status *****" );
		      System.out.println("hand count = " + state.players.get(1).hand.size() + ", expected = "+ ( testState.players.get(1).hand.size()  ) );
		      System.out.println("deck count = " + state.players.get(1).deck.size() + ", expected = "+ ( testState.players.get(1).deck.size()  ) );
		      System.out.println("discard count = " + state.players.get(1).discard.size() + ", expected = "+ ( testState.players.get(1).discard.size() + gainedCount ) );
		      System.out.println("numActions = " + state.players.get(1).numActions + ", expected = "+ ( testState.players.get(1).numActions  ) );
		      
		      System.out.println("Estate to be discarded = " + Card.getCard(state.onBoard,CardName.Estate).toString() );
		      System.out.println("Value = " + state.gameBoard.get(Card.getCard(state.onBoard,CardName.Estate)).intValue() );
		      System.out.println("Estate to be discarded = " + Card.getCard(testState.onBoard,CardName.Estate).toString() );
		      System.out.println("Value = " + testState.gameBoard.get(Card.getCard(testState.onBoard,CardName.Estate)) );
		      */
		      System.out.println("Value = " + state.players.get(0).discard.size() );
		      System.out.println("Value = " + (testState.players.get(0).discard.size() + gainedCount + treasureSpent) );
		      assertTrue((state.players.get(0).hand.size()) == (testState.players.get(0).hand.size() - embargoCount - treasureSpent));		      
		      assertEquals((state.players.get(0).deck.size()),( testState.players.get(0).deck.size() ) );
		      assertTrue((state.players.get(0).discard.size()) == (testState.players.get(0).discard.size() + gainedCount + treasureSpent));
		      assertTrue(state.trashPile.contains(Card.getCard(state.Supply, CardName.Embargo)) );
		      Integer two = new Integer(2);
		      assertTrue(state.embargoed.containsValue(two));

	   }
	 
	 @Test
		public void feastTest()  throws Throwable  {	   
			    List<Card> cards;
			    GameState state,testState;
				Randomness.reset(10);	   

			    int gainedCount = 1;
			    int feastCount = 1;
			 // initialize a game state and player cards
				cards = new ArrayList<Card>(Card.createCards());
				 state = new GameState(cards);  			
			      Player player = new Player(state, "player-1");
			         player.hand.add(Card.getCard(cards,Card.CardName.Feast));

			         state.addPlayer(player);
			       player = new Player(state, "player-2");
			         state.addPlayer(player);
			         
			      //Initialize the game!
			      state.initializeGame();
			      
			      System.out.println(state.players.get(0).player_username + "hand count = " + state.players.get(0).hand.size());
			      System.out.println(state.players.get(0).player_username + "deck = " + state.players.get(0).deck.size());
			      System.out.println(state.players.get(0).player_username + "coins = " + state.players.get(0).coins);
			      System.out.println(state.players.get(0).player_username + "numActions = " + state.players.get(0).numActions);
			      System.out.println(state.players.get(0).player_username + "numBuys = " + state.players.get(0).numBuys);
			      
			      System.out.println(state.players.get(1).player_username + "hand count = " + state.players.get(1).hand.size());
			      System.out.println(state.players.get(1).player_username + "deck = " + state.players.get(1).deck.size());
			      System.out.println(state.players.get(1).player_username + "coins = " + state.players.get(1).coins);
			      System.out.println(state.players.get(1).player_username + "numActions = " + state.players.get(1).numActions);
			      System.out.println(state.players.get(1).player_username + "numBuys = " + state.players.get(1).numBuys);
			      
			      //copy or clone the game state to a test case
			      testState=(GameState) state.clone();

			     //	play the game 
			      state.players.get(0).playKingdomCard();
			      /*
			      System.out.println("  *****    "+state.players.get(0).player_username +" Status ***** " );
			      System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = "+ ( testState.players.get(0).hand.size() + newCards - smithyCount) );
			      System.out.println("deck count = " + state.players.get(0).deck.size() + ", expected = "+ ( testState.players.get(0).deck.size() - newCards ) );
			      System.out.println("discard count = " + state.players.get(0).discard.size() + ", expected = "+ ( testState.players.get(0).discard.size()  + smithyCount) );
			      System.out.println("numActions = " + state.players.get(0).numActions + ", expected = "+ ( testState.players.get(0).numActions - 1 ) );
			      
			      System.out.println("  *****    "+state.players.get(1).player_username +" Status *****" );
			      System.out.println("hand count = " + state.players.get(1).hand.size() + ", expected = "+ ( testState.players.get(1).hand.size()  ) );
			      System.out.println("deck count = " + state.players.get(1).deck.size() + ", expected = "+ ( testState.players.get(1).deck.size()  ) );
			      System.out.println("discard count = " + state.players.get(1).discard.size() + ", expected = "+ ( testState.players.get(1).discard.size()  ) );
			      System.out.println("numActions = " + state.players.get(1).numActions + ", expected = "+ ( testState.players.get(1).numActions  ) );
			     */
			      assertEquals(state.players.get(0).hand.size(),( testState.players.get(0).hand.size()- feastCount))      ;
			      assertEquals(state.players.get(0).deck.size(),( testState.players.get(0).deck.size() ))      ;
			      assertEquals(state.players.get(0).discard.size(),( testState.players.get(0).discard.size()  + gainedCount) );
			      assertTrue(state.trashPile.contains(Card.getCard(state.Supply, CardName.Feast)) );
		   }
	 
	 @Test
		public void greatHallTest()  throws Throwable  {	   
			    List<Card> cards;
			    GameState state,testState;
				Randomness.reset(10);	   

			    int gainedCount = 1;
			    int greatHallCount = 1;

			 // initialize a game state and player cards
				cards = new ArrayList<Card>(Card.createCards());
				 state = new GameState(cards);  			
			      Player player = new Player(state, "player-1");
			         player.hand.add(Card.getCard(cards,Card.CardName.Great_Hall));

			         state.addPlayer(player);
			       player = new Player(state, "player-2");
			         state.addPlayer(player);
			         
			      //Initialize the game!
			      state.initializeGame();
			      
			      System.out.println(state.players.get(0).player_username + "hand count = " + state.players.get(0).hand.size());
			      System.out.println(state.players.get(0).player_username + "deck = " + state.players.get(0).deck.size());
			      System.out.println(state.players.get(0).player_username + "coins = " + state.players.get(0).coins);
			      System.out.println(state.players.get(0).player_username + "numActions = " + state.players.get(0).numActions);
			      System.out.println(state.players.get(0).player_username + "numBuys = " + state.players.get(0).numBuys);
			      
			      System.out.println(state.players.get(1).player_username + "hand count = " + state.players.get(1).hand.size());
			      System.out.println(state.players.get(1).player_username + "deck = " + state.players.get(1).deck.size());
			      System.out.println(state.players.get(1).player_username + "coins = " + state.players.get(1).coins);
			      System.out.println(state.players.get(1).player_username + "numActions = " + state.players.get(1).numActions);
			      System.out.println(state.players.get(1).player_username + "numBuys = " + state.players.get(1).numBuys);
			      
			      //copy or clone the game state to a test case
			      testState=(GameState) state.clone();

			     //	play the game 
			      state.players.get(0).playKingdomCard();
			      /*
			      System.out.println("  *****    "+state.players.get(0).player_username +" Status ***** " );
			      System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = "+ ( testState.players.get(0).hand.size() + newCards - smithyCount) );
			      System.out.println("deck count = " + state.players.get(0).deck.size() + ", expected = "+ ( testState.players.get(0).deck.size() - newCards ) );
			      System.out.println("discard count = " + state.players.get(0).discard.size() + ", expected = "+ ( testState.players.get(0).discard.size()  + smithyCount) );
			      System.out.println("numActions = " + state.players.get(0).numActions + ", expected = "+ ( testState.players.get(0).numActions - 1 ) );
			      
			      System.out.println("  *****    "+state.players.get(1).player_username +" Status *****" );
			      System.out.println("hand count = " + state.players.get(1).hand.size() + ", expected = "+ ( testState.players.get(1).hand.size()  ) );
			      System.out.println("deck count = " + state.players.get(1).deck.size() + ", expected = "+ ( testState.players.get(1).deck.size()  ) );
			      System.out.println("discard count = " + state.players.get(1).discard.size() + ", expected = "+ ( testState.players.get(1).discard.size()  ) );
			      System.out.println("numActions = " + state.players.get(1).numActions + ", expected = "+ ( testState.players.get(1).numActions  ) );
			     */
			      assertEquals(state.players.get(0).hand.size(),( testState.players.get(0).hand.size()- greatHallCount + gainedCount))      ;
			      assertEquals(state.players.get(0).deck.size(),( testState.players.get(0).deck.size() - gainedCount))      ;
			      assertEquals(state.players.get(0).discard.size(),( testState.players.get(0).discard.size()  + greatHallCount) );
			      assertEquals(state.players.get(0).scoreFor(),( testState.players.get(1).scoreFor()  + greatHallCount) );
			      
		   }
	 
	 @Test
		public void mineTest()  throws Throwable  {	   
			    List<Card> cards;
			    GameState state,testState;
				Randomness.reset(10);	   

			    int gainedCount = 1;
			    int mineCount = 1;
			    int trashedCount = 1;
			 // initialize a game state and player cards
				cards = new ArrayList<Card>(Card.createCards());
				 state = new GameState(cards);  			
			      Player player = new Player(state, "player-1");

			         state.addPlayer(player);
			       player = new Player(state, "player-2");
			         state.addPlayer(player);
			         
			      //Initialize the game!
			      state.initializeGame();
			      state.players.get(0).hand.add(Card.getCard(cards,Card.CardName.Mine));
			      
			      System.out.println(state.players.get(0).player_username + "hand count = " + state.players.get(0).hand.size());
			      System.out.println(state.players.get(0).player_username + "deck = " + state.players.get(0).deck.size());
			      System.out.println(state.players.get(0).player_username + "coins = " + state.players.get(0).coins);
			      System.out.println(state.players.get(0).player_username + "numActions = " + state.players.get(0).numActions);
			      System.out.println(state.players.get(0).player_username + "numBuys = " + state.players.get(0).numBuys);
			      
			      System.out.println(state.players.get(1).player_username + "hand count = " + state.players.get(1).hand.size());
			      System.out.println(state.players.get(1).player_username + "deck = " + state.players.get(1).deck.size());
			      System.out.println(state.players.get(1).player_username + "coins = " + state.players.get(1).coins);
			      System.out.println(state.players.get(1).player_username + "numActions = " + state.players.get(1).numActions);
			      System.out.println(state.players.get(1).player_username + "numBuys = " + state.players.get(1).numBuys);
			      
			      //copy or clone the game state to a test case
			      testState=(GameState) state.clone();

			     //	play the game 
			      state.players.get(0).playKingdomCard();
			      
			      System.out.println("  *****    "+state.players.get(0).player_username +" Status ***** " );
			      System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = "+ ( testState.players.get(0).hand.size() - mineCount + gainedCount - trashedCount) );
			      /*
			      System.out.println("deck count = " + state.players.get(0).deck.size() + ", expected = "+ ( testState.players.get(0).deck.size()) );
			      System.out.println("discard count = " + state.players.get(0).discard.size() + ", expected = "+ ( testState.players.get(0).discard.size() ) );
			      System.out.println("numActions = " + state.players.get(0).numActions + ", expected = "+ ( testState.players.get(0).numActions - 1 ) );
			      
			      System.out.println("  *****    "+state.players.get(1).player_username +" Status *****" );
			      System.out.println("hand count = " + state.players.get(1).hand.size() + ", expected = "+ ( testState.players.get(1).hand.size()  ) );
			      System.out.println("deck count = " + state.players.get(1).deck.size() + ", expected = "+ ( testState.players.get(1).deck.size()  ) );
			      System.out.println("discard count = " + state.players.get(1).discard.size() + ", expected = "+ ( testState.players.get(1).discard.size()  ) );
			      System.out.println("numActions = " + state.players.get(1).numActions + ", expected = "+ ( testState.players.get(1).numActions  ) );
			     */
			      assertEquals(state.players.get(0).hand.size(),( testState.players.get(0).hand.size()- mineCount + gainedCount - trashedCount))      ;
			      assertEquals(state.players.get(0).deck.size(),( testState.players.get(0).deck.size()))      ;
			      assertEquals(state.players.get(0).discard.size(),( testState.players.get(0).discard.size()  + mineCount) );
			      assertTrue(state.trashPile.contains(Card.getCard(state.Supply, CardName.Copper)) );
			      
		   }
	 
	 @Test
		public void remodelTest()  throws Throwable  {	   
			    List<Card> cards;
			    GameState state,testState;
				Randomness.reset(10);	   

			    int gainedCount = 1;
			    int remodelcount = 1;
			    int trashedCount = 1;
			 // initialize a game state and player cards
				cards = new ArrayList<Card>(Card.createCards());
				 state = new GameState(cards);  			
			      Player player = new Player(state, "player-1");

			         state.addPlayer(player);
			       player = new Player(state, "player-2");
			         state.addPlayer(player);
			         
			      //Initialize the game!
			      state.initializeGame();
			      state.players.get(0).hand.add(Card.getCard(cards,Card.CardName.Remodel));
			      
			      System.out.println(state.players.get(0).player_username + "hand count = " + state.players.get(0).hand.size());
			      System.out.println(state.players.get(0).player_username + "deck = " + state.players.get(0).deck.size());
			      System.out.println(state.players.get(0).player_username + "coins = " + state.players.get(0).coins);
			      System.out.println(state.players.get(0).player_username + "numActions = " + state.players.get(0).numActions);
			      System.out.println(state.players.get(0).player_username + "numBuys = " + state.players.get(0).numBuys);
			      
			      System.out.println(state.players.get(1).player_username + "hand count = " + state.players.get(1).hand.size());
			      System.out.println(state.players.get(1).player_username + "deck = " + state.players.get(1).deck.size());
			      System.out.println(state.players.get(1).player_username + "coins = " + state.players.get(1).coins);
			      System.out.println(state.players.get(1).player_username + "numActions = " + state.players.get(1).numActions);
			      System.out.println(state.players.get(1).player_username + "numBuys = " + state.players.get(1).numBuys);
			      
			      //copy or clone the game state to a test case
			      testState=(GameState) state.clone();

			     //	play the game 
			      state.players.get(0).playKingdomCard();
			      
			      System.out.println("  *****    "+state.players.get(0).player_username +" Status ***** " );
			      System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = "+ ( testState.players.get(0).hand.size() - remodelcount - trashedCount) );
			      /*
			      System.out.println("deck count = " + state.players.get(0).deck.size() + ", expected = "+ ( testState.players.get(0).deck.size()) );
			      System.out.println("discard count = " + state.players.get(0).discard.size() + ", expected = "+ ( testState.players.get(0).discard.size() ) );
			      System.out.println("numActions = " + state.players.get(0).numActions + ", expected = "+ ( testState.players.get(0).numActions - 1 ) );
			      
			      System.out.println("  *****    "+state.players.get(1).player_username +" Status *****" );
			      System.out.println("hand count = " + state.players.get(1).hand.size() + ", expected = "+ ( testState.players.get(1).hand.size()  ) );
			      System.out.println("deck count = " + state.players.get(1).deck.size() + ", expected = "+ ( testState.players.get(1).deck.size()  ) );
			      System.out.println("discard count = " + state.players.get(1).discard.size() + ", expected = "+ ( testState.players.get(1).discard.size()  ) );
			      System.out.println("numActions = " + state.players.get(1).numActions + ", expected = "+ ( testState.players.get(1).numActions  ) );
			     */
			      assertEquals(state.players.get(0).hand.size(),( testState.players.get(0).hand.size()- remodelcount  - trashedCount))      ;
			      assertEquals(state.players.get(0).deck.size(),( testState.players.get(0).deck.size()))      ;
			      assertEquals(state.players.get(0).discard.size(),( testState.players.get(0).discard.size()  + remodelcount + gainedCount) );
			      assertTrue((state.trashPile.contains(Card.getCard(state.Supply, CardName.Copper)))||(state.trashPile.contains(Card.getCard(state.Supply, CardName.Estate))) );
			      
		   }
	 
	 @Test
		public void tributeTest()  throws Throwable  {	   
			    List<Card> cards;
			    GameState state,testState;
				Randomness.reset(10);	   

			    int drawCount = 2;
			    int tributeCount = 1;
			    int revealedCount = 2;
			 // initialize a game state and player cards
				cards = new ArrayList<Card>(Card.createCards());
				 state = new GameState(cards);  			
			      Player player = new Player(state, "player-1");

			         state.addPlayer(player);
			       player = new Player(state, "player-2");
			         state.addPlayer(player);
			         
			      //Initialize the game!
					  state.initializeGame();
				         

				  state.players.get(1).deck.addFirst(Card.getCard(cards,Card.CardName.Gold));
				  state.players.get(1).deck.addFirst(Card.getCard(cards,Card.CardName.Duchy));

			         
			      state.players.get(0).hand.add(Card.getCard(cards,Card.CardName.Tribute));
			      
			      System.out.println(state.players.get(0).player_username + "hand count = " + state.players.get(0).hand.size());
			      System.out.println(state.players.get(0).player_username + "deck = " + state.players.get(0).deck.size());
			      System.out.println(state.players.get(0).player_username + "coins = " + state.players.get(0).coins);
			      System.out.println(state.players.get(0).player_username + "numActions = " + state.players.get(0).numActions);
			      System.out.println(state.players.get(0).player_username + "numBuys = " + state.players.get(0).numBuys);
			      
			      System.out.println(state.players.get(1).player_username + "hand count = " + state.players.get(1).hand.size());
			      System.out.println(state.players.get(1).player_username + "deck = " + state.players.get(1).deck.size());
			      System.out.println(state.players.get(1).player_username + "coins = " + state.players.get(1).coins);
			      System.out.println(state.players.get(1).player_username + "numActions = " + state.players.get(1).numActions);
			      System.out.println(state.players.get(1).player_username + "numBuys = " + state.players.get(1).numBuys);
			      
			      //copy or clone the game state to a test case
			      testState=(GameState) state.clone();

			     //	play the game 
			      state.players.get(0).playKingdomCard();
			      
			      System.out.println("  *****    "+state.players.get(0).player_username +" Status ***** " );
			      System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = "+ ( testState.players.get(0).hand.size() - tributeCount + drawCount) );
			      System.out.println("numActions = " + state.players.get(0).numActions + ", expected = "+ ( testState.players.get(0).numActions + 1 ) );
			      /*
			      System.out.println("deck count = " + state.players.get(0).deck.size() + ", expected = "+ ( testState.players.get(0).deck.size()) );
			      System.out.println("discard count = " + state.players.get(0).discard.size() + ", expected = "+ ( testState.players.get(0).discard.size() ) );
			      
			      
			      System.out.println("  *****    "+state.players.get(1).player_username +" Status *****" );
			      System.out.println("hand count = " + state.players.get(1).hand.size() + ", expected = "+ ( testState.players.get(1).hand.size()  ) );
			      System.out.println("deck count = " + state.players.get(1).deck.size() + ", expected = "+ ( testState.players.get(1).deck.size()  ) );
			      System.out.println("discard count = " + state.players.get(1).discard.size() + ", expected = "+ ( testState.players.get(1).discard.size()  ) );
			      System.out.println("numActions = " + state.players.get(1).numActions + ", expected = "+ ( testState.players.get(1).numActions  ) );
			     */
			      assertEquals(state.players.get(0).hand.size(),( testState.players.get(0).hand.size()- tributeCount  + drawCount))      ;
			      assertEquals(state.players.get(0).deck.size(),( testState.players.get(0).deck.size() - drawCount))      ;
			      assertEquals(state.players.get(0).discard.size(),( testState.players.get(0).discard.size()  + tributeCount) );
			      assertEquals(state.players.get(0).coins,( testState.players.get(0).coins  + 2) );
			      assertEquals(state.players.get(1).discard.size(),( testState.players.get(1).discard.size()  + revealedCount) );
			      
		   }
	
}
