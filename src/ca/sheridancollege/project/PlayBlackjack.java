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
    Deck myDeck = new Deck();
    myDeck.shuffle();
    Card card1 = myDeck.drawCard();
    System.out.println(card1.toString()); 
  }
}
