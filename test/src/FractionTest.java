import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FractionTest {

    @Test
    public void zeroPlusZero() {
        assertThat(new Fraction(0).plus(new Fraction(0)), is(new Fraction(0)));
    }

    @Test
    public void zeroMinusZero() {
        assertThat(new Fraction(0).minus(new Fraction(0)), is(new Fraction((0))));
    }

    @Test
    public void addFractionsWithSameDenominator() {
        assertThat(new Fraction(1, 3).plus(new Fraction(1, 3)), is(new Fraction(2, 3)));
    }

    @Test
    public void addFractionsWithDifferentDenominators() {
        assertThat(new Fraction(1, 3).plus(new Fraction(1, 2)), is(new Fraction(5, 6)));
    }

    @Test
    public void reduceAFraction() {
        assertThat(new Fraction(1, 2).plus(new Fraction(1, 4)), is(new Fraction(3, 4)));
    }

    @Test
    public void reduceToOne() {
        assertThat(new Fraction(1, 3).plus(new Fraction(2, 3)), is(new Fraction(1, 1)));
    }

    @Test
    public void someExamples() {
        assertThat(new Fraction(7, 3).plus(new Fraction(4, 5)), is(new Fraction(47, 15)));
    }

    @Test
    public void addFractionToInteger() {
        assertThat(new Fraction(1).plus(new Fraction(1, 2)), is(new Fraction(3, 2)));
    }

    @Test
    public void subtractFractionsWithDifferentDenominators() {
        assertThat(new Fraction(47, 15).minus(new Fraction((4), 5)), is(new Fraction(7, 3)));
    }

    @Test
    public void subtractFractionFromItself() {
        assertThat(new Fraction(1, 2).minus(new Fraction(1, 2)), is(new Fraction(0)));
    }

}
