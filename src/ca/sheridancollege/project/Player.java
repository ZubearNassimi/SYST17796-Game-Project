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
    Hand hand;
    Bank bank;

    public Player(int playerID, String name, Bank bank, Hand hand)
    {
        this.playerID = playerID;
        this.name = name;
        this.bank = bank;
        this.hand = hand;
    }

    public String toString()
    {
        return "Test";
    }
}
