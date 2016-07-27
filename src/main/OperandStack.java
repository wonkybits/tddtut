import java.math.BigDecimal;
import java.util.Stack;

/**
 * Created by pstene on 7/26/16.
 */
public class OperandStack {

    private Stack<BigDecimal> values = new Stack<>();

    public BigDecimal peek() {
        if(values.size() == 0)
            return BigDecimal.ZERO;
        return values.peek();
    }

    public void push(BigDecimal value) {
        values.push(value);
    }

    public void replaceTop(BigDecimal value) {
        values.pop();
        values.push(value);
    }
}
