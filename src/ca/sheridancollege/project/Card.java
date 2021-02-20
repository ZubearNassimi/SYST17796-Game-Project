/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author dancye, 2018
 */
import java.util.*;

public class Card
{
    enum Suit
    {
      Hearts, Diamonds, Clubs, Spades
    };

    enum Name 
    {
      Ace (11), Two (2), Three (3), Four (4), Five (5), Six (6), Seven (7), Eight (8), Nine (9), Ten (10), Jack (10), Queen (10), King (10);

      public final int worth;

      private Name (int worth)
      {
        this.worth = worth;
      }
    };

    private Name name;
    private Suit  suit;

    
    public Card(Name name, Suit suit)
    {
        this.name   = name;
        this.suit   = suit;
    }

    public String toString()
    {
      return name + " of " + suit + " which is worth " + name.worth;
    }
}