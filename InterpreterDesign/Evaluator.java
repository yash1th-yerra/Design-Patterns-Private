import java.util.Map;

class Evaluator implements Expression {
    private Expression syntaxTree;

    public Evaluator(String expression) {
        String[] tokens = expression.split(" ");
        java.util.Stack<Expression> stack = new java.util.Stack<>();

        for (String token : tokens) {
            if (token.equals("+")) {
                Expression right = stack.pop();
                Expression left = stack.pop();
                Expression subExpression = new Add(left, right);
                stack.push(subExpression);
            } else if (token.equals("-")) {
                Expression right = stack.pop();
                Expression left = stack.pop();
                // Handle subtraction in a similar way if needed
            } else {
                stack.push(new Variable(token));
            }
        }
        syntaxTree = stack.pop();
    }

    @Override
    public int interpret(Map<String, Expression> context) {
        return syntaxTree.interpret(context);
    }
}