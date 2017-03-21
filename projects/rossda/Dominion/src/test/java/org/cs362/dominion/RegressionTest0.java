package org.cs362.dominion;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }

    org.cs362.dominion.Card.CardName cardName0 = org.cs362.dominion.Card.CardName.Gardens;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + org.cs362.dominion.Card.CardName.Gardens + "'", cardName0.equals(org.cs362.dominion.Card.CardName.Gardens));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }

    java.lang.Iterable<org.cs362.dominion.Card> iterable_card0 = null;
    org.cs362.dominion.Card.Type type1 = org.cs362.dominion.Card.Type.ACTION;
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<org.cs362.dominion.Card> list_card2 = org.cs362.dominion.Card.filter(iterable_card0, type1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    org.junit.Assert.assertTrue("'" + type1 + "' != '" + org.cs362.dominion.Card.Type.ACTION + "'", type1.equals(org.cs362.dominion.Card.Type.ACTION));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }

    org.cs362.dominion.Randomness.totalCallsToRandom = '4';

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }

    long long0 = org.cs362.dominion.Randomness.SEED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long0 == 0L);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }

    org.cs362.dominion.Randomness.reset((long)(short)1);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }

    org.cs362.dominion.Card.CardName cardName0 = org.cs362.dominion.Card.CardName.Adventurer;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + org.cs362.dominion.Card.CardName.Adventurer + "'", cardName0.equals(org.cs362.dominion.Card.CardName.Adventurer));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }

    org.cs362.dominion.Card.CardName cardName0 = org.cs362.dominion.Card.CardName.Smithy;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + org.cs362.dominion.Card.CardName.Smithy + "'", cardName0.equals(org.cs362.dominion.Card.CardName.Smithy));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }

    org.cs362.dominion.Card.CardName cardName0 = org.cs362.dominion.Card.CardName.Council_Room;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + org.cs362.dominion.Card.CardName.Council_Room + "'", cardName0.equals(org.cs362.dominion.Card.CardName.Council_Room));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }

    org.cs362.dominion.Randomness.totalCallsToRandom = 0;

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Player player3 = new org.cs362.dominion.Player(gameState1, "hi!");
    // The following exception was thrown during execution in test generation
    try {
    player3.buyCard();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Player player3 = new org.cs362.dominion.Player(gameState1, "hi!");
    player3.playTreasureCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }

    boolean b0 = org.cs362.dominion.Randomness.nextBoolean();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b0 == true);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }

    org.cs362.dominion.Randomness.totalCallsToRandom = (byte)100;

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }

    org.cs362.dominion.Card.CardName cardName0 = org.cs362.dominion.Card.CardName.Embargo;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + org.cs362.dominion.Card.CardName.Embargo + "'", cardName0.equals(org.cs362.dominion.Card.CardName.Embargo));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }

    org.cs362.dominion.Card.CardName cardName0 = org.cs362.dominion.Card.CardName.Remodel;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + org.cs362.dominion.Card.CardName.Remodel + "'", cardName0.equals(org.cs362.dominion.Card.CardName.Remodel));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }

    org.cs362.dominion.Card.CardName cardName0 = org.cs362.dominion.Card.CardName.Mine;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + org.cs362.dominion.Card.CardName.Mine + "'", cardName0.equals(org.cs362.dominion.Card.CardName.Mine));

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }

    org.cs362.dominion.Card.CardName cardName0 = org.cs362.dominion.Card.CardName.Cutpurse;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + org.cs362.dominion.Card.CardName.Cutpurse + "'", cardName0.equals(org.cs362.dominion.Card.CardName.Cutpurse));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }

    org.cs362.dominion.Card.CardName cardName0 = org.cs362.dominion.Card.CardName.Province;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + org.cs362.dominion.Card.CardName.Province + "'", cardName0.equals(org.cs362.dominion.Card.CardName.Province));

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }

    boolean b0 = org.cs362.dominion.Randomness.nextChoice10();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b0 == true);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    gameState1.Supply = arraylist_card9;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i13 = null;
    gameState1.embargoed = hashmap_card_i13;
    java.util.List<org.cs362.dominion.Player> list_player15 = null;
    gameState1.players = list_player15;
    java.util.List<org.cs362.dominion.Card> list_card17 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState18 = new org.cs362.dominion.GameState(list_card17);
    org.cs362.dominion.Card card19 = null;
    gameState18.loseCard(card19);
    org.cs362.dominion.Card[] card_array21 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card22 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card22, card_array21);
    gameState18.onBoard = arraylist_card22;
    java.util.List<org.cs362.dominion.Card> list_card25 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState26 = new org.cs362.dominion.GameState(list_card25);
    org.cs362.dominion.Player player28 = new org.cs362.dominion.Player(gameState26, "hi!");
    org.cs362.dominion.Player[] player_array29 = new org.cs362.dominion.Player[] { player28 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player30 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b31 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player30, player_array29);
    gameState18.players = arraylist_player30;
    java.util.List<org.cs362.dominion.Card> list_card33 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState34 = new org.cs362.dominion.GameState(list_card33);
    org.cs362.dominion.Card card35 = null;
    gameState34.loseCard(card35);
    org.cs362.dominion.Card[] card_array37 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card38 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b39 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card38, card_array37);
    gameState34.onBoard = arraylist_card38;
    java.util.List<org.cs362.dominion.Card> list_card41 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState42 = new org.cs362.dominion.GameState(list_card41);
    org.cs362.dominion.Player player44 = new org.cs362.dominion.Player(gameState42, "hi!");
    org.cs362.dominion.Player[] player_array45 = new org.cs362.dominion.Player[] { player44 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player46 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b47 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player46, player_array45);
    gameState34.players = arraylist_player46;
    org.cs362.dominion.Player player49 = org.cs362.dominion.Randomness.randomMember((java.util.List<org.cs362.dominion.Player>)arraylist_player46);
    gameState18.addPlayer(player49);
    // The following exception was thrown during execution in test generation
    try {
    gameState1.addPlayer(player49);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player49);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }

    org.cs362.dominion.Card.CardName cardName0 = org.cs362.dominion.Card.CardName.Gold;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + org.cs362.dominion.Card.CardName.Gold + "'", cardName0.equals(org.cs362.dominion.Card.CardName.Gold));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.List<org.cs362.dominion.Card> list_card8 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState9 = new org.cs362.dominion.GameState(list_card8);
    org.cs362.dominion.Player player11 = new org.cs362.dominion.Player(gameState9, "hi!");
    org.cs362.dominion.Player[] player_array12 = new org.cs362.dominion.Player[] { player11 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player13 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player13, player_array12);
    gameState1.players = arraylist_player13;
    org.cs362.dominion.Player player16 = org.cs362.dominion.Randomness.randomMember((java.util.List<org.cs362.dominion.Player>)arraylist_player13);
    // The following exception was thrown during execution in test generation
    try {
    player16.buyCard();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player16);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card card4 = null;
    gameState1.loseCard(card4);
    // The following exception was thrown during execution in test generation
    try {
    org.cs362.dominion.GameState gameState6 = gameState1.clone();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }

    org.cs362.dominion.Randomness.totalCallsToRandom = 'a';

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }

    org.cs362.dominion.Card.CardName cardName0 = org.cs362.dominion.Card.CardName.Copper;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + org.cs362.dominion.Card.CardName.Copper + "'", cardName0.equals(org.cs362.dominion.Card.CardName.Copper));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }

    java.util.Random random0 = null;
    org.cs362.dominion.Randomness.random = random0;

  }
/*
  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }

    int i0 = org.cs362.dominion.Randomness.totalCallsToRandom;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 98);

  }
*/
  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }

    java.util.Random random0 = org.cs362.dominion.Randomness.random;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(random0);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }

    org.cs362.dominion.Randomness.reset((long)'4');

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    gameState1.Supply = arraylist_card9;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i13 = null;
    gameState1.embargoed = hashmap_card_i13;
    java.util.List<org.cs362.dominion.Player> list_player15 = null;
    gameState1.players = list_player15;
    // The following exception was thrown during execution in test generation
    try {
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i17 = gameState1.play();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }

    org.cs362.dominion.Card.Type type0 = org.cs362.dominion.Card.Type.TREASURE;
    org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.cs362.dominion.Card.Type.TREASURE + "'", type0.equals(org.cs362.dominion.Card.Type.TREASURE));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }

    org.cs362.dominion.Randomness.totalCallsToRandom = (byte)0;

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    gameState1.Supply = arraylist_card9;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i13 = null;
    gameState1.embargoed = hashmap_card_i13;
    java.util.List<org.cs362.dominion.Player> list_player15 = null;
    gameState1.players = list_player15;
    java.util.List<org.cs362.dominion.Card> list_card17 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState18 = new org.cs362.dominion.GameState(list_card17);
    org.cs362.dominion.Card card19 = null;
    gameState18.loseCard(card19);
    org.cs362.dominion.Card[] card_array21 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card22 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card22, card_array21);
    gameState18.onBoard = arraylist_card22;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i25 = gameState18.embargoed;
    gameState1.gameBoard = hashmap_card_i25;
    java.util.List<org.cs362.dominion.Card> list_card27 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState28 = new org.cs362.dominion.GameState(list_card27);
    org.cs362.dominion.Card card29 = null;
    gameState28.loseCard(card29);
    org.cs362.dominion.Card[] card_array31 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card32 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card32, card_array31);
    gameState28.onBoard = arraylist_card32;
    java.util.List<org.cs362.dominion.Card> list_card35 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState36 = new org.cs362.dominion.GameState(list_card35);
    org.cs362.dominion.Player player38 = new org.cs362.dominion.Player(gameState36, "hi!");
    org.cs362.dominion.Player[] player_array39 = new org.cs362.dominion.Player[] { player38 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player40 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player40, player_array39);
    gameState28.players = arraylist_player40;
    java.util.List<org.cs362.dominion.Card> list_card43 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState44 = new org.cs362.dominion.GameState(list_card43);
    org.cs362.dominion.Card card45 = null;
    gameState44.loseCard(card45);
    org.cs362.dominion.Card[] card_array47 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card48 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b49 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card48, card_array47);
    gameState44.onBoard = arraylist_card48;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i51 = gameState44.embargoed;
    gameState28.embargoed = hashmap_card_i51;
    gameState1.gameBoard = hashmap_card_i51;
    boolean b54 = gameState1.isGameOver();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);

  }
/*
  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }

    int i1 = org.cs362.dominion.Randomness.nextRandomInt((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 9);

  }
*/
  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.List<org.cs362.dominion.Card> list_card8 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState9 = new org.cs362.dominion.GameState(list_card8);
    org.cs362.dominion.Player player11 = new org.cs362.dominion.Player(gameState9, "hi!");
    org.cs362.dominion.Player[] player_array12 = new org.cs362.dominion.Player[] { player11 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player13 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player13, player_array12);
    gameState1.players = arraylist_player13;
    java.util.List<org.cs362.dominion.Card> list_card16 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState17 = new org.cs362.dominion.GameState(list_card16);
    org.cs362.dominion.Card card18 = null;
    gameState17.loseCard(card18);
    org.cs362.dominion.Card[] card_array20 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card21 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card21, card_array20);
    gameState17.onBoard = arraylist_card21;
    java.util.List<org.cs362.dominion.Card> list_card24 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState25 = new org.cs362.dominion.GameState(list_card24);
    org.cs362.dominion.Player player27 = new org.cs362.dominion.Player(gameState25, "hi!");
    org.cs362.dominion.Player[] player_array28 = new org.cs362.dominion.Player[] { player27 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player29 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player29, player_array28);
    gameState17.players = arraylist_player29;
    org.cs362.dominion.Player player32 = org.cs362.dominion.Randomness.randomMember((java.util.List<org.cs362.dominion.Player>)arraylist_player29);
    gameState1.addPlayer(player32);
    boolean b34 = gameState1.isGameOver();
    boolean b35 = gameState1.isGameOver();
    java.util.List<org.cs362.dominion.Card> list_card36 = gameState1.Supply;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card36);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }

    org.cs362.dominion.Randomness.reset(0L);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.List<org.cs362.dominion.Card> list_card8 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState9 = new org.cs362.dominion.GameState(list_card8);
    org.cs362.dominion.Player player11 = new org.cs362.dominion.Player(gameState9, "hi!");
    org.cs362.dominion.Player[] player_array12 = new org.cs362.dominion.Player[] { player11 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player13 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player13, player_array12);
    gameState1.players = arraylist_player13;
    java.util.List<org.cs362.dominion.Card> list_card16 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState17 = new org.cs362.dominion.GameState(list_card16);
    org.cs362.dominion.Card card18 = null;
    gameState17.loseCard(card18);
    org.cs362.dominion.Card[] card_array20 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card21 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card21, card_array20);
    gameState17.onBoard = arraylist_card21;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i24 = gameState17.embargoed;
    gameState1.embargoed = hashmap_card_i24;
    java.util.List<org.cs362.dominion.Card> list_card26 = gameState1.Supply;
    java.util.List<org.cs362.dominion.Card> list_card27 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState28 = new org.cs362.dominion.GameState(list_card27);
    org.cs362.dominion.Card card29 = null;
    gameState28.loseCard(card29);
    java.util.List<org.cs362.dominion.Card> list_card31 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState32 = new org.cs362.dominion.GameState(list_card31);
    org.cs362.dominion.Card card33 = null;
    gameState32.loseCard(card33);
    org.cs362.dominion.Card[] card_array35 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card36 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card36, card_array35);
    gameState32.onBoard = arraylist_card36;
    gameState28.Supply = arraylist_card36;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i40 = null;
    gameState28.embargoed = hashmap_card_i40;
    org.cs362.dominion.Player player43 = new org.cs362.dominion.Player(gameState28, "The board game is empty you need to intialize the game!!!!");
    gameState1.addPlayer(player43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }

    org.cs362.dominion.Randomness.reset((long)98);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }

    org.cs362.dominion.Randomness.reset((-1L));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }

    org.cs362.dominion.Card.CardName cardName0 = org.cs362.dominion.Card.CardName.Feast;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + org.cs362.dominion.Card.CardName.Feast + "'", cardName0.equals(org.cs362.dominion.Card.CardName.Feast));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState1.embargoed;
    java.lang.String str9 = gameState1.toString();
    boolean b10 = gameState1.isGameOver();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "The board game is empty you need to intialize the game!!!!"+ "'", str9.equals("The board game is empty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }

    org.cs362.dominion.Card.CardName cardName0 = org.cs362.dominion.Card.CardName.Ambassador;
    org.junit.Assert.assertTrue("'" + cardName0 + "' != '" + org.cs362.dominion.Card.CardName.Ambassador + "'", cardName0.equals(org.cs362.dominion.Card.CardName.Ambassador));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Player player3 = new org.cs362.dominion.Player(gameState1, "hi!");
    java.util.List<org.cs362.dominion.Player> list_player4 = gameState1.players;
    gameState1.updateBoard();
    java.util.List<org.cs362.dominion.Card> list_card6 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState7 = new org.cs362.dominion.GameState(list_card6);
    org.cs362.dominion.Player player9 = new org.cs362.dominion.Player(gameState7, "hi!");
    gameState1.addPlayer(player9);
    player9.printStateGame();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    gameState1.Supply = arraylist_card9;
    java.util.List<org.cs362.dominion.Card> list_card13 = gameState1.onBoard;
    org.cs362.dominion.Player player15 = new org.cs362.dominion.Player(gameState1, "hi!");
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i16 = gameState1.play();
    java.lang.String str17 = gameState1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "The board game is empty you need to intialize the game!!!!"+ "'", str17.equals("The board game is empty you need to intialize the game!!!!"));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card card4 = null;
    gameState1.loseCard(card4);
    gameState1.updateBoard();
    gameState1.updateBoard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);

  }
/*
  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card.Type type2 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card3 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card0, type2);
    org.cs362.dominion.Card card4 = org.cs362.dominion.Randomness.randomMember(list_card3);
    java.util.List<org.cs362.dominion.Card> list_card5 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState6 = new org.cs362.dominion.GameState(list_card5);
    org.cs362.dominion.Card.Type type7 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card8 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card5, type7);
    org.cs362.dominion.Card card9 = org.cs362.dominion.Randomness.randomMember(list_card8);
    org.cs362.dominion.Card.Type type10 = card9.getType();
    int i11 = card4.compareTo(card9);
    java.lang.String str12 = card4.toString();
    int i13 = card4.getCost();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type2.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    org.junit.Assert.assertTrue("'" + type7 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type7.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card9);
    org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type10.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + " \n\tCurse"+ "'", str12.equals(" \n\tCurse"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }
*/
  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }

    org.cs362.dominion.Randomness.reset(100L);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState1.embargoed;
    java.lang.String str9 = gameState1.toString();
    gameState1.updateBoard();
    java.util.List<org.cs362.dominion.Card> list_card11 = gameState1.Supply;
    org.cs362.dominion.Player player13 = new org.cs362.dominion.Player(gameState1, "");
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i14 = gameState1.play();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "The board game is empty you need to intialize the game!!!!"+ "'", str9.equals("The board game is empty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i14);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }

    org.cs362.dominion.Randomness.reset((long)(short)-1);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card.Type type2 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card3 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card0, type2);
    org.cs362.dominion.Card.CardName cardName4 = org.cs362.dominion.Card.CardName.Tribute;
    org.cs362.dominion.Card card5 = org.cs362.dominion.Card.getCard(list_card3, cardName4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type2.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card3);
    org.junit.Assert.assertTrue("'" + cardName4 + "' != '" + org.cs362.dominion.Card.CardName.Tribute + "'", cardName4.equals(org.cs362.dominion.Card.CardName.Tribute));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card5);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    gameState1.Supply = arraylist_card9;
    java.util.List<org.cs362.dominion.Card> list_card13 = gameState1.onBoard;
    org.cs362.dominion.Player player15 = new org.cs362.dominion.Player(gameState1, "hi!");
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i16 = gameState1.play();
    // The following exception was thrown during execution in test generation
    try {
    org.cs362.dominion.GameState gameState17 = gameState1.clone();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i16);

  }
/*
  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState1.embargoed;
    java.lang.String str9 = gameState1.toString();
    gameState1.updateBoard();
    java.util.List<org.cs362.dominion.Card> list_card11 = gameState1.Supply;
    org.cs362.dominion.Player player13 = new org.cs362.dominion.Player(gameState1, "");
    java.util.List<org.cs362.dominion.Card> list_card14 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState15 = new org.cs362.dominion.GameState(list_card14);
    org.cs362.dominion.Card card16 = null;
    gameState15.loseCard(card16);
    org.cs362.dominion.Card[] card_array18 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card19 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card19, card_array18);
    gameState15.onBoard = arraylist_card19;
    java.util.List<org.cs362.dominion.Card> list_card22 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState23 = new org.cs362.dominion.GameState(list_card22);
    org.cs362.dominion.Player player25 = new org.cs362.dominion.Player(gameState23, "hi!");
    org.cs362.dominion.Player[] player_array26 = new org.cs362.dominion.Player[] { player25 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player27 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player27, player_array26);
    gameState15.players = arraylist_player27;
    java.util.List<org.cs362.dominion.Card> list_card30 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState31 = new org.cs362.dominion.GameState(list_card30);
    org.cs362.dominion.Card card32 = null;
    gameState31.loseCard(card32);
    org.cs362.dominion.Card[] card_array34 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card35 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card35, card_array34);
    gameState31.onBoard = arraylist_card35;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i38 = gameState31.embargoed;
    gameState15.embargoed = hashmap_card_i38;
    java.util.List<org.cs362.dominion.Card> list_card40 = gameState15.Supply;
    org.cs362.dominion.GameState gameState41 = new org.cs362.dominion.GameState(list_card40);
    org.cs362.dominion.Card.CardName cardName42 = org.cs362.dominion.Card.CardName.Curse;
    org.cs362.dominion.Card card43 = org.cs362.dominion.Card.getCard(list_card40, cardName42);
    java.util.List<org.cs362.dominion.Card> list_card44 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState45 = new org.cs362.dominion.GameState(list_card44);
    org.cs362.dominion.Card.Type type46 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card47 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card44, type46);
    org.cs362.dominion.Card card48 = org.cs362.dominion.Randomness.randomMember(list_card47);
    java.util.List<org.cs362.dominion.Card> list_card49 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState50 = new org.cs362.dominion.GameState(list_card49);
    org.cs362.dominion.Card.Type type51 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card52 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card49, type51);
    org.cs362.dominion.Card card53 = org.cs362.dominion.Randomness.randomMember(list_card52);
    org.cs362.dominion.Card.Type type54 = card53.getType();
    int i55 = card48.compareTo(card53);
    int i56 = card43.compareTo(card48);
    player13.discard(card43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "The board game is empty you need to intialize the game!!!!"+ "'", str9.equals("The board game is empty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card40);
    org.junit.Assert.assertTrue("'" + cardName42 + "' != '" + org.cs362.dominion.Card.CardName.Curse + "'", cardName42.equals(org.cs362.dominion.Card.CardName.Curse));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card44);
    org.junit.Assert.assertTrue("'" + type46 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type46.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card49);
    org.junit.Assert.assertTrue("'" + type51 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type51.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card53);
    org.junit.Assert.assertTrue("'" + type54 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type54.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card.Type type2 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card3 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card0, type2);
    org.cs362.dominion.Card card4 = org.cs362.dominion.Randomness.randomMember(list_card3);
    java.util.List<org.cs362.dominion.Card> list_card5 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState6 = new org.cs362.dominion.GameState(list_card5);
    org.cs362.dominion.Card card7 = null;
    gameState6.loseCard(card7);
    org.cs362.dominion.Card[] card_array9 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card10 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card10, card_array9);
    gameState6.onBoard = arraylist_card10;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i13 = gameState6.embargoed;
    org.cs362.dominion.Player player15 = new org.cs362.dominion.Player(gameState6, "");
    player15.playTreasureCard();
    java.util.List<org.cs362.dominion.Card> list_card17 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState18 = new org.cs362.dominion.GameState(list_card17);
    org.cs362.dominion.Card.Type type19 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card20 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card17, type19);
    org.cs362.dominion.Card card21 = org.cs362.dominion.Randomness.randomMember(list_card20);
    java.util.List<org.cs362.dominion.Card> list_card22 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState23 = new org.cs362.dominion.GameState(list_card22);
    org.cs362.dominion.Card.Type type24 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card25 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card22, type24);
    org.cs362.dominion.Card card26 = org.cs362.dominion.Randomness.randomMember(list_card25);
    org.cs362.dominion.Card.Type type27 = card26.getType();
    int i28 = card21.compareTo(card26);
    int i29 = card26.score();
    player15.discard(card26);
    org.cs362.dominion.Card.Type type31 = card26.getType();
    int i32 = card26.getCost();
    int i33 = card26.getTreasureValue();
    int i34 = card4.compareTo(card26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type2.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);
    org.junit.Assert.assertTrue("'" + type19 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type19.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    org.junit.Assert.assertTrue("'" + type24 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type24.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card26);
    org.junit.Assert.assertTrue("'" + type27 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type27.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 3);
    org.junit.Assert.assertTrue("'" + type31 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type31.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == (-1));

  }
*/
  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.List<org.cs362.dominion.Card> list_card8 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState9 = new org.cs362.dominion.GameState(list_card8);
    org.cs362.dominion.Player player11 = new org.cs362.dominion.Player(gameState9, "hi!");
    org.cs362.dominion.Player[] player_array12 = new org.cs362.dominion.Player[] { player11 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player13 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player13, player_array12);
    gameState1.players = arraylist_player13;
    java.util.List<org.cs362.dominion.Card> list_card16 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState17 = new org.cs362.dominion.GameState(list_card16);
    org.cs362.dominion.Card card18 = null;
    gameState17.loseCard(card18);
    org.cs362.dominion.Card[] card_array20 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card21 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card21, card_array20);
    gameState17.onBoard = arraylist_card21;
    java.util.List<org.cs362.dominion.Card> list_card24 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState25 = new org.cs362.dominion.GameState(list_card24);
    org.cs362.dominion.Player player27 = new org.cs362.dominion.Player(gameState25, "hi!");
    org.cs362.dominion.Player[] player_array28 = new org.cs362.dominion.Player[] { player27 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player29 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player29, player_array28);
    gameState17.players = arraylist_player29;
    org.cs362.dominion.Player player32 = org.cs362.dominion.Randomness.randomMember((java.util.List<org.cs362.dominion.Player>)arraylist_player29);
    gameState1.addPlayer(player32);
    gameState1.updateBoard();
    // The following exception was thrown during execution in test generation
    try {
    gameState1.initializeGame();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player32);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.List<org.cs362.dominion.Card> list_card8 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState9 = new org.cs362.dominion.GameState(list_card8);
    org.cs362.dominion.Player player11 = new org.cs362.dominion.Player(gameState9, "hi!");
    org.cs362.dominion.Player[] player_array12 = new org.cs362.dominion.Player[] { player11 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player13 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player13, player_array12);
    gameState1.players = arraylist_player13;
    java.util.List<org.cs362.dominion.Card> list_card16 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState17 = new org.cs362.dominion.GameState(list_card16);
    org.cs362.dominion.Card card18 = null;
    gameState17.loseCard(card18);
    org.cs362.dominion.Card[] card_array20 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card21 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card21, card_array20);
    gameState17.onBoard = arraylist_card21;
    java.util.List<org.cs362.dominion.Card> list_card24 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState25 = new org.cs362.dominion.GameState(list_card24);
    org.cs362.dominion.Player player27 = new org.cs362.dominion.Player(gameState25, "hi!");
    org.cs362.dominion.Player[] player_array28 = new org.cs362.dominion.Player[] { player27 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player29 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player29, player_array28);
    gameState17.players = arraylist_player29;
    org.cs362.dominion.Player player32 = org.cs362.dominion.Randomness.randomMember((java.util.List<org.cs362.dominion.Player>)arraylist_player29);
    gameState1.addPlayer(player32);
    boolean b34 = gameState1.isGameOver();
    boolean b35 = gameState1.isGameOver();
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i36 = gameState1.play();
    java.util.List<org.cs362.dominion.Card> list_card37 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState38 = new org.cs362.dominion.GameState(list_card37);
    org.cs362.dominion.Card card39 = null;
    gameState38.loseCard(card39);
    org.cs362.dominion.Card[] card_array41 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card42 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b43 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card42, card_array41);
    gameState38.onBoard = arraylist_card42;
    java.util.List<org.cs362.dominion.Card> list_card45 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState46 = new org.cs362.dominion.GameState(list_card45);
    org.cs362.dominion.Player player48 = new org.cs362.dominion.Player(gameState46, "hi!");
    org.cs362.dominion.Player[] player_array49 = new org.cs362.dominion.Player[] { player48 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player50 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b51 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player50, player_array49);
    gameState38.players = arraylist_player50;
    org.cs362.dominion.Player player53 = org.cs362.dominion.Randomness.randomMember((java.util.List<org.cs362.dominion.Player>)arraylist_player50);
    gameState1.players = arraylist_player50;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player53);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.List<org.cs362.dominion.Card> list_card8 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState9 = new org.cs362.dominion.GameState(list_card8);
    org.cs362.dominion.Player player11 = new org.cs362.dominion.Player(gameState9, "hi!");
    org.cs362.dominion.Player[] player_array12 = new org.cs362.dominion.Player[] { player11 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player13 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player13, player_array12);
    gameState1.players = arraylist_player13;
    java.util.List<org.cs362.dominion.Card> list_card16 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState17 = new org.cs362.dominion.GameState(list_card16);
    org.cs362.dominion.Card card18 = null;
    gameState17.loseCard(card18);
    org.cs362.dominion.Card[] card_array20 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card21 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card21, card_array20);
    gameState17.onBoard = arraylist_card21;
    java.util.List<org.cs362.dominion.Card> list_card24 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState25 = new org.cs362.dominion.GameState(list_card24);
    org.cs362.dominion.Player player27 = new org.cs362.dominion.Player(gameState25, "hi!");
    org.cs362.dominion.Player[] player_array28 = new org.cs362.dominion.Player[] { player27 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player29 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player29, player_array28);
    gameState17.players = arraylist_player29;
    org.cs362.dominion.Player player32 = org.cs362.dominion.Randomness.randomMember((java.util.List<org.cs362.dominion.Player>)arraylist_player29);
    gameState1.addPlayer(player32);
    boolean b34 = gameState1.isGameOver();
    boolean b35 = gameState1.isGameOver();
    org.cs362.dominion.Card card36 = null;
    gameState1.loseCard(card36);
    java.lang.String str38 = gameState1.toString();
    java.util.List<org.cs362.dominion.Card> list_card39 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState40 = new org.cs362.dominion.GameState(list_card39);
    org.cs362.dominion.Card card41 = null;
    gameState40.loseCard(card41);
    org.cs362.dominion.Card[] card_array43 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card44 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b45 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card44, card_array43);
    gameState40.onBoard = arraylist_card44;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i47 = gameState40.embargoed;
    gameState1.gameBoard = hashmap_card_i47;
    java.util.List<org.cs362.dominion.Player> list_player49 = gameState1.players;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "The board game is empty you need to intialize the game!!!!"+ "'", str38.equals("The board game is empty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player49);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card.Type type2 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card3 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card0, type2);
    org.cs362.dominion.Card card4 = org.cs362.dominion.Randomness.randomMember(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type2.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card4);

  }
