package Poker;

public enum Suit {
    
    Spade("\u2660"),
    Diamond("\u25C6"),
    Heart("\u2665"),
    Club("\u2663");

    public final String symbol;

    Suit(String symbol) {
        this.symbol = symbol;
    }

    public String toString() {
        return this.symbol;
    }
    
}
