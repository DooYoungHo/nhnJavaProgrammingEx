package Poker;

import java.util.EmptyStackException;
import java.util.Stack;

public class Deck {
    
    static Stack<Card> cardDeck;

    public Deck() {
        cardDeck = new Stack<>();
        init();
    }

    private static void init() {
        for (Suit pattern : Suit.values()) {
            for (Rank denomination : Rank.values()) {
                cardDeck.add(new Card(denomination, pattern));
            }
        }
    }

    public static Card getCard() { 
        if (cardDeck.isEmpty()) {
            throw new EmptyStackException();
        }

        return cardDeck.pop(); 
    }
}
