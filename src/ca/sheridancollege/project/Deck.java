/**
 * SYST 17796 - Group 4 - The Runtime Terrors
 */
package ca.sheridancollege.project;

/**
 * Deck class which creates a deck, has the ability to shuffle and draw a card from the deck.
 * @author Karan Boparai, 2020
 * @author Zubear Nassimi, 2020
 * @author Aiden Janey, 2020
 * @author Christina Kwamie, 2020
 */

import java.util.*;

public class Deck
{
    ArrayList<Card> deck = new ArrayList<>();

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