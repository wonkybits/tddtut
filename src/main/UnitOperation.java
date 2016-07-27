import java.math.BigDecimal;

/**
 * Created by upxs078 on 7/27/16.
 */
public abstract class UnitOperation implements Operation {
    @Override
    public void apply(OperandStack values) {
        BigDecimal value = values.peek();
        values.replaceTop(calculate(value));
    }

    protected abstract BigDecimal calculate(BigDecimal value);
}
