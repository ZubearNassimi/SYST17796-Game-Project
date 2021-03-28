/**
 * SYST 17796 - Group 4 - The Runtime Terrors
 */
package ca.sheridancollege.project;

/**
 * The main class to play Blackjack.
 * @author Karan Boparai, 2020
 * @author Zubear Nassimi, 2020
 * @author Aiden Janey, 2020
 * @author Christina Kwamie, 2020
 */

import java.util.*;

public class PlayBlackjack 
{
  public static void main (String [] karan)
  {
    Scanner input = new Scanner(System.in);
    ArrayList<Player> players = new ArrayList<Player>();

    System.out.println("Hello!, Welcome to Blackjack, Would you like to start a game?");
    System.out.println("Press 1 for Yes, 2 for No");
    int wantToPlay = input.nextInt();

    if (wantToPlay != 1)
    {
      System.exit(0);
    }
    else
    {
      System.out.println("Great! First, how many players will be playing?");
      int numberOfPlayers = input.nextInt();
      for (int i = 0;  i < numberOfPlayers; i++)
      {
        int playerID = i + 1;
        System.out.println("Player " + playerID + ", What is your name?");
        String name = input.next();
        System.out.println("Hello " + name + ", how many chip would you like to start with?");
        int chips = input.nextInt();
        players.add(new Player(playerID, name, chips));
      }

      startGame(players);
    }
    Deck myDeck = new Deck();
    myDeck.shuffle();
    Card card1 = myDeck.drawCard();

  }

  public static void startGame (ArrayList<Player> players)
  {
    Dealer dealer = new Dealer();
    Deck deck = new Deck();
    deck.shuffle();
    dealer.addCard(deck.drawCard());
    dealer.addCard(deck.drawCard());
    for (Player player : players)
    {
      player.addCard(deck.drawCard());
      player.addCard(deck.drawCard());
    }

    dealer.firstCard();
    dealer.checkBlackjack;

    for (Player player : players)
    {
      player.currentHand();
      if (checkBlackjack(player.currentTotal()))
    }
  }

  public boolean checkBlackjack(ArrayList<Card> hand)
  {
    if (Card.current)
  }
}
