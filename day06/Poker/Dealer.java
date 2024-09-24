package Poker;

import java.util.Collections;

public class Dealer extends Deck {
    
    public static void shuffle() {
        Deck deck = new Deck();
        Collections.shuffle(cardDeck);
    }

    public static void HandOutCards(Player[] player) {
        for (int i = 0; i < player.length; i++) {
            for (int j = 0; j < 5; j++) {
                player[i].addCard(getCard());
            }
        }
    }
}
