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
  public static void main (String [] args)
  {
    Scanner input = new Scanner(System.in);
    ArrayList<Player> players = new ArrayList<>();

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
        Bank bank = new Bank(chips);
        Hand playerHand = new Hand();
        players.add(new Player(playerID, name, bank, playerHand));
      }

      startGame(players);
    }

  }

  public static void startGame (ArrayList<Player> players)
  {
    Scanner input = new Scanner(System.in);
    Hand dealerHand = new Hand();
    Dealer dealer = new Dealer(dealerHand);
    Deck deck = new Deck();
    deck.shuffle();
    dealerHand.addCard(deck.drawCard());
    dealerHand.addCard(deck.drawCard());
    for (Player player : players)
    {
      player.hand.addCard(deck.drawCard());
      player.hand.addCard(deck.drawCard());
    }

    dealer.firstCard();

    for (Player player : players)
    {
      player.hand.currentHand();
      do
      {
        if (player.hand.checkBlackjack() == true)
        {
          System.out.println("You got Blackjack!, you automatically stand");
          break;
        }
        else if (player.hand.checkBust() == true)
        {
          System.out.println("You are over 21 and have bust");
          break;
        }
        else
        {
          System.out.println("Would you like to hit or stand?");
          System.out.println("Press 1 for hit or 2 for stand.");
          int hitOrStand = input.nextInt();
          if (hitOrStand == 1)
          {
            player.hand.addCard(deck.drawCard());
            player.hand.currentHand();
          }
          else
          {
            break;
          }
        }
      }
      while (player.hand.checkBlackjack() == false && player.hand.checkBlackjack() == false);

      System.out.println(player.bank.checkBalance());
    }
  }

}
