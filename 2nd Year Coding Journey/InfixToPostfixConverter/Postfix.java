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
        return op == '+' || op=='-' || op == '*' || op == '/' || op=='(';
    }
    
    static void postFix(String expression){
       
        Stack<Character> operators = new Stack<>();
        String s = "";
      
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
             
                
              if( isOperator(c)){                                                 
               while(operators.size()>1  &&   opertarPrecendence(operators.peek()) >= opertarPrecendence(c)){
                  s+=operators.pop();
               } 

                operators.add(c);        

             }else if(Character.isDigit(c)){
                s+=c;
             } else  if(c == ')'){
                while(!operators.isEmpty() && operators.peek() != '('){                
                      s+=operators.pop();         
                }
             }                 
        }

        while(!operators.isEmpty() ){
           if(operators.peek() != '('){
             s+=operators.pop();
           }else
             operators.pop();
        }
         System.out.println(s);
      } 


    public static void main(String[] args) {
       
        postFix("(8 - 2) * 7 + 5 / (3 - 1)"); 
        //  +/(
        //   82-7*5
    }
}
