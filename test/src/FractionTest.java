import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FractionTest {

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

    @Test
    public void multiplyTwoFractions() {
        assertThat(new Fraction(1, 2).multiplyBy(new Fraction(1, 2)), is(new Fraction(1, 4)));
        assertThat(new Fraction(2, 5).multiplyBy(new Fraction(3, 7)), is(new Fraction(6, 35)));
    }

    @Test
    public void multiplyTwoFractionAndReduce() {
        assertThat(new Fraction(2, 3).multiplyBy(new Fraction(3, 4)), is(new Fraction(1, 2)));
    }
}
