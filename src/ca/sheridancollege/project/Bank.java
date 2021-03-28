/**
 * SYST 17796 - Group 4 - The Runtime Terrors
 */
package ca.sheridancollege.project;

/**
 * Bank class which will store and track chips used to wager.
 * @author Karan Boparai, 2020
 * @author Zubear Nassimi, 2020
 * @author Aiden Janey, 2020
 * @author Christina Kwamie, 2020
 */

import java.util.*;

public class Bank
{
    private int balance;

    public Bank (int balance)
    {
        this.balance = balance;
    }

    public int checkBalance()
    {
        return balance;
    }

    public boolean verifyBet(int bet)
    {
        if (checkBalance() < bet)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public void placeBet(int bet)
    {
        this.balance = balance - bet;
    }
}
