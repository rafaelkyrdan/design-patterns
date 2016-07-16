package interpreter;

/**
 * Interface is used by all different concrete expressions.
 * Classes override it's interpret method to define their specific
 * operation on the expression.
 */

public interface Expression {
    public int interpret();
}
