package Poker;

public class Card implements Comparable<Card> {
    
    private Rank cardNo;
    private Suit cardShape;

    public Card(Rank no, Suit shape) {
        this.cardNo = no;
        this.cardShape = shape;
    }

    public Rank getCardNo() {
        return this.cardNo;
    }

    public Suit getCardShape() {
        return this.cardShape;
    }

    @Override
    public int compareTo(Card o) {
        if (this.cardNo.ordinal() > o.cardNo.ordinal()){
            return 1;
        }
        else if (this.cardNo.ordinal() < o.cardNo.ordinal()){
            return -1;
        }
        else {
            if (this.cardShape.ordinal() > o.cardShape.ordinal()) {
                return 1;
            }
            else {
                return -1;
            }
        }
    }

    @Override
    public String toString() {
        return this.cardNo + " - " + this.cardShape;
    }
    
}