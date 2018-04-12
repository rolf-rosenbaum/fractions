import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FractionTest {

    @Test
    public void zeroPlusZero() {
        assertThat(new Fraction(0).add(new Fraction(0)), is(new Fraction(0)));
    }

    @Test
    public void addFractionsWithSameDenominator() {
        assertThat(new Fraction(1, 3).add(new Fraction(1, 3)), is(new Fraction(2, 3)));
    }

    @Test
    public void addFractionsWithDifferentDenominators() {
        assertThat(new Fraction(1, 3).add(new Fraction(1, 2)), is(new Fraction(5, 6)));
    }

    @Test
    public void reduceAFraction() {
        assertThat(new Fraction(1, 2).add(new Fraction(1, 4)), is(new Fraction(3, 4)));
    }

}
