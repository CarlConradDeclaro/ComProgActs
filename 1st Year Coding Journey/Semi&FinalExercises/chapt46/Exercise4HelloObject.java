class HelloObject
{
  
  String greeting;
  
  HelloObject(String greeting){
      this.greeting = greeting;
  
  }  
  
  HelloObject(HelloObject init){
      this.greeting =  init.greeting ;
  }
  
  public String greet(){
           return greeting;
  }
 
}
  
class Main{
     public static void main (String[]args){
    
     HelloObject greeting = new HelloObject("Hello");
     
     String c = greeting.greet();
     System.out.println(c);

    } 
}
