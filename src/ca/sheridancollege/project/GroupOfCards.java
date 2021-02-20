/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.*;

public class Deck
{
    ArrayList<Card> deck = new ArrayList<Card>();

    public Deck()
    {
        for (Card.Suit suit : Card.Suit.values())
        {
          for (Card.Name name : Card.Name.values()) 
            {
              Card card = new Card(name, suit);
              deck.add(card);
            }
          }
    }

    public void shuffle()
    {
        Collections.shuffle(deck);
    }

    public Card drawCard()
    {
        return deck.remove(0);
    }
}