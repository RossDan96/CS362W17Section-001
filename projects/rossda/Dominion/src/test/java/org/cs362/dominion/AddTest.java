package org.cs362.dominion;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.cs362.dominion.Card.CardName;
import org.junit.Test;

public class AddTest {

	@Test
	public void initializeTurnTest()  throws Throwable  {  
		List<Card> Supply;
		GameState state;
		Randomness.reset(10);	   

		System.out.println("START"); 
		
		//the cards  are achieved by each element/constant in the enum class 
		Supply = new ArrayList<Card>(Card.createCards());
		state = new GameState(Supply);
		int numPlayers = Randomness.nextRandomInt(3) + 2;
		String playername;
		for(int i =0; i<numPlayers; i++){
			  playername = ("player-" + Integer.toString(i+1));
			  Player player = new Player(state, playername);
			  player.printStateGame();
			  state.addPlayer(player);
		}
	  
		//Initialize the game!
		state.initializeGame();
		for(int j =0; j<numPlayers; j++){
			assertEquals(state.players.get(j).hand.size(),5);
		}
	}
	@Test
	public void gainTest()  throws Throwable  {	   
		    List<Card> cards;
		    GameState state,testState;
			Randomness.reset(10);	   

		    int newCards = 1;
		 // initialize a game state and player cards
			cards = new ArrayList<Card>(Card.createCards());
			 state = new GameState(cards);  			
		      Player player = new Player(state, "player-1");

		         state.addPlayer(player);
		       player = new Player(state, "player-2");
		         state.addPlayer(player);
		         
		      //Initialize the game!
		      state.initializeGame();
		      
			assertTrue(state.players.get(0).gain(Card.getCard(cards,Card.CardName.Copper)));
			for(int j =0; j<40; j++){
				state.players.get(0).gain(Card.getCard(cards,Card.CardName.Copper));
				state.updateBoard();
			}
			assertFalse(state.players.get(0).gain(Card.getCard(cards,Card.CardName.Copper)));

	   }
}
