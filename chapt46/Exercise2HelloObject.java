
class HelloObject                                  
{
  String greeting;

  HelloObject(String greeting){
      this.greeting = greeting;
  }
        
   
  public void speak()                                     
  { 
            System.out.println( greeting );      
  }
   
}

class Main
{
  public static void main ( String[] args )        
  {
    HelloObject morning = new HelloObject("Good morning World!"); 
    HelloObject evening = new HelloObject("Good evening World!");
   
    morning.speak();
    evening.speak();
  }
}