/*
 Krista Tanciongco
991576824
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @krista
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random()*13)+1);
            c.setSuit(Card.SUITS[((int)(Math.random()*3))]);
            magicHand[i] = c.getSuit();
            magicHand[i] = c.getValue();
        }
        
        Scanner in = new Scanner(System.in);
        System.out.println("Input Card value:");
        int value = in.nextInt();
        System.out.println("Input Card suit:");
        String  suit = in.next();
        System.out.println("Your card is " + value + " of " + suit);
        
        for (int i=0; i <4; i++){
            if (suit == magicHand[i]) {
                for (int j=0; i<7; j++){
                    if (suit==magicHand[j]) {
                        System.out.println("Card appears in magic hand");
                     
                        
                    }
                }
            }
        }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}