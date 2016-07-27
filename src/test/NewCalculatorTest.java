import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by upxs078 on 7/26/16.
 */
public class NewCalculatorTest {

    private Calculator calculator;

    @Before
    public void createCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void testNewCalculatorHasAnAccumulatorOfZero() {
        assertEquals(BigDecimal.ZERO, calculator.getAccumulator());
    }
    @Test
    public void testSettingAccumulatorVale() {
        BigDecimal value = new BigDecimal(23);
        calculator.setAccumulator(value);
        assertEquals(value, calculator.getAccumulator());
    }
}
