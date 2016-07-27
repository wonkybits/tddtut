import java.math.BigDecimal;

/**
 * Created by upxs078 on 7/27/16.
 */
public class SquareOperation extends UnitOperation {
    @Override
    protected BigDecimal calculate(BigDecimal value) {
        return value.pow(2);
    }
}
