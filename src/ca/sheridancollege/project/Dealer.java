/**
 * SYST 17796 - Group 4 - The Runtime Terrors
 */
package ca.sheridancollege.project;

/**
 * A class that models the Dealer.
 * @author Karan Boparai, 2020
 * @author Zubear Nassimi, 2020
 * @author Aiden Janey, 2020
 * @author Christina Kwamie, 2020
 */

import java.util.*;

public class Dealer 
{
    ArrayList<Card> dealerHand = new ArrayList<Card>();

    public Dealer()
    {

    }

    public void addCard (Card card)
    {
        dealerHand.add(card);
    }

    public void firstCard ()
    {
        System.out.println("The Dealer's first card is a " + dealerHand.get(1).toString());
    }
}