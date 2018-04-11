import java.util.Objects;

public class Fraction {

    private final int integerNumber;

    private final int numerator;

    private final int denominator;

    public Fraction(int integerNumber) {
        this.integerNumber = integerNumber;
        denominator = 1;
        numerator = 0;

    }

    public Fraction(int numerator, int denominator) {
        integerNumber = 0;
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction fraction) {
        if (fraction.denominator == this.denominator) {
            return new Fraction(this.numerator + fraction.numerator, denominator);
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Fraction fraction = (Fraction) o;
        return integerNumber == fraction.integerNumber &&
                numerator == fraction.numerator &&
                denominator == fraction.denominator;
    }

    @Override
    public int hashCode() {

        return Objects.hash(integerNumber, numerator, denominator);
    }
}
