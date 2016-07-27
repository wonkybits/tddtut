import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by upxs078 on 7/27/16.
 */
public class OperationsTest {
    private Calculator calculator;

    @Before
    public void createCalculator() {
        calculator = new Calculator();
        calculator.setAccumulator(new BigDecimal(20));
        calculator.enter();
        calculator.setAccumulator(new BigDecimal(4));
    }

    @Test
    public void testAddExecution() {
        calculator.execute("+");
        assertEquals(new BigDecimal(24), calculator.getAccumulator());
    }

    @Test
    public void testSubtractExecution() {
        calculator.execute("-");
        assertEquals(new BigDecimal(16), calculator.getAccumulator());
    }

    @Test
    public void testMultiplyExecution() {
        calculator.execute("*");
        assertEquals(new BigDecimal(80), calculator.getAccumulator());
    }

    @Test
    public void testDivideExecution() {
        calculator.execute("/");
        assertEquals(new BigDecimal(5), calculator.getAccumulator());
    }

    @Test
    public void testSquareExecution() {
        calculator.execute("sq");
        assertEquals(new BigDecimal(16), calculator.getAccumulator());
    }
}
