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

    public Fraction add(Fraction other) {
        if (other.denominator == this.denominator) {
            return new Fraction(this.numerator + other.numerator, denominator);
        } else {
            int lcm = commonMultiple(other.denominator, denominator);
            int num1 = this.numerator * lcm / this.denominator;
            int num2 = other.numerator * lcm / other.denominator;
            return new Fraction(num1 + num2, lcm).reduce();
        }
    }

    private int commonMultiple(int a, int b) {
        return a * b;
    }

    private Fraction reduce() {
        int gcd = greatestCommonDivider(numerator, denominator);
        return new Fraction((numerator / gcd), denominator / gcd);
    }

    private int greatestCommonDivider(int numerator, int denominator) {
        int result = 1;
        for (int i = 2; i < Math.max(numerator, denominator); i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                result = i;
            }
        }
        return result;
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

    @Override
    public String toString() {
        return "Fraction{" +
                integerNumber +
                " " + numerator +
                "/" + denominator +
                '}';
    }
}
