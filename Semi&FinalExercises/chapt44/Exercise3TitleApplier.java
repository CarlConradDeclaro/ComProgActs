import java.util.Scanner;

public class Main
{
    
     public static void Exercise3TitleApplier(){
         
         Scanner sc = new Scanner(System.in);
         
         String Amy = "Amy", Buffy = "Buffy", Cathy = "Cathy";
         String Elroy = "Elroy", Fred = "Fred",  Graham = "Graham";
         String titleApplier = "",input = "" ;

        System.out.println("Enter a String: ");
    	input = sc.nextLine();
    
        while(input.length() > 0 ){
            if(input.startsWith(Amy) || input.startsWith(Buffy) || input.startsWith(Cathy) ){
                    titleApplier = "Ms. " + input;
                    System.out.println(titleApplier);
            }else if(input.startsWith(Elroy) || input.startsWith(Fred) || input.startsWith(Graham) ){
                     titleApplier = "Mr. " + input;
                     System.out.println(titleApplier);
            }else{ 
                     System.out.println(input);
           }   
            System.out.println("\nEnter a String: ");
    		input = sc.nextLine();
         }
 	}
  
    public static void main(String[] args) {
   
		Exercise3TitleApplier();
 	
	}
}

 