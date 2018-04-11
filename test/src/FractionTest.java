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

}
