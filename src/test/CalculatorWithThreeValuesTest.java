import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by pstene on 7/26/16.
 */
public class CalculatorWithThreeValuesTest {

    private Calculator calculator;
    BigDecimal value1;
    BigDecimal value2;
    BigDecimal value3;

    @Before
    public void createCalculatorWithThreeValues() {
        calculator = new Calculator();
        value1 = new BigDecimal(12);
        value2 = new BigDecimal(22);
        value3 = new BigDecimal(52);
        calculator.setAccumulator(value1);
        calculator.enter();
        calculator.setAccumulator(value2);
        calculator.enter();
        calculator.setAccumulator(value3);
    }

    @Test
    public void testAccumulatorAfterPushingThreeValues() {
        assertEquals(value3, calculator.getAccumulator());
    }

    @Test
    public void testAccumulatorAfterSingleDrop() {
        calculator.drop();
        assertEquals(value2, calculator.getAccumulator());
    }

    @Test
    public void testAccumulatorAfterDroppingTwice() {
        calculator.drop();
        calculator.drop();
        assertEquals(value1, calculator.getAccumulator());
    }
}
