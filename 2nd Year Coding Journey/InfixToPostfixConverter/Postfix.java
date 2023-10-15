 package InfixToPostfixConverter;

import java.util.Stack;

public class Postfix {

    static int  opertarPrecendence(char op){
        
        switch(op){
            case '+' :
                    return 1;           
            case '-' :
                    return 1;
                  
            case '*' :
                    return 2;
                
            case '/' :
                    return 2;           
                                                  
        }
        return 0;       
    }
    
    static boolean isOperator(char op){
        return op == '+' || op=='-' || op == '*' || op == '/' ;
    }
    
    static void postFix(String expression){
       
        Stack<Character> operators = new Stack<>();
        StringBuilder s =  new StringBuilder();
      
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
             
                
            if(Character.isDigit(c)){
                s.append(c);
             }else if(c == '('){
                operators.add(c);
             }else  if(c == ')'){
                while(!operators.isEmpty() && operators.peek() != '('){                
                      s.append(operators.pop());         
                }
                if(!operators.isEmpty() && operators.peek() == '('){
                     operators.pop();
                }
             }else if( isOperator(c) ){                                                 
                while(!operators.isEmpty()  &&   opertarPrecendence(operators.peek()) >= opertarPrecendence(c)){
                     s.append(operators.pop());
                } 
                operators.add(c);        

              }                 
        }

        while(!operators.isEmpty() ){ 
            s.append(operators.pop());      
        }
         System.out.println(s);
      } 


    public static void main(String[] args) {
       
        postFix("8-2 * 7 + 5 / (3 - 1)"); 
       
    }
}
