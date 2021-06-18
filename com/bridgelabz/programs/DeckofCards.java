/**
 * ************************** 
 * Purpose: to initialise deck of cards having suit ("Clubs", "Diamonds", "Hearts", "Spades") 
 * & Rank ("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"). 
 * Shuffle the cards using Random method and then distribute 9 Cards to 4 Players
 *  and Print the Cards the received by the 4 Players.
 *  
 * @author Piyush Shaw
 * @version 1.0
 * @since 18-06-2021 **************************
 */

package com.bridgelabz.programs;

import java.util.Random;

public class DeckofCards {
	private static final int SIZE = 52;
    private static Card[] deckOfCards = new Card[SIZE]; 
    public static Card[] getDeckOfCards() {

        int count = 0;

        String[] suits = {"Diamonds", "Clubs", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        for (String s : suits) {
            for (String r : ranks) {

                Card card = new Card(s, r);
                deckOfCards[count] = card;
                count++;
            }
        }
     return deckOfCards;

    }    
    public static Card[] shuffleCards(Card[] deckOfCards) {
		Random rand = new Random();
		int j;
		for (int i = 0; i < SIZE; i++) {
			j = rand.nextInt(SIZE);
			Card temp = deckOfCards[i];
			deckOfCards[i] = deckOfCards[j];
			deckOfCards[j] = temp;
		}
		return deckOfCards;
	}
}


