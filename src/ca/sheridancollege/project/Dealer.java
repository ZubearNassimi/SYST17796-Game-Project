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
}