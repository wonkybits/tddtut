import java.math.BigDecimal;
import java.util.Stack;

/**
 * Created by upxs078 on 7/26/16.
 */
public class Calculator {
    private Stack<BigDecimal> values = new Stack<>();

    public BigDecimal getAccumulator() {
        if(values.size() == 0)
            return BigDecimal.ZERO;
        return values.peek();
    }

    public void setAccumulator(BigDecimal value) {
        if(values.size() > 0)
            values.pop();
        values.push(value);
    }

    public void enter() {
        values.push(getAccumulator());
    }

    public void drop() {
        values.pop();
    }
}
