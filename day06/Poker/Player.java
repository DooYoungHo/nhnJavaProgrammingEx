package Poker;

import java.util.ArrayList;
import java.util.List;

public class Player {
    
    private List<Card> deck;
    private String name;

    public Player(String name) {
        this.deck = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addCard(Card card) {
        deck.add(card);
    }

    public List<Card> getPlayerDeck() {
        return deck;
    }

    @Override
    public String toString() {
        return this.name;
    }

}
