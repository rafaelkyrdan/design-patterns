package behavioral.patterns.interpreter;

import java.util.Stack;

/**
 * Example
 * Please note that we have used a postfix expression to solve it.
 * A postfix is mathematical notation in which every operator follows all of its operands e.g. 34+.
 */

public class ExampleInterpreterPattern {
    public static void main(String[] args) {

        String tokenString = "7 3 - 2 1 + *";
        Stack<Expression> stack = new Stack<>();
        String[] tokenArray = tokenString.split(" ");

        for (String s : tokenArray) {

            if (ExpressionUtils.isOperator(s)) {

                Expression rightExpression = stack.pop();
                Expression leftExpression = stack.pop();
                Expression operator = ExpressionUtils.getOperator(s, leftExpression, rightExpression);
                int result = operator.interpret();
                stack.push(new Number(result));

            } else {
                Expression i = new Number(Integer.parseInt(s));
                stack.push(i);
            }
        }

        System.out.println("( " + tokenString + " ) = " + stack.pop().interpret());

    }
}
