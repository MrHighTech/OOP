package fractions;

public class Fraction {

    private int numerator;
    private int denominator;

    private Fraction(){};

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    private static int gcd(int x, int y) {
        return (y == 0) ? x : gcd(y, x % y);
    }

    private void simplify() {
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= gcd;
        denominator /= gcd;

        //put minus before numerator
        if (denominator < 0) {
            denominator = -denominator;
            numerator = -numerator;
        }
    }

    public Fraction add(Fraction fraction2) {
        Fraction f = new Fraction();
        f.numerator = this.numerator * fraction2.denominator + fraction2.numerator * this.denominator;
        f.denominator = this.denominator * fraction2.denominator;
        f.simplify();
        return f;
    }

    public Fraction subtract(Fraction fraction2) {
        Fraction negatedFraction = new Fraction(-fraction2.numerator, fraction2.denominator);
        return add(negatedFraction);
    }

    public Fraction invert() {
        Fraction inverted = new Fraction(denominator, numerator);

        // put minus before numerator
        if (inverted.denominator < 0) {
            inverted.denominator = -inverted.denominator;
            inverted.numerator = -inverted.numerator;
        }
        return inverted;
    }

    public Fraction negate() {
        return new Fraction(-numerator, denominator);
    }

    public Fraction multiply(Fraction fraction2) {
        Fraction f = new Fraction();
        f.numerator = this.numerator * fraction2.numerator;
        f.denominator = this.denominator * fraction2.denominator;
        f.simplify();
        return f;
    }

    public Fraction divide(Fraction fraction2) {
        return multiply(fraction2.invert());
    }

    @Override
    public String toString() {
        return Integer.toString(numerator) + '/' + Integer.toString(denominator);
    }

}