/*
  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState1.embargoed;
    org.cs362.dominion.Player player10 = new org.cs362.dominion.Player(gameState1, "");
    player10.playTreasureCard();
    java.util.List<org.cs362.dominion.Card> list_card12 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState13 = new org.cs362.dominion.GameState(list_card12);
    org.cs362.dominion.Card.Type type14 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card15 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card12, type14);
    org.cs362.dominion.Card card16 = org.cs362.dominion.Randomness.randomMember(list_card15);
    java.util.List<org.cs362.dominion.Card> list_card17 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState18 = new org.cs362.dominion.GameState(list_card17);
    org.cs362.dominion.Card.Type type19 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card20 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card17, type19);
    org.cs362.dominion.Card card21 = org.cs362.dominion.Randomness.randomMember(list_card20);
    org.cs362.dominion.Card.Type type22 = card21.getType();
    int i23 = card16.compareTo(card21);
    int i24 = card21.score();
    player10.discard(card21);
    org.cs362.dominion.Card.Type type26 = card21.getType();
    int i27 = card21.getCost();
    int i28 = card21.getTreasureValue();
    int i29 = card21.score();
    java.util.List<org.cs362.dominion.Card> list_card30 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState31 = new org.cs362.dominion.GameState(list_card30);
    org.cs362.dominion.Card card32 = null;
    gameState31.loseCard(card32);
    org.cs362.dominion.Card[] card_array34 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card35 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card35, card_array34);
    gameState31.onBoard = arraylist_card35;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i38 = gameState31.embargoed;
    org.cs362.dominion.Player player40 = new org.cs362.dominion.Player(gameState31, "");
    org.cs362.dominion.Player player42 = new org.cs362.dominion.Player(gameState31, "hi!");
    player42.printStateGame();
    java.util.List<org.cs362.dominion.Card> list_card44 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState45 = new org.cs362.dominion.GameState(list_card44);
    org.cs362.dominion.Card card46 = null;
    gameState45.loseCard(card46);
    org.cs362.dominion.Card[] card_array48 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card49 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b50 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card49, card_array48);
    gameState45.onBoard = arraylist_card49;
    java.util.List<org.cs362.dominion.Card> list_card52 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState53 = new org.cs362.dominion.GameState(list_card52);
    org.cs362.dominion.Player player55 = new org.cs362.dominion.Player(gameState53, "hi!");
    org.cs362.dominion.Player[] player_array56 = new org.cs362.dominion.Player[] { player55 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player57 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b58 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player57, player_array56);
    gameState45.players = arraylist_player57;
    java.util.List<org.cs362.dominion.Card> list_card60 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState61 = new org.cs362.dominion.GameState(list_card60);
    org.cs362.dominion.Card card62 = null;
    gameState61.loseCard(card62);
    org.cs362.dominion.Card[] card_array64 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card65 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b66 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card65, card_array64);
    gameState61.onBoard = arraylist_card65;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i68 = gameState61.embargoed;
    gameState45.embargoed = hashmap_card_i68;
    java.util.List<org.cs362.dominion.Card> list_card70 = gameState45.Supply;
    org.cs362.dominion.GameState gameState71 = new org.cs362.dominion.GameState(list_card70);
    card21.play(player42, gameState71);
    int i73 = card21.getTreasureValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card12);
    org.junit.Assert.assertTrue("'" + type14 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type14.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);
    org.junit.Assert.assertTrue("'" + type19 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type19.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card21);
    org.junit.Assert.assertTrue("'" + type22 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type22.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == (-10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    org.junit.Assert.assertTrue("'" + type26 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type26.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);

  }
*/
  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Player player3 = new org.cs362.dominion.Player(gameState1, "hi!");
    java.util.List<org.cs362.dominion.Player> list_player4 = gameState1.players;
    gameState1.updateBoard();
    java.util.List<org.cs362.dominion.Card> list_card6 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState7 = new org.cs362.dominion.GameState(list_card6);
    org.cs362.dominion.Player player9 = new org.cs362.dominion.Player(gameState7, "hi!");
    gameState1.addPlayer(player9);
    java.util.List<org.cs362.dominion.Card> list_card11 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState12 = new org.cs362.dominion.GameState(list_card11);
    org.cs362.dominion.Card card13 = null;
    gameState12.loseCard(card13);
    org.cs362.dominion.Card[] card_array15 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card16 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card16, card_array15);
    gameState12.onBoard = arraylist_card16;
    java.util.List<org.cs362.dominion.Card> list_card19 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState20 = new org.cs362.dominion.GameState(list_card19);
    org.cs362.dominion.Player player22 = new org.cs362.dominion.Player(gameState20, "hi!");
    org.cs362.dominion.Player[] player_array23 = new org.cs362.dominion.Player[] { player22 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player24 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player24, player_array23);
    gameState12.players = arraylist_player24;
    java.util.List<org.cs362.dominion.Card> list_card27 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState28 = new org.cs362.dominion.GameState(list_card27);
    org.cs362.dominion.Card card29 = null;
    gameState28.loseCard(card29);
    org.cs362.dominion.Card[] card_array31 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card32 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card32, card_array31);
    gameState28.onBoard = arraylist_card32;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i35 = gameState28.embargoed;
    gameState12.embargoed = hashmap_card_i35;
    java.util.List<org.cs362.dominion.Card> list_card37 = gameState12.Supply;
    org.cs362.dominion.GameState gameState38 = new org.cs362.dominion.GameState(list_card37);
    gameState1.Supply = list_card37;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card37);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState1.embargoed;
    java.lang.String str9 = gameState1.toString();
    // The following exception was thrown during execution in test generation
    try {
    org.cs362.dominion.GameState gameState10 = gameState1.clone();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "The board game is empty you need to intialize the game!!!!"+ "'", str9.equals("The board game is empty you need to intialize the game!!!!"));

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    org.cs362.dominion.Card card8 = null;
    gameState1.loseCard(card8);
    java.util.List<org.cs362.dominion.Card> list_card10 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState11 = new org.cs362.dominion.GameState(list_card10);
    org.cs362.dominion.Card card12 = null;
    gameState11.loseCard(card12);
    org.cs362.dominion.Card[] card_array14 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card15 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card15, card_array14);
    gameState11.onBoard = arraylist_card15;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i18 = gameState11.embargoed;
    gameState1.gameBoard = hashmap_card_i18;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i20 = gameState1.embargoed;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i20);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState1.embargoed;
    org.cs362.dominion.Player player10 = new org.cs362.dominion.Player(gameState1, "");
    org.cs362.dominion.Card[] card_array11 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card12 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card12, card_array11);
    int i14 = player10.lowestCost((java.util.List<org.cs362.dominion.Card>)arraylist_card12);
    java.lang.String str15 = player10.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + " ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str15.equals(" ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    gameState1.Supply = arraylist_card9;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i13 = null;
    gameState1.embargoed = hashmap_card_i13;
    java.util.List<org.cs362.dominion.Player> list_player15 = null;
    gameState1.players = list_player15;
    java.util.List<org.cs362.dominion.Card> list_card17 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState18 = new org.cs362.dominion.GameState(list_card17);
    org.cs362.dominion.Card card19 = null;
    gameState18.loseCard(card19);
    org.cs362.dominion.Card[] card_array21 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card22 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card22, card_array21);
    gameState18.onBoard = arraylist_card22;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i25 = gameState18.embargoed;
    gameState1.gameBoard = hashmap_card_i25;
    java.util.List<org.cs362.dominion.Card> list_card27 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState28 = new org.cs362.dominion.GameState(list_card27);
    org.cs362.dominion.Card card29 = null;
    gameState28.loseCard(card29);
    org.cs362.dominion.Card[] card_array31 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card32 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card32, card_array31);
    gameState28.onBoard = arraylist_card32;
    java.util.List<org.cs362.dominion.Card> list_card35 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState36 = new org.cs362.dominion.GameState(list_card35);
    org.cs362.dominion.Player player38 = new org.cs362.dominion.Player(gameState36, "hi!");
    org.cs362.dominion.Player[] player_array39 = new org.cs362.dominion.Player[] { player38 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player40 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player40, player_array39);
    gameState28.players = arraylist_player40;
    java.util.List<org.cs362.dominion.Card> list_card43 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState44 = new org.cs362.dominion.GameState(list_card43);
    org.cs362.dominion.Card card45 = null;
    gameState44.loseCard(card45);
    org.cs362.dominion.Card[] card_array47 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card48 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b49 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card48, card_array47);
    gameState44.onBoard = arraylist_card48;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i51 = gameState44.embargoed;
    gameState28.embargoed = hashmap_card_i51;
    gameState1.gameBoard = hashmap_card_i51;
    java.util.List<org.cs362.dominion.Card> list_card54 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState55 = new org.cs362.dominion.GameState(list_card54);
    java.util.List<org.cs362.dominion.Card> list_card56 = gameState55.trashPile;
    gameState1.Supply = list_card56;
    java.util.List<org.cs362.dominion.Card> list_card58 = gameState1.trashPile;
    java.util.List<org.cs362.dominion.Card> list_card59 = gameState1.trashPile;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card59);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i8 = gameState1.play();
    java.util.List<org.cs362.dominion.Card> list_card9 = gameState1.trashPile;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card9);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    org.cs362.dominion.Card.Type type8 = org.cs362.dominion.Card.Type.ACTION;
    java.util.List<org.cs362.dominion.Card> list_card9 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)arraylist_card5, type8);
    // The following exception was thrown during execution in test generation
    try {
    org.cs362.dominion.Card card10 = org.cs362.dominion.Randomness.randomMember((java.util.List<org.cs362.dominion.Card>)arraylist_card5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    org.junit.Assert.assertTrue("'" + type8 + "' != '" + org.cs362.dominion.Card.Type.ACTION + "'", type8.equals(org.cs362.dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card9);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    gameState1.Supply = arraylist_card9;
    java.util.List<org.cs362.dominion.Card> list_card13 = gameState1.onBoard;
    org.cs362.dominion.Player player15 = new org.cs362.dominion.Player(gameState1, "hi!");
    java.lang.String str16 = player15.toString();
    java.lang.String str17 = player15.toString();
    player15.printStateGame();
    player15.playTreasureCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str16.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str17.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    gameState1.Supply = arraylist_card9;
    java.util.List<org.cs362.dominion.Card> list_card13 = gameState1.onBoard;
    org.cs362.dominion.Player player15 = new org.cs362.dominion.Player(gameState1, "hi!");
    java.lang.String str16 = player15.toString();
    java.lang.String str17 = player15.toString();
    player15.playTreasureCard();
    player15.printStateGame();
    // The following exception was thrown during execution in test generation
    try {
    player15.buyCard();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str16.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str17.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }

    org.cs362.dominion.Randomness.totalCallsToRandom = (short)1;

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState1.embargoed;
    org.cs362.dominion.Player player10 = new org.cs362.dominion.Player(gameState1, "");
    org.cs362.dominion.Player player12 = new org.cs362.dominion.Player(gameState1, "hi!");
    java.lang.String str13 = player12.toString();
    player12.playTreasureCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str13.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }

    org.cs362.dominion.GameState gameState0 = null;
    org.cs362.dominion.Player player2 = new org.cs362.dominion.Player(gameState0, " \n\tProvince");

  }
/*
  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }

    int i1 = org.cs362.dominion.Randomness.nextRandomInt(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }
*/
  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    gameState1.Supply = arraylist_card9;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i13 = null;
    gameState1.embargoed = hashmap_card_i13;
    java.util.List<org.cs362.dominion.Player> list_player15 = null;
    gameState1.players = list_player15;
    java.util.List<org.cs362.dominion.Card> list_card17 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState18 = new org.cs362.dominion.GameState(list_card17);
    org.cs362.dominion.Card card19 = null;
    gameState18.loseCard(card19);
    org.cs362.dominion.Card[] card_array21 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card22 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card22, card_array21);
    gameState18.onBoard = arraylist_card22;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i25 = gameState18.embargoed;
    gameState1.gameBoard = hashmap_card_i25;
    java.util.List<org.cs362.dominion.Card> list_card27 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState28 = new org.cs362.dominion.GameState(list_card27);
    org.cs362.dominion.Card card29 = null;
    gameState28.loseCard(card29);
    org.cs362.dominion.Card[] card_array31 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card32 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card32, card_array31);
    gameState28.onBoard = arraylist_card32;
    java.util.List<org.cs362.dominion.Card> list_card35 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState36 = new org.cs362.dominion.GameState(list_card35);
    org.cs362.dominion.Player player38 = new org.cs362.dominion.Player(gameState36, "hi!");
    org.cs362.dominion.Player[] player_array39 = new org.cs362.dominion.Player[] { player38 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player40 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player40, player_array39);
    gameState28.players = arraylist_player40;
    java.util.List<org.cs362.dominion.Card> list_card43 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState44 = new org.cs362.dominion.GameState(list_card43);
    org.cs362.dominion.Card card45 = null;
    gameState44.loseCard(card45);
    org.cs362.dominion.Card[] card_array47 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card48 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b49 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card48, card_array47);
    gameState44.onBoard = arraylist_card48;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i51 = gameState44.embargoed;
    gameState28.embargoed = hashmap_card_i51;
    gameState1.gameBoard = hashmap_card_i51;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i54 = gameState1.embargoed;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(hashmap_card_i54);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }

    org.cs362.dominion.Randomness.totalCallsToRandom = 6;

  }
/*
  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState1.embargoed;
    org.cs362.dominion.Player player10 = new org.cs362.dominion.Player(gameState1, "");
    player10.playTreasureCard();
    java.util.List<org.cs362.dominion.Card> list_card12 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState13 = new org.cs362.dominion.GameState(list_card12);
    org.cs362.dominion.Card.Type type14 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card15 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card12, type14);
    org.cs362.dominion.Card card16 = org.cs362.dominion.Randomness.randomMember(list_card15);
    java.util.List<org.cs362.dominion.Card> list_card17 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState18 = new org.cs362.dominion.GameState(list_card17);
    org.cs362.dominion.Card.Type type19 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card20 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card17, type19);
    org.cs362.dominion.Card card21 = org.cs362.dominion.Randomness.randomMember(list_card20);
    org.cs362.dominion.Card.Type type22 = card21.getType();
    int i23 = card16.compareTo(card21);
    int i24 = card21.score();
    player10.discard(card21);
    org.cs362.dominion.Card.Type type26 = card21.getType();
    int i27 = card21.getCost();
    int i28 = card21.getTreasureValue();
    int i29 = card21.score();
    int i30 = card21.score();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card12);
    org.junit.Assert.assertTrue("'" + type14 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type14.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);
    org.junit.Assert.assertTrue("'" + type19 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type19.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card21);
    org.junit.Assert.assertTrue("'" + type22 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type22.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == (-2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3);
    org.junit.Assert.assertTrue("'" + type26 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type26.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 3);

  }
*/
  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.List<org.cs362.dominion.Card> list_card8 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState9 = new org.cs362.dominion.GameState(list_card8);
    org.cs362.dominion.Player player11 = new org.cs362.dominion.Player(gameState9, "hi!");
    org.cs362.dominion.Player[] player_array12 = new org.cs362.dominion.Player[] { player11 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player13 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player13, player_array12);
    gameState1.players = arraylist_player13;
    java.util.List<org.cs362.dominion.Card> list_card16 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState17 = new org.cs362.dominion.GameState(list_card16);
    org.cs362.dominion.Card card18 = null;
    gameState17.loseCard(card18);
    org.cs362.dominion.Card[] card_array20 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card21 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card21, card_array20);
    gameState17.onBoard = arraylist_card21;
    java.util.List<org.cs362.dominion.Card> list_card24 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState25 = new org.cs362.dominion.GameState(list_card24);
    org.cs362.dominion.Player player27 = new org.cs362.dominion.Player(gameState25, "hi!");
    org.cs362.dominion.Player[] player_array28 = new org.cs362.dominion.Player[] { player27 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player29 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player29, player_array28);
    gameState17.players = arraylist_player29;
    org.cs362.dominion.Player player32 = org.cs362.dominion.Randomness.randomMember((java.util.List<org.cs362.dominion.Player>)arraylist_player29);
    gameState1.addPlayer(player32);
    java.util.List<org.cs362.dominion.Card> list_card34 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState35 = new org.cs362.dominion.GameState(list_card34);
    org.cs362.dominion.Card card36 = null;
    gameState35.loseCard(card36);
    org.cs362.dominion.Card[] card_array38 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card39 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b40 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card39, card_array38);
    gameState35.onBoard = arraylist_card39;
    java.util.List<org.cs362.dominion.Card> list_card42 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState43 = new org.cs362.dominion.GameState(list_card42);
    org.cs362.dominion.Player player45 = new org.cs362.dominion.Player(gameState43, "hi!");
    org.cs362.dominion.Player[] player_array46 = new org.cs362.dominion.Player[] { player45 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player47 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b48 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player47, player_array46);
    gameState35.players = arraylist_player47;
    java.util.List<org.cs362.dominion.Card> list_card50 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState51 = new org.cs362.dominion.GameState(list_card50);
    org.cs362.dominion.Card card52 = null;
    gameState51.loseCard(card52);
    org.cs362.dominion.Card[] card_array54 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card55 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b56 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card55, card_array54);
    gameState51.onBoard = arraylist_card55;
    java.util.List<org.cs362.dominion.Card> list_card58 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState59 = new org.cs362.dominion.GameState(list_card58);
    org.cs362.dominion.Player player61 = new org.cs362.dominion.Player(gameState59, "hi!");
    org.cs362.dominion.Player[] player_array62 = new org.cs362.dominion.Player[] { player61 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player63 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b64 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player63, player_array62);
    gameState51.players = arraylist_player63;
    org.cs362.dominion.Player player66 = org.cs362.dominion.Randomness.randomMember((java.util.List<org.cs362.dominion.Player>)arraylist_player63);
    gameState35.addPlayer(player66);
    boolean b68 = gameState35.isGameOver();
    boolean b69 = gameState35.isGameOver();
    org.cs362.dominion.Card card70 = null;
    gameState35.loseCard(card70);
    java.lang.String str72 = gameState35.toString();
    java.util.List<org.cs362.dominion.Card> list_card73 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState74 = new org.cs362.dominion.GameState(list_card73);
    org.cs362.dominion.Card card75 = null;
    gameState74.loseCard(card75);
    org.cs362.dominion.Card[] card_array77 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card78 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b79 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card78, card_array77);
    gameState74.onBoard = arraylist_card78;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i81 = gameState74.embargoed;
    gameState35.gameBoard = hashmap_card_i81;
    gameState1.gameBoard = hashmap_card_i81;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str72 + "' != '" + "The board game is empty you need to intialize the game!!!!"+ "'", str72.equals("The board game is empty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i81);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }

    org.cs362.dominion.Randomness.totalCallsToRandom = 98;

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    gameState1.Supply = arraylist_card9;
    org.cs362.dominion.Player player14 = new org.cs362.dominion.Player(gameState1, " ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    org.cs362.dominion.Card card8 = null;
    gameState1.loseCard(card8);
    java.util.List<org.cs362.dominion.Card> list_card10 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState11 = new org.cs362.dominion.GameState(list_card10);
    org.cs362.dominion.Card card12 = null;
    gameState11.loseCard(card12);
    org.cs362.dominion.Card[] card_array14 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card15 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card15, card_array14);
    gameState11.onBoard = arraylist_card15;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i18 = gameState11.embargoed;
    org.cs362.dominion.Player player20 = new org.cs362.dominion.Player(gameState11, "");
    gameState1.addPlayer(player20);
    java.lang.String str22 = gameState1.toString();
    gameState1.updateBoard();
    java.util.List<org.cs362.dominion.Card> list_card24 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState25 = new org.cs362.dominion.GameState(list_card24);
    org.cs362.dominion.Card card26 = null;
    gameState25.loseCard(card26);
    java.util.List<org.cs362.dominion.Card> list_card28 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState29 = new org.cs362.dominion.GameState(list_card28);
    org.cs362.dominion.Card card30 = null;
    gameState29.loseCard(card30);
    org.cs362.dominion.Card[] card_array32 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card33 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b34 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card33, card_array32);
    gameState29.onBoard = arraylist_card33;
    gameState25.Supply = arraylist_card33;
    gameState1.trashPile = arraylist_card33;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "The board game is empty you need to intialize the game!!!!"+ "'", str22.equals("The board game is empty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }
/*
  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card.Type type2 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card3 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card0, type2);
    org.cs362.dominion.Card card4 = org.cs362.dominion.Randomness.randomMember(list_card3);
    org.cs362.dominion.Card.Type type5 = card4.getType();
    java.lang.String str6 = card4.toString();
    int i7 = card4.score();
    org.cs362.dominion.Card.CardName cardName8 = card4.getCardName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type2.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card4);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type5.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + " \n\tGardens"+ "'", str6.equals(" \n\tGardens"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    org.junit.Assert.assertTrue("'" + cardName8 + "' != '" + org.cs362.dominion.Card.CardName.Gardens + "'", cardName8.equals(org.cs362.dominion.Card.CardName.Gardens));

  }
*/
  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card card4 = null;
    gameState1.loseCard(card4);
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i6 = gameState1.play();
    java.util.List<org.cs362.dominion.Card> list_card7 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState8 = new org.cs362.dominion.GameState(list_card7);
    org.cs362.dominion.Card card9 = null;
    gameState8.loseCard(card9);
    org.cs362.dominion.Card[] card_array11 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card12 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card12, card_array11);
    gameState8.onBoard = arraylist_card12;
    java.util.List<org.cs362.dominion.Card> list_card15 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState16 = new org.cs362.dominion.GameState(list_card15);
    org.cs362.dominion.Player player18 = new org.cs362.dominion.Player(gameState16, "hi!");
    org.cs362.dominion.Player[] player_array19 = new org.cs362.dominion.Player[] { player18 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player20 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player20, player_array19);
    gameState8.players = arraylist_player20;
    java.util.List<org.cs362.dominion.Card> list_card23 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState24 = new org.cs362.dominion.GameState(list_card23);
    org.cs362.dominion.Card card25 = null;
    gameState24.loseCard(card25);
    org.cs362.dominion.Card[] card_array27 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card28 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card28, card_array27);
    gameState24.onBoard = arraylist_card28;
    java.util.List<org.cs362.dominion.Card> list_card31 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState32 = new org.cs362.dominion.GameState(list_card31);
    org.cs362.dominion.Player player34 = new org.cs362.dominion.Player(gameState32, "hi!");
    org.cs362.dominion.Player[] player_array35 = new org.cs362.dominion.Player[] { player34 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player36 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player36, player_array35);
    gameState24.players = arraylist_player36;
    org.cs362.dominion.Player player39 = org.cs362.dominion.Randomness.randomMember((java.util.List<org.cs362.dominion.Player>)arraylist_player36);
    gameState8.addPlayer(player39);
    boolean b41 = gameState8.isGameOver();
    boolean b42 = gameState8.isGameOver();
    org.cs362.dominion.Card card43 = null;
    gameState8.loseCard(card43);
    java.util.List<org.cs362.dominion.Card> list_card45 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState46 = new org.cs362.dominion.GameState(list_card45);
    org.cs362.dominion.Player player48 = new org.cs362.dominion.Player(gameState46, "hi!");
    java.util.List<org.cs362.dominion.Card> list_card49 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState50 = new org.cs362.dominion.GameState(list_card49);
    org.cs362.dominion.Card card51 = null;
    gameState50.loseCard(card51);
    org.cs362.dominion.Card[] card_array53 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card54 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b55 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card54, card_array53);
    gameState50.onBoard = arraylist_card54;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i57 = gameState50.embargoed;
    java.util.List<org.cs362.dominion.Player> list_player58 = gameState50.players;
    gameState46.players = list_player58;
    gameState8.players = list_player58;
    gameState1.players = list_player58;
    // The following exception was thrown during execution in test generation
    try {
    org.cs362.dominion.GameState gameState62 = gameState1.clone();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player58);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    gameState1.Supply = arraylist_card9;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i13 = null;
    gameState1.embargoed = hashmap_card_i13;
    org.cs362.dominion.Player player16 = new org.cs362.dominion.Player(gameState1, "The board game is empty you need to intialize the game!!!!");
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i17 = gameState1.gameBoard;
    boolean b18 = gameState1.isGameOver();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Player player3 = new org.cs362.dominion.Player(gameState1, "hi!");
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i12 = gameState5.embargoed;
    java.util.List<org.cs362.dominion.Player> list_player13 = gameState5.players;
    gameState1.players = list_player13;
    gameState1.initializeGame();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player13);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card.Type type2 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card3 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card0, type2);
    org.cs362.dominion.Card.Type type4 = org.cs362.dominion.Card.Type.ACTION;
    java.util.List<org.cs362.dominion.Card> list_card5 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card0, type4);
    org.cs362.dominion.GameState gameState6 = new org.cs362.dominion.GameState(list_card5);
    org.cs362.dominion.GameState gameState7 = new org.cs362.dominion.GameState(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type2.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card3);
    org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.cs362.dominion.Card.Type.ACTION + "'", type4.equals(org.cs362.dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.List<org.cs362.dominion.Card> list_card8 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState9 = new org.cs362.dominion.GameState(list_card8);
    org.cs362.dominion.Player player11 = new org.cs362.dominion.Player(gameState9, "hi!");
    org.cs362.dominion.Player[] player_array12 = new org.cs362.dominion.Player[] { player11 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player13 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player13, player_array12);
    gameState1.players = arraylist_player13;
    java.util.List<org.cs362.dominion.Card> list_card16 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState17 = new org.cs362.dominion.GameState(list_card16);
    org.cs362.dominion.Card card18 = null;
    gameState17.loseCard(card18);
    org.cs362.dominion.Card[] card_array20 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card21 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card21, card_array20);
    gameState17.onBoard = arraylist_card21;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i24 = gameState17.embargoed;
    gameState1.embargoed = hashmap_card_i24;
    java.util.List<org.cs362.dominion.Card> list_card26 = gameState1.Supply;
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i27 = gameState1.play();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i27);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.List<org.cs362.dominion.Card> list_card8 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState9 = new org.cs362.dominion.GameState(list_card8);
    org.cs362.dominion.Player player11 = new org.cs362.dominion.Player(gameState9, "hi!");
    org.cs362.dominion.Player[] player_array12 = new org.cs362.dominion.Player[] { player11 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player13 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player13, player_array12);
    gameState1.players = arraylist_player13;
    java.util.List<org.cs362.dominion.Card> list_card16 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState17 = new org.cs362.dominion.GameState(list_card16);
    org.cs362.dominion.Card card18 = null;
    gameState17.loseCard(card18);
    org.cs362.dominion.Card[] card_array20 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card21 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card21, card_array20);
    gameState17.onBoard = arraylist_card21;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i24 = gameState17.embargoed;
    gameState1.embargoed = hashmap_card_i24;
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i26 = gameState1.getWinners();
    java.util.List<org.cs362.dominion.Card> list_card27 = gameState1.Supply;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card27);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState1.embargoed;
    java.lang.String str9 = gameState1.toString();
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i10 = gameState1.getWinners();
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i11 = gameState1.play();
    gameState1.updateBoard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "The board game is empty you need to intialize the game!!!!"+ "'", str9.equals("The board game is empty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i11);

  }
