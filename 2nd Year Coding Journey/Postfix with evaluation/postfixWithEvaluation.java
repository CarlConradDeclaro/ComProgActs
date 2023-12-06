import java.util.Stack;
import java.util.ArrayList;
import java.util.Scanner;

class PMDAS {
    static Stack<Integer> values = new Stack<>();
    static Stack<Character> operators = new Stack<>();
    static StringBuilder posfix = new StringBuilder();
    static ArrayList<String> evaluation = new ArrayList<>();

    public static int calculatePMDAS(String expression) {
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch == ' ') {
                continue; // Skip spaces
            } else if (Character.isDigit(ch) || (ch == '-' && i + 1 < expression.length() && Character.isDigit(expression.charAt(i + 1)))) {
                int num;
                if (ch == '-') {
                    num = -1 * (expression.charAt(i + 1) - '0');
                    i++;
                } else {
                    num = ch - '0';
                }

                while (i + 1 < expression.length() && (Character.isDigit(expression.charAt(i + 1)))) {
                    num = num * 10 + (expression.charAt(i + 1) - '0');
                    i++;
                }

                values.push(num);
                posfix.append(num);
            } else if (ch == '(') {
                operators.push(ch);
            } else if (ch == ')') {
                while (!operators.isEmpty() && operators.peek() != '(') {
                    posfix.append(operators.peek());
                    char operator = operators.pop();
                    int operand2 = values.pop();
                    int operand1 = values.pop();
                    values.push(applyOperator(operator, operand1, operand2));
                    evaluation.add(operand1 + " " + operator + " " + operand2 + " = " + applyOperator(operator, operand1, operand2));
                }
                operators.pop(); // Pop the '('
            } else if (isOperator(ch)) {
                while (!operators.isEmpty() && precedence(ch) <= precedence(operators.peek())) {
                    posfix.append(operators.peek());
                    char operator = operators.pop();
                    int operand2 = values.pop();
                    int operand1 = values.pop();
                    values.push(applyOperator(operator, operand1, operand2));
                    evaluation.add(operand1 + " " + operator + " " + operand2 + " = " + applyOperator(operator, operand1, operand2));
                }
                operators.push(ch);
            }
        }

        while (!operators.isEmpty()) {
            posfix.append(operators.peek());
            char operator = operators.pop();
            int operand2 = values.pop();
            int operand1 = values.pop();
            values.push(applyOperator(operator, operand1, operand2));
            evaluation.add(operand1 + " " + operator + " " + operand2 + " = " + applyOperator(operator, operand1, operand2));
        }
        return values.pop();
    }

    String getPostfix() {
        return posfix.toString();
    }

    void displayEvaluation() {
        for (String x : evaluation)
            System.out.println(x);
    }

    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    private static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;
        }
    }

    private static int applyOperator(char operator, int operand1, int operand2) {
        int val = 0;
        switch (operator) {
            case '+':
                val = operand1 + operand2;
                break;
            case '-':
                val = operand1 - operand2;
                break;
            case '*':
                val = operand1 * operand2;
                break;
            case '/':
                if (operand2 != 0) {
                    val = operand1 / operand2;
                }
                break;
        }
        return val;
    }
}

class pmdasStack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PMDAS pmdas = new PMDAS();
        System.out.print("\nEnter an expression: ");
        String expression = sc.nextLine();
        int result = pmdas.calculatePMDAS(expression);
        System.out.println("\nPostfix: " + pmdas.getPostfix());
        System.out.println("Evaluation: ");
        pmdas.displayEvaluation();
        System.out.println("\nRESULT: " + result + "\n");
    }
}
