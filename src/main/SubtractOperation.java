import java.math.BigDecimal;

/**
 * Created by upxs078 on 7/27/16.
 */
public class SubtractOperation extends BinaryOperation {
    @Override
    protected BigDecimal calculate(BigDecimal value1, BigDecimal value2) {
        return value2.subtract(value1);
    }
}
