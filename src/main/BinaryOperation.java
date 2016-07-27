import java.math.BigDecimal;

/**
 * Created by upxs078 on 7/27/16.
 */
public abstract class BinaryOperation implements Operation {
    @Override
    public void apply(OperandStack values) {
        BigDecimal value1 = values.peek();
        values.pop();
        BigDecimal value2 = values.peek();
        values.replaceTop(calculate(value1, value2));
    }

    protected abstract BigDecimal calculate(BigDecimal value1, BigDecimal value2);
}
