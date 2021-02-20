/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.*;

public class TableTop 
{
  public static void main (String [] karan)
  {
    Deck myDeck = new Deck();
    myDeck.shuffle();
    Card card1 = myDeck.drawCard();
    System.out.println(card1.toString()); 
  }
}
