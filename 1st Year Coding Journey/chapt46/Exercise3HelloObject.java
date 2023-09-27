import java.util.Scanner;

class HelloObject                                  
{
   
  public void speak(String hello)                                     
  { 
            System.out.println(hello);      
  }
   
}

class Main
{
  public static void main (String[] args )
  {
    HelloObject greeting = new HelloObject();   
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter Greeting: ");
    String message = sc.nextLine();
     
    greeting.speak("\n" + message);
    
  }
}