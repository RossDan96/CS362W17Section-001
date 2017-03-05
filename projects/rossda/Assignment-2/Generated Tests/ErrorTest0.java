
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test01"); }

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
    java.util.List<org.cs362.dominion.Card> list_card14 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState15 = new org.cs362.dominion.GameState(list_card14);
    org.cs362.dominion.Card card16 = null;
    gameState15.loseCard(card16);
    org.cs362.dominion.Card[] card_array18 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card19 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card19, card_array18);
    gameState15.onBoard = arraylist_card19;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i22 = gameState15.embargoed;
    org.cs362.dominion.Player player24 = new org.cs362.dominion.Player(gameState15, "");
    player24.playTreasureCard();
    java.util.List<org.cs362.dominion.Card> list_card26 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState27 = new org.cs362.dominion.GameState(list_card26);
    org.cs362.dominion.Card.Type type28 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card29 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card26, type28);
    org.cs362.dominion.Card card30 = org.cs362.dominion.Randomness.randomMember(list_card29);
    java.util.List<org.cs362.dominion.Card> list_card31 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState32 = new org.cs362.dominion.GameState(list_card31);
    org.cs362.dominion.Card.Type type33 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card34 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card31, type33);
    org.cs362.dominion.Card card35 = org.cs362.dominion.Randomness.randomMember(list_card34);
    org.cs362.dominion.Card.Type type36 = card35.getType();
    int i37 = card30.compareTo(card35);
    int i38 = card35.score();
    player24.discard(card35);
    org.cs362.dominion.Card.Type type40 = card35.getType();
    int i41 = card35.getCost();
    java.util.List<org.cs362.dominion.Card> list_card42 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState43 = new org.cs362.dominion.GameState(list_card42);
    org.cs362.dominion.Card card44 = null;
    gameState43.loseCard(card44);
    java.util.List<org.cs362.dominion.Card> list_card46 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState47 = new org.cs362.dominion.GameState(list_card46);
    org.cs362.dominion.Card card48 = null;
    gameState47.loseCard(card48);
    org.cs362.dominion.Card[] card_array50 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card51 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b52 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card51, card_array50);
    gameState47.onBoard = arraylist_card51;
    gameState43.Supply = arraylist_card51;
    java.util.List<org.cs362.dominion.Card> list_card55 = gameState43.onBoard;
    boolean b56 = card35.equals((java.lang.Object)gameState43);
    int i57 = card9.compareTo(card35);
    
    // Checks the contract:  compareTo-equals on card30 and card4
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on card30 and card4", (card30.compareTo(card4) == 0) == card30.equals(card4));

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test02"); }

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
    java.util.List<org.cs362.dominion.Card> list_card80 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState81 = new org.cs362.dominion.GameState(list_card80);
    java.util.List<org.cs362.dominion.Card> list_card82 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState83 = new org.cs362.dominion.GameState(list_card82);
    org.cs362.dominion.Card card84 = null;
    gameState83.loseCard(card84);
    org.cs362.dominion.Card[] card_array86 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card87 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b88 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card87, card_array86);
    gameState83.onBoard = arraylist_card87;
    org.cs362.dominion.Card.Type type90 = org.cs362.dominion.Card.Type.ACTION;
    java.util.List<org.cs362.dominion.Card> list_card91 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)arraylist_card87, type90);
    java.util.List<org.cs362.dominion.Card> list_card92 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card80, type90);
    boolean b93 = card9.equals((java.lang.Object)list_card80);
    org.cs362.dominion.GameState gameState94 = new org.cs362.dominion.GameState(list_card80);
    
    // Checks the contract:  compareTo-equals on card4 and card9
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on card4 and card9", (card4.compareTo(card9) == 0) == card4.equals(card9));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test03"); }

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
    org.cs362.dominion.Card.Type type13 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card14 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card11, type13);
    org.cs362.dominion.Card card15 = org.cs362.dominion.Randomness.randomMember(list_card14);
    java.util.List<org.cs362.dominion.Card> list_card16 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState17 = new org.cs362.dominion.GameState(list_card16);
    org.cs362.dominion.Card.Type type18 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card19 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card16, type18);
    org.cs362.dominion.Card card20 = org.cs362.dominion.Randomness.randomMember(list_card19);
    org.cs362.dominion.Card.Type type21 = card20.getType();
    int i22 = card15.compareTo(card20);
    player10.discard(card20);
    player10.printStateGame();
    
    // Checks the contract:  compareTo-equals on card20 and card15
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on card20 and card15", (card20.compareTo(card15) == 0) == card20.equals(card15));

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test04"); }

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
    java.util.List<org.cs362.dominion.Card> list_card81 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState82 = new org.cs362.dominion.GameState(list_card81);
    org.cs362.dominion.Card.Type type83 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card84 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card81, type83);
    org.cs362.dominion.Card card85 = org.cs362.dominion.Randomness.randomMember(list_card84);
    org.cs362.dominion.Card.Type type86 = card85.getType();
    java.util.List<org.cs362.dominion.Card> list_card87 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState88 = new org.cs362.dominion.GameState(list_card87);
    org.cs362.dominion.Card.Type type89 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card90 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card87, type89);
    org.cs362.dominion.Card card91 = org.cs362.dominion.Randomness.randomMember(list_card90);
    org.cs362.dominion.Card.Type type92 = card91.getType();
    int i93 = card85.compareTo(card91);
    org.cs362.dominion.Card.CardName cardName94 = card91.getCardName();
    int i95 = card9.compareTo(card91);
    
    // Checks the contract:  compareTo-equals on card85 and card4
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on card85 and card4", (card85.compareTo(card4) == 0) == card85.equals(card4));

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test05"); }

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
    java.util.List<org.cs362.dominion.Card> list_card14 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.Card.CardName cardName15 = org.cs362.dominion.Card.CardName.Duchy;
    org.cs362.dominion.Card card16 = org.cs362.dominion.Card.getCard(list_card14, cardName15);
    int i17 = card9.compareTo(card16);
    org.cs362.dominion.Card.Type type18 = card9.getType();
    
    // Checks the contract:  compareTo-equals on card16 and card4
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on card16 and card4", (card16.compareTo(card4) == 0) == card16.equals(card4));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test06"); }

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
    java.lang.String str22 = gameState14.toString();
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i23 = gameState14.getWinners();
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i24 = gameState14.play();
    java.util.List<org.cs362.dominion.Card> list_card25 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState26 = new org.cs362.dominion.GameState(list_card25);
    org.cs362.dominion.Card.Type type27 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card28 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card25, type27);
    org.cs362.dominion.Card card29 = org.cs362.dominion.Randomness.randomMember(list_card28);
    org.cs362.dominion.Card.Type type30 = card29.getType();
    java.util.List<org.cs362.dominion.Card> list_card31 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState32 = new org.cs362.dominion.GameState(list_card31);
    org.cs362.dominion.Card.Type type33 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card34 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card31, type33);
    org.cs362.dominion.Card card35 = org.cs362.dominion.Randomness.randomMember(list_card34);
    org.cs362.dominion.Card.Type type36 = card35.getType();
    int i37 = card29.compareTo(card35);
    gameState14.loseCard(card35);
    int i39 = card4.compareTo(card35);
    java.util.List<org.cs362.dominion.Card> list_card40 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState41 = new org.cs362.dominion.GameState(list_card40);
    org.cs362.dominion.Player player43 = new org.cs362.dominion.Player(gameState41, "hi!");
    java.util.List<org.cs362.dominion.Player> list_player44 = gameState41.players;
    gameState41.updateBoard();
    java.util.List<org.cs362.dominion.Card> list_card46 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState47 = new org.cs362.dominion.GameState(list_card46);
    org.cs362.dominion.Player player49 = new org.cs362.dominion.Player(gameState47, "hi!");
    gameState41.addPlayer(player49);
    java.util.HashMap<org.cs362.dominion.Player,java.lang.Integer> hashmap_player_i51 = gameState41.play();
    org.cs362.dominion.Player player53 = new org.cs362.dominion.Player(gameState41, " --- hi! ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n");
    java.util.List<org.cs362.dominion.Card> list_card54 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState55 = new org.cs362.dominion.GameState(list_card54);
    org.cs362.dominion.Card card56 = null;
    gameState55.loseCard(card56);
    org.cs362.dominion.Card[] card_array58 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card59 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b60 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card59, card_array58);
    gameState55.onBoard = arraylist_card59;
    org.cs362.dominion.Card card62 = null;
    gameState55.loseCard(card62);
    java.util.List<org.cs362.dominion.Player> list_player64 = gameState55.players;
    card35.play(player53, gameState55);
    
    // Checks the contract:  compareTo-equals on card4 and card29
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on card4 and card29", (card4.compareTo(card29) == 0) == card4.equals(card29));

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test07"); }

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
    org.cs362.dominion.Player player74 = new org.cs362.dominion.Player(gameState71, " \n\tDuchy");
    
    // Checks the contract:  compareTo-equals on card16 and card21
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on card16 and card21", (card16.compareTo(card21) == 0) == card16.equals(card21));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test08"); }

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
    org.cs362.dominion.Card[] card_array18 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card19 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card19, card_array18);
    gameState15.onBoard = arraylist_card19;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i22 = gameState15.embargoed;
    org.cs362.dominion.Player player24 = new org.cs362.dominion.Player(gameState15, "");
    player24.playTreasureCard();
    java.util.List<org.cs362.dominion.Card> list_card26 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState27 = new org.cs362.dominion.GameState(list_card26);
    org.cs362.dominion.Card.Type type28 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card29 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card26, type28);
    org.cs362.dominion.Card card30 = org.cs362.dominion.Randomness.randomMember(list_card29);
    java.util.List<org.cs362.dominion.Card> list_card31 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState32 = new org.cs362.dominion.GameState(list_card31);
    org.cs362.dominion.Card.Type type33 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card34 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card31, type33);
    org.cs362.dominion.Card card35 = org.cs362.dominion.Randomness.randomMember(list_card34);
    org.cs362.dominion.Card.Type type36 = card35.getType();
    int i37 = card30.compareTo(card35);
    int i38 = card35.score();
    player24.discard(card35);
    org.cs362.dominion.Card.Type type40 = card35.getType();
    int i41 = card35.getCost();
    java.util.List<org.cs362.dominion.Card> list_card42 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState43 = new org.cs362.dominion.GameState(list_card42);
    org.cs362.dominion.Card card44 = null;
    gameState43.loseCard(card44);
    java.util.List<org.cs362.dominion.Card> list_card46 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState47 = new org.cs362.dominion.GameState(list_card46);
    org.cs362.dominion.Card card48 = null;
    gameState47.loseCard(card48);
    org.cs362.dominion.Card[] card_array50 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card51 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b52 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card51, card_array50);
    gameState47.onBoard = arraylist_card51;
    gameState43.Supply = arraylist_card51;
    java.util.List<org.cs362.dominion.Card> list_card55 = gameState43.onBoard;
    boolean b56 = card35.equals((java.lang.Object)gameState43);
    int i57 = card10.compareTo(card35);
    int i58 = card10.score();
    
    // Checks the contract:  compareTo-equals on card30 and card4
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on card30 and card4", (card30.compareTo(card4) == 0) == card30.equals(card4));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test09"); }

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
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i27 = null;
    gameState15.embargoed = hashmap_card_i27;
    org.cs362.dominion.Player player30 = new org.cs362.dominion.Player(gameState15, "The board game is empty you need to intialize the game!!!!");
    org.cs362.dominion.Card card31 = null;
    player30.discard(card31);
    boolean b33 = card10.equals((java.lang.Object)player30);
    player30.playTreasureCard();
    java.lang.String str35 = player30.toString();
    
    // Checks the contract:  compareTo-equals on card4 and card10
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on card4 and card10", (card4.compareTo(card10) == 0) == card4.equals(card10));

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test10"); }

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
    java.lang.String str80 = gameState31.toString();
    
    // Checks the contract:  compareTo-equals on card9 and card4
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on card9 and card4", (card9.compareTo(card4) == 0) == card9.equals(card4));

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test11"); }

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
    org.cs362.dominion.Card.Type type28 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card29 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card26, type28);
    org.cs362.dominion.Card card30 = org.cs362.dominion.Randomness.randomMember(list_card29);
    org.cs362.dominion.Card.Type type31 = card30.getType();
    java.util.List<org.cs362.dominion.Card> list_card32 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState33 = new org.cs362.dominion.GameState(list_card32);
    org.cs362.dominion.Card.Type type34 = org.cs362.dominion.Card.Type.VICTORY;
    java.util.List<org.cs362.dominion.Card> list_card35 = org.cs362.dominion.Card.filter((java.lang.Iterable<org.cs362.dominion.Card>)list_card32, type34);
    org.cs362.dominion.Card card36 = org.cs362.dominion.Randomness.randomMember(list_card35);
    org.cs362.dominion.Card.Type type37 = card36.getType();
    int i38 = card30.compareTo(card36);
    int i39 = card36.score();
    java.util.List<org.cs362.dominion.Card> list_card40 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState41 = new org.cs362.dominion.GameState(list_card40);
    org.cs362.dominion.Card card42 = null;
    gameState41.loseCard(card42);
    java.util.List<org.cs362.dominion.Card> list_card44 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState45 = new org.cs362.dominion.GameState(list_card44);
    org.cs362.dominion.Card card46 = null;
    gameState45.loseCard(card46);
    org.cs362.dominion.Card[] card_array48 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card49 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b50 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card49, card_array48);
    gameState45.onBoard = arraylist_card49;
    gameState41.Supply = arraylist_card49;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i53 = null;
    gameState41.embargoed = hashmap_card_i53;
    org.cs362.dominion.Player player56 = new org.cs362.dominion.Player(gameState41, "The board game is empty you need to intialize the game!!!!");
    org.cs362.dominion.Card card57 = null;
    player56.discard(card57);
    boolean b59 = card36.equals((java.lang.Object)player56);
    java.util.List<org.cs362.dominion.Card> list_card60 = org.cs362.dominion.Card.createCards();
    org.cs362.dominion.GameState gameState61 = new org.cs362.dominion.GameState(list_card60);
    org.cs362.dominion.Card card62 = null;
    gameState61.loseCard(card62);
    org.cs362.dominion.Card[] card_array64 = new org.cs362.dominion.Card[] {  };
    java.util.ArrayList<org.cs362.dominion.Card> arraylist_card65 = new java.util.ArrayList<org.cs362.dominion.Card>();
    boolean b66 = java.util.Collections.addAll((java.util.Collection<org.cs362.dominion.Card>)arraylist_card65, card_array64);
    gameState61.onBoard = arraylist_card65;
    java.util.HashMap<org.cs362.dominion.Card,java.lang.Integer> hashmap_card_i68 = gameState61.embargoed;
    java.util.List<org.cs362.dominion.Player> list_player69 = gameState61.players;
    card22.play(player56, gameState61);
    
    // Checks the contract:  compareTo-equals on card30 and card36
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on card30 and card36", (card30.compareTo(card36) == 0) == card30.equals(card36));

  }

}
