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
    Hand hand;

    public Dealer(Hand hand)
    {
        this.hand = hand;
    }

    public void firstCard ()
    {
        System.out.println("The Dealer's first card is a " + hand.hand.get(1).toString());
    }

    public void fullHand()
    {
        System.out.println("The Dealer has: ");
        for (Card card :  hand.hand)
        {
            System.out.println(card.toString());
        }
        System.out.println("Dealer's hand is worth: " + hand.currentTotal());
    }

    public boolean checkDealerDraw()
    {
        hand.currentTotal();
        if (hand.currentTotal() < 17)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}