public class Rational {
    
    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new RuntimeException("denominator can not be 0");
        }

        this.numerator = numerator;
        this.denominator = denominator;
    }

    private static int gcd(int i, int j) {
        if (i % j == 0) {
            return j;
        }
        return gcd(j, i % j);
    }

    private static int lcd(int i, int j) {
        return (i * j) / gcd(i, j);
    }

    public int getDenominator() {
        return this.denominator;
    }

    public int getNumerator() {
        return this.numerator;
    }

    // plus
    public static Rational add(Rational r1, Rational r2) {
        int lcd = lcd(r1.getDenominator(), r2.getDenominator());
        int addNumber1 = r1.getNumerator() * (lcd / r1.getDenominator());
        int addNumber2 = r1.getNumerator() * (lcd / r2.getDenominator());

        return new Rational((addNumber1 + addNumber2), lcd);
    }
    
    // multiply
    public static Rational multiply(Rational r1, Rational r2) {
        int multiDenominator = (r1.getDenominator()) * (r2.getDenominator());
        int multiNumerator = (r1.getNumerator()) * (r2.getNumerator());

        int gcd = gcd(multiNumerator, multiDenominator);
        multiNumerator = multiNumerator / gcd;
        multiDenominator = multiDenominator / gcd;

        return new Rational(multiNumerator, multiDenominator);
    }

    // substract
    public static Rational substract(Rational r1, Rational r2) {
        int lcd = lcd(r1.getDenominator(), r2.getDenominator());
        int addNumber1 = r1.getNumerator() * (lcd / r1.getDenominator());
        int addNumber2 = r1.getNumerator() * (lcd / r2.getDenominator());

        return new Rational((addNumber1 - addNumber2), lcd);
    }

    // divide
    public static Rational divide(Rational r1, Rational r2) {
        return Rational.multiply(r1, new Rational(r2.getDenominator(), r2.getNumerator()));
    }

    @Override
    public String toString() {
        if(this.getNumerator() % this.getDenominator() == 0) {
            return Integer.toString(this.getNumerator() / this.getDenominator());
        }

        return this.getNumerator() + "/" + this.getDenominator();
    }
}

class Test {
    public static void main(String[] args) {
        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(1, 2);
        Rational result = Rational.add(r1, r2);
        System.out.println("add : " + result);
        
        Rational r3 = new Rational(2, 2);
        Rational r4 = new Rational(2, 3);
        Rational result2 = Rational.multiply(r3, r4);
        System.out.println("multiply : " + result2);

        Rational r5 = new Rational(1, 4);
        Rational r6 = new Rational(1, 3);
        Rational result3 = Rational.substract(r5, r6);
        System.out.println("sub : " + result3);

        
        Rational r7 = new Rational(1, 4);
        Rational r8 = new Rational(1, 3);
        Rational result4 = Rational.divide(r7, r8);
        System.out.println("divide : " + result4);

    }
}
