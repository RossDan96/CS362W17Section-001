package org.cs362.dominion;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

public class TestDominionRandom{
	
		@Test
		public void testDominion() throws Throwable {
		   
		    List<Card> Supply;
		    GameState state;
				   

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
		      
		      System.out.println("Initialization DominionBoard:\n " + state.toString());
		      HashMap<Player, Integer> winners=state.play();
		      System.out.println ("Finished game.\n");
		    
		      for(Player p: winners.keySet()){
		    	  System.out.println ("Player name: "+ p.player_username + " , Score: "+ winners.get(p) );
		    	  assertTrue(winners.get(p) != null);
		      }
		      assertTrue(state.toString() != null);
	//	      player.printStateGame();


	   }
	
	
}