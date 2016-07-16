package interpreter;

/**
 * It is the optional utility class that contains
 * different utility methods used to execute the expression.
 */

public class ExpressionUtils {

    public static boolean isOperator(String s) {
        if (s.equals("+") || s.equals("-") || s.equals("*")) {
            return true;
        } else {
            return false;
        }
    }

    public static Expression getOperator(String s, Expression left, Expression right) {
        switch (s) {
            case "+":
                return new Add(left, right);
            case "-":
                return new Subtract(left, right);
            case "*":
                return new Product(left, right);
        }
        return null;
    }
}
