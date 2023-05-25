
class HelloObject                                  
{
  String greeting;

  HelloObject(String greeting){
      this.greeting = greeting;
  }
        
   
  public void speak()                                     
  { 
      for (int i=0;i<greeting.length();i++ ){
            System.out.println( greeting );      
      }
  }
   
}

class Main
{
  public static void main ( String[] args )        
  {
    HelloObject anObject = new HelloObject("Hello"); 
    anObject.speak();
  }
}