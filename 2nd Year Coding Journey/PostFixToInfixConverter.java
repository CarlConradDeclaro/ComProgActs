import java.util.Stack;
class PostFixToInfixConverter{
 
    public static String postfixToInfix(String postfix) {
        Stack<String> stack = new Stack<>();
        
        for (char c : postfix.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                stack.push(String.valueOf(c));
            } else {
                String operand2 = stack.pop();
                String operand1 = stack.pop();
                String expression = "(" + operand1 + c + operand2 + ")";
                stack.push(expression);
            }
        }       
        return stack.pop();
    }

    public static void main(String[] args) {
        String postfixExpression = "12+2*2/5223*+/+4+";
        String infixExpression = postfixToInfix(postfixExpression);
        System.out.println("Postfix Expression: " + postfixExpression);
        System.out.println("Infix Expression: " + infixExpression);
    }
}