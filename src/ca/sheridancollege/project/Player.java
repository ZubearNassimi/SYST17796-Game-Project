/**
 * SYST 17796 - Group 4 - The Runtime Terrors
 */
package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 * @author Karan Boparai, 2020
 * @author Zubear Nassimi, 2020
 * @author Aiden Janey, 2020
 * @author Christina Kwamie, 2020
 */

import java.util.*;

public class Player 
{
    private int playerID;
    private String name;
    private int chips;
    private int total;
    ArrayList<Card> playerHand = new ArrayList<Card>();

    public Player(int playerID, String name, int chips)
    {
        this.playerID = playerID;
        this.name = name;
        this.chips = chips;
    }

    public void addCard (Card card)
    {
        playerHand.add(card);
    }

    public void currentHand ()
    {
        System.out.println("You have: ");
        for (Card card : playerHand)
        {
            System.out.println(card.toString());
        }
        System.out.println("Your hand is worth: " + currentTotal());
    }

    public int currentTotal ()
    {
        for (Card card : playerHand)
        {
            total += card.value();
        }
        return total;
    }
    public String toString()
    {
        return "Player{" +
                "playerID=" + playerID +
                ", name='" + name + '\'' +
                ", chips=" + chips +
                '}';
    }
}