/*
  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    gameState1.Supply = arraylist_card9;
    java.util.List<org.cs362.dominion.Card> list_card13 = gameState1.onBoard;
    org.cs362.dominion.Player player15 = new org.cs362.dominion.Player(gameState1, "hi!");
    java.lang.String str16 = player15.toString();
    java.lang.String str17 = player15.toString();
    player15.playKingdomCard();
    java.util.List<org.cs362.dominion.Card> list_card19 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState20 = new org.cs362.dominion.GameState(list_card19);
    org.cs362.dominion.Card card21 = null;
    gameState20.loseCard(card21);
    org.cs362.dominion.Card[] card_array23 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card24 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card24, card_array23);
    gameState20.onBoard = arraylist_card24;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i27 = gameState20.embargoed;
    org.cs362.dominion.Player player29 = new org.cs362.dominion.Player(gameState20, "");
    java.util.List<org.cs362.dominion.Card> list_card30 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState31 = new org.cs362.dominion.GameState(list_card30);
    org.cs362.dominion.Card.Type type32 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card33 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card30, type32);
    org.cs362.dominion.Card card34 = org.cs362.dominion.Randomness.randomMember(list_card33);
    java.util.List<org.cs362.dominion.Card> list_card35 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState36 = new org.cs362.dominion.GameState(list_card35);
    org.cs362.dominion.Card.Type type37 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card38 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card35, type37);
    org.cs362.dominion.Card card39 = org.cs362.dominion.Randomness.randomMember(list_card38);
    org.cs362.dominion.Card.Type type40 = card39.getType();
    int i41 = card34.compareTo(card39);
    player29.discard(card39);
    player15.discard(card39);
    org.cs362.dominion.Card.CardName cardName44 = card39.getCardName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str16.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str17.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card30);
    org.junit.Assert.assertTrue("'" + type32 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type32.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card35);
    org.junit.Assert.assertTrue("'" + type37 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type37.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card39);
    org.junit.Assert.assertTrue("'" + type40 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type40.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == (-2));
    org.junit.Assert.assertTrue("'" + cardName44 + "' != '" + org.cs362.dominion.Card.CardName.Curse + "'", cardName44.equals(org.cs362.dominion.Card.CardName.Curse));

  }
*/
  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Player player3 = new org.cs362.dominion.Player(gameState1, "hi!");
    java.util.List<org.cs362.dominion.Player> list_player4 = gameState1.players;
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i5 = gameState1.play();
    java.util.List<org.cs362.dominion.Player> list_player6 = gameState1.players;
    // The following exception was thrown during execution in test generation
    try {
    org.cs362.dominion.Player player7 = org.cs362.dominion.Randomness.randomMember(list_player6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player6);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    gameState1.Supply = arraylist_card9;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i13 = null;
    gameState1.embargoed = hashmap_card_i13;
    java.util.List<org.cs362.dominion.Player> list_player15 = null;
    gameState1.players = list_player15;
    java.util.List<org.cs362.dominion.Card> list_card17 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState18 = new org.cs362.dominion.GameState(list_card17);
    org.cs362.dominion.Card card19 = null;
    gameState18.loseCard(card19);
    org.cs362.dominion.Card[] card_array21 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card22 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card22, card_array21);
    gameState18.onBoard = arraylist_card22;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i25 = gameState18.embargoed;
    gameState1.gameBoard = hashmap_card_i25;
    java.util.List<org.cs362.dominion.Card> list_card27 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState28 = new org.cs362.dominion.GameState(list_card27);
    org.cs362.dominion.Card card29 = null;
    gameState28.loseCard(card29);
    org.cs362.dominion.Card[] card_array31 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card32 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card32, card_array31);
    gameState28.onBoard = arraylist_card32;
    java.util.List<org.cs362.dominion.Card> list_card35 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState36 = new org.cs362.dominion.GameState(list_card35);
    org.cs362.dominion.Player player38 = new org.cs362.dominion.Player(gameState36, "hi!");
    org.cs362.dominion.Player[] player_array39 = new org.cs362.dominion.Player[] { player38 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player40 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player40, player_array39);
    gameState28.players = arraylist_player40;
    java.util.List<org.cs362.dominion.Card> list_card43 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState44 = new org.cs362.dominion.GameState(list_card43);
    org.cs362.dominion.Card card45 = null;
    gameState44.loseCard(card45);
    org.cs362.dominion.Card[] card_array47 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card48 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b49 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card48, card_array47);
    gameState44.onBoard = arraylist_card48;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i51 = gameState44.embargoed;
    gameState28.embargoed = hashmap_card_i51;
    gameState1.gameBoard = hashmap_card_i51;
    java.util.List<org.cs362.dominion.Card> list_card54 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState55 = new org.cs362.dominion.GameState(list_card54);
    java.util.List<org.cs362.dominion.Card> list_card56 = gameState55.trashPile;
    gameState1.Supply = list_card56;
    java.util.List<org.cs362.dominion.Card> list_card58 = gameState1.trashPile;
    java.util.List<org.cs362.dominion.Card> list_card59 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState60 = new org.cs362.dominion.GameState(list_card59);
    org.cs362.dominion.Card card61 = null;
    gameState60.loseCard(card61);
    java.util.List<org.cs362.dominion.Card> list_card63 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState64 = new org.cs362.dominion.GameState(list_card63);
    org.cs362.dominion.Card card65 = null;
    gameState64.loseCard(card65);
    org.cs362.dominion.Card[] card_array67 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card68 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b69 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card68, card_array67);
    gameState64.onBoard = arraylist_card68;
    gameState60.Supply = arraylist_card68;
    java.util.List<org.cs362.dominion.Card> list_card72 = gameState60.onBoard;
    org.cs362.dominion.Player player74 = new org.cs362.dominion.Player(gameState60, "hi!");
    java.lang.String str75 = player74.toString();
    java.lang.String str76 = player74.toString();
    player74.playTreasureCard();
    player74.printStateGame();
    // The following exception was thrown during execution in test generation
    try {
    gameState1.addPlayer(player74);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str75 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str75.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str76 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str76.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    gameState1.Supply = arraylist_card9;
    java.util.List<org.cs362.dominion.Card> list_card13 = gameState1.onBoard;
    org.cs362.dominion.Player player15 = new org.cs362.dominion.Player(gameState1, "hi!");
    java.lang.String str16 = player15.toString();
    java.lang.String str17 = player15.toString();
    player15.playTreasureCard();
    player15.playKingdomCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str16.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str17.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    gameState1.Supply = arraylist_card9;
    java.util.List<org.cs362.dominion.Card> list_card13 = gameState1.onBoard;
    org.cs362.dominion.Card card14 = null;
    gameState1.loseCard(card14);
    org.cs362.dominion.Player player17 = new org.cs362.dominion.Player(gameState1, "The board game is empty you need to intialize the game!!!!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    gameState1.initializeGame();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }
/*
  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card.Type type2 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card3 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card0, type2);
    org.cs362.dominion.Card card4 = org.cs362.dominion.Randomness.randomMember(list_card3);
    java.util.List<org.cs362.dominion.Card> list_card5 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState6 = new org.cs362.dominion.GameState(list_card5);
    org.cs362.dominion.Card.Type type7 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card8 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card5, type7);
    org.cs362.dominion.Card card9 = org.cs362.dominion.Randomness.randomMember(list_card8);
    org.cs362.dominion.Card.Type type10 = card9.getType();
    int i11 = card4.compareTo(card9);
    org.cs362.dominion.Card.CardName cardName12 = card9.getCardName();
    java.util.List<org.cs362.dominion.Card> list_card13 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState14 = new org.cs362.dominion.GameState(list_card13);
    org.cs362.dominion.Card card15 = null;
    gameState14.loseCard(card15);
    org.cs362.dominion.Card[] card_array17 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card18 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card18, card_array17);
    gameState14.onBoard = arraylist_card18;
    org.cs362.dominion.Card card21 = null;
    gameState14.loseCard(card21);
    java.util.List<org.cs362.dominion.Card> list_card23 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState24 = new org.cs362.dominion.GameState(list_card23);
    org.cs362.dominion.Card card25 = null;
    gameState24.loseCard(card25);
    org.cs362.dominion.Card[] card_array27 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card28 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card28, card_array27);
    gameState24.onBoard = arraylist_card28;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i31 = gameState24.embargoed;
    org.cs362.dominion.Player player33 = new org.cs362.dominion.Player(gameState24, "");
    gameState14.addPlayer(player33);
    java.util.List<org.cs362.dominion.Card> list_card35 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState36 = new org.cs362.dominion.GameState(list_card35);
    org.cs362.dominion.Card card37 = null;
    gameState36.loseCard(card37);
    org.cs362.dominion.Card[] card_array39 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card40 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card40, card_array39);
    gameState36.onBoard = arraylist_card40;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i43 = gameState36.embargoed;
    org.cs362.dominion.Player player45 = new org.cs362.dominion.Player(gameState36, "");
    org.cs362.dominion.Player player47 = new org.cs362.dominion.Player(gameState36, "hi!");
    java.util.List<org.cs362.dominion.Card> list_card48 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState49 = new org.cs362.dominion.GameState(list_card48);
    org.cs362.dominion.Card card50 = null;
    gameState49.loseCard(card50);
    org.cs362.dominion.Card[] card_array52 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card53 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b54 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card53, card_array52);
    gameState49.onBoard = arraylist_card53;
    org.cs362.dominion.Card card56 = null;
    gameState49.loseCard(card56);
    java.util.List<org.cs362.dominion.Card> list_card58 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState59 = new org.cs362.dominion.GameState(list_card58);
    org.cs362.dominion.Card card60 = null;
    gameState59.loseCard(card60);
    org.cs362.dominion.Card[] card_array62 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card63 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b64 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card63, card_array62);
    gameState59.onBoard = arraylist_card63;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i66 = gameState59.embargoed;
    gameState49.gameBoard = hashmap_card_i66;
    gameState36.embargoed = hashmap_card_i66;
    card9.play(player33, gameState36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type2.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    org.junit.Assert.assertTrue("'" + type7 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type7.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card9);
    org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type10.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    org.junit.Assert.assertTrue("'" + cardName12 + "' != '" + org.cs362.dominion.Card.CardName.Duchy + "'", cardName12.equals(org.cs362.dominion.Card.CardName.Duchy));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i66);

  }
*/
  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState1.embargoed;
    gameState1.initializeGame();
    java.lang.String str10 = gameState1.toString();
    // The following exception was thrown during execution in test generation
    try {
    org.cs362.dominion.GameState gameState11 = gameState1.clone();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "The board game is empty you need to intialize the game!!!!"+ "'", str10.equals("The board game is empty you need to intialize the game!!!!"));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Player player3 = new org.cs362.dominion.Player(gameState1, "hi!");
    java.util.List<org.cs362.dominion.Player> list_player4 = gameState1.players;
    gameState1.updateBoard();
    java.util.List<org.cs362.dominion.Card> list_card6 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState7 = new org.cs362.dominion.GameState(list_card6);
    org.cs362.dominion.Player player9 = new org.cs362.dominion.Player(gameState7, "hi!");
    gameState1.addPlayer(player9);
    // The following exception was thrown during execution in test generation
    try {
    org.cs362.dominion.GameState gameState11 = gameState1.clone();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState1.embargoed;
    org.cs362.dominion.Player player10 = new org.cs362.dominion.Player(gameState1, "");
    org.cs362.dominion.Card[] card_array11 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card12 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card12, card_array11);
    int i14 = player10.lowestCost((java.util.List<org.cs362.dominion.Card>)arraylist_card12);
    player10.printStateGame();
    java.lang.String str16 = player10.toString();
    // The following exception was thrown during execution in test generation
    try {
    player10.buyCard();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + " ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str16.equals(" ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }
/*
  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card.Type type2 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card3 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card0, type2);
    org.cs362.dominion.Card card4 = org.cs362.dominion.Randomness.randomMember(list_card3);
    org.cs362.dominion.Card.Type type5 = card4.getType();
    java.util.List<org.cs362.dominion.Card> list_card6 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState7 = new org.cs362.dominion.GameState(list_card6);
    org.cs362.dominion.Card.Type type8 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card9 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card6, type8);
    org.cs362.dominion.Card card10 = org.cs362.dominion.Randomness.randomMember(list_card9);
    org.cs362.dominion.Card.Type type11 = card10.getType();
    int i12 = card4.compareTo(card10);
    org.cs362.dominion.Card.CardName cardName13 = card10.getCardName();
    int i14 = card10.getTreasureValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type2.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card4);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type5.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    org.junit.Assert.assertTrue("'" + type8 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type8.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card10);
    org.junit.Assert.assertTrue("'" + type11 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type11.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-12));
    org.junit.Assert.assertTrue("'" + cardName13 + "' != '" + org.cs362.dominion.Card.CardName.Gardens + "'", cardName13.equals(org.cs362.dominion.Card.CardName.Gardens));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }
*/
  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }

    org.cs362.dominion.Randomness.reset((long)(-10));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState1.embargoed;
    java.lang.String str9 = gameState1.toString();
    gameState1.updateBoard();
    java.util.List<org.cs362.dominion.Card> list_card11 = gameState1.Supply;
    org.cs362.dominion.GameState gameState12 = new org.cs362.dominion.GameState(list_card11);
    org.cs362.dominion.GameState gameState13 = new org.cs362.dominion.GameState(list_card11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "The board game is empty you need to intialize the game!!!!"+ "'", str9.equals("The board game is empty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card11);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    gameState1.Supply = arraylist_card9;
    java.util.List<org.cs362.dominion.Card> list_card13 = gameState1.onBoard;
    org.cs362.dominion.Player player15 = new org.cs362.dominion.Player(gameState1, "hi!");
    // The following exception was thrown during execution in test generation
    try {
    player15.buyCard();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);

  }
/*
  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card.Type type2 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card3 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card0, type2);
    org.cs362.dominion.Card card4 = org.cs362.dominion.Randomness.randomMember(list_card3);
    org.cs362.dominion.Card.Type type5 = card4.getType();
    java.lang.String str6 = card4.toString();
    int i7 = card4.score();
    java.lang.String str8 = card4.toString();
    org.cs362.dominion.Card.Type type9 = card4.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type2.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card4);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type5.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + " \n\tProvince"+ "'", str6.equals(" \n\tProvince"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " \n\tProvince"+ "'", str8.equals(" \n\tProvince"));
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type9.equals(org.cs362.dominion.Card.Type.VICTORY));

  }
*/
  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState1.embargoed;
    gameState1.initializeGame();
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i10 = gameState1.getWinners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i10);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    gameState1.Supply = arraylist_card9;
    org.cs362.dominion.GameState gameState13 = new org.cs362.dominion.GameState((java.util.List<org.cs362.dominion.Card>)arraylist_card9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    gameState1.Supply = arraylist_card9;
    java.util.List<org.cs362.dominion.Card> list_card13 = gameState1.onBoard;
    org.cs362.dominion.Player player15 = new org.cs362.dominion.Player(gameState1, "hi!");
    gameState1.updateBoard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    gameState1.Supply = arraylist_card9;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i13 = null;
    gameState1.embargoed = hashmap_card_i13;
    org.cs362.dominion.Player player16 = new org.cs362.dominion.Player(gameState1, "The board game is empty you need to intialize the game!!!!");
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i17 = gameState1.gameBoard;
    gameState1.updateBoard();
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i19 = gameState1.getWinners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i19);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card card4 = null;
    gameState1.loseCard(card4);
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i6 = gameState1.play();
    java.util.List<org.cs362.dominion.Card> list_card7 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState8 = new org.cs362.dominion.GameState(list_card7);
    org.cs362.dominion.Card card9 = null;
    gameState8.loseCard(card9);
    org.cs362.dominion.Card[] card_array11 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card12 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card12, card_array11);
    gameState8.onBoard = arraylist_card12;
    java.util.List<org.cs362.dominion.Card> list_card15 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState16 = new org.cs362.dominion.GameState(list_card15);
    org.cs362.dominion.Player player18 = new org.cs362.dominion.Player(gameState16, "hi!");
    org.cs362.dominion.Player[] player_array19 = new org.cs362.dominion.Player[] { player18 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player20 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player20, player_array19);
    gameState8.players = arraylist_player20;
    java.util.List<org.cs362.dominion.Card> list_card23 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState24 = new org.cs362.dominion.GameState(list_card23);
    org.cs362.dominion.Card card25 = null;
    gameState24.loseCard(card25);
    org.cs362.dominion.Card[] card_array27 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card28 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card28, card_array27);
    gameState24.onBoard = arraylist_card28;
    java.util.List<org.cs362.dominion.Card> list_card31 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState32 = new org.cs362.dominion.GameState(list_card31);
    org.cs362.dominion.Player player34 = new org.cs362.dominion.Player(gameState32, "hi!");
    org.cs362.dominion.Player[] player_array35 = new org.cs362.dominion.Player[] { player34 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player36 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player36, player_array35);
    gameState24.players = arraylist_player36;
    org.cs362.dominion.Player player39 = org.cs362.dominion.Randomness.randomMember((java.util.List<org.cs362.dominion.Player>)arraylist_player36);
    gameState8.addPlayer(player39);
    boolean b41 = gameState8.isGameOver();
    boolean b42 = gameState8.isGameOver();
    org.cs362.dominion.Card card43 = null;
    gameState8.loseCard(card43);
    java.util.List<org.cs362.dominion.Card> list_card45 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState46 = new org.cs362.dominion.GameState(list_card45);
    org.cs362.dominion.Player player48 = new org.cs362.dominion.Player(gameState46, "hi!");
    java.util.List<org.cs362.dominion.Card> list_card49 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState50 = new org.cs362.dominion.GameState(list_card49);
    org.cs362.dominion.Card card51 = null;
    gameState50.loseCard(card51);
    org.cs362.dominion.Card[] card_array53 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card54 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b55 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card54, card_array53);
    gameState50.onBoard = arraylist_card54;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i57 = gameState50.embargoed;
    java.util.List<org.cs362.dominion.Player> list_player58 = gameState50.players;
    gameState46.players = list_player58;
    gameState8.players = list_player58;
    gameState1.players = list_player58;
    // The following exception was thrown during execution in test generation
    try {
    org.cs362.dominion.Player player62 = org.cs362.dominion.Randomness.randomMember(list_player58);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player58);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState1.embargoed;
    org.cs362.dominion.Player player10 = new org.cs362.dominion.Player(gameState1, "");
    java.util.List<org.cs362.dominion.Player> list_player11 = gameState1.players;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player11);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Player player3 = new org.cs362.dominion.Player(gameState1, "hi!");
    java.util.List<org.cs362.dominion.Player> list_player4 = gameState1.players;
    java.util.List<org.cs362.dominion.Card> list_card5 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState6 = new org.cs362.dominion.GameState(list_card5);
    org.cs362.dominion.Player player8 = new org.cs362.dominion.Player(gameState6, "hi!");
    java.util.List<org.cs362.dominion.Player> list_player9 = gameState6.players;
    gameState6.updateBoard();
    java.util.List<org.cs362.dominion.Card> list_card11 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState12 = new org.cs362.dominion.GameState(list_card11);
    org.cs362.dominion.Player player14 = new org.cs362.dominion.Player(gameState12, "hi!");
    gameState6.addPlayer(player14);
    java.util.List<org.cs362.dominion.Card> list_card16 = gameState6.Supply;
    java.util.List<org.cs362.dominion.Card> list_card17 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState18 = new org.cs362.dominion.GameState(list_card17);
    org.cs362.dominion.Card card19 = null;
    gameState18.loseCard(card19);
    org.cs362.dominion.Card[] card_array21 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card22 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card22, card_array21);
    gameState18.onBoard = arraylist_card22;
    org.cs362.dominion.Card.Type type25 = org.cs362.dominion.Card.Type.ACTION;
    java.util.List<org.cs362.dominion.Card> list_card26 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)arraylist_card22, type25);
    java.util.List<org.cs362.dominion.Card> list_card27 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card16, type25);
    gameState1.onBoard = list_card16;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    org.junit.Assert.assertTrue("'" + type25 + "' != '" + org.cs362.dominion.Card.Type.ACTION + "'", type25.equals(org.cs362.dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card27);

  }
/*
  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState1.embargoed;
    org.cs362.dominion.Player player10 = new org.cs362.dominion.Player(gameState1, "");
    player10.playTreasureCard();
    java.util.List<org.cs362.dominion.Card> list_card12 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState13 = new org.cs362.dominion.GameState(list_card12);
    org.cs362.dominion.Card.Type type14 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card15 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card12, type14);
    org.cs362.dominion.Card card16 = org.cs362.dominion.Randomness.randomMember(list_card15);
    java.util.List<org.cs362.dominion.Card> list_card17 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState18 = new org.cs362.dominion.GameState(list_card17);
    org.cs362.dominion.Card.Type type19 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card20 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card17, type19);
    org.cs362.dominion.Card card21 = org.cs362.dominion.Randomness.randomMember(list_card20);
    org.cs362.dominion.Card.Type type22 = card21.getType();
    int i23 = card16.compareTo(card21);
    int i24 = card21.score();
    player10.discard(card21);
    org.cs362.dominion.Card.Type type26 = card21.getType();
    int i27 = card21.getCost();
    int i28 = card21.getTreasureValue();
    int i29 = card21.getCost();
    org.cs362.dominion.Card.Type type30 = card21.getType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card12);
    org.junit.Assert.assertTrue("'" + type14 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type14.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);
    org.junit.Assert.assertTrue("'" + type19 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type19.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card21);
    org.junit.Assert.assertTrue("'" + type22 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type22.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3);
    org.junit.Assert.assertTrue("'" + type26 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type26.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 2);
    org.junit.Assert.assertTrue("'" + type30 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type30.equals(org.cs362.dominion.Card.Type.VICTORY));

  }
*/
  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    gameState1.Supply = arraylist_card9;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i13 = null;
    gameState1.embargoed = hashmap_card_i13;
    org.cs362.dominion.Player player16 = new org.cs362.dominion.Player(gameState1, "The board game is empty you need to intialize the game!!!!");
    java.util.List<org.cs362.dominion.Card> list_card17 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState18 = new org.cs362.dominion.GameState(list_card17);
    org.cs362.dominion.Card card19 = null;
    gameState18.loseCard(card19);
    org.cs362.dominion.Card[] card_array21 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card22 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card22, card_array21);
    gameState18.onBoard = arraylist_card22;
    java.util.List<org.cs362.dominion.Card> list_card25 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState26 = new org.cs362.dominion.GameState(list_card25);
    org.cs362.dominion.Player player28 = new org.cs362.dominion.Player(gameState26, "hi!");
    org.cs362.dominion.Player[] player_array29 = new org.cs362.dominion.Player[] { player28 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player30 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b31 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player30, player_array29);
    gameState18.players = arraylist_player30;
    java.util.List<org.cs362.dominion.Card> list_card33 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState34 = new org.cs362.dominion.GameState(list_card33);
    org.cs362.dominion.Card card35 = null;
    gameState34.loseCard(card35);
    org.cs362.dominion.Card[] card_array37 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card38 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b39 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card38, card_array37);
    gameState34.onBoard = arraylist_card38;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i41 = gameState34.embargoed;
    gameState18.embargoed = hashmap_card_i41;
    java.util.List<org.cs362.dominion.Card> list_card43 = gameState18.onBoard;
    gameState1.trashPile = list_card43;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card43);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }

    org.cs362.dominion.Randomness.totalCallsToRandom = (byte)1;

  }
/*
  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card.Type type2 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card3 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card0, type2);
    org.cs362.dominion.Card card4 = org.cs362.dominion.Randomness.randomMember(list_card3);
    java.util.List<org.cs362.dominion.Card> list_card5 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState6 = new org.cs362.dominion.GameState(list_card5);
    org.cs362.dominion.Card.Type type7 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card8 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card5, type7);
    org.cs362.dominion.Card card9 = org.cs362.dominion.Randomness.randomMember(list_card8);
    org.cs362.dominion.Card.Type type10 = card9.getType();
    int i11 = card4.compareTo(card9);
    java.lang.String str12 = card9.toString();
    org.cs362.dominion.Card.CardName cardName13 = card9.getCardName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type2.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    org.junit.Assert.assertTrue("'" + type7 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type7.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card9);
    org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type10.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + " \n\tEstate"+ "'", str12.equals(" \n\tEstate"));
    org.junit.Assert.assertTrue("'" + cardName13 + "' != '" + org.cs362.dominion.Card.CardName.Estate + "'", cardName13.equals(org.cs362.dominion.Card.CardName.Estate));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState1.embargoed;
    org.cs362.dominion.Player player10 = new org.cs362.dominion.Player(gameState1, "");
    player10.printStateGame();
    java.util.List<org.cs362.dominion.Card> list_card12 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState13 = new org.cs362.dominion.GameState(list_card12);
    org.cs362.dominion.Card card14 = null;
    gameState13.loseCard(card14);
    org.cs362.dominion.Card[] card_array16 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card17 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card17, card_array16);
    gameState13.onBoard = arraylist_card17;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i20 = gameState13.embargoed;
    org.cs362.dominion.Player player22 = new org.cs362.dominion.Player(gameState13, "");
    player22.playTreasureCard();
    java.util.List<org.cs362.dominion.Card> list_card24 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState25 = new org.cs362.dominion.GameState(list_card24);
    org.cs362.dominion.Card.Type type26 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card27 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card24, type26);
    org.cs362.dominion.Card card28 = org.cs362.dominion.Randomness.randomMember(list_card27);
    java.util.List<org.cs362.dominion.Card> list_card29 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState30 = new org.cs362.dominion.GameState(list_card29);
    org.cs362.dominion.Card.Type type31 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card32 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card29, type31);
    org.cs362.dominion.Card card33 = org.cs362.dominion.Randomness.randomMember(list_card32);
    org.cs362.dominion.Card.Type type34 = card33.getType();
    int i35 = card28.compareTo(card33);
    int i36 = card33.score();
    player22.discard(card33);
    org.cs362.dominion.Card.Type type38 = card33.getType();
    int i39 = card33.getCost();
    int i40 = card33.getTreasureValue();
    int i41 = card33.getCost();
    java.util.List<org.cs362.dominion.Card> list_card42 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState43 = new org.cs362.dominion.GameState(list_card42);
    org.cs362.dominion.Card.Type type44 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card45 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card42, type44);
    org.cs362.dominion.Card card46 = org.cs362.dominion.Randomness.randomMember(list_card45);
    java.util.List<org.cs362.dominion.Card> list_card47 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState48 = new org.cs362.dominion.GameState(list_card47);
    org.cs362.dominion.Card.Type type49 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card50 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card47, type49);
    org.cs362.dominion.Card card51 = org.cs362.dominion.Randomness.randomMember(list_card50);
    org.cs362.dominion.Card.Type type52 = card51.getType();
    int i53 = card46.compareTo(card51);
    int i54 = card51.score();
    int i55 = card51.getCost();
    int i56 = card33.compareTo(card51);
    player10.discard(card33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    org.junit.Assert.assertTrue("'" + type26 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type26.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card29);
    org.junit.Assert.assertTrue("'" + type31 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type31.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card33);
    org.junit.Assert.assertTrue("'" + type34 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type34.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 3);
    org.junit.Assert.assertTrue("'" + type38 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type38.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card42);
    org.junit.Assert.assertTrue("'" + type44 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type44.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card47);
    org.junit.Assert.assertTrue("'" + type49 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type49.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card51);
    org.junit.Assert.assertTrue("'" + type52 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type52.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == (-2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);

  }
*/
  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }

    // The following exception was thrown during execution in test generation
    try {
    int i1 = org.cs362.dominion.Randomness.nextRandomInt(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.List<org.cs362.dominion.Card> list_card8 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState9 = new org.cs362.dominion.GameState(list_card8);
    org.cs362.dominion.Player player11 = new org.cs362.dominion.Player(gameState9, "hi!");
    org.cs362.dominion.Player[] player_array12 = new org.cs362.dominion.Player[] { player11 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player13 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player13, player_array12);
    gameState1.players = arraylist_player13;
    java.util.List<org.cs362.dominion.Card> list_card16 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState17 = new org.cs362.dominion.GameState(list_card16);
    org.cs362.dominion.Card card18 = null;
    gameState17.loseCard(card18);
    org.cs362.dominion.Card[] card_array20 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card21 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card21, card_array20);
    gameState17.onBoard = arraylist_card21;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i24 = gameState17.embargoed;
    gameState1.embargoed = hashmap_card_i24;
    java.util.List<org.cs362.dominion.Card> list_card26 = gameState1.Supply;
    org.cs362.dominion.GameState gameState27 = new org.cs362.dominion.GameState(list_card26);
    org.cs362.dominion.Card.CardName cardName28 = org.cs362.dominion.Card.CardName.Curse;
    org.cs362.dominion.Card card29 = org.cs362.dominion.Card.getCard(list_card26, cardName28);
    org.cs362.dominion.GameState gameState30 = new org.cs362.dominion.GameState(list_card26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card26);
    org.junit.Assert.assertTrue("'" + cardName28 + "' != '" + org.cs362.dominion.Card.CardName.Curse + "'", cardName28.equals(org.cs362.dominion.Card.CardName.Curse));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card29);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    gameState1.Supply = arraylist_card9;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i13 = null;
    gameState1.embargoed = hashmap_card_i13;
    org.cs362.dominion.Player player16 = new org.cs362.dominion.Player(gameState1, "The board game is empty you need to intialize the game!!!!");
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i17 = gameState1.gameBoard;
    java.util.List<org.cs362.dominion.Card> list_card18 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState19 = new org.cs362.dominion.GameState(list_card18);
    org.cs362.dominion.Card card20 = null;
    gameState19.loseCard(card20);
    org.cs362.dominion.Card[] card_array22 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card23 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card23, card_array22);
    gameState19.onBoard = arraylist_card23;
    java.util.List<org.cs362.dominion.Card> list_card26 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState27 = new org.cs362.dominion.GameState(list_card26);
    org.cs362.dominion.Player player29 = new org.cs362.dominion.Player(gameState27, "hi!");
    org.cs362.dominion.Player[] player_array30 = new org.cs362.dominion.Player[] { player29 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player31 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player31, player_array30);
    gameState19.players = arraylist_player31;
    java.util.List<org.cs362.dominion.Card> list_card34 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState35 = new org.cs362.dominion.GameState(list_card34);
    org.cs362.dominion.Card card36 = null;
    gameState35.loseCard(card36);
    org.cs362.dominion.Card[] card_array38 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card39 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b40 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card39, card_array38);
    gameState35.onBoard = arraylist_card39;
    java.util.List<org.cs362.dominion.Card> list_card42 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState43 = new org.cs362.dominion.GameState(list_card42);
    org.cs362.dominion.Player player45 = new org.cs362.dominion.Player(gameState43, "hi!");
    org.cs362.dominion.Player[] player_array46 = new org.cs362.dominion.Player[] { player45 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player47 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b48 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player47, player_array46);
    gameState35.players = arraylist_player47;
    org.cs362.dominion.Player player50 = org.cs362.dominion.Randomness.randomMember((java.util.List<org.cs362.dominion.Player>)arraylist_player47);
    gameState19.addPlayer(player50);
    boolean b52 = gameState19.isGameOver();
    boolean b53 = gameState19.isGameOver();
    java.util.List<org.cs362.dominion.Card> list_card54 = gameState19.trashPile;
    gameState1.Supply = list_card54;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card54);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    java.util.List<org.cs362.dominion.Card> list_card2 = gameState1.trashPile;
    gameState1.initializeGame();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card2);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card.Type type2 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card3 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card0, type2);
    org.cs362.dominion.GameState gameState4 = new org.cs362.dominion.GameState(list_card0);
    boolean b5 = gameState4.isGameOver();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type2.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState1.embargoed;
    java.lang.String str9 = gameState1.toString();
    gameState1.updateBoard();
    java.util.List<org.cs362.dominion.Card> list_card11 = gameState1.Supply;
    org.cs362.dominion.Player player13 = new org.cs362.dominion.Player(gameState1, "");
    java.util.List<org.cs362.dominion.Card> list_card14 = gameState1.trashPile;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "The board game is empty you need to intialize the game!!!!"+ "'", str9.equals("The board game is empty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.List<org.cs362.dominion.Card> list_card8 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState9 = new org.cs362.dominion.GameState(list_card8);
    org.cs362.dominion.Player player11 = new org.cs362.dominion.Player(gameState9, "hi!");
    org.cs362.dominion.Player[] player_array12 = new org.cs362.dominion.Player[] { player11 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player13 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player13, player_array12);
    gameState1.players = arraylist_player13;
    java.util.List<org.cs362.dominion.Card> list_card16 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState17 = new org.cs362.dominion.GameState(list_card16);
    org.cs362.dominion.Card card18 = null;
    gameState17.loseCard(card18);
    org.cs362.dominion.Card[] card_array20 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card21 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card21, card_array20);
    gameState17.onBoard = arraylist_card21;
    java.util.List<org.cs362.dominion.Card> list_card24 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState25 = new org.cs362.dominion.GameState(list_card24);
    org.cs362.dominion.Player player27 = new org.cs362.dominion.Player(gameState25, "hi!");
    org.cs362.dominion.Player[] player_array28 = new org.cs362.dominion.Player[] { player27 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player29 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player29, player_array28);
    gameState17.players = arraylist_player29;
    org.cs362.dominion.Player player32 = org.cs362.dominion.Randomness.randomMember((java.util.List<org.cs362.dominion.Player>)arraylist_player29);
    gameState1.addPlayer(player32);
    boolean b34 = gameState1.isGameOver();
    boolean b35 = gameState1.isGameOver();
    org.cs362.dominion.Card card36 = null;
    gameState1.loseCard(card36);
    java.util.List<org.cs362.dominion.Player> list_player38 = gameState1.players;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player38);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card card4 = null;
    gameState1.loseCard(card4);
    java.util.List<org.cs362.dominion.Card> list_card6 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState7 = new org.cs362.dominion.GameState(list_card6);
    org.cs362.dominion.Card card8 = null;
    gameState7.loseCard(card8);
    org.cs362.dominion.Card[] card_array10 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card11 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card11, card_array10);
    gameState7.onBoard = arraylist_card11;
    java.util.List<org.cs362.dominion.Card> list_card14 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState15 = new org.cs362.dominion.GameState(list_card14);
    org.cs362.dominion.Player player17 = new org.cs362.dominion.Player(gameState15, "hi!");
    org.cs362.dominion.Player[] player_array18 = new org.cs362.dominion.Player[] { player17 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player19 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player19, player_array18);
    gameState7.players = arraylist_player19;
    java.util.List<org.cs362.dominion.Card> list_card22 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState23 = new org.cs362.dominion.GameState(list_card22);
    org.cs362.dominion.Card card24 = null;
    gameState23.loseCard(card24);
    org.cs362.dominion.Card[] card_array26 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card27 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card27, card_array26);
    gameState23.onBoard = arraylist_card27;
    java.util.List<org.cs362.dominion.Card> list_card30 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState31 = new org.cs362.dominion.GameState(list_card30);
    org.cs362.dominion.Player player33 = new org.cs362.dominion.Player(gameState31, "hi!");
    org.cs362.dominion.Player[] player_array34 = new org.cs362.dominion.Player[] { player33 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player35 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player35, player_array34);
    gameState23.players = arraylist_player35;
    org.cs362.dominion.Player player38 = org.cs362.dominion.Randomness.randomMember((java.util.List<org.cs362.dominion.Player>)arraylist_player35);
    gameState7.addPlayer(player38);
    boolean b40 = gameState7.isGameOver();
    boolean b41 = gameState7.isGameOver();
    org.cs362.dominion.Card card42 = null;
    gameState7.loseCard(card42);
    java.lang.String str44 = gameState7.toString();
    java.util.List<org.cs362.dominion.Card> list_card45 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState46 = new org.cs362.dominion.GameState(list_card45);
    org.cs362.dominion.Card card47 = null;
    gameState46.loseCard(card47);
    org.cs362.dominion.Card[] card_array49 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card50 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b51 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card50, card_array49);
    gameState46.onBoard = arraylist_card50;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i53 = gameState46.embargoed;
    gameState7.gameBoard = hashmap_card_i53;
    gameState1.gameBoard = hashmap_card_i53;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "The board game is empty you need to intialize the game!!!!"+ "'", str44.equals("The board game is empty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i53);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    gameState1.Supply = arraylist_card9;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i13 = null;
    gameState1.embargoed = hashmap_card_i13;
    java.util.List<org.cs362.dominion.Player> list_player15 = null;
    gameState1.players = list_player15;
    java.util.List<org.cs362.dominion.Card> list_card17 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState18 = new org.cs362.dominion.GameState(list_card17);
    org.cs362.dominion.Card card19 = null;
    gameState18.loseCard(card19);
    org.cs362.dominion.Card[] card_array21 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card22 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card22, card_array21);
    gameState18.onBoard = arraylist_card22;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i25 = gameState18.embargoed;
    gameState1.gameBoard = hashmap_card_i25;
    java.util.List<org.cs362.dominion.Card> list_card27 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState28 = new org.cs362.dominion.GameState(list_card27);
    org.cs362.dominion.Card card29 = null;
    gameState28.loseCard(card29);
    org.cs362.dominion.Card[] card_array31 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card32 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card32, card_array31);
    gameState28.onBoard = arraylist_card32;
    java.util.List<org.cs362.dominion.Card> list_card35 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState36 = new org.cs362.dominion.GameState(list_card35);
    org.cs362.dominion.Player player38 = new org.cs362.dominion.Player(gameState36, "hi!");
    org.cs362.dominion.Player[] player_array39 = new org.cs362.dominion.Player[] { player38 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player40 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player40, player_array39);
    gameState28.players = arraylist_player40;
    java.util.List<org.cs362.dominion.Card> list_card43 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState44 = new org.cs362.dominion.GameState(list_card43);
    org.cs362.dominion.Card card45 = null;
    gameState44.loseCard(card45);
    org.cs362.dominion.Card[] card_array47 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card48 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b49 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card48, card_array47);
    gameState44.onBoard = arraylist_card48;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i51 = gameState44.embargoed;
    gameState28.embargoed = hashmap_card_i51;
    gameState1.gameBoard = hashmap_card_i51;
    java.util.List<org.cs362.dominion.Card> list_card54 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState55 = new org.cs362.dominion.GameState(list_card54);
    java.util.List<org.cs362.dominion.Card> list_card56 = gameState55.trashPile;
    gameState1.Supply = list_card56;
    java.util.List<org.cs362.dominion.Card> list_card58 = gameState1.trashPile;
    org.cs362.dominion.GameState gameState59 = new org.cs362.dominion.GameState(list_card58);
    org.cs362.dominion.Player player61 = new org.cs362.dominion.Player(gameState59, " \n\tDuchy");
    java.util.List<org.cs362.dominion.Card> list_card62 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState63 = new org.cs362.dominion.GameState(list_card62);
    org.cs362.dominion.Card card64 = null;
    gameState63.loseCard(card64);
    java.util.List<org.cs362.dominion.Card> list_card66 = gameState63.trashPile;
    int i67 = player61.lowestCost(list_card66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 10);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    gameState1.Supply = arraylist_card9;
    java.util.List<org.cs362.dominion.Card> list_card13 = gameState1.onBoard;
    org.cs362.dominion.Player player15 = new org.cs362.dominion.Player(gameState1, "hi!");
    java.lang.String str16 = player15.toString();
    java.lang.String str17 = player15.toString();
    player15.playKingdomCard();
    // The following exception was thrown during execution in test generation
    try {
    player15.buyCard();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str16.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str17.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.List<org.cs362.dominion.Card> list_card8 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState9 = new org.cs362.dominion.GameState(list_card8);
    org.cs362.dominion.Player player11 = new org.cs362.dominion.Player(gameState9, "hi!");
    org.cs362.dominion.Player[] player_array12 = new org.cs362.dominion.Player[] { player11 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player13 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player13, player_array12);
    gameState1.players = arraylist_player13;
    java.util.List<org.cs362.dominion.Card> list_card16 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState17 = new org.cs362.dominion.GameState(list_card16);
    org.cs362.dominion.Card card18 = null;
    gameState17.loseCard(card18);
    org.cs362.dominion.Card[] card_array20 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card21 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card21, card_array20);
    gameState17.onBoard = arraylist_card21;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i24 = gameState17.embargoed;
    gameState1.embargoed = hashmap_card_i24;
    java.util.List<org.cs362.dominion.Card> list_card26 = gameState1.Supply;
    java.util.List<org.cs362.dominion.Card> list_card27 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState28 = new org.cs362.dominion.GameState(list_card27);
    org.cs362.dominion.Card card29 = null;
    gameState28.loseCard(card29);
    java.util.List<org.cs362.dominion.Card> list_card31 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState32 = new org.cs362.dominion.GameState(list_card31);
    org.cs362.dominion.Card card33 = null;
    gameState32.loseCard(card33);
    org.cs362.dominion.Card[] card_array35 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card36 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card36, card_array35);
    gameState32.onBoard = arraylist_card36;
    gameState28.Supply = arraylist_card36;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i40 = null;
    gameState28.embargoed = hashmap_card_i40;
    java.util.List<org.cs362.dominion.Player> list_player42 = null;
    gameState28.players = list_player42;
    java.util.List<org.cs362.dominion.Card> list_card44 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState45 = new org.cs362.dominion.GameState(list_card44);
    org.cs362.dominion.Card card46 = null;
    gameState45.loseCard(card46);
    org.cs362.dominion.Card[] card_array48 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card49 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b50 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card49, card_array48);
    gameState45.onBoard = arraylist_card49;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i52 = gameState45.embargoed;
    gameState28.gameBoard = hashmap_card_i52;
    java.util.List<org.cs362.dominion.Card> list_card54 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState55 = new org.cs362.dominion.GameState(list_card54);
    org.cs362.dominion.Card card56 = null;
    gameState55.loseCard(card56);
    org.cs362.dominion.Card[] card_array58 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card59 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b60 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card59, card_array58);
    gameState55.onBoard = arraylist_card59;
    java.util.List<org.cs362.dominion.Card> list_card62 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState63 = new org.cs362.dominion.GameState(list_card62);
    org.cs362.dominion.Player player65 = new org.cs362.dominion.Player(gameState63, "hi!");
    org.cs362.dominion.Player[] player_array66 = new org.cs362.dominion.Player[] { player65 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player67 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b68 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player67, player_array66);
    gameState55.players = arraylist_player67;
    java.util.List<org.cs362.dominion.Card> list_card70 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState71 = new org.cs362.dominion.GameState(list_card70);
    org.cs362.dominion.Card card72 = null;
    gameState71.loseCard(card72);
    org.cs362.dominion.Card[] card_array74 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card75 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b76 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card75, card_array74);
    gameState71.onBoard = arraylist_card75;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i78 = gameState71.embargoed;
    gameState55.embargoed = hashmap_card_i78;
    gameState28.gameBoard = hashmap_card_i78;
    java.util.List<org.cs362.dominion.Card> list_card81 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState82 = new org.cs362.dominion.GameState(list_card81);
    java.util.List<org.cs362.dominion.Card> list_card83 = gameState82.trashPile;
    gameState28.Supply = list_card83;
    java.util.List<org.cs362.dominion.Card> list_card85 = gameState28.trashPile;
    gameState1.onBoard = list_card85;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card85);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Player player3 = new org.cs362.dominion.Player(gameState1, "hi!");
    java.util.List<org.cs362.dominion.Player> list_player4 = gameState1.players;
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i5 = gameState1.play();
    java.util.List<org.cs362.dominion.Player> list_player6 = gameState1.players;
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i7 = gameState1.getWinners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i7);

  }
/*
  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState1.embargoed;
    java.lang.String str9 = gameState1.toString();
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i10 = gameState1.getWinners();
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i11 = gameState1.play();
    java.util.List<org.cs362.dominion.Card> list_card12 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState13 = new org.cs362.dominion.GameState(list_card12);
    org.cs362.dominion.Card.Type type14 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card15 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card12, type14);
    org.cs362.dominion.Card card16 = org.cs362.dominion.Randomness.randomMember(list_card15);
    org.cs362.dominion.Card.Type type17 = card16.getType();
    java.util.List<org.cs362.dominion.Card> list_card18 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState19 = new org.cs362.dominion.GameState(list_card18);
    org.cs362.dominion.Card.Type type20 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card21 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card18, type20);
    org.cs362.dominion.Card card22 = org.cs362.dominion.Randomness.randomMember(list_card21);
    org.cs362.dominion.Card.Type type23 = card22.getType();
    int i24 = card16.compareTo(card22);
    gameState1.loseCard(card22);
    java.util.List<org.cs362.dominion.Card> list_card26 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState27 = new org.cs362.dominion.GameState(list_card26);
    java.util.List<org.cs362.dominion.Card> list_card28 = gameState27.trashPile;
    gameState1.trashPile = list_card28;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "The board game is empty you need to intialize the game!!!!"+ "'", str9.equals("The board game is empty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card12);
    org.junit.Assert.assertTrue("'" + type14 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type14.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card16);
    org.junit.Assert.assertTrue("'" + type17 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type17.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card18);
    org.junit.Assert.assertTrue("'" + type20 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type20.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card22);
    org.junit.Assert.assertTrue("'" + type23 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type23.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);

  }
*/
  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState1.embargoed;
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i9 = gameState1.getWinners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i9);

  }
/*
  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card.Type type2 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card3 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card0, type2);
    org.cs362.dominion.Card.Type type4 = org.cs362.dominion.Card.Type.ACTION;
    java.util.List<org.cs362.dominion.Card> list_card5 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card0, type4);
    org.cs362.dominion.GameState gameState6 = new org.cs362.dominion.GameState(list_card5);
    org.cs362.dominion.Card card7 = org.cs362.dominion.Randomness.randomMember(list_card5);
    int i8 = card7.getCost();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type2.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card3);
    org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.cs362.dominion.Card.Type.ACTION + "'", type4.equals(org.cs362.dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);

  }
*/
  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    org.cs362.dominion.Card card8 = null;
    gameState1.loseCard(card8);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i10 = gameState1.gameBoard;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i10);

  }
/*
  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    org.cs362.dominion.Card card8 = null;
    gameState1.loseCard(card8);
    java.util.List<org.cs362.dominion.Card> list_card10 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState11 = new org.cs362.dominion.GameState(list_card10);
    org.cs362.dominion.Card card12 = null;
    gameState11.loseCard(card12);
    org.cs362.dominion.Card[] card_array14 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card15 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card15, card_array14);
    gameState11.onBoard = arraylist_card15;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i18 = gameState11.embargoed;
    org.cs362.dominion.Player player20 = new org.cs362.dominion.Player(gameState11, "");
    gameState1.addPlayer(player20);
    java.util.List<org.cs362.dominion.Card> list_card22 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState23 = new org.cs362.dominion.GameState(list_card22);
    org.cs362.dominion.Card card24 = null;
    gameState23.loseCard(card24);
    org.cs362.dominion.Card[] card_array26 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card27 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card27, card_array26);
    gameState23.onBoard = arraylist_card27;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i30 = gameState23.embargoed;
    java.lang.String str31 = gameState23.toString();
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i32 = gameState23.getWinners();
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i33 = gameState23.play();
    java.util.List<org.cs362.dominion.Card> list_card34 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState35 = new org.cs362.dominion.GameState(list_card34);
    org.cs362.dominion.Card.Type type36 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card37 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card34, type36);
    org.cs362.dominion.Card card38 = org.cs362.dominion.Randomness.randomMember(list_card37);
    org.cs362.dominion.Card.Type type39 = card38.getType();
    java.util.List<org.cs362.dominion.Card> list_card40 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState41 = new org.cs362.dominion.GameState(list_card40);
    org.cs362.dominion.Card.Type type42 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card43 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card40, type42);
    org.cs362.dominion.Card card44 = org.cs362.dominion.Randomness.randomMember(list_card43);
    org.cs362.dominion.Card.Type type45 = card44.getType();
    int i46 = card38.compareTo(card44);
    gameState23.loseCard(card44);
    org.cs362.dominion.Card.CardName cardName48 = card44.getCardName();
    player20.trash(card44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "The board game is empty you need to intialize the game!!!!"+ "'", str31.equals("The board game is empty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card34);
    org.junit.Assert.assertTrue("'" + type36 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type36.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card38);
    org.junit.Assert.assertTrue("'" + type39 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type39.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card40);
    org.junit.Assert.assertTrue("'" + type42 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type42.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card44);
    org.junit.Assert.assertTrue("'" + type45 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type45.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 3);
    org.junit.Assert.assertTrue("'" + cardName48 + "' != '" + org.cs362.dominion.Card.CardName.Province + "'", cardName48.equals(org.cs362.dominion.Card.CardName.Province));

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card.Type type2 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card3 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card0, type2);
    org.cs362.dominion.Card card4 = org.cs362.dominion.Randomness.randomMember(list_card3);
    java.util.List<org.cs362.dominion.Card> list_card5 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState6 = new org.cs362.dominion.GameState(list_card5);
    org.cs362.dominion.Card.Type type7 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card8 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card5, type7);
    org.cs362.dominion.Card card9 = org.cs362.dominion.Randomness.randomMember(list_card8);
    org.cs362.dominion.Card.Type type10 = card9.getType();
    int i11 = card4.compareTo(card9);
    org.cs362.dominion.Card.CardName cardName12 = card9.getCardName();
    java.util.List<org.cs362.dominion.Card> list_card13 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState14 = new org.cs362.dominion.GameState(list_card13);
    org.cs362.dominion.Card card15 = null;
    gameState14.loseCard(card15);
    java.util.List<org.cs362.dominion.Card> list_card17 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState18 = new org.cs362.dominion.GameState(list_card17);
    org.cs362.dominion.Card card19 = null;
    gameState18.loseCard(card19);
    org.cs362.dominion.Card[] card_array21 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card22 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card22, card_array21);
    gameState18.onBoard = arraylist_card22;
    gameState14.Supply = arraylist_card22;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i26 = null;
    gameState14.embargoed = hashmap_card_i26;
    org.cs362.dominion.Player player29 = new org.cs362.dominion.Player(gameState14, "The board game is empty you need to intialize the game!!!!");
    java.util.List<org.cs362.dominion.Card> list_card30 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState31 = new org.cs362.dominion.GameState(list_card30);
    org.cs362.dominion.Card card32 = null;
    gameState31.loseCard(card32);
    org.cs362.dominion.Card[] card_array34 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card35 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card35, card_array34);
    gameState31.onBoard = arraylist_card35;
    java.util.List<org.cs362.dominion.Card> list_card38 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState39 = new org.cs362.dominion.GameState(list_card38);
    org.cs362.dominion.Player player41 = new org.cs362.dominion.Player(gameState39, "hi!");
    org.cs362.dominion.Player[] player_array42 = new org.cs362.dominion.Player[] { player41 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player43 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b44 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player43, player_array42);
    gameState31.players = arraylist_player43;
    java.util.List<org.cs362.dominion.Card> list_card46 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState47 = new org.cs362.dominion.GameState(list_card46);
    org.cs362.dominion.Card card48 = null;
    gameState47.loseCard(card48);
    org.cs362.dominion.Card[] card_array50 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card51 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b52 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card51, card_array50);
    gameState47.onBoard = arraylist_card51;
    java.util.List<org.cs362.dominion.Card> list_card54 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState55 = new org.cs362.dominion.GameState(list_card54);
    org.cs362.dominion.Player player57 = new org.cs362.dominion.Player(gameState55, "hi!");
    org.cs362.dominion.Player[] player_array58 = new org.cs362.dominion.Player[] { player57 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player59 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b60 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player59, player_array58);
    gameState47.players = arraylist_player59;
    org.cs362.dominion.Player player62 = org.cs362.dominion.Randomness.randomMember((java.util.List<org.cs362.dominion.Player>)arraylist_player59);
    gameState31.addPlayer(player62);
    boolean b64 = gameState31.isGameOver();
    boolean b65 = gameState31.isGameOver();
    org.cs362.dominion.Card card66 = null;
    gameState31.loseCard(card66);
    java.lang.String str68 = gameState31.toString();
    java.util.List<org.cs362.dominion.Card> list_card69 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState70 = new org.cs362.dominion.GameState(list_card69);
    org.cs362.dominion.Card card71 = null;
    gameState70.loseCard(card71);
    org.cs362.dominion.Card[] card_array73 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card74 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b75 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card74, card_array73);
    gameState70.onBoard = arraylist_card74;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i77 = gameState70.embargoed;
    gameState31.gameBoard = hashmap_card_i77;
    card9.play(player29, gameState31);
    java.lang.String str80 = card9.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type2.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    org.junit.Assert.assertTrue("'" + type7 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type7.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card9);
    org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type10.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    org.junit.Assert.assertTrue("'" + cardName12 + "' != '" + org.cs362.dominion.Card.CardName.Province + "'", cardName12.equals(org.cs362.dominion.Card.CardName.Province));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str68 + "' != '" + "The board game is empty you need to intialize the game!!!!"+ "'", str68.equals("The board game is empty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str80 + "' != '" + " \n\tProvince"+ "'", str80.equals(" \n\tProvince"));

  }
*/
  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState1.embargoed;
    org.cs362.dominion.Player player10 = new org.cs362.dominion.Player(gameState1, "");
    org.cs362.dominion.Player player12 = new org.cs362.dominion.Player(gameState1, "hi!");
    // The following exception was thrown during execution in test generation
    try {
    player12.buyCard();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Player player3 = new org.cs362.dominion.Player(gameState1, "hi!");
    java.util.List<org.cs362.dominion.Player> list_player4 = gameState1.players;
    gameState1.updateBoard();
    java.util.List<org.cs362.dominion.Card> list_card6 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState7 = new org.cs362.dominion.GameState(list_card6);
    org.cs362.dominion.Player player9 = new org.cs362.dominion.Player(gameState7, "hi!");
    gameState1.addPlayer(player9);
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i11 = gameState1.getWinners();
    java.util.List<org.cs362.dominion.Card> list_card12 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState13 = new org.cs362.dominion.GameState(list_card12);
    org.cs362.dominion.Card card14 = null;
    gameState13.loseCard(card14);
    org.cs362.dominion.Card[] card_array16 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card17 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card17, card_array16);
    gameState13.onBoard = arraylist_card17;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i20 = gameState13.embargoed;
    java.lang.String str21 = gameState13.toString();
    gameState13.updateBoard();
    java.util.List<org.cs362.dominion.Card> list_card23 = gameState13.Supply;
    org.cs362.dominion.GameState gameState24 = new org.cs362.dominion.GameState(list_card23);
    gameState1.onBoard = list_card23;
    org.cs362.dominion.GameState gameState26 = new org.cs362.dominion.GameState(list_card23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "The board game is empty you need to intialize the game!!!!"+ "'", str21.equals("The board game is empty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.List<org.cs362.dominion.Card> list_card8 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState9 = new org.cs362.dominion.GameState(list_card8);
    org.cs362.dominion.Player player11 = new org.cs362.dominion.Player(gameState9, "hi!");
    org.cs362.dominion.Player[] player_array12 = new org.cs362.dominion.Player[] { player11 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player13 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player13, player_array12);
    gameState1.players = arraylist_player13;
    java.util.List<org.cs362.dominion.Card> list_card16 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState17 = new org.cs362.dominion.GameState(list_card16);
    org.cs362.dominion.Card card18 = null;
    gameState17.loseCard(card18);
    org.cs362.dominion.Card[] card_array20 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card21 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card21, card_array20);
    gameState17.onBoard = arraylist_card21;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i24 = gameState17.embargoed;
    gameState1.embargoed = hashmap_card_i24;
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i26 = gameState1.play();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i27 = gameState1.gameBoard;
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i28 = gameState1.getWinners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i28);

  }
/*
  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card.Type type2 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card3 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card0, type2);
    org.cs362.dominion.Card card4 = org.cs362.dominion.Randomness.randomMember(list_card3);
    java.util.List<org.cs362.dominion.Card> list_card5 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState6 = new org.cs362.dominion.GameState(list_card5);
    org.cs362.dominion.Card.Type type7 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card8 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card5, type7);
    org.cs362.dominion.Card card9 = org.cs362.dominion.Randomness.randomMember(list_card8);
    org.cs362.dominion.Card.Type type10 = card9.getType();
    int i11 = card4.compareTo(card9);
    org.cs362.dominion.Card.CardName cardName12 = card9.getCardName();
    java.util.List<org.cs362.dominion.Card> list_card13 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState14 = new org.cs362.dominion.GameState(list_card13);
    org.cs362.dominion.Card card15 = null;
    gameState14.loseCard(card15);
    java.util.List<org.cs362.dominion.Card> list_card17 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState18 = new org.cs362.dominion.GameState(list_card17);
    org.cs362.dominion.Card card19 = null;
    gameState18.loseCard(card19);
    org.cs362.dominion.Card[] card_array21 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card22 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card22, card_array21);
    gameState18.onBoard = arraylist_card22;
    gameState14.Supply = arraylist_card22;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i26 = null;
    gameState14.embargoed = hashmap_card_i26;
    org.cs362.dominion.Player player29 = new org.cs362.dominion.Player(gameState14, "The board game is empty you need to intialize the game!!!!");
    java.util.List<org.cs362.dominion.Card> list_card30 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState31 = new org.cs362.dominion.GameState(list_card30);
    org.cs362.dominion.Card card32 = null;
    gameState31.loseCard(card32);
    org.cs362.dominion.Card[] card_array34 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card35 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card35, card_array34);
    gameState31.onBoard = arraylist_card35;
    java.util.List<org.cs362.dominion.Card> list_card38 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState39 = new org.cs362.dominion.GameState(list_card38);
    org.cs362.dominion.Player player41 = new org.cs362.dominion.Player(gameState39, "hi!");
    org.cs362.dominion.Player[] player_array42 = new org.cs362.dominion.Player[] { player41 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player43 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b44 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player43, player_array42);
    gameState31.players = arraylist_player43;
    java.util.List<org.cs362.dominion.Card> list_card46 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState47 = new org.cs362.dominion.GameState(list_card46);
    org.cs362.dominion.Card card48 = null;
    gameState47.loseCard(card48);
    org.cs362.dominion.Card[] card_array50 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card51 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b52 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card51, card_array50);
    gameState47.onBoard = arraylist_card51;
    java.util.List<org.cs362.dominion.Card> list_card54 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState55 = new org.cs362.dominion.GameState(list_card54);
    org.cs362.dominion.Player player57 = new org.cs362.dominion.Player(gameState55, "hi!");
    org.cs362.dominion.Player[] player_array58 = new org.cs362.dominion.Player[] { player57 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player59 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b60 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player59, player_array58);
    gameState47.players = arraylist_player59;
    org.cs362.dominion.Player player62 = org.cs362.dominion.Randomness.randomMember((java.util.List<org.cs362.dominion.Player>)arraylist_player59);
    gameState31.addPlayer(player62);
    boolean b64 = gameState31.isGameOver();
    boolean b65 = gameState31.isGameOver();
    org.cs362.dominion.Card card66 = null;
    gameState31.loseCard(card66);
    java.lang.String str68 = gameState31.toString();
    java.util.List<org.cs362.dominion.Card> list_card69 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState70 = new org.cs362.dominion.GameState(list_card69);
    org.cs362.dominion.Card card71 = null;
    gameState70.loseCard(card71);
    org.cs362.dominion.Card[] card_array73 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card74 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b75 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card74, card_array73);
    gameState70.onBoard = arraylist_card74;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i77 = gameState70.embargoed;
    gameState31.gameBoard = hashmap_card_i77;
    card9.play(player29, gameState31);
    org.cs362.dominion.Card.Type type80 = card9.getType();
    int i81 = card9.getTreasureValue();
    java.util.List<org.cs362.dominion.Card> list_card82 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState83 = new org.cs362.dominion.GameState(list_card82);
    org.cs362.dominion.Card.Type type84 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card85 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card82, type84);
    org.cs362.dominion.Card card86 = org.cs362.dominion.Randomness.randomMember(list_card85);
    java.util.List<org.cs362.dominion.Card> list_card87 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState88 = new org.cs362.dominion.GameState(list_card87);
    org.cs362.dominion.Card.Type type89 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card90 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card87, type89);
    org.cs362.dominion.Card card91 = org.cs362.dominion.Randomness.randomMember(list_card90);
    org.cs362.dominion.Card.Type type92 = card91.getType();
    int i93 = card86.compareTo(card91);
    org.cs362.dominion.Card.CardName cardName94 = card91.getCardName();
    int i95 = card91.score();
    int i96 = card9.compareTo(card91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type2.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    org.junit.Assert.assertTrue("'" + type7 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type7.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card9);
    org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type10.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    org.junit.Assert.assertTrue("'" + cardName12 + "' != '" + org.cs362.dominion.Card.CardName.Estate + "'", cardName12.equals(org.cs362.dominion.Card.CardName.Estate));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str68 + "' != '" + "The board game is empty you need to intialize the game!!!!"+ "'", str68.equals("The board game is empty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i77);
    org.junit.Assert.assertTrue("'" + type80 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type80.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card82);
    org.junit.Assert.assertTrue("'" + type84 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type84.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card87);
    org.junit.Assert.assertTrue("'" + type89 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type89.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card91);
    org.junit.Assert.assertTrue("'" + type92 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type92.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i93 == 0);
    org.junit.Assert.assertTrue("'" + cardName94 + "' != '" + org.cs362.dominion.Card.CardName.Duchy + "'", cardName94.equals(org.cs362.dominion.Card.CardName.Duchy));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i95 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i96 == 1);

  }
*/
  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    gameState1.Supply = arraylist_card9;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i13 = null;
    gameState1.embargoed = hashmap_card_i13;
    java.util.List<org.cs362.dominion.Card> list_card15 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState16 = new org.cs362.dominion.GameState(list_card15);
    org.cs362.dominion.Card card17 = null;
    gameState16.loseCard(card17);
    org.cs362.dominion.Card[] card_array19 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card20 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card20, card_array19);
    gameState16.onBoard = arraylist_card20;
    java.util.List<org.cs362.dominion.Card> list_card23 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState24 = new org.cs362.dominion.GameState(list_card23);
    org.cs362.dominion.Player player26 = new org.cs362.dominion.Player(gameState24, "hi!");
    org.cs362.dominion.Player[] player_array27 = new org.cs362.dominion.Player[] { player26 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player28 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player28, player_array27);
    gameState16.players = arraylist_player28;
    java.util.List<org.cs362.dominion.Card> list_card31 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState32 = new org.cs362.dominion.GameState(list_card31);
    org.cs362.dominion.Card card33 = null;
    gameState32.loseCard(card33);
    org.cs362.dominion.Card[] card_array35 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card36 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card36, card_array35);
    gameState32.onBoard = arraylist_card36;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i39 = gameState32.embargoed;
    gameState16.embargoed = hashmap_card_i39;
    java.util.List<org.cs362.dominion.Card> list_card41 = gameState16.Supply;
    org.cs362.dominion.GameState gameState42 = new org.cs362.dominion.GameState(list_card41);
    java.util.List<org.cs362.dominion.Card> list_card43 = gameState42.trashPile;
    gameState1.Supply = list_card43;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card43);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    org.cs362.dominion.Card card8 = null;
    gameState1.loseCard(card8);
    java.util.List<org.cs362.dominion.Card> list_card10 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState11 = new org.cs362.dominion.GameState(list_card10);
    org.cs362.dominion.Card card12 = null;
    gameState11.loseCard(card12);
    org.cs362.dominion.Card[] card_array14 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card15 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card15, card_array14);
    gameState11.onBoard = arraylist_card15;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i18 = gameState11.embargoed;
    org.cs362.dominion.Player player20 = new org.cs362.dominion.Player(gameState11, "");
    gameState1.addPlayer(player20);
    player20.playKingdomCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i18);

  }
/*
  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState1.embargoed;
    org.cs362.dominion.Player player10 = new org.cs362.dominion.Player(gameState1, "");
    player10.playTreasureCard();
    java.util.List<org.cs362.dominion.Card> list_card12 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState13 = new org.cs362.dominion.GameState(list_card12);
    org.cs362.dominion.Card.Type type14 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card15 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card12, type14);
    org.cs362.dominion.Card card16 = org.cs362.dominion.Randomness.randomMember(list_card15);
    java.util.List<org.cs362.dominion.Card> list_card17 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState18 = new org.cs362.dominion.GameState(list_card17);
    org.cs362.dominion.Card.Type type19 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card20 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card17, type19);
    org.cs362.dominion.Card card21 = org.cs362.dominion.Randomness.randomMember(list_card20);
    org.cs362.dominion.Card.Type type22 = card21.getType();
    int i23 = card16.compareTo(card21);
    int i24 = card21.score();
    player10.discard(card21);
    org.cs362.dominion.Card.Type type26 = card21.getType();
    java.util.List<org.cs362.dominion.Card> list_card27 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState28 = new org.cs362.dominion.GameState(list_card27);
    org.cs362.dominion.Card card29 = null;
    gameState28.loseCard(card29);
    java.util.List<org.cs362.dominion.Card> list_card31 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState32 = new org.cs362.dominion.GameState(list_card31);
    org.cs362.dominion.Card card33 = null;
    gameState32.loseCard(card33);
    org.cs362.dominion.Card[] card_array35 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card36 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card36, card_array35);
    gameState32.onBoard = arraylist_card36;
    gameState28.Supply = arraylist_card36;
    java.util.List<org.cs362.dominion.Card> list_card40 = gameState28.onBoard;
    org.cs362.dominion.Player player42 = new org.cs362.dominion.Player(gameState28, "hi!");
    java.util.List<org.cs362.dominion.Card> list_card43 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState44 = new org.cs362.dominion.GameState(list_card43);
    org.cs362.dominion.Player player46 = new org.cs362.dominion.Player(gameState44, "hi!");
    java.util.List<org.cs362.dominion.Player> list_player47 = gameState44.players;
    gameState44.updateBoard();
    java.util.List<org.cs362.dominion.Card> list_card49 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState50 = new org.cs362.dominion.GameState(list_card49);
    org.cs362.dominion.Player player52 = new org.cs362.dominion.Player(gameState50, "hi!");
    gameState44.addPlayer(player52);
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i54 = gameState44.getWinners();
    card21.play(player42, gameState44);
    org.cs362.dominion.Card.CardName cardName56 = card21.getCardName();
    int i57 = card21.score();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card12);
    org.junit.Assert.assertTrue("'" + type14 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type14.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);
    org.junit.Assert.assertTrue("'" + type19 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type19.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card21);
    org.junit.Assert.assertTrue("'" + type22 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type22.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-1));
    org.junit.Assert.assertTrue("'" + type26 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type26.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i54);
    org.junit.Assert.assertTrue("'" + cardName56 + "' != '" + org.cs362.dominion.Card.CardName.Curse + "'", cardName56.equals(org.cs362.dominion.Card.CardName.Curse));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == (-1));

  }
*/
  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    gameState1.Supply = arraylist_card9;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i13 = null;
    gameState1.embargoed = hashmap_card_i13;
    java.util.List<org.cs362.dominion.Player> list_player15 = null;
    gameState1.players = list_player15;
    // The following exception was thrown during execution in test generation
    try {
    gameState1.initializeGame();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState1.embargoed;
    org.cs362.dominion.Player player10 = new org.cs362.dominion.Player(gameState1, "");
    org.cs362.dominion.Player player12 = new org.cs362.dominion.Player(gameState1, "hi!");
    player12.playTreasureCard();
    player12.playKingdomCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.List<org.cs362.dominion.Card> list_card8 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState9 = new org.cs362.dominion.GameState(list_card8);
    org.cs362.dominion.Player player11 = new org.cs362.dominion.Player(gameState9, "hi!");
    org.cs362.dominion.Player[] player_array12 = new org.cs362.dominion.Player[] { player11 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player13 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player13, player_array12);
    gameState1.players = arraylist_player13;
    java.util.List<org.cs362.dominion.Card> list_card16 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState17 = new org.cs362.dominion.GameState(list_card16);
    org.cs362.dominion.Card card18 = null;
    gameState17.loseCard(card18);
    org.cs362.dominion.Card[] card_array20 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card21 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card21, card_array20);
    gameState17.onBoard = arraylist_card21;
    java.util.List<org.cs362.dominion.Card> list_card24 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState25 = new org.cs362.dominion.GameState(list_card24);
    org.cs362.dominion.Player player27 = new org.cs362.dominion.Player(gameState25, "hi!");
    org.cs362.dominion.Player[] player_array28 = new org.cs362.dominion.Player[] { player27 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player29 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player29, player_array28);
    gameState17.players = arraylist_player29;
    java.util.List<org.cs362.dominion.Card> list_card32 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState33 = new org.cs362.dominion.GameState(list_card32);
    org.cs362.dominion.Card card34 = null;
    gameState33.loseCard(card34);
    org.cs362.dominion.Card[] card_array36 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card37 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b38 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card37, card_array36);
    gameState33.onBoard = arraylist_card37;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i40 = gameState33.embargoed;
    gameState17.embargoed = hashmap_card_i40;
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i42 = gameState17.play();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i43 = gameState17.gameBoard;
    gameState1.embargoed = hashmap_card_i43;
    java.lang.String str45 = gameState1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "The board game is empty you need to intialize the game!!!!"+ "'", str45.equals("The board game is empty you need to intialize the game!!!!"));

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Player player3 = new org.cs362.dominion.Player(gameState1, "hi!");
    java.util.List<org.cs362.dominion.Player> list_player4 = gameState1.players;
    gameState1.updateBoard();
    java.util.List<org.cs362.dominion.Card> list_card6 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState7 = new org.cs362.dominion.GameState(list_card6);
    org.cs362.dominion.Player player9 = new org.cs362.dominion.Player(gameState7, "hi!");
    gameState1.addPlayer(player9);
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i11 = gameState1.getWinners();
    java.util.List<org.cs362.dominion.Card> list_card12 = org.cs362.dominion.Card.createCards();
    gameState1.onBoard = list_card12;
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i14 = gameState1.play();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i15 = gameState1.embargoed;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i15);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.List<org.cs362.dominion.Card> list_card8 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState9 = new org.cs362.dominion.GameState(list_card8);
    org.cs362.dominion.Player player11 = new org.cs362.dominion.Player(gameState9, "hi!");
    org.cs362.dominion.Player[] player_array12 = new org.cs362.dominion.Player[] { player11 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player13 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player13, player_array12);
    gameState1.players = arraylist_player13;
    java.util.List<org.cs362.dominion.Card> list_card16 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState17 = new org.cs362.dominion.GameState(list_card16);
    org.cs362.dominion.Card card18 = null;
    gameState17.loseCard(card18);
    org.cs362.dominion.Card[] card_array20 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card21 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card21, card_array20);
    gameState17.onBoard = arraylist_card21;
    java.util.List<org.cs362.dominion.Card> list_card24 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState25 = new org.cs362.dominion.GameState(list_card24);
    org.cs362.dominion.Player player27 = new org.cs362.dominion.Player(gameState25, "hi!");
    org.cs362.dominion.Player[] player_array28 = new org.cs362.dominion.Player[] { player27 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player29 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player29, player_array28);
    gameState17.players = arraylist_player29;
    org.cs362.dominion.Player player32 = org.cs362.dominion.Randomness.randomMember((java.util.List<org.cs362.dominion.Player>)arraylist_player29);
    gameState1.addPlayer(player32);
    boolean b34 = gameState1.isGameOver();
    boolean b35 = gameState1.isGameOver();
    org.cs362.dominion.Card card36 = null;
    gameState1.loseCard(card36);
    java.lang.String str38 = gameState1.toString();
    java.util.List<org.cs362.dominion.Card> list_card39 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState40 = new org.cs362.dominion.GameState(list_card39);
    org.cs362.dominion.Player player42 = new org.cs362.dominion.Player(gameState40, "hi!");
    player42.playKingdomCard();
    gameState1.addPlayer(player42);
    java.util.List<org.cs362.dominion.Card> list_card45 = org.cs362.dominion.Card.createCards();
    int i46 = player42.lowestCost(list_card45);
    org.cs362.dominion.Card card47 = org.cs362.dominion.Randomness.randomMember(list_card45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "The board game is empty you need to intialize the game!!!!"+ "'", str38.equals("The board game is empty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card47);

  }
/*
  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card.Type type2 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card3 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card0, type2);
    org.cs362.dominion.Card card4 = org.cs362.dominion.Randomness.randomMember(list_card3);
    org.cs362.dominion.Card.Type type5 = card4.getType();
    java.lang.String str6 = card4.toString();
    java.lang.String str7 = card4.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type2.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card4);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type5.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + " \n\tDuchy"+ "'", str6.equals(" \n\tDuchy"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + " \n\tDuchy"+ "'", str7.equals(" \n\tDuchy"));

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState1.embargoed;
    org.cs362.dominion.Player player10 = new org.cs362.dominion.Player(gameState1, "");
    player10.playTreasureCard();
    java.util.List<org.cs362.dominion.Card> list_card12 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState13 = new org.cs362.dominion.GameState(list_card12);
    org.cs362.dominion.Card.Type type14 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card15 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card12, type14);
    org.cs362.dominion.Card card16 = org.cs362.dominion.Randomness.randomMember(list_card15);
    java.util.List<org.cs362.dominion.Card> list_card17 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState18 = new org.cs362.dominion.GameState(list_card17);
    org.cs362.dominion.Card.Type type19 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card20 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card17, type19);
    org.cs362.dominion.Card card21 = org.cs362.dominion.Randomness.randomMember(list_card20);
    org.cs362.dominion.Card.Type type22 = card21.getType();
    int i23 = card16.compareTo(card21);
    int i24 = card21.score();
    player10.discard(card21);
    org.cs362.dominion.Card.Type type26 = card21.getType();
    java.util.List<org.cs362.dominion.Card> list_card27 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState28 = new org.cs362.dominion.GameState(list_card27);
    org.cs362.dominion.Card card29 = null;
    gameState28.loseCard(card29);
    java.util.List<org.cs362.dominion.Card> list_card31 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState32 = new org.cs362.dominion.GameState(list_card31);
    org.cs362.dominion.Card card33 = null;
    gameState32.loseCard(card33);
    org.cs362.dominion.Card[] card_array35 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card36 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card36, card_array35);
    gameState32.onBoard = arraylist_card36;
    gameState28.Supply = arraylist_card36;
    java.util.List<org.cs362.dominion.Card> list_card40 = gameState28.onBoard;
    org.cs362.dominion.Player player42 = new org.cs362.dominion.Player(gameState28, "hi!");
    java.util.List<org.cs362.dominion.Card> list_card43 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState44 = new org.cs362.dominion.GameState(list_card43);
    org.cs362.dominion.Player player46 = new org.cs362.dominion.Player(gameState44, "hi!");
    java.util.List<org.cs362.dominion.Player> list_player47 = gameState44.players;
    gameState44.updateBoard();
    java.util.List<org.cs362.dominion.Card> list_card49 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState50 = new org.cs362.dominion.GameState(list_card49);
    org.cs362.dominion.Player player52 = new org.cs362.dominion.Player(gameState50, "hi!");
    gameState44.addPlayer(player52);
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i54 = gameState44.getWinners();
    card21.play(player42, gameState44);
    player42.printStateGame();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card12);
    org.junit.Assert.assertTrue("'" + type14 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type14.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);
    org.junit.Assert.assertTrue("'" + type19 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type19.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card21);
    org.junit.Assert.assertTrue("'" + type22 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type22.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == (-12));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    org.junit.Assert.assertTrue("'" + type26 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type26.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i54);

  }
*/
  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    gameState1.Supply = arraylist_card9;
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i13 = gameState1.play();
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i14 = gameState1.play();
    java.util.List<org.cs362.dominion.Card> list_card15 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState16 = new org.cs362.dominion.GameState(list_card15);
    org.cs362.dominion.Card.Type type17 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card18 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card15, type17);
    org.cs362.dominion.GameState gameState19 = new org.cs362.dominion.GameState(list_card15);
    java.util.List<org.cs362.dominion.Card> list_card20 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState21 = new org.cs362.dominion.GameState(list_card20);
    org.cs362.dominion.Card card22 = null;
    gameState21.loseCard(card22);
    org.cs362.dominion.Card[] card_array24 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card25 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card25, card_array24);
    gameState21.onBoard = arraylist_card25;
    java.util.List<org.cs362.dominion.Card> list_card28 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState29 = new org.cs362.dominion.GameState(list_card28);
    org.cs362.dominion.Player player31 = new org.cs362.dominion.Player(gameState29, "hi!");
    org.cs362.dominion.Player[] player_array32 = new org.cs362.dominion.Player[] { player31 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player33 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b34 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player33, player_array32);
    gameState21.players = arraylist_player33;
    java.util.List<org.cs362.dominion.Card> list_card36 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState37 = new org.cs362.dominion.GameState(list_card36);
    org.cs362.dominion.Card card38 = null;
    gameState37.loseCard(card38);
    org.cs362.dominion.Card[] card_array40 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card41 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b42 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card41, card_array40);
    gameState37.onBoard = arraylist_card41;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i44 = gameState37.embargoed;
    gameState21.embargoed = hashmap_card_i44;
    gameState19.embargoed = hashmap_card_i44;
    gameState1.gameBoard = hashmap_card_i44;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);
    org.junit.Assert.assertTrue("'" + type17 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type17.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i44);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Player player3 = new org.cs362.dominion.Player(gameState1, "hi!");
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i12 = gameState5.embargoed;
    java.util.List<org.cs362.dominion.Player> list_player13 = gameState5.players;
    gameState1.players = list_player13;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i15 = gameState1.gameBoard;
    gameState1.initializeGame();
    java.util.List<org.cs362.dominion.Card> list_card17 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState18 = new org.cs362.dominion.GameState(list_card17);
    org.cs362.dominion.Player player20 = new org.cs362.dominion.Player(gameState18, "hi!");
    java.util.List<org.cs362.dominion.Player> list_player21 = gameState18.players;
    gameState18.updateBoard();
    java.util.List<org.cs362.dominion.Card> list_card23 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState24 = new org.cs362.dominion.GameState(list_card23);
    org.cs362.dominion.Player player26 = new org.cs362.dominion.Player(gameState24, "hi!");
    gameState18.addPlayer(player26);
    java.util.List<org.cs362.dominion.Card> list_card28 = gameState18.Supply;
    java.util.List<org.cs362.dominion.Card> list_card29 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState30 = new org.cs362.dominion.GameState(list_card29);
    org.cs362.dominion.Card card31 = null;
    gameState30.loseCard(card31);
    org.cs362.dominion.Card[] card_array33 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card34 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b35 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card34, card_array33);
    gameState30.onBoard = arraylist_card34;
    org.cs362.dominion.Card.Type type37 = org.cs362.dominion.Card.Type.ACTION;
    java.util.List<org.cs362.dominion.Card> list_card38 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)arraylist_card34, type37);
    java.util.List<org.cs362.dominion.Card> list_card39 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card28, type37);
    gameState1.Supply = list_card28;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    org.junit.Assert.assertTrue("'" + type37 + "' != '" + org.cs362.dominion.Card.Type.ACTION + "'", type37.equals(org.cs362.dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card39);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.List<org.cs362.dominion.Card> list_card8 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState9 = new org.cs362.dominion.GameState(list_card8);
    org.cs362.dominion.Player player11 = new org.cs362.dominion.Player(gameState9, "hi!");
    org.cs362.dominion.Player[] player_array12 = new org.cs362.dominion.Player[] { player11 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player13 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player13, player_array12);
    gameState1.players = arraylist_player13;
    java.util.List<org.cs362.dominion.Card> list_card16 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState17 = new org.cs362.dominion.GameState(list_card16);
    org.cs362.dominion.Card card18 = null;
    gameState17.loseCard(card18);
    org.cs362.dominion.Card[] card_array20 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card21 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card21, card_array20);
    gameState17.onBoard = arraylist_card21;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i24 = gameState17.embargoed;
    gameState1.embargoed = hashmap_card_i24;
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i26 = gameState1.play();
    gameState1.initializeGame();
    java.util.List<org.cs362.dominion.Card> list_card28 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState29 = new org.cs362.dominion.GameState(list_card28);
    org.cs362.dominion.Card card30 = null;
    gameState29.loseCard(card30);
    org.cs362.dominion.Card[] card_array32 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card33 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b34 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card33, card_array32);
    gameState29.onBoard = arraylist_card33;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i36 = gameState29.embargoed;
    java.util.List<org.cs362.dominion.Player> list_player37 = gameState29.players;
    gameState1.players = list_player37;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player37);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState1.embargoed;
    java.lang.String str9 = gameState1.toString();
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i10 = gameState1.getWinners();
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i11 = gameState1.play();
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i12 = gameState1.getWinners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "The board game is empty you need to intialize the game!!!!"+ "'", str9.equals("The board game is empty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i12);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Player player3 = new org.cs362.dominion.Player(gameState1, "hi!");
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i4 = gameState1.getWinners();
    boolean b5 = gameState1.isGameOver();
    java.util.List<org.cs362.dominion.Card> list_card6 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState7 = new org.cs362.dominion.GameState(list_card6);
    org.cs362.dominion.Card card8 = null;
    gameState7.loseCard(card8);
    org.cs362.dominion.Card[] card_array10 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card11 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card11, card_array10);
    gameState7.onBoard = arraylist_card11;
    java.util.List<org.cs362.dominion.Card> list_card14 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState15 = new org.cs362.dominion.GameState(list_card14);
    org.cs362.dominion.Player player17 = new org.cs362.dominion.Player(gameState15, "hi!");
    org.cs362.dominion.Player[] player_array18 = new org.cs362.dominion.Player[] { player17 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player19 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player19, player_array18);
    gameState7.players = arraylist_player19;
    java.util.List<org.cs362.dominion.Card> list_card22 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState23 = new org.cs362.dominion.GameState(list_card22);
    org.cs362.dominion.Card card24 = null;
    gameState23.loseCard(card24);
    org.cs362.dominion.Card[] card_array26 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card27 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card27, card_array26);
    gameState23.onBoard = arraylist_card27;
    java.util.List<org.cs362.dominion.Card> list_card30 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState31 = new org.cs362.dominion.GameState(list_card30);
    org.cs362.dominion.Player player33 = new org.cs362.dominion.Player(gameState31, "hi!");
    org.cs362.dominion.Player[] player_array34 = new org.cs362.dominion.Player[] { player33 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player35 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player35, player_array34);
    gameState23.players = arraylist_player35;
    org.cs362.dominion.Player player38 = org.cs362.dominion.Randomness.randomMember((java.util.List<org.cs362.dominion.Player>)arraylist_player35);
    gameState7.addPlayer(player38);
    boolean b40 = gameState7.isGameOver();
    boolean b41 = gameState7.isGameOver();
    org.cs362.dominion.Card card42 = null;
    gameState7.loseCard(card42);
    java.util.List<org.cs362.dominion.Card> list_card44 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState45 = new org.cs362.dominion.GameState(list_card44);
    org.cs362.dominion.Player player47 = new org.cs362.dominion.Player(gameState45, "hi!");
    java.util.List<org.cs362.dominion.Card> list_card48 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState49 = new org.cs362.dominion.GameState(list_card48);
    org.cs362.dominion.Card card50 = null;
    gameState49.loseCard(card50);
    org.cs362.dominion.Card[] card_array52 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card53 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b54 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card53, card_array52);
    gameState49.onBoard = arraylist_card53;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i56 = gameState49.embargoed;
    java.util.List<org.cs362.dominion.Player> list_player57 = gameState49.players;
    gameState45.players = list_player57;
    gameState7.players = list_player57;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i60 = gameState7.gameBoard;
    gameState1.embargoed = hashmap_card_i60;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i60);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    gameState1.Supply = arraylist_card9;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i13 = null;
    gameState1.embargoed = hashmap_card_i13;
    org.cs362.dominion.Player player16 = new org.cs362.dominion.Player(gameState1, "The board game is empty you need to intialize the game!!!!");
    org.cs362.dominion.Card card17 = null;
    player16.discard(card17);
    player16.playKingdomCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    gameState1.Supply = arraylist_card9;
    java.util.List<org.cs362.dominion.Card> list_card13 = gameState1.onBoard;
    org.cs362.dominion.Player player15 = new org.cs362.dominion.Player(gameState1, "hi!");
    java.lang.String str16 = player15.toString();
    player15.playKingdomCard();
    player15.playKingdomCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str16.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }
/*
  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card.Type type2 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card3 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card0, type2);
    org.cs362.dominion.Card card4 = org.cs362.dominion.Randomness.randomMember(list_card3);
    org.cs362.dominion.Card.Type type5 = card4.getType();
    java.util.List<org.cs362.dominion.Card> list_card6 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState7 = new org.cs362.dominion.GameState(list_card6);
    org.cs362.dominion.Card.Type type8 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card9 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card6, type8);
    org.cs362.dominion.Card card10 = org.cs362.dominion.Randomness.randomMember(list_card9);
    org.cs362.dominion.Card.Type type11 = card10.getType();
    int i12 = card4.compareTo(card10);
    int i13 = card10.score();
    java.util.List<org.cs362.dominion.Card> list_card14 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState15 = new org.cs362.dominion.GameState(list_card14);
    org.cs362.dominion.Card card16 = null;
    gameState15.loseCard(card16);
    java.util.List<org.cs362.dominion.Card> list_card18 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState19 = new org.cs362.dominion.GameState(list_card18);
    org.cs362.dominion.Card card20 = null;
    gameState19.loseCard(card20);
    org.cs362.dominion.Card[] card_array22 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card23 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card23, card_array22);
    gameState19.onBoard = arraylist_card23;
    gameState15.Supply = arraylist_card23;
    java.util.List<org.cs362.dominion.Card> list_card27 = gameState15.onBoard;
    org.cs362.dominion.Player player29 = new org.cs362.dominion.Player(gameState15, "hi!");
    java.lang.String str30 = player29.toString();
    java.lang.String str31 = player29.toString();
    player29.playTreasureCard();
    java.util.List<org.cs362.dominion.Card> list_card33 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState34 = new org.cs362.dominion.GameState(list_card33);
    org.cs362.dominion.Card card35 = null;
    gameState34.loseCard(card35);
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i37 = gameState34.play();
    card10.play(player29, gameState34);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i39 = gameState34.gameBoard;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type2.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card4);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type5.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    org.junit.Assert.assertTrue("'" + type8 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type8.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card10);
    org.junit.Assert.assertTrue("'" + type11 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type11.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str30.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str31.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i39);

  }
*/
  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    gameState1.Supply = arraylist_card9;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i13 = null;
    gameState1.embargoed = hashmap_card_i13;
    org.cs362.dominion.Player player16 = new org.cs362.dominion.Player(gameState1, "The board game is empty you need to intialize the game!!!!");
    gameState1.updateBoard();
    org.cs362.dominion.Player player19 = new org.cs362.dominion.Player(gameState1, "The board game is empty you need to intialize the game!!!!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card.Type type2 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card3 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card0, type2);
    org.cs362.dominion.Card.Type type4 = org.cs362.dominion.Card.Type.ACTION;
    java.util.List<org.cs362.dominion.Card> list_card5 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card0, type4);
    org.cs362.dominion.GameState gameState6 = new org.cs362.dominion.GameState(list_card5);
    java.util.List<org.cs362.dominion.Card> list_card7 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState8 = new org.cs362.dominion.GameState(list_card7);
    org.cs362.dominion.Card.Type type9 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card10 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card7, type9);
    org.cs362.dominion.Card.Type type11 = org.cs362.dominion.Card.Type.ACTION;
    java.util.List<org.cs362.dominion.Card> list_card12 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card7, type11);
    java.util.List<org.cs362.dominion.Card> list_card13 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card5, type11);
    org.cs362.dominion.Card.CardName cardName14 = org.cs362.dominion.Card.CardName.Silver;
    org.cs362.dominion.Card card15 = org.cs362.dominion.Card.getCard(list_card5, cardName14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type2.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card3);
    org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.cs362.dominion.Card.Type.ACTION + "'", type4.equals(org.cs362.dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card7);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type9.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);
    org.junit.Assert.assertTrue("'" + type11 + "' != '" + org.cs362.dominion.Card.Type.ACTION + "'", type11.equals(org.cs362.dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    org.junit.Assert.assertTrue("'" + cardName14 + "' != '" + org.cs362.dominion.Card.CardName.Silver + "'", cardName14.equals(org.cs362.dominion.Card.CardName.Silver));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card15);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState1.embargoed;
    java.lang.String str9 = gameState1.toString();
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i10 = gameState1.getWinners();
    java.util.List<org.cs362.dominion.Card> list_card11 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState12 = new org.cs362.dominion.GameState(list_card11);
    java.util.List<org.cs362.dominion.Card> list_card13 = gameState12.trashPile;
    gameState1.onBoard = list_card13;
    java.util.List<org.cs362.dominion.Card> list_card15 = gameState1.Supply;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "The board game is empty you need to intialize the game!!!!"+ "'", str9.equals("The board game is empty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }

    org.cs362.dominion.Randomness.totalCallsToRandom = (byte)-1;

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Player player3 = new org.cs362.dominion.Player(gameState1, "hi!");
    java.util.List<org.cs362.dominion.Player> list_player4 = gameState1.players;
    gameState1.updateBoard();
    gameState1.initializeGame();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.List<org.cs362.dominion.Card> list_card8 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState9 = new org.cs362.dominion.GameState(list_card8);
    org.cs362.dominion.Player player11 = new org.cs362.dominion.Player(gameState9, "hi!");
    org.cs362.dominion.Player[] player_array12 = new org.cs362.dominion.Player[] { player11 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player13 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player13, player_array12);
    gameState1.players = arraylist_player13;
    java.util.List<org.cs362.dominion.Card> list_card16 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState17 = new org.cs362.dominion.GameState(list_card16);
    org.cs362.dominion.Card card18 = null;
    gameState17.loseCard(card18);
    org.cs362.dominion.Card[] card_array20 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card21 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card21, card_array20);
    gameState17.onBoard = arraylist_card21;
    java.util.List<org.cs362.dominion.Card> list_card24 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState25 = new org.cs362.dominion.GameState(list_card24);
    org.cs362.dominion.Player player27 = new org.cs362.dominion.Player(gameState25, "hi!");
    org.cs362.dominion.Player[] player_array28 = new org.cs362.dominion.Player[] { player27 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player29 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player29, player_array28);
    gameState17.players = arraylist_player29;
    org.cs362.dominion.Player player32 = org.cs362.dominion.Randomness.randomMember((java.util.List<org.cs362.dominion.Player>)arraylist_player29);
    gameState1.addPlayer(player32);
    player32.playKingdomCard();
    player32.playKingdomCard();
    java.util.List<org.cs362.dominion.Card> list_card36 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState37 = new org.cs362.dominion.GameState(list_card36);
    org.cs362.dominion.Card card38 = null;
    gameState37.loseCard(card38);
    org.cs362.dominion.Card[] card_array40 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card41 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b42 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card41, card_array40);
    gameState37.onBoard = arraylist_card41;
    java.util.List<org.cs362.dominion.Card> list_card44 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState45 = new org.cs362.dominion.GameState(list_card44);
    org.cs362.dominion.Player player47 = new org.cs362.dominion.Player(gameState45, "hi!");
    org.cs362.dominion.Player[] player_array48 = new org.cs362.dominion.Player[] { player47 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player49 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b50 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player49, player_array48);
    gameState37.players = arraylist_player49;
    java.util.List<org.cs362.dominion.Card> list_card52 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState53 = new org.cs362.dominion.GameState(list_card52);
    org.cs362.dominion.Card card54 = null;
    gameState53.loseCard(card54);
    org.cs362.dominion.Card[] card_array56 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card57 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b58 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card57, card_array56);
    gameState53.onBoard = arraylist_card57;
    java.util.List<org.cs362.dominion.Card> list_card60 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState61 = new org.cs362.dominion.GameState(list_card60);
    org.cs362.dominion.Player player63 = new org.cs362.dominion.Player(gameState61, "hi!");
    org.cs362.dominion.Player[] player_array64 = new org.cs362.dominion.Player[] { player63 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player65 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b66 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player65, player_array64);
    gameState53.players = arraylist_player65;
    org.cs362.dominion.Player player68 = org.cs362.dominion.Randomness.randomMember((java.util.List<org.cs362.dominion.Player>)arraylist_player65);
    gameState37.addPlayer(player68);
    boolean b70 = gameState37.isGameOver();
    boolean b71 = gameState37.isGameOver();
    java.util.List<org.cs362.dominion.Card> list_card72 = gameState37.trashPile;
    int i73 = player32.lowestCost(list_card72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 10);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState1.embargoed;
    java.lang.String str9 = gameState1.toString();
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i10 = gameState1.getWinners();
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i11 = gameState1.getWinners();
    org.cs362.dominion.Player player13 = new org.cs362.dominion.Player(gameState1, " \n\tEstate");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "The board game is empty you need to intialize the game!!!!"+ "'", str9.equals("The board game is empty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i11);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    gameState1.Supply = arraylist_card9;
    java.util.List<org.cs362.dominion.Card> list_card13 = gameState1.onBoard;
    org.cs362.dominion.Player player15 = new org.cs362.dominion.Player(gameState1, "hi!");
    java.lang.String str16 = player15.toString();
    java.lang.String str17 = player15.toString();
    player15.printStateGame();
    player15.playKingdomCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str16.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str17.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.List<org.cs362.dominion.Card> list_card8 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState9 = new org.cs362.dominion.GameState(list_card8);
    org.cs362.dominion.Player player11 = new org.cs362.dominion.Player(gameState9, "hi!");
    org.cs362.dominion.Player[] player_array12 = new org.cs362.dominion.Player[] { player11 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player13 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player13, player_array12);
    gameState1.players = arraylist_player13;
    java.util.List<org.cs362.dominion.Card> list_card16 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState17 = new org.cs362.dominion.GameState(list_card16);
    org.cs362.dominion.Card card18 = null;
    gameState17.loseCard(card18);
    org.cs362.dominion.Card[] card_array20 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card21 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card21, card_array20);
    gameState17.onBoard = arraylist_card21;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i24 = gameState17.embargoed;
    gameState1.embargoed = hashmap_card_i24;
    java.util.List<org.cs362.dominion.Card> list_card26 = gameState1.Supply;
    org.cs362.dominion.GameState gameState27 = new org.cs362.dominion.GameState(list_card26);
    java.util.List<org.cs362.dominion.Card> list_card28 = gameState27.trashPile;
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i29 = gameState27.getWinners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i29);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }

    org.cs362.dominion.Randomness.totalCallsToRandom = 2;

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }

    org.cs362.dominion.Randomness.totalCallsToRandom = (short)100;

  }
/*
  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Player player3 = new org.cs362.dominion.Player(gameState1, "hi!");
    java.util.List<org.cs362.dominion.Player> list_player4 = gameState1.players;
    gameState1.updateBoard();
    java.util.List<org.cs362.dominion.Card> list_card6 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState7 = new org.cs362.dominion.GameState(list_card6);
    org.cs362.dominion.Player player9 = new org.cs362.dominion.Player(gameState7, "hi!");
    gameState1.addPlayer(player9);
    java.util.List<org.cs362.dominion.Card> list_card11 = gameState1.Supply;
    java.util.List<org.cs362.dominion.Card> list_card12 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState13 = new org.cs362.dominion.GameState(list_card12);
    org.cs362.dominion.Card card14 = null;
    gameState13.loseCard(card14);
    org.cs362.dominion.Card[] card_array16 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card17 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card17, card_array16);
    gameState13.onBoard = arraylist_card17;
    org.cs362.dominion.Card.Type type20 = org.cs362.dominion.Card.Type.ACTION;
    java.util.List<org.cs362.dominion.Card> list_card21 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)arraylist_card17, type20);
    java.util.List<org.cs362.dominion.Card> list_card22 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card11, type20);
    org.cs362.dominion.GameState gameState23 = new org.cs362.dominion.GameState(list_card22);
    java.util.List<org.cs362.dominion.Card> list_card24 = gameState23.onBoard;
    java.util.List<org.cs362.dominion.Card> list_card25 = gameState23.trashPile;
    java.util.List<org.cs362.dominion.Card> list_card26 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState27 = new org.cs362.dominion.GameState(list_card26);
    org.cs362.dominion.Card card28 = null;
    gameState27.loseCard(card28);
    org.cs362.dominion.Card[] card_array30 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card31 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card31, card_array30);
    gameState27.onBoard = arraylist_card31;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i34 = gameState27.embargoed;
    org.cs362.dominion.Player player36 = new org.cs362.dominion.Player(gameState27, "");
    player36.playTreasureCard();
    java.util.List<org.cs362.dominion.Card> list_card38 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState39 = new org.cs362.dominion.GameState(list_card38);
    org.cs362.dominion.Card.Type type40 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card41 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card38, type40);
    org.cs362.dominion.Card card42 = org.cs362.dominion.Randomness.randomMember(list_card41);
    java.util.List<org.cs362.dominion.Card> list_card43 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState44 = new org.cs362.dominion.GameState(list_card43);
    org.cs362.dominion.Card.Type type45 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card46 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card43, type45);
    org.cs362.dominion.Card card47 = org.cs362.dominion.Randomness.randomMember(list_card46);
    org.cs362.dominion.Card.Type type48 = card47.getType();
    int i49 = card42.compareTo(card47);
    int i50 = card47.score();
    player36.discard(card47);
    org.cs362.dominion.Card.Type type52 = card47.getType();
    int i53 = card47.getCost();
    int i54 = card47.getTreasureValue();
    int i55 = card47.score();
    gameState23.loseCard(card47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    org.junit.Assert.assertTrue("'" + type20 + "' != '" + org.cs362.dominion.Card.Type.ACTION + "'", type20.equals(org.cs362.dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card38);
    org.junit.Assert.assertTrue("'" + type40 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type40.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card43);
    org.junit.Assert.assertTrue("'" + type45 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type45.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card47);
    org.junit.Assert.assertTrue("'" + type48 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type48.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 6);
    org.junit.Assert.assertTrue("'" + type52 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type52.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 6);

  }
*/
  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.List<org.cs362.dominion.Card> list_card8 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState9 = new org.cs362.dominion.GameState(list_card8);
    org.cs362.dominion.Player player11 = new org.cs362.dominion.Player(gameState9, "hi!");
    org.cs362.dominion.Player[] player_array12 = new org.cs362.dominion.Player[] { player11 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player13 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player13, player_array12);
    gameState1.players = arraylist_player13;
    java.util.List<org.cs362.dominion.Card> list_card16 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState17 = new org.cs362.dominion.GameState(list_card16);
    org.cs362.dominion.Card card18 = null;
    gameState17.loseCard(card18);
    org.cs362.dominion.Card[] card_array20 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card21 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card21, card_array20);
    gameState17.onBoard = arraylist_card21;
    java.util.List<org.cs362.dominion.Card> list_card24 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState25 = new org.cs362.dominion.GameState(list_card24);
    org.cs362.dominion.Player player27 = new org.cs362.dominion.Player(gameState25, "hi!");
    org.cs362.dominion.Player[] player_array28 = new org.cs362.dominion.Player[] { player27 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player29 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player29, player_array28);
    gameState17.players = arraylist_player29;
    org.cs362.dominion.Player player32 = org.cs362.dominion.Randomness.randomMember((java.util.List<org.cs362.dominion.Player>)arraylist_player29);
    gameState1.addPlayer(player32);
    player32.playKingdomCard();
    player32.playKingdomCard();
    player32.printStateGame();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player32);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    gameState1.Supply = arraylist_card9;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i13 = null;
    gameState1.embargoed = hashmap_card_i13;
    java.util.List<org.cs362.dominion.Player> list_player15 = null;
    gameState1.players = list_player15;
    java.util.List<org.cs362.dominion.Card> list_card17 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState18 = new org.cs362.dominion.GameState(list_card17);
    org.cs362.dominion.Card card19 = null;
    gameState18.loseCard(card19);
    org.cs362.dominion.Card[] card_array21 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card22 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card22, card_array21);
    gameState18.onBoard = arraylist_card22;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i25 = gameState18.embargoed;
    gameState1.gameBoard = hashmap_card_i25;
    java.util.List<org.cs362.dominion.Card> list_card27 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState28 = new org.cs362.dominion.GameState(list_card27);
    org.cs362.dominion.Card card29 = null;
    gameState28.loseCard(card29);
    org.cs362.dominion.Card[] card_array31 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card32 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card32, card_array31);
    gameState28.onBoard = arraylist_card32;
    java.util.List<org.cs362.dominion.Card> list_card35 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState36 = new org.cs362.dominion.GameState(list_card35);
    org.cs362.dominion.Player player38 = new org.cs362.dominion.Player(gameState36, "hi!");
    org.cs362.dominion.Player[] player_array39 = new org.cs362.dominion.Player[] { player38 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player40 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player40, player_array39);
    gameState28.players = arraylist_player40;
    java.util.List<org.cs362.dominion.Card> list_card43 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState44 = new org.cs362.dominion.GameState(list_card43);
    org.cs362.dominion.Card card45 = null;
    gameState44.loseCard(card45);
    org.cs362.dominion.Card[] card_array47 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card48 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b49 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card48, card_array47);
    gameState44.onBoard = arraylist_card48;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i51 = gameState44.embargoed;
    gameState28.embargoed = hashmap_card_i51;
    gameState1.gameBoard = hashmap_card_i51;
    java.util.List<org.cs362.dominion.Card> list_card54 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState55 = new org.cs362.dominion.GameState(list_card54);
    java.util.List<org.cs362.dominion.Card> list_card56 = gameState55.trashPile;
    gameState1.Supply = list_card56;
    java.util.List<org.cs362.dominion.Card> list_card58 = gameState1.trashPile;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i59 = gameState1.embargoed;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(hashmap_card_i59);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card.Type type2 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card3 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card0, type2);
    org.cs362.dominion.GameState gameState4 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card.CardName cardName5 = org.cs362.dominion.Card.CardName.Estate;
    org.cs362.dominion.Card card6 = org.cs362.dominion.Card.getCard(list_card0, cardName5);
    java.util.List<org.cs362.dominion.Card> list_card7 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState8 = new org.cs362.dominion.GameState(list_card7);
    org.cs362.dominion.Card card9 = null;
    gameState8.loseCard(card9);
    org.cs362.dominion.Card[] card_array11 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card12 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card12, card_array11);
    gameState8.onBoard = arraylist_card12;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i15 = gameState8.embargoed;
    org.cs362.dominion.Player player17 = new org.cs362.dominion.Player(gameState8, "");
    org.cs362.dominion.Card[] card_array18 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card19 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card19, card_array18);
    int i21 = player17.lowestCost((java.util.List<org.cs362.dominion.Card>)arraylist_card19);
    player17.printStateGame();
    java.lang.String str23 = player17.toString();
    java.util.List<org.cs362.dominion.Card> list_card24 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState25 = new org.cs362.dominion.GameState(list_card24);
    org.cs362.dominion.Card card26 = null;
    gameState25.loseCard(card26);
    org.cs362.dominion.Card[] card_array28 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card29 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card29, card_array28);
    gameState25.onBoard = arraylist_card29;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i32 = gameState25.embargoed;
    org.cs362.dominion.Player player34 = new org.cs362.dominion.Player(gameState25, "");
    org.cs362.dominion.Player player36 = new org.cs362.dominion.Player(gameState25, "hi!");
    java.util.List<org.cs362.dominion.Card> list_card37 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState38 = new org.cs362.dominion.GameState(list_card37);
    org.cs362.dominion.Card card39 = null;
    gameState38.loseCard(card39);
    org.cs362.dominion.Card[] card_array41 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card42 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b43 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card42, card_array41);
    gameState38.onBoard = arraylist_card42;
    org.cs362.dominion.Card card45 = null;
    gameState38.loseCard(card45);
    java.util.List<org.cs362.dominion.Card> list_card47 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState48 = new org.cs362.dominion.GameState(list_card47);
    org.cs362.dominion.Card card49 = null;
    gameState48.loseCard(card49);
    org.cs362.dominion.Card[] card_array51 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card52 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b53 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card52, card_array51);
    gameState48.onBoard = arraylist_card52;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i55 = gameState48.embargoed;
    gameState38.gameBoard = hashmap_card_i55;
    gameState25.embargoed = hashmap_card_i55;
    java.util.List<org.cs362.dominion.Card> list_card58 = gameState25.trashPile;
    card6.play(player17, gameState25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type2.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card3);
    org.junit.Assert.assertTrue("'" + cardName5 + "' != '" + org.cs362.dominion.Card.CardName.Estate + "'", cardName5.equals(org.cs362.dominion.Card.CardName.Estate));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + " ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str23.equals(" ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card58);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card card4 = null;
    gameState1.loseCard(card4);
    java.util.List<org.cs362.dominion.Card> list_card6 = gameState1.Supply;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i7 = gameState1.gameBoard;
    boolean b8 = gameState1.isGameOver();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    gameState1.Supply = arraylist_card9;
    java.util.List<org.cs362.dominion.Card> list_card13 = gameState1.onBoard;
    org.cs362.dominion.Player player15 = new org.cs362.dominion.Player(gameState1, "hi!");
    player15.playKingdomCard();
    // The following exception was thrown during execution in test generation
    try {
    player15.buyCard();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }

    // The following exception was thrown during execution in test generation
    try {
    int i1 = org.cs362.dominion.Randomness.nextRandomInt((int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = org.cs362.dominion.Randomness.randomMember(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card2);

  }
/*
  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card.Type type2 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card3 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card0, type2);
    org.cs362.dominion.Card card4 = org.cs362.dominion.Randomness.randomMember(list_card3);
    java.util.List<org.cs362.dominion.Card> list_card5 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState6 = new org.cs362.dominion.GameState(list_card5);
    org.cs362.dominion.Card.Type type7 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card8 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card5, type7);
    org.cs362.dominion.Card card9 = org.cs362.dominion.Randomness.randomMember(list_card8);
    org.cs362.dominion.Card.Type type10 = card9.getType();
    int i11 = card4.compareTo(card9);
    int i12 = card9.score();
    int i13 = card9.getCost();
    int i14 = card9.score();
    int i15 = card9.getTreasureValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type2.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    org.junit.Assert.assertTrue("'" + type7 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type7.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card9);
    org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type10.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }
*/
  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.List<org.cs362.dominion.Card> list_card8 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState9 = new org.cs362.dominion.GameState(list_card8);
    org.cs362.dominion.Player player11 = new org.cs362.dominion.Player(gameState9, "hi!");
    org.cs362.dominion.Player[] player_array12 = new org.cs362.dominion.Player[] { player11 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player13 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player13, player_array12);
    gameState1.players = arraylist_player13;
    java.util.List<org.cs362.dominion.Card> list_card16 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState17 = new org.cs362.dominion.GameState(list_card16);
    org.cs362.dominion.Card card18 = null;
    gameState17.loseCard(card18);
    org.cs362.dominion.Card[] card_array20 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card21 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card21, card_array20);
    gameState17.onBoard = arraylist_card21;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i24 = gameState17.embargoed;
    gameState1.embargoed = hashmap_card_i24;
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i26 = gameState1.getWinners();
    java.util.List<org.cs362.dominion.Card> list_card27 = gameState1.trashPile;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card27);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState1.embargoed;
    org.cs362.dominion.Player player10 = new org.cs362.dominion.Player(gameState1, "");
    org.cs362.dominion.Player player12 = new org.cs362.dominion.Player(gameState1, "hi!");
    java.util.List<org.cs362.dominion.Card> list_card13 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState14 = new org.cs362.dominion.GameState(list_card13);
    org.cs362.dominion.Card card15 = null;
    gameState14.loseCard(card15);
    org.cs362.dominion.Card[] card_array17 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card18 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card18, card_array17);
    gameState14.onBoard = arraylist_card18;
    org.cs362.dominion.Card card21 = null;
    gameState14.loseCard(card21);
    java.util.List<org.cs362.dominion.Card> list_card23 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState24 = new org.cs362.dominion.GameState(list_card23);
    org.cs362.dominion.Card card25 = null;
    gameState24.loseCard(card25);
    org.cs362.dominion.Card[] card_array27 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card28 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card28, card_array27);
    gameState24.onBoard = arraylist_card28;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i31 = gameState24.embargoed;
    gameState14.gameBoard = hashmap_card_i31;
    gameState1.embargoed = hashmap_card_i31;
    java.util.List<org.cs362.dominion.Card> list_card34 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState35 = new org.cs362.dominion.GameState(list_card34);
    org.cs362.dominion.Card.Type type36 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card37 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card34, type36);
    org.cs362.dominion.Card.Type type38 = org.cs362.dominion.Card.Type.ACTION;
    java.util.List<org.cs362.dominion.Card> list_card39 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card34, type38);
    org.cs362.dominion.GameState gameState40 = new org.cs362.dominion.GameState(list_card39);
    java.util.List<org.cs362.dominion.Card> list_card41 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState42 = new org.cs362.dominion.GameState(list_card41);
    org.cs362.dominion.Card.Type type43 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card44 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card41, type43);
    org.cs362.dominion.Card.Type type45 = org.cs362.dominion.Card.Type.ACTION;
    java.util.List<org.cs362.dominion.Card> list_card46 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card41, type45);
    java.util.List<org.cs362.dominion.Card> list_card47 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card39, type45);
    gameState1.Supply = list_card47;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card34);
    org.junit.Assert.assertTrue("'" + type36 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type36.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card37);
    org.junit.Assert.assertTrue("'" + type38 + "' != '" + org.cs362.dominion.Card.Type.ACTION + "'", type38.equals(org.cs362.dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card41);
    org.junit.Assert.assertTrue("'" + type43 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type43.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card44);
    org.junit.Assert.assertTrue("'" + type45 + "' != '" + org.cs362.dominion.Card.Type.ACTION + "'", type45.equals(org.cs362.dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card47);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    gameState1.Supply = arraylist_card9;
    java.util.List<org.cs362.dominion.Card> list_card13 = gameState1.onBoard;
    org.cs362.dominion.Player player15 = new org.cs362.dominion.Player(gameState1, "hi!");
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i16 = gameState1.play();
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i17 = gameState1.play();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i17);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    gameState1.Supply = arraylist_card9;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i13 = null;
    gameState1.embargoed = hashmap_card_i13;
    org.cs362.dominion.Player player16 = new org.cs362.dominion.Player(gameState1, "The board game is empty you need to intialize the game!!!!");
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i17 = gameState1.gameBoard;
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i18 = gameState1.play();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i18);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Player player3 = new org.cs362.dominion.Player(gameState1, "hi!");
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i12 = gameState5.embargoed;
    java.util.List<org.cs362.dominion.Player> list_player13 = gameState5.players;
    gameState1.players = list_player13;
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i15 = gameState1.play();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i15);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    java.util.List<org.cs362.dominion.Card> list_card2 = gameState1.trashPile;
    // The following exception was thrown during execution in test generation
    try {
    org.cs362.dominion.GameState gameState3 = gameState1.clone();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card2);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    org.cs362.dominion.Card card8 = null;
    gameState1.loseCard(card8);
    java.util.List<org.cs362.dominion.Player> list_player10 = gameState1.players;
    java.util.List<org.cs362.dominion.Card> list_card11 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState12 = new org.cs362.dominion.GameState(list_card11);
    org.cs362.dominion.Card card13 = null;
    gameState12.loseCard(card13);
    java.util.List<org.cs362.dominion.Card> list_card15 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState16 = new org.cs362.dominion.GameState(list_card15);
    org.cs362.dominion.Card card17 = null;
    gameState16.loseCard(card17);
    org.cs362.dominion.Card[] card_array19 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card20 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card20, card_array19);
    gameState16.onBoard = arraylist_card20;
    gameState12.Supply = arraylist_card20;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i24 = null;
    gameState12.embargoed = hashmap_card_i24;
    java.util.List<org.cs362.dominion.Player> list_player26 = null;
    gameState12.players = list_player26;
    java.util.List<org.cs362.dominion.Card> list_card28 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState29 = new org.cs362.dominion.GameState(list_card28);
    org.cs362.dominion.Card card30 = null;
    gameState29.loseCard(card30);
    org.cs362.dominion.Card[] card_array32 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card33 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b34 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card33, card_array32);
    gameState29.onBoard = arraylist_card33;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i36 = gameState29.embargoed;
    gameState12.gameBoard = hashmap_card_i36;
    java.util.List<org.cs362.dominion.Card> list_card38 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState39 = new org.cs362.dominion.GameState(list_card38);
    org.cs362.dominion.Card card40 = null;
    gameState39.loseCard(card40);
    org.cs362.dominion.Card[] card_array42 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card43 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b44 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card43, card_array42);
    gameState39.onBoard = arraylist_card43;
    java.util.List<org.cs362.dominion.Card> list_card46 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState47 = new org.cs362.dominion.GameState(list_card46);
    org.cs362.dominion.Player player49 = new org.cs362.dominion.Player(gameState47, "hi!");
    org.cs362.dominion.Player[] player_array50 = new org.cs362.dominion.Player[] { player49 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player51 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b52 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player51, player_array50);
    gameState39.players = arraylist_player51;
    java.util.List<org.cs362.dominion.Card> list_card54 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState55 = new org.cs362.dominion.GameState(list_card54);
    org.cs362.dominion.Card card56 = null;
    gameState55.loseCard(card56);
    org.cs362.dominion.Card[] card_array58 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card59 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b60 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card59, card_array58);
    gameState55.onBoard = arraylist_card59;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i62 = gameState55.embargoed;
    gameState39.embargoed = hashmap_card_i62;
    gameState12.gameBoard = hashmap_card_i62;
    java.util.List<org.cs362.dominion.Card> list_card65 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState66 = new org.cs362.dominion.GameState(list_card65);
    java.util.List<org.cs362.dominion.Card> list_card67 = gameState66.trashPile;
    gameState12.Supply = list_card67;
    java.util.List<org.cs362.dominion.Card> list_card69 = gameState12.trashPile;
    org.cs362.dominion.GameState gameState70 = new org.cs362.dominion.GameState(list_card69);
    gameState1.trashPile = list_card69;
    java.util.List<org.cs362.dominion.Card> list_card72 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState73 = new org.cs362.dominion.GameState(list_card72);
    org.cs362.dominion.Card.Type type74 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card75 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card72, type74);
    org.cs362.dominion.Card.Type type76 = org.cs362.dominion.Card.Type.ACTION;
    java.util.List<org.cs362.dominion.Card> list_card77 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card72, type76);
    org.cs362.dominion.GameState gameState78 = new org.cs362.dominion.GameState(list_card77);
    java.util.List<org.cs362.dominion.Card> list_card79 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState80 = new org.cs362.dominion.GameState(list_card79);
    org.cs362.dominion.Card.Type type81 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card82 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card79, type81);
    org.cs362.dominion.Card.Type type83 = org.cs362.dominion.Card.Type.ACTION;
    java.util.List<org.cs362.dominion.Card> list_card84 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card79, type83);
    java.util.List<org.cs362.dominion.Card> list_card85 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card77, type83);
    java.util.List<org.cs362.dominion.Card> list_card86 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card69, type83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card72);
    org.junit.Assert.assertTrue("'" + type74 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type74.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card75);
    org.junit.Assert.assertTrue("'" + type76 + "' != '" + org.cs362.dominion.Card.Type.ACTION + "'", type76.equals(org.cs362.dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card79);
    org.junit.Assert.assertTrue("'" + type81 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type81.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card82);
    org.junit.Assert.assertTrue("'" + type83 + "' != '" + org.cs362.dominion.Card.Type.ACTION + "'", type83.equals(org.cs362.dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card86);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState1.embargoed;
    org.cs362.dominion.Player player10 = new org.cs362.dominion.Player(gameState1, "");
    java.util.List<org.cs362.dominion.Card> list_card11 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState12 = new org.cs362.dominion.GameState(list_card11);
    org.cs362.dominion.Card card13 = null;
    gameState12.loseCard(card13);
    org.cs362.dominion.Card card15 = null;
    gameState12.loseCard(card15);
    java.util.List<org.cs362.dominion.Card> list_card17 = gameState12.Supply;
    gameState1.Supply = list_card17;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Player player3 = new org.cs362.dominion.Player(gameState1, "hi!");
    java.util.List<org.cs362.dominion.Player> list_player4 = gameState1.players;
    gameState1.updateBoard();
    java.util.List<org.cs362.dominion.Card> list_card6 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState7 = new org.cs362.dominion.GameState(list_card6);
    org.cs362.dominion.Player player9 = new org.cs362.dominion.Player(gameState7, "hi!");
    gameState1.addPlayer(player9);
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i11 = gameState1.getWinners();
    java.util.List<org.cs362.dominion.Card> list_card12 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState13 = new org.cs362.dominion.GameState(list_card12);
    org.cs362.dominion.Card card14 = null;
    gameState13.loseCard(card14);
    org.cs362.dominion.Card[] card_array16 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card17 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card17, card_array16);
    gameState13.onBoard = arraylist_card17;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i20 = gameState13.embargoed;
    org.cs362.dominion.Player player22 = new org.cs362.dominion.Player(gameState13, "");
    org.cs362.dominion.Player player24 = new org.cs362.dominion.Player(gameState13, "hi!");
    java.util.List<org.cs362.dominion.Card> list_card25 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState26 = new org.cs362.dominion.GameState(list_card25);
    org.cs362.dominion.Card card27 = null;
    gameState26.loseCard(card27);
    org.cs362.dominion.Card[] card_array29 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card30 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b31 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card30, card_array29);
    gameState26.onBoard = arraylist_card30;
    org.cs362.dominion.Card card33 = null;
    gameState26.loseCard(card33);
    java.util.List<org.cs362.dominion.Card> list_card35 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState36 = new org.cs362.dominion.GameState(list_card35);
    org.cs362.dominion.Card card37 = null;
    gameState36.loseCard(card37);
    org.cs362.dominion.Card[] card_array39 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card40 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card40, card_array39);
    gameState36.onBoard = arraylist_card40;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i43 = gameState36.embargoed;
    gameState26.gameBoard = hashmap_card_i43;
    gameState13.embargoed = hashmap_card_i43;
    java.util.List<org.cs362.dominion.Card> list_card46 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState47 = new org.cs362.dominion.GameState(list_card46);
    org.cs362.dominion.Card card48 = null;
    gameState47.loseCard(card48);
    org.cs362.dominion.Card[] card_array50 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card51 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b52 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card51, card_array50);
    gameState47.onBoard = arraylist_card51;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i54 = gameState47.embargoed;
    org.cs362.dominion.Player player56 = new org.cs362.dominion.Player(gameState47, "");
    org.cs362.dominion.Player player58 = new org.cs362.dominion.Player(gameState47, "hi!");
    java.util.List<org.cs362.dominion.Card> list_card59 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState60 = new org.cs362.dominion.GameState(list_card59);
    org.cs362.dominion.Card card61 = null;
    gameState60.loseCard(card61);
    org.cs362.dominion.Card[] card_array63 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card64 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b65 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card64, card_array63);
    gameState60.onBoard = arraylist_card64;
    org.cs362.dominion.Card card67 = null;
    gameState60.loseCard(card67);
    java.util.List<org.cs362.dominion.Card> list_card69 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState70 = new org.cs362.dominion.GameState(list_card69);
    org.cs362.dominion.Card card71 = null;
    gameState70.loseCard(card71);
    org.cs362.dominion.Card[] card_array73 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card74 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b75 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card74, card_array73);
    gameState70.onBoard = arraylist_card74;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i77 = gameState70.embargoed;
    gameState60.gameBoard = hashmap_card_i77;
    gameState47.embargoed = hashmap_card_i77;
    gameState13.embargoed = hashmap_card_i77;
    gameState1.embargoed = hashmap_card_i77;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i77);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    org.cs362.dominion.Card card8 = null;
    gameState1.loseCard(card8);
    java.util.List<org.cs362.dominion.Card> list_card10 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState11 = new org.cs362.dominion.GameState(list_card10);
    org.cs362.dominion.Card card12 = null;
    gameState11.loseCard(card12);
    org.cs362.dominion.Card[] card_array14 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card15 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card15, card_array14);
    gameState11.onBoard = arraylist_card15;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i18 = gameState11.embargoed;
    gameState1.gameBoard = hashmap_card_i18;
    java.util.List<org.cs362.dominion.Card> list_card20 = gameState1.trashPile;
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i21 = gameState1.play();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i21);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    gameState1.Supply = arraylist_card9;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i13 = null;
    gameState1.embargoed = hashmap_card_i13;
    java.util.List<org.cs362.dominion.Player> list_player15 = null;
    gameState1.players = list_player15;
    java.util.List<org.cs362.dominion.Card> list_card17 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState18 = new org.cs362.dominion.GameState(list_card17);
    org.cs362.dominion.Card card19 = null;
    gameState18.loseCard(card19);
    org.cs362.dominion.Card[] card_array21 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card22 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card22, card_array21);
    gameState18.onBoard = arraylist_card22;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i25 = gameState18.embargoed;
    gameState1.gameBoard = hashmap_card_i25;
    java.util.List<org.cs362.dominion.Card> list_card27 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState28 = new org.cs362.dominion.GameState(list_card27);
    org.cs362.dominion.Card card29 = null;
    gameState28.loseCard(card29);
    org.cs362.dominion.Card[] card_array31 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card32 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card32, card_array31);
    gameState28.onBoard = arraylist_card32;
    java.util.List<org.cs362.dominion.Card> list_card35 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState36 = new org.cs362.dominion.GameState(list_card35);
    org.cs362.dominion.Player player38 = new org.cs362.dominion.Player(gameState36, "hi!");
    org.cs362.dominion.Player[] player_array39 = new org.cs362.dominion.Player[] { player38 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player40 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player40, player_array39);
    gameState28.players = arraylist_player40;
    java.util.List<org.cs362.dominion.Card> list_card43 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState44 = new org.cs362.dominion.GameState(list_card43);
    org.cs362.dominion.Card card45 = null;
    gameState44.loseCard(card45);
    org.cs362.dominion.Card[] card_array47 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card48 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b49 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card48, card_array47);
    gameState44.onBoard = arraylist_card48;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i51 = gameState44.embargoed;
    gameState28.embargoed = hashmap_card_i51;
    gameState1.gameBoard = hashmap_card_i51;
    java.util.List<org.cs362.dominion.Card> list_card54 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState55 = new org.cs362.dominion.GameState(list_card54);
    org.cs362.dominion.Player player57 = new org.cs362.dominion.Player(gameState55, "hi!");
    java.util.List<org.cs362.dominion.Player> list_player58 = gameState55.players;
    gameState55.updateBoard();
    java.util.List<org.cs362.dominion.Card> list_card60 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState61 = new org.cs362.dominion.GameState(list_card60);
    org.cs362.dominion.Player player63 = new org.cs362.dominion.Player(gameState61, "hi!");
    gameState55.addPlayer(player63);
    java.util.List<org.cs362.dominion.Card> list_card65 = gameState55.Supply;
    gameState1.trashPile = list_card65;
    java.util.List<org.cs362.dominion.Card> list_card67 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState68 = new org.cs362.dominion.GameState(list_card67);
    org.cs362.dominion.Player player70 = new org.cs362.dominion.Player(gameState68, "hi!");
    java.util.List<org.cs362.dominion.Player> list_player71 = gameState68.players;
    gameState1.players = list_player71;
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i73 = gameState1.play();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i73);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.List<org.cs362.dominion.Card> list_card8 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState9 = new org.cs362.dominion.GameState(list_card8);
    org.cs362.dominion.Player player11 = new org.cs362.dominion.Player(gameState9, "hi!");
    org.cs362.dominion.Player[] player_array12 = new org.cs362.dominion.Player[] { player11 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player13 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player13, player_array12);
    gameState1.players = arraylist_player13;
    java.util.List<org.cs362.dominion.Card> list_card16 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState17 = new org.cs362.dominion.GameState(list_card16);
    org.cs362.dominion.Card card18 = null;
    gameState17.loseCard(card18);
    org.cs362.dominion.Card[] card_array20 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card21 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card21, card_array20);
    gameState17.onBoard = arraylist_card21;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i24 = gameState17.embargoed;
    gameState1.embargoed = hashmap_card_i24;
    java.util.List<org.cs362.dominion.Card> list_card26 = gameState1.Supply;
    org.cs362.dominion.GameState gameState27 = new org.cs362.dominion.GameState(list_card26);
    org.cs362.dominion.Card.CardName cardName28 = org.cs362.dominion.Card.CardName.Curse;
    org.cs362.dominion.Card card29 = org.cs362.dominion.Card.getCard(list_card26, cardName28);
    java.util.List<org.cs362.dominion.Card> list_card30 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState31 = new org.cs362.dominion.GameState(list_card30);
    java.util.List<org.cs362.dominion.Card> list_card32 = gameState31.trashPile;
    java.util.List<org.cs362.dominion.Card> list_card33 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState34 = new org.cs362.dominion.GameState(list_card33);
    org.cs362.dominion.Card.Type type35 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card36 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card33, type35);
    org.cs362.dominion.Card.CardName cardName37 = org.cs362.dominion.Card.CardName.Great_Hall;
    org.cs362.dominion.Card card38 = org.cs362.dominion.Card.getCard(list_card36, cardName37);
    org.cs362.dominion.Card card39 = org.cs362.dominion.Card.getCard(list_card32, cardName37);
    org.cs362.dominion.Card card40 = org.cs362.dominion.Card.getCard(list_card26, cardName37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card26);
    org.junit.Assert.assertTrue("'" + cardName28 + "' != '" + org.cs362.dominion.Card.CardName.Curse + "'", cardName28.equals(org.cs362.dominion.Card.CardName.Curse));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card33);
    org.junit.Assert.assertTrue("'" + type35 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type35.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card36);
    org.junit.Assert.assertTrue("'" + cardName37 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName37.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card40);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    gameState1.Supply = arraylist_card9;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i13 = null;
    gameState1.embargoed = hashmap_card_i13;
    java.util.List<org.cs362.dominion.Player> list_player15 = null;
    gameState1.players = list_player15;
    java.util.List<org.cs362.dominion.Card> list_card17 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState18 = new org.cs362.dominion.GameState(list_card17);
    org.cs362.dominion.Card card19 = null;
    gameState18.loseCard(card19);
    org.cs362.dominion.Card[] card_array21 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card22 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card22, card_array21);
    gameState18.onBoard = arraylist_card22;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i25 = gameState18.embargoed;
    gameState1.gameBoard = hashmap_card_i25;
    java.util.List<org.cs362.dominion.Card> list_card27 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState28 = new org.cs362.dominion.GameState(list_card27);
    org.cs362.dominion.Card card29 = null;
    gameState28.loseCard(card29);
    org.cs362.dominion.Card[] card_array31 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card32 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card32, card_array31);
    gameState28.onBoard = arraylist_card32;
    java.util.List<org.cs362.dominion.Card> list_card35 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState36 = new org.cs362.dominion.GameState(list_card35);
    org.cs362.dominion.Player player38 = new org.cs362.dominion.Player(gameState36, "hi!");
    org.cs362.dominion.Player[] player_array39 = new org.cs362.dominion.Player[] { player38 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player40 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player40, player_array39);
    gameState28.players = arraylist_player40;
    java.util.List<org.cs362.dominion.Card> list_card43 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState44 = new org.cs362.dominion.GameState(list_card43);
    org.cs362.dominion.Card card45 = null;
    gameState44.loseCard(card45);
    org.cs362.dominion.Card[] card_array47 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card48 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b49 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card48, card_array47);
    gameState44.onBoard = arraylist_card48;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i51 = gameState44.embargoed;
    gameState28.embargoed = hashmap_card_i51;
    gameState1.gameBoard = hashmap_card_i51;
    java.util.List<org.cs362.dominion.Card> list_card54 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState55 = new org.cs362.dominion.GameState(list_card54);
    java.util.List<org.cs362.dominion.Card> list_card56 = gameState55.trashPile;
    gameState1.Supply = list_card56;
    gameState1.updateBoard();
    // The following exception was thrown during execution in test generation
    try {
    org.cs362.dominion.GameState gameState59 = gameState1.clone();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card56);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }

    org.cs362.dominion.Randomness.reset((long)(-2));

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Player player3 = new org.cs362.dominion.Player(gameState1, "hi!");
    gameState1.initializeGame();
    // The following exception was thrown during execution in test generation
    try {
    org.cs362.dominion.GameState gameState5 = gameState1.clone();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }

    org.cs362.dominion.Randomness.totalCallsToRandom = (-2);

  }
/*
  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card.Type type2 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card3 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card0, type2);
    org.cs362.dominion.Card card4 = org.cs362.dominion.Randomness.randomMember(list_card3);
    java.util.List<org.cs362.dominion.Card> list_card5 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState6 = new org.cs362.dominion.GameState(list_card5);
    org.cs362.dominion.Card.Type type7 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card8 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card5, type7);
    org.cs362.dominion.Card card9 = org.cs362.dominion.Randomness.randomMember(list_card8);
    org.cs362.dominion.Card.Type type10 = card9.getType();
    int i11 = card4.compareTo(card9);
    java.lang.String str12 = card9.toString();
    java.lang.String str13 = card9.toString();
    org.cs362.dominion.Card.CardName cardName14 = card9.getCardName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type2.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    org.junit.Assert.assertTrue("'" + type7 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type7.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card9);
    org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type10.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + " \n\tEstate"+ "'", str12.equals(" \n\tEstate"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " \n\tEstate"+ "'", str13.equals(" \n\tEstate"));
    org.junit.Assert.assertTrue("'" + cardName14 + "' != '" + org.cs362.dominion.Card.CardName.Estate + "'", cardName14.equals(org.cs362.dominion.Card.CardName.Estate));

  }
*/
  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    gameState1.Supply = arraylist_card9;
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i13 = gameState1.play();
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i14 = gameState1.play();
    boolean b15 = gameState1.isGameOver();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.List<org.cs362.dominion.Card> list_card8 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState9 = new org.cs362.dominion.GameState(list_card8);
    org.cs362.dominion.Player player11 = new org.cs362.dominion.Player(gameState9, "hi!");
    org.cs362.dominion.Player[] player_array12 = new org.cs362.dominion.Player[] { player11 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player13 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player13, player_array12);
    gameState1.players = arraylist_player13;
    java.util.List<org.cs362.dominion.Card> list_card16 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState17 = new org.cs362.dominion.GameState(list_card16);
    org.cs362.dominion.Card card18 = null;
    gameState17.loseCard(card18);
    org.cs362.dominion.Card[] card_array20 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card21 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card21, card_array20);
    gameState17.onBoard = arraylist_card21;
    java.util.List<org.cs362.dominion.Card> list_card24 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState25 = new org.cs362.dominion.GameState(list_card24);
    org.cs362.dominion.Player player27 = new org.cs362.dominion.Player(gameState25, "hi!");
    org.cs362.dominion.Player[] player_array28 = new org.cs362.dominion.Player[] { player27 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player29 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player29, player_array28);
    gameState17.players = arraylist_player29;
    org.cs362.dominion.Player player32 = org.cs362.dominion.Randomness.randomMember((java.util.List<org.cs362.dominion.Player>)arraylist_player29);
    gameState1.addPlayer(player32);
    boolean b34 = gameState1.isGameOver();
    boolean b35 = gameState1.isGameOver();
    java.util.List<org.cs362.dominion.Card> list_card36 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState37 = new org.cs362.dominion.GameState(list_card36);
    org.cs362.dominion.Card card38 = null;
    gameState37.loseCard(card38);
    org.cs362.dominion.Card[] card_array40 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card41 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b42 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card41, card_array40);
    gameState37.onBoard = arraylist_card41;
    java.util.List<org.cs362.dominion.Card> list_card44 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState45 = new org.cs362.dominion.GameState(list_card44);
    org.cs362.dominion.Player player47 = new org.cs362.dominion.Player(gameState45, "hi!");
    org.cs362.dominion.Player[] player_array48 = new org.cs362.dominion.Player[] { player47 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player49 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b50 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player49, player_array48);
    gameState37.players = arraylist_player49;
    java.util.List<org.cs362.dominion.Card> list_card52 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState53 = new org.cs362.dominion.GameState(list_card52);
    org.cs362.dominion.Card card54 = null;
    gameState53.loseCard(card54);
    org.cs362.dominion.Card[] card_array56 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card57 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b58 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card57, card_array56);
    gameState53.onBoard = arraylist_card57;
    java.util.List<org.cs362.dominion.Card> list_card60 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState61 = new org.cs362.dominion.GameState(list_card60);
    org.cs362.dominion.Player player63 = new org.cs362.dominion.Player(gameState61, "hi!");
    org.cs362.dominion.Player[] player_array64 = new org.cs362.dominion.Player[] { player63 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player65 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b66 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player65, player_array64);
    gameState53.players = arraylist_player65;
    org.cs362.dominion.Player player68 = org.cs362.dominion.Randomness.randomMember((java.util.List<org.cs362.dominion.Player>)arraylist_player65);
    gameState37.addPlayer(player68);
    boolean b70 = gameState37.isGameOver();
    boolean b71 = gameState37.isGameOver();
    org.cs362.dominion.Card card72 = null;
    gameState37.loseCard(card72);
    java.lang.String str74 = gameState37.toString();
    java.util.List<org.cs362.dominion.Card> list_card75 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState76 = new org.cs362.dominion.GameState(list_card75);
    org.cs362.dominion.Card card77 = null;
    gameState76.loseCard(card77);
    org.cs362.dominion.Card[] card_array79 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card80 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b81 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card80, card_array79);
    gameState76.onBoard = arraylist_card80;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i83 = gameState76.embargoed;
    gameState37.gameBoard = hashmap_card_i83;
    gameState1.embargoed = hashmap_card_i83;
    org.cs362.dominion.GameState gameState86 = gameState1.clone();
    org.cs362.dominion.Card card87 = null;
    gameState1.loseCard(card87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str74 + "' != '" + "The board game is empty you need to intialize the game!!!!"+ "'", str74.equals("The board game is empty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gameState86);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    gameState1.Supply = arraylist_card9;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i13 = null;
    gameState1.embargoed = hashmap_card_i13;
    org.cs362.dominion.Player player16 = new org.cs362.dominion.Player(gameState1, "The board game is empty you need to intialize the game!!!!");
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i17 = gameState1.gameBoard;
    gameState1.updateBoard();
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i19 = gameState1.embargoed;
    gameState1.updateBoard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(hashmap_card_i19);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }

    org.cs362.dominion.Randomness.reset((long)'a');

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.List<org.cs362.dominion.Card> list_card8 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState9 = new org.cs362.dominion.GameState(list_card8);
    org.cs362.dominion.Player player11 = new org.cs362.dominion.Player(gameState9, "hi!");
    org.cs362.dominion.Player[] player_array12 = new org.cs362.dominion.Player[] { player11 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player13 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player13, player_array12);
    gameState1.players = arraylist_player13;
    org.cs362.dominion.Player player16 = org.cs362.dominion.Randomness.randomMember((java.util.List<org.cs362.dominion.Player>)arraylist_player13);
    java.lang.String str17 = player16.toString();
    player16.playTreasureCard();
    player16.playTreasureCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str17.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    gameState1.Supply = arraylist_card9;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i13 = null;
    gameState1.embargoed = hashmap_card_i13;
    java.util.List<org.cs362.dominion.Player> list_player15 = null;
    gameState1.players = list_player15;
    java.util.List<org.cs362.dominion.Card> list_card17 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState18 = new org.cs362.dominion.GameState(list_card17);
    org.cs362.dominion.Card card19 = null;
    gameState18.loseCard(card19);
    org.cs362.dominion.Card[] card_array21 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card22 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card22, card_array21);
    gameState18.onBoard = arraylist_card22;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i25 = gameState18.embargoed;
    gameState1.gameBoard = hashmap_card_i25;
    java.util.List<org.cs362.dominion.Card> list_card27 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState28 = new org.cs362.dominion.GameState(list_card27);
    org.cs362.dominion.Card card29 = null;
    gameState28.loseCard(card29);
    org.cs362.dominion.Card[] card_array31 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card32 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card32, card_array31);
    gameState28.onBoard = arraylist_card32;
    java.util.List<org.cs362.dominion.Card> list_card35 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState36 = new org.cs362.dominion.GameState(list_card35);
    org.cs362.dominion.Player player38 = new org.cs362.dominion.Player(gameState36, "hi!");
    org.cs362.dominion.Player[] player_array39 = new org.cs362.dominion.Player[] { player38 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player40 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player40, player_array39);
    gameState28.players = arraylist_player40;
    java.util.List<org.cs362.dominion.Card> list_card43 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState44 = new org.cs362.dominion.GameState(list_card43);
    org.cs362.dominion.Card card45 = null;
    gameState44.loseCard(card45);
    org.cs362.dominion.Card[] card_array47 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card48 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b49 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card48, card_array47);
    gameState44.onBoard = arraylist_card48;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i51 = gameState44.embargoed;
    gameState28.embargoed = hashmap_card_i51;
    gameState1.gameBoard = hashmap_card_i51;
    java.util.List<org.cs362.dominion.Card> list_card54 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState55 = new org.cs362.dominion.GameState(list_card54);
    java.util.List<org.cs362.dominion.Card> list_card56 = gameState55.trashPile;
    gameState1.Supply = list_card56;
    java.util.List<org.cs362.dominion.Card> list_card58 = gameState1.trashPile;
    org.cs362.dominion.GameState gameState59 = new org.cs362.dominion.GameState(list_card58);
    org.cs362.dominion.Player player61 = new org.cs362.dominion.Player(gameState59, " \n\tDuchy");
    // The following exception was thrown during execution in test generation
    try {
    player61.buyCard();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card58);

  }
/*
  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState1.embargoed;
    org.cs362.dominion.Player player10 = new org.cs362.dominion.Player(gameState1, "");
    player10.playTreasureCard();
    java.util.List<org.cs362.dominion.Card> list_card12 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState13 = new org.cs362.dominion.GameState(list_card12);
    org.cs362.dominion.Card.Type type14 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card15 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card12, type14);
    org.cs362.dominion.Card card16 = org.cs362.dominion.Randomness.randomMember(list_card15);
    java.util.List<org.cs362.dominion.Card> list_card17 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState18 = new org.cs362.dominion.GameState(list_card17);
    org.cs362.dominion.Card.Type type19 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card20 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card17, type19);
    org.cs362.dominion.Card card21 = org.cs362.dominion.Randomness.randomMember(list_card20);
    org.cs362.dominion.Card.Type type22 = card21.getType();
    int i23 = card16.compareTo(card21);
    int i24 = card21.score();
    player10.discard(card21);
    java.lang.String str26 = player10.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card12);
    org.junit.Assert.assertTrue("'" + type14 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type14.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);
    org.junit.Assert.assertTrue("'" + type19 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type19.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card21);
    org.junit.Assert.assertTrue("'" + type22 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type22.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + " ---  ---  --- --------------------------- --- Hand: []Discard: [ \n\tEstate]Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str26.equals(" ---  ---  --- --------------------------- --- Hand: []Discard: [ \n\tEstate]Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }
*/
  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Player player3 = new org.cs362.dominion.Player(gameState1, "hi!");
    java.util.List<org.cs362.dominion.Player> list_player4 = gameState1.players;
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i5 = gameState1.play();
    java.util.List<org.cs362.dominion.Card> list_card6 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState7 = new org.cs362.dominion.GameState(list_card6);
    java.util.List<org.cs362.dominion.Card> list_card8 = gameState7.trashPile;
    java.util.List<org.cs362.dominion.Card> list_card9 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState10 = new org.cs362.dominion.GameState(list_card9);
    org.cs362.dominion.Card.Type type11 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card12 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card9, type11);
    org.cs362.dominion.Card.CardName cardName13 = org.cs362.dominion.Card.CardName.Great_Hall;
    org.cs362.dominion.Card card14 = org.cs362.dominion.Card.getCard(list_card12, cardName13);
    org.cs362.dominion.Card card15 = org.cs362.dominion.Card.getCard(list_card8, cardName13);
    gameState1.Supply = list_card8;
    java.util.List<org.cs362.dominion.Card> list_card17 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState18 = new org.cs362.dominion.GameState(list_card17);
    org.cs362.dominion.Card.Type type19 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card20 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card17, type19);
    org.cs362.dominion.Card.Type type21 = org.cs362.dominion.Card.Type.ACTION;
    java.util.List<org.cs362.dominion.Card> list_card22 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card17, type21);
    org.cs362.dominion.GameState gameState23 = new org.cs362.dominion.GameState(list_card22);
    java.util.List<org.cs362.dominion.Card> list_card24 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState25 = new org.cs362.dominion.GameState(list_card24);
    org.cs362.dominion.Card.Type type26 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card27 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card24, type26);
    org.cs362.dominion.Card.Type type28 = org.cs362.dominion.Card.Type.ACTION;
    java.util.List<org.cs362.dominion.Card> list_card29 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card24, type28);
    java.util.List<org.cs362.dominion.Card> list_card30 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card22, type28);
    gameState1.trashPile = list_card22;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card9);
    org.junit.Assert.assertTrue("'" + type11 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type11.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card12);
    org.junit.Assert.assertTrue("'" + cardName13 + "' != '" + org.cs362.dominion.Card.CardName.Great_Hall + "'", cardName13.equals(org.cs362.dominion.Card.CardName.Great_Hall));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(card15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);
    org.junit.Assert.assertTrue("'" + type19 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type19.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card20);
    org.junit.Assert.assertTrue("'" + type21 + "' != '" + org.cs362.dominion.Card.Type.ACTION + "'", type21.equals(org.cs362.dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    org.junit.Assert.assertTrue("'" + type26 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type26.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card27);
    org.junit.Assert.assertTrue("'" + type28 + "' != '" + org.cs362.dominion.Card.Type.ACTION + "'", type28.equals(org.cs362.dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card30);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState1.embargoed;
    org.cs362.dominion.Player player10 = new org.cs362.dominion.Player(gameState1, "");
    org.cs362.dominion.Player player12 = new org.cs362.dominion.Player(gameState1, "hi!");
    java.lang.String str13 = player12.toString();
    player12.playKingdomCard();
    player12.playTreasureCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str13.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Player player3 = new org.cs362.dominion.Player(gameState1, "hi!");
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i12 = gameState5.embargoed;
    java.util.List<org.cs362.dominion.Player> list_player13 = gameState5.players;
    gameState1.players = list_player13;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i15 = gameState1.gameBoard;
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i16 = gameState1.getWinners();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i16);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.List<org.cs362.dominion.Card> list_card8 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState9 = new org.cs362.dominion.GameState(list_card8);
    org.cs362.dominion.Player player11 = new org.cs362.dominion.Player(gameState9, "hi!");
    org.cs362.dominion.Player[] player_array12 = new org.cs362.dominion.Player[] { player11 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player13 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player13, player_array12);
    gameState1.players = arraylist_player13;
    java.util.List<org.cs362.dominion.Card> list_card16 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState17 = new org.cs362.dominion.GameState(list_card16);
    org.cs362.dominion.Card card18 = null;
    gameState17.loseCard(card18);
    org.cs362.dominion.Card[] card_array20 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card21 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card21, card_array20);
    gameState17.onBoard = arraylist_card21;
    java.util.List<org.cs362.dominion.Card> list_card24 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState25 = new org.cs362.dominion.GameState(list_card24);
    org.cs362.dominion.Player player27 = new org.cs362.dominion.Player(gameState25, "hi!");
    org.cs362.dominion.Player[] player_array28 = new org.cs362.dominion.Player[] { player27 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player29 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player29, player_array28);
    gameState17.players = arraylist_player29;
    org.cs362.dominion.Player player32 = org.cs362.dominion.Randomness.randomMember((java.util.List<org.cs362.dominion.Player>)arraylist_player29);
    gameState1.addPlayer(player32);
    boolean b34 = gameState1.isGameOver();
    boolean b35 = gameState1.isGameOver();
    org.cs362.dominion.Card card36 = null;
    gameState1.loseCard(card36);
    java.util.List<org.cs362.dominion.Card> list_card38 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState39 = new org.cs362.dominion.GameState(list_card38);
    org.cs362.dominion.Player player41 = new org.cs362.dominion.Player(gameState39, "hi!");
    java.util.List<org.cs362.dominion.Card> list_card42 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState43 = new org.cs362.dominion.GameState(list_card42);
    org.cs362.dominion.Card card44 = null;
    gameState43.loseCard(card44);
    org.cs362.dominion.Card[] card_array46 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card47 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b48 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card47, card_array46);
    gameState43.onBoard = arraylist_card47;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i50 = gameState43.embargoed;
    java.util.List<org.cs362.dominion.Player> list_player51 = gameState43.players;
    gameState39.players = list_player51;
    gameState1.players = list_player51;
    java.util.List<org.cs362.dominion.Card> list_card54 = gameState1.trashPile;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card54);

  }
/*
  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.List<org.cs362.dominion.Card> list_card8 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState9 = new org.cs362.dominion.GameState(list_card8);
    org.cs362.dominion.Player player11 = new org.cs362.dominion.Player(gameState9, "hi!");
    org.cs362.dominion.Player[] player_array12 = new org.cs362.dominion.Player[] { player11 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player13 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player13, player_array12);
    gameState1.players = arraylist_player13;
    org.cs362.dominion.Player player16 = org.cs362.dominion.Randomness.randomMember((java.util.List<org.cs362.dominion.Player>)arraylist_player13);
    player16.playKingdomCard();
    player16.printStateGame();
    java.util.List<org.cs362.dominion.Card> list_card19 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState20 = new org.cs362.dominion.GameState(list_card19);
    org.cs362.dominion.Card.Type type21 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card22 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card19, type21);
    org.cs362.dominion.Card card23 = org.cs362.dominion.Randomness.randomMember(list_card22);
    java.util.List<org.cs362.dominion.Card> list_card24 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState25 = new org.cs362.dominion.GameState(list_card24);
    org.cs362.dominion.Card.Type type26 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card27 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card24, type26);
    org.cs362.dominion.Card card28 = org.cs362.dominion.Randomness.randomMember(list_card27);
    org.cs362.dominion.Card.Type type29 = card28.getType();
    int i30 = card23.compareTo(card28);
    int i31 = card28.score();
    int i32 = card28.getCost();
    player16.trash(card28);
    org.cs362.dominion.Card card34 = null;
    player16.discard(card34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card19);
    org.junit.Assert.assertTrue("'" + type21 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type21.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    org.junit.Assert.assertTrue("'" + type26 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type26.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card28);
    org.junit.Assert.assertTrue("'" + type29 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type29.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 5);

  }
*/
  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.List<org.cs362.dominion.Card> list_card8 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState9 = new org.cs362.dominion.GameState(list_card8);
    org.cs362.dominion.Player player11 = new org.cs362.dominion.Player(gameState9, "hi!");
    org.cs362.dominion.Player[] player_array12 = new org.cs362.dominion.Player[] { player11 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player13 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player13, player_array12);
    gameState1.players = arraylist_player13;
    java.util.List<org.cs362.dominion.Card> list_card16 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState17 = new org.cs362.dominion.GameState(list_card16);
    org.cs362.dominion.Card card18 = null;
    gameState17.loseCard(card18);
    org.cs362.dominion.Card[] card_array20 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card21 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card21, card_array20);
    gameState17.onBoard = arraylist_card21;
    java.util.List<org.cs362.dominion.Card> list_card24 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState25 = new org.cs362.dominion.GameState(list_card24);
    org.cs362.dominion.Player player27 = new org.cs362.dominion.Player(gameState25, "hi!");
    org.cs362.dominion.Player[] player_array28 = new org.cs362.dominion.Player[] { player27 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player29 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player29, player_array28);
    gameState17.players = arraylist_player29;
    org.cs362.dominion.Player player32 = org.cs362.dominion.Randomness.randomMember((java.util.List<org.cs362.dominion.Player>)arraylist_player29);
    gameState1.addPlayer(player32);
    player32.playKingdomCard();
    player32.playKingdomCard();
    player32.playKingdomCard();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player32);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState1.embargoed;
    org.cs362.dominion.Player player10 = new org.cs362.dominion.Player(gameState1, "");
    org.cs362.dominion.Player player12 = new org.cs362.dominion.Player(gameState1, "hi!");
    java.util.List<org.cs362.dominion.Card> list_card13 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState14 = new org.cs362.dominion.GameState(list_card13);
    org.cs362.dominion.Card card15 = null;
    gameState14.loseCard(card15);
    org.cs362.dominion.Card[] card_array17 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card18 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card18, card_array17);
    gameState14.onBoard = arraylist_card18;
    org.cs362.dominion.Card card21 = null;
    gameState14.loseCard(card21);
    java.util.List<org.cs362.dominion.Card> list_card23 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState24 = new org.cs362.dominion.GameState(list_card23);
    org.cs362.dominion.Card card25 = null;
    gameState24.loseCard(card25);
    org.cs362.dominion.Card[] card_array27 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card28 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card28, card_array27);
    gameState24.onBoard = arraylist_card28;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i31 = gameState24.embargoed;
    gameState14.gameBoard = hashmap_card_i31;
    gameState1.embargoed = hashmap_card_i31;
    java.util.List<org.cs362.dominion.Card> list_card34 = gameState1.trashPile;
    java.util.List<org.cs362.dominion.Card> list_card35 = gameState1.Supply;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card35);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.List<org.cs362.dominion.Card> list_card8 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState9 = new org.cs362.dominion.GameState(list_card8);
    org.cs362.dominion.Player player11 = new org.cs362.dominion.Player(gameState9, "hi!");
    org.cs362.dominion.Player[] player_array12 = new org.cs362.dominion.Player[] { player11 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player13 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player13, player_array12);
    gameState1.players = arraylist_player13;
    java.util.List<org.cs362.dominion.Card> list_card16 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState17 = new org.cs362.dominion.GameState(list_card16);
    org.cs362.dominion.Card card18 = null;
    gameState17.loseCard(card18);
    org.cs362.dominion.Card[] card_array20 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card21 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card21, card_array20);
    gameState17.onBoard = arraylist_card21;
    java.util.List<org.cs362.dominion.Card> list_card24 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState25 = new org.cs362.dominion.GameState(list_card24);
    org.cs362.dominion.Player player27 = new org.cs362.dominion.Player(gameState25, "hi!");
    org.cs362.dominion.Player[] player_array28 = new org.cs362.dominion.Player[] { player27 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player29 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player29, player_array28);
    gameState17.players = arraylist_player29;
    org.cs362.dominion.Player player32 = org.cs362.dominion.Randomness.randomMember((java.util.List<org.cs362.dominion.Player>)arraylist_player29);
    gameState1.addPlayer(player32);
    boolean b34 = gameState1.isGameOver();
    boolean b35 = gameState1.isGameOver();
    org.cs362.dominion.Card card36 = null;
    gameState1.loseCard(card36);
    java.lang.String str38 = gameState1.toString();
    java.util.List<org.cs362.dominion.Card> list_card39 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState40 = new org.cs362.dominion.GameState(list_card39);
    org.cs362.dominion.Card card41 = null;
    gameState40.loseCard(card41);
    org.cs362.dominion.Card[] card_array43 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card44 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b45 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card44, card_array43);
    gameState40.onBoard = arraylist_card44;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i47 = gameState40.embargoed;
    gameState1.gameBoard = hashmap_card_i47;
    gameState1.updateBoard();
    java.util.List<org.cs362.dominion.Card> list_card50 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState51 = new org.cs362.dominion.GameState(list_card50);
    org.cs362.dominion.Card card52 = null;
    gameState51.loseCard(card52);
    org.cs362.dominion.Card[] card_array54 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card55 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b56 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card55, card_array54);
    gameState51.onBoard = arraylist_card55;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i58 = gameState51.embargoed;
    java.lang.String str59 = gameState51.toString();
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i60 = gameState51.getWinners();
    java.util.List<org.cs362.dominion.Card> list_card61 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState62 = new org.cs362.dominion.GameState(list_card61);
    java.util.List<org.cs362.dominion.Card> list_card63 = gameState62.trashPile;
    gameState51.onBoard = list_card63;
    java.util.List<org.cs362.dominion.Card> list_card65 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState66 = new org.cs362.dominion.GameState(list_card65);
    org.cs362.dominion.Card.Type type67 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card68 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card65, type67);
    gameState51.trashPile = list_card65;
    org.cs362.dominion.GameState gameState70 = new org.cs362.dominion.GameState(list_card65);
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i71 = gameState70.embargoed;
    gameState1.embargoed = hashmap_card_i71;
    boolean b73 = gameState1.isGameOver();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "The board game is empty you need to intialize the game!!!!"+ "'", str38.equals("The board game is empty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "The board game is empty you need to intialize the game!!!!"+ "'", str59.equals("The board game is empty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card65);
    org.junit.Assert.assertTrue("'" + type67 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type67.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    java.util.List<org.cs362.dominion.Card> list_card4 = gameState1.trashPile;
    org.cs362.dominion.Player player6 = new org.cs362.dominion.Player(gameState1, " \n\tCurse");
    gameState1.initializeGame();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card card4 = null;
    gameState1.loseCard(card4);
    gameState1.updateBoard();
    // The following exception was thrown during execution in test generation
    try {
    org.cs362.dominion.GameState gameState7 = gameState1.clone();
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    gameState1.Supply = arraylist_card9;
    java.util.List<org.cs362.dominion.Card> list_card13 = gameState1.onBoard;
    org.cs362.dominion.Player player15 = new org.cs362.dominion.Player(gameState1, "hi!");
    java.lang.String str16 = player15.toString();
    java.lang.String str17 = player15.toString();
    java.util.List<org.cs362.dominion.Card> list_card18 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState19 = new org.cs362.dominion.GameState(list_card18);
    org.cs362.dominion.Card.Type type20 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card21 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card18, type20);
    int i22 = player15.lowestCost(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str16.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str17.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card18);
    org.junit.Assert.assertTrue("'" + type20 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type20.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.List<org.cs362.dominion.Card> list_card8 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState9 = new org.cs362.dominion.GameState(list_card8);
    org.cs362.dominion.Player player11 = new org.cs362.dominion.Player(gameState9, "hi!");
    org.cs362.dominion.Player[] player_array12 = new org.cs362.dominion.Player[] { player11 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player13 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player13, player_array12);
    gameState1.players = arraylist_player13;
    java.util.List<org.cs362.dominion.Card> list_card16 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState17 = new org.cs362.dominion.GameState(list_card16);
    org.cs362.dominion.Card card18 = null;
    gameState17.loseCard(card18);
    org.cs362.dominion.Card[] card_array20 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card21 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b22 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card21, card_array20);
    gameState17.onBoard = arraylist_card21;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i24 = gameState17.embargoed;
    gameState1.embargoed = hashmap_card_i24;
    java.util.List<org.cs362.dominion.Card> list_card26 = gameState1.Supply;
    org.cs362.dominion.GameState gameState27 = new org.cs362.dominion.GameState(list_card26);
    java.util.List<org.cs362.dominion.Card> list_card28 = gameState27.trashPile;
    java.util.List<org.cs362.dominion.Card> list_card29 = org.cs362.dominion.Card.createCards();
    gameState27.Supply = list_card29;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card29);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName1 = org.cs362.dominion.Card.CardName.Duchy;
    org.cs362.dominion.Card card2 = org.cs362.dominion.Card.getCard(list_card0, cardName1);
    org.cs362.dominion.Card.CardName cardName3 = card2.getCardName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    org.junit.Assert.assertTrue("'" + cardName1 + "' != '" + org.cs362.dominion.Card.CardName.Duchy + "'", cardName1.equals(org.cs362.dominion.Card.CardName.Duchy));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card2);
    org.junit.Assert.assertTrue("'" + cardName3 + "' != '" + org.cs362.dominion.Card.CardName.Duchy + "'", cardName3.equals(org.cs362.dominion.Card.CardName.Duchy));

  }
/*
  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card.Type type2 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card3 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card0, type2);
    org.cs362.dominion.Card card4 = org.cs362.dominion.Randomness.randomMember(list_card3);
    java.util.List<org.cs362.dominion.Card> list_card5 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState6 = new org.cs362.dominion.GameState(list_card5);
    org.cs362.dominion.Card.Type type7 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card8 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card5, type7);
    org.cs362.dominion.Card card9 = org.cs362.dominion.Randomness.randomMember(list_card8);
    org.cs362.dominion.Card.Type type10 = card9.getType();
    int i11 = card4.compareTo(card9);
    java.lang.String str12 = card4.toString();
    java.util.List<org.cs362.dominion.Card> list_card13 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState14 = new org.cs362.dominion.GameState(list_card13);
    org.cs362.dominion.Card card15 = null;
    gameState14.loseCard(card15);
    org.cs362.dominion.Card[] card_array17 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card18 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card18, card_array17);
    gameState14.onBoard = arraylist_card18;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i21 = gameState14.embargoed;
    org.cs362.dominion.Player player23 = new org.cs362.dominion.Player(gameState14, "");
    player23.printStateGame();
    java.util.List<org.cs362.dominion.Card> list_card25 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState26 = new org.cs362.dominion.GameState(list_card25);
    org.cs362.dominion.Card card27 = null;
    gameState26.loseCard(card27);
    org.cs362.dominion.Card[] card_array29 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card30 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b31 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card30, card_array29);
    gameState26.onBoard = arraylist_card30;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i33 = gameState26.embargoed;
    java.lang.String str34 = gameState26.toString();
    gameState26.updateBoard();
    java.util.List<org.cs362.dominion.Card> list_card36 = gameState26.Supply;
    org.cs362.dominion.Player player38 = new org.cs362.dominion.Player(gameState26, "");
    card4.play(player23, gameState26);
    java.util.List<org.cs362.dominion.Card> list_card40 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState41 = new org.cs362.dominion.GameState(list_card40);
    org.cs362.dominion.Card.Type type42 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card43 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card40, type42);
    org.cs362.dominion.Card card44 = org.cs362.dominion.Randomness.randomMember(list_card43);
    org.cs362.dominion.Card.Type type45 = card44.getType();
    java.util.List<org.cs362.dominion.Card> list_card46 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState47 = new org.cs362.dominion.GameState(list_card46);
    org.cs362.dominion.Card.Type type48 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card49 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card46, type48);
    org.cs362.dominion.Card card50 = org.cs362.dominion.Randomness.randomMember(list_card49);
    org.cs362.dominion.Card.Type type51 = card50.getType();
    int i52 = card44.compareTo(card50);
    int i53 = card50.score();
    java.util.List<org.cs362.dominion.Card> list_card54 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState55 = new org.cs362.dominion.GameState(list_card54);
    org.cs362.dominion.Card card56 = null;
    gameState55.loseCard(card56);
    java.util.List<org.cs362.dominion.Card> list_card58 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState59 = new org.cs362.dominion.GameState(list_card58);
    org.cs362.dominion.Card card60 = null;
    gameState59.loseCard(card60);
    org.cs362.dominion.Card[] card_array62 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card63 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b64 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card63, card_array62);
    gameState59.onBoard = arraylist_card63;
    gameState55.Supply = arraylist_card63;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i67 = null;
    gameState55.embargoed = hashmap_card_i67;
    org.cs362.dominion.Player player70 = new org.cs362.dominion.Player(gameState55, "The board game is empty you need to intialize the game!!!!");
    org.cs362.dominion.Card card71 = null;
    player70.discard(card71);
    boolean b73 = card50.equals((java.lang.Object)player70);
    player23.trash(card50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type2.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    org.junit.Assert.assertTrue("'" + type7 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type7.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card9);
    org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type10.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + " \n\tProvince"+ "'", str12.equals(" \n\tProvince"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "The board game is empty you need to intialize the game!!!!"+ "'", str34.equals("The board game is empty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card40);
    org.junit.Assert.assertTrue("'" + type42 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type42.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card44);
    org.junit.Assert.assertTrue("'" + type45 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type45.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card46);
    org.junit.Assert.assertTrue("'" + type48 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type48.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card50);
    org.junit.Assert.assertTrue("'" + type51 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type51.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);

  }
*/
  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    org.cs362.dominion.Card card8 = null;
    gameState1.loseCard(card8);
    java.util.List<org.cs362.dominion.Card> list_card10 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState11 = new org.cs362.dominion.GameState(list_card10);
    org.cs362.dominion.Card card12 = null;
    gameState11.loseCard(card12);
    org.cs362.dominion.Card[] card_array14 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card15 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card15, card_array14);
    gameState11.onBoard = arraylist_card15;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i18 = gameState11.embargoed;
    org.cs362.dominion.Player player20 = new org.cs362.dominion.Player(gameState11, "");
    gameState1.addPlayer(player20);
    player20.printStateGame();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i18);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Player player3 = new org.cs362.dominion.Player(gameState1, "hi!");
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i4 = gameState1.getWinners();
    java.util.List<org.cs362.dominion.Card> list_card5 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState6 = new org.cs362.dominion.GameState(list_card5);
    org.cs362.dominion.Card card7 = null;
    gameState6.loseCard(card7);
    java.util.List<org.cs362.dominion.Card> list_card9 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState10 = new org.cs362.dominion.GameState(list_card9);
    org.cs362.dominion.Card card11 = null;
    gameState10.loseCard(card11);
    org.cs362.dominion.Card[] card_array13 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card14 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card14, card_array13);
    gameState10.onBoard = arraylist_card14;
    gameState6.Supply = arraylist_card14;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i18 = null;
    gameState6.embargoed = hashmap_card_i18;
    org.cs362.dominion.Player player21 = new org.cs362.dominion.Player(gameState6, "The board game is empty you need to intialize the game!!!!");
    gameState6.updateBoard();
    java.util.List<org.cs362.dominion.Player> list_player23 = gameState6.players;
    gameState1.players = list_player23;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player23);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.List<org.cs362.dominion.Card> list_card8 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState9 = new org.cs362.dominion.GameState(list_card8);
    org.cs362.dominion.Player player11 = new org.cs362.dominion.Player(gameState9, "hi!");
    org.cs362.dominion.Player[] player_array12 = new org.cs362.dominion.Player[] { player11 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player13 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player13, player_array12);
    gameState1.players = arraylist_player13;
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i16 = gameState1.play();
    java.util.List<org.cs362.dominion.Player> list_player17 = gameState1.players;
    java.lang.String str18 = gameState1.toString();
    java.util.List<org.cs362.dominion.Card> list_card19 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState20 = new org.cs362.dominion.GameState(list_card19);
    org.cs362.dominion.Card.Type type21 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card22 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card19, type21);
    org.cs362.dominion.GameState gameState23 = new org.cs362.dominion.GameState(list_card19);
    org.cs362.dominion.Card.CardName cardName24 = org.cs362.dominion.Card.CardName.Estate;
    org.cs362.dominion.Card card25 = org.cs362.dominion.Card.getCard(list_card19, cardName24);
    gameState1.loseCard(card25);
    int i27 = card25.getTreasureValue();
    int i28 = card25.getTreasureValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "The board game is empty you need to intialize the game!!!!"+ "'", str18.equals("The board game is empty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card19);
    org.junit.Assert.assertTrue("'" + type21 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type21.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    org.junit.Assert.assertTrue("'" + cardName24 + "' != '" + org.cs362.dominion.Card.CardName.Estate + "'", cardName24.equals(org.cs362.dominion.Card.CardName.Estate));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);

  }
/*
  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card.Type type2 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card3 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card0, type2);
    org.cs362.dominion.Card card4 = org.cs362.dominion.Randomness.randomMember(list_card3);
    org.cs362.dominion.Card.Type type5 = card4.getType();
    java.util.List<org.cs362.dominion.Card> list_card6 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState7 = new org.cs362.dominion.GameState(list_card6);
    org.cs362.dominion.Card.Type type8 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card9 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card6, type8);
    org.cs362.dominion.Card card10 = org.cs362.dominion.Randomness.randomMember(list_card9);
    org.cs362.dominion.Card.Type type11 = card10.getType();
    int i12 = card4.compareTo(card10);
    java.util.List<org.cs362.dominion.Card> list_card13 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState14 = new org.cs362.dominion.GameState(list_card13);
    org.cs362.dominion.Card.Type type15 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card16 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card13, type15);
    org.cs362.dominion.Card card17 = org.cs362.dominion.Randomness.randomMember(list_card16);
    org.cs362.dominion.Card.Type type18 = card17.getType();
    java.util.List<org.cs362.dominion.Card> list_card19 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState20 = new org.cs362.dominion.GameState(list_card19);
    org.cs362.dominion.Card.Type type21 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card22 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card19, type21);
    org.cs362.dominion.Card card23 = org.cs362.dominion.Randomness.randomMember(list_card22);
    org.cs362.dominion.Card.Type type24 = card23.getType();
    int i25 = card17.compareTo(card23);
    org.cs362.dominion.Card.CardName cardName26 = card23.getCardName();
    int i27 = card10.compareTo(card23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type2.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card4);
    org.junit.Assert.assertTrue("'" + type5 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type5.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card6);
    org.junit.Assert.assertTrue("'" + type8 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type8.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card10);
    org.junit.Assert.assertTrue("'" + type11 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type11.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    org.junit.Assert.assertTrue("'" + type15 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type15.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card17);
    org.junit.Assert.assertTrue("'" + type18 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type18.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card19);
    org.junit.Assert.assertTrue("'" + type21 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type21.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card23);
    org.junit.Assert.assertTrue("'" + type24 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type24.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == (-2));
    org.junit.Assert.assertTrue("'" + cardName26 + "' != '" + org.cs362.dominion.Card.CardName.Estate + "'", cardName26.equals(org.cs362.dominion.Card.CardName.Estate));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == (-2));

  }
*/
  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    gameState1.Supply = arraylist_card9;
    java.util.List<org.cs362.dominion.Card> list_card13 = gameState1.onBoard;
    org.cs362.dominion.Player player15 = new org.cs362.dominion.Player(gameState1, "hi!");
    java.lang.String str16 = player15.toString();
    player15.playKingdomCard();
    // The following exception was thrown during execution in test generation
    try {
    player15.buyCard();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"+ "'", str16.equals(" --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n"));

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i8 = gameState1.embargoed;
    java.lang.String str9 = gameState1.toString();
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i10 = gameState1.getWinners();
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i11 = gameState1.play();
    boolean b12 = gameState1.isGameOver();
    java.util.List<org.cs362.dominion.Card> list_card13 = gameState1.trashPile;
    java.util.List<org.cs362.dominion.Card> list_card14 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState15 = new org.cs362.dominion.GameState(list_card14);
    org.cs362.dominion.Card card16 = null;
    gameState15.loseCard(card16);
    org.cs362.dominion.Card[] card_array18 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card19 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card19, card_array18);
    gameState15.onBoard = arraylist_card19;
    java.util.List<org.cs362.dominion.Card> list_card22 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState23 = new org.cs362.dominion.GameState(list_card22);
    org.cs362.dominion.Player player25 = new org.cs362.dominion.Player(gameState23, "hi!");
    org.cs362.dominion.Player[] player_array26 = new org.cs362.dominion.Player[] { player25 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player27 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player27, player_array26);
    gameState15.players = arraylist_player27;
    java.util.List<org.cs362.dominion.Card> list_card30 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState31 = new org.cs362.dominion.GameState(list_card30);
    org.cs362.dominion.Card card32 = null;
    gameState31.loseCard(card32);
    org.cs362.dominion.Card[] card_array34 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card35 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card35, card_array34);
    gameState31.onBoard = arraylist_card35;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i38 = gameState31.embargoed;
    gameState15.embargoed = hashmap_card_i38;
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i40 = gameState15.play();
    java.util.List<org.cs362.dominion.Player> list_player41 = gameState15.players;
    gameState1.players = list_player41;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "The board game is empty you need to intialize the game!!!!"+ "'", str9.equals("The board game is empty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_player_i40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_player41);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card.Type type2 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card3 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card0, type2);
    org.cs362.dominion.Card.Type type4 = org.cs362.dominion.Card.Type.ACTION;
    java.util.List<org.cs362.dominion.Card> list_card5 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card0, type4);
    org.cs362.dominion.GameState gameState6 = new org.cs362.dominion.GameState(list_card5);
    java.util.List<org.cs362.dominion.Card> list_card7 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState8 = new org.cs362.dominion.GameState(list_card7);
    org.cs362.dominion.Card.Type type9 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card10 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card7, type9);
    org.cs362.dominion.Card.Type type11 = org.cs362.dominion.Card.Type.ACTION;
    java.util.List<org.cs362.dominion.Card> list_card12 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card7, type11);
    java.util.List<org.cs362.dominion.Card> list_card13 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card5, type11);
    org.cs362.dominion.Card.Type type14 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card15 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card5, type14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type2.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card3);
    org.junit.Assert.assertTrue("'" + type4 + "' != '" + org.cs362.dominion.Card.Type.ACTION + "'", type4.equals(org.cs362.dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card7);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type9.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);
    org.junit.Assert.assertTrue("'" + type11 + "' != '" + org.cs362.dominion.Card.Type.ACTION + "'", type11.equals(org.cs362.dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    org.junit.Assert.assertTrue("'" + type14 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type14.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    org.cs362.dominion.Card[] card_array4 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card5 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card5, card_array4);
    gameState1.onBoard = arraylist_card5;
    java.util.List<org.cs362.dominion.Card> list_card8 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState9 = new org.cs362.dominion.GameState(list_card8);
    org.cs362.dominion.Player player11 = new org.cs362.dominion.Player(gameState9, "hi!");
    org.cs362.dominion.Player[] player_array12 = new org.cs362.dominion.Player[] { player11 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player13 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player13, player_array12);
    gameState1.players = arraylist_player13;
    java.lang.String str16 = gameState1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "The board game is empty you need to intialize the game!!!!"+ "'", str16.equals("The board game is empty you need to intialize the game!!!!"));

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test220"); }

    java.lang.Iterable<org.cs362.dominion.Card> iterable_card0 = null;
    java.util.List<org.cs362.dominion.Card> list_card1 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState2 = new org.cs362.dominion.GameState(list_card1);
    org.cs362.dominion.Card card3 = null;
    gameState2.loseCard(card3);
    org.cs362.dominion.Card[] card_array5 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card6 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card6, card_array5);
    gameState2.onBoard = arraylist_card6;
    org.cs362.dominion.Card.Type type9 = org.cs362.dominion.Card.Type.ACTION;
    java.util.List<org.cs362.dominion.Card> list_card10 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)arraylist_card6, type9);
    // The following exception was thrown during execution in test generation
    try {
    java.util.List<org.cs362.dominion.Card> list_card11 = org.cs362.dominion.Card.filter(iterable_card0, type9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.cs362.dominion.Card.Type.ACTION + "'", type9.equals(org.cs362.dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card10);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test221"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    gameState1.Supply = arraylist_card9;
    java.util.List<org.cs362.dominion.Card> list_card13 = gameState1.onBoard;
    java.util.List<org.cs362.dominion.Card> list_card14 = gameState1.trashPile;
    gameState1.initializeGame();
    org.cs362.dominion.Player player17 = new org.cs362.dominion.Player(gameState1, " ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test222"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    gameState1.Supply = arraylist_card9;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i13 = null;
    gameState1.embargoed = hashmap_card_i13;
    org.cs362.dominion.Player player16 = new org.cs362.dominion.Player(gameState1, "The board game is empty you need to intialize the game!!!!");
    gameState1.updateBoard();
    java.util.List<org.cs362.dominion.Card> list_card18 = gameState1.trashPile;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card18);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test223"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName1 = org.cs362.dominion.Card.CardName.Duchy;
    org.cs362.dominion.Card card2 = org.cs362.dominion.Card.getCard(list_card0, cardName1);
    java.util.List<org.cs362.dominion.Card> list_card3 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState4 = new org.cs362.dominion.GameState(list_card3);
    java.util.List<org.cs362.dominion.Card> list_card5 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState6 = new org.cs362.dominion.GameState(list_card5);
    org.cs362.dominion.Card card7 = null;
    gameState6.loseCard(card7);
    org.cs362.dominion.Card[] card_array9 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card10 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card10, card_array9);
    gameState6.onBoard = arraylist_card10;
    org.cs362.dominion.Card.Type type13 = org.cs362.dominion.Card.Type.ACTION;
    java.util.List<org.cs362.dominion.Card> list_card14 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)arraylist_card10, type13);
    java.util.List<org.cs362.dominion.Card> list_card15 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card3, type13);
    org.cs362.dominion.Card.CardName cardName16 = org.cs362.dominion.Card.CardName.Baron;
    org.cs362.dominion.Card card17 = org.cs362.dominion.Card.getCard(list_card3, cardName16);
    org.cs362.dominion.Card card18 = org.cs362.dominion.Card.getCard(list_card0, cardName16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    org.junit.Assert.assertTrue("'" + cardName1 + "' != '" + org.cs362.dominion.Card.CardName.Duchy + "'", cardName1.equals(org.cs362.dominion.Card.CardName.Duchy));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    org.junit.Assert.assertTrue("'" + type13 + "' != '" + org.cs362.dominion.Card.Type.ACTION + "'", type13.equals(org.cs362.dominion.Card.Type.ACTION));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card15);
    org.junit.Assert.assertTrue("'" + cardName16 + "' != '" + org.cs362.dominion.Card.CardName.Baron + "'", cardName16.equals(org.cs362.dominion.Card.CardName.Baron));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card18);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test224"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card card2 = null;
    gameState1.loseCard(card2);
    java.util.List<org.cs362.dominion.Card> list_card4 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState5 = new org.cs362.dominion.GameState(list_card4);
    org.cs362.dominion.Card card6 = null;
    gameState5.loseCard(card6);
    org.cs362.dominion.Card[] card_array8 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card9 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card9, card_array8);
    gameState5.onBoard = arraylist_card9;
    gameState1.Supply = arraylist_card9;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i13 = null;
    gameState1.embargoed = hashmap_card_i13;
    org.cs362.dominion.Player player16 = new org.cs362.dominion.Player(gameState1, "The board game is empty you need to intialize the game!!!!");
    org.cs362.dominion.Card card17 = null;
    player16.discard(card17);
    // The following exception was thrown during execution in test generation
    try {
    player16.buyCard();
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }
/*
  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test225"); }

    java.util.List<org.cs362.dominion.Card> list_card0 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState1 = new org.cs362.dominion.GameState(list_card0);
    org.cs362.dominion.Card.Type type2 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card3 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card0, type2);
    org.cs362.dominion.Card card4 = org.cs362.dominion.Randomness.randomMember(list_card3);
    java.util.List<org.cs362.dominion.Card> list_card5 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState6 = new org.cs362.dominion.GameState(list_card5);
    org.cs362.dominion.Card.Type type7 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card8 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card5, type7);
    org.cs362.dominion.Card card9 = org.cs362.dominion.Randomness.randomMember(list_card8);
    org.cs362.dominion.Card.Type type10 = card9.getType();
    int i11 = card4.compareTo(card9);
    org.cs362.dominion.Card.CardName cardName12 = card9.getCardName();
    java.util.List<org.cs362.dominion.Card> list_card13 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState14 = new org.cs362.dominion.GameState(list_card13);
    org.cs362.dominion.Card card15 = null;
    gameState14.loseCard(card15);
    java.util.List<org.cs362.dominion.Card> list_card17 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState18 = new org.cs362.dominion.GameState(list_card17);
    org.cs362.dominion.Card card19 = null;
    gameState18.loseCard(card19);
    org.cs362.dominion.Card[] card_array21 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card22 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card22, card_array21);
    gameState18.onBoard = arraylist_card22;
    gameState14.Supply = arraylist_card22;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i26 = null;
    gameState14.embargoed = hashmap_card_i26;
    org.cs362.dominion.Player player29 = new org.cs362.dominion.Player(gameState14, "The board game is empty you need to intialize the game!!!!");
    java.util.List<org.cs362.dominion.Card> list_card30 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState31 = new org.cs362.dominion.GameState(list_card30);
    org.cs362.dominion.Card card32 = null;
    gameState31.loseCard(card32);
    org.cs362.dominion.Card[] card_array34 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card35 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card35, card_array34);
    gameState31.onBoard = arraylist_card35;
    java.util.List<org.cs362.dominion.Card> list_card38 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState39 = new org.cs362.dominion.GameState(list_card38);
    org.cs362.dominion.Player player41 = new org.cs362.dominion.Player(gameState39, "hi!");
    org.cs362.dominion.Player[] player_array42 = new org.cs362.dominion.Player[] { player41 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player43 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b44 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player43, player_array42);
    gameState31.players = arraylist_player43;
    java.util.List<org.cs362.dominion.Card> list_card46 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState47 = new org.cs362.dominion.GameState(list_card46);
    org.cs362.dominion.Card card48 = null;
    gameState47.loseCard(card48);
    org.cs362.dominion.Card[] card_array50 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card51 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b52 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card51, card_array50);
    gameState47.onBoard = arraylist_card51;
    java.util.List<org.cs362.dominion.Card> list_card54 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState55 = new org.cs362.dominion.GameState(list_card54);
    org.cs362.dominion.Player player57 = new org.cs362.dominion.Player(gameState55, "hi!");
    org.cs362.dominion.Player[] player_array58 = new org.cs362.dominion.Player[] { player57 };
    java.util.ArrayList<org.cs362.dominion.Player> arraylist_player59 = new java.util.ArrayList<org.cs362.dominion.Player>();
    boolean b60 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Player>)arraylist_player59, player_array58);
    gameState47.players = arraylist_player59;
    org.cs362.dominion.Player player62 = org.cs362.dominion.Randomness.randomMember((java.util.List<org.cs362.dominion.Player>)arraylist_player59);
    gameState31.addPlayer(player62);
    boolean b64 = gameState31.isGameOver();
    boolean b65 = gameState31.isGameOver();
    org.cs362.dominion.Card card66 = null;
    gameState31.loseCard(card66);
    java.lang.String str68 = gameState31.toString();
    java.util.List<org.cs362.dominion.Card> list_card69 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState70 = new org.cs362.dominion.GameState(list_card69);
    org.cs362.dominion.Card card71 = null;
    gameState70.loseCard(card71);
    org.cs362.dominion.Card[] card_array73 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card74 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b75 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card74, card_array73);
    gameState70.onBoard = arraylist_card74;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i77 = gameState70.embargoed;
    gameState31.gameBoard = hashmap_card_i77;
    card9.play(player29, gameState31);
    org.cs362.dominion.Card.Type type80 = card9.getType();
    int i81 = card9.getTreasureValue();
    int i82 = card9.getTreasureValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card0);
    org.junit.Assert.assertTrue("'" + type2 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type2.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card5);
    org.junit.Assert.assertTrue("'" + type7 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type7.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card9);
    org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type10.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    org.junit.Assert.assertTrue("'" + cardName12 + "' != '" + org.cs362.dominion.Card.CardName.Estate + "'", cardName12.equals(org.cs362.dominion.Card.CardName.Estate));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card38);
    
    // Regression assertion (captures the current behavior of the code)071
    org.junit.Assert.assertNotNull(player_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(player62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str68 + "' != '" + "The board game is empty you need to intialize the game!!!!"+ "'", str68.equals("The board game is empty you need to intialize the game!!!!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_card69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(card_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashmap_card_i77);
    org.junit.Assert.assertTrue("'" + type80 + "' != '" + org.cs362.dominion.Card.Type.VICTORY + "'", type80.equals(org.cs362.dominion.Card.Type.VICTORY));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 0);

  }
*/
}
