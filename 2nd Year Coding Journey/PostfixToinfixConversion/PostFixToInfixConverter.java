package PostfixToinfixConversion;
import java.util.*;

public class PostFixToInfixConverter {
     

  
  static void convertPostfixToInfix(String s){
       Stack<String> infix = new Stack<>();
       
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                infix.push(String.valueOf(c));
            }else{
                String operand2 = infix.pop();
                String operand1 = infix.pop();
                infix.push("("+operand1+c+operand2+")");
            }
     }
      System.out.println(infix.pop());
  }


   
  public static void main(String[] args) {
     convertPostfixToInfix("12+2*2/5223*+/+4+");
  }
}
