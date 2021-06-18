package com.bridgelabz.programs;

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
}


