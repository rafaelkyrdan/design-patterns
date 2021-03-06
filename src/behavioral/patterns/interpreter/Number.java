package behavioral.patterns.interpreter;

/**
 * The specific expression class.
 * This class represents the number through the expression.
 */

public class Number implements Expression {

    private final int n;

    public Number(int n) {
        this.n = n;
    }

    @Override
    public int interpret() {
        return n;
    }
}
