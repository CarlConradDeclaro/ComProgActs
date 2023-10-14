package InfixToPostfixConverter;

import java.util.Stack;

public class Postfix {

    static int  opertarPrecendence(int a, int b,String op){
        switch(op){
            case "+" :
                    return a+b;           
            case "-" :
                    return a+b;
                  
            case "*" :
                    return a+b;
                
            case "/" :
                    return a+b;                                             
        }
        return 0;       
    }
    
    static boolean isOperator(char op){
        return op == '+' || op=='-' || op == '*' || op == '/' || op == '(';
    }
    
    static void postFix(String expression){
       
        Stack<Character> operators = new Stack<>();
        String s = "";
      
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
     //(1+2)/2+1
             if( c == ')'){
               while(!operators.isEmpty() && operators.peek() != '('){
                s+=operators.pop();
               }
             }else if( isOperator(c)){
               operators.add(c);
             }else if(Character.isDigit(c)){
                s+=c;
             }
            
       

        }
         System.out.println(s);
        System.out.println(operators);
     } 


    public static void main(String[] args) {
       
        postFix("(1+2)/2+1");
    }
}
