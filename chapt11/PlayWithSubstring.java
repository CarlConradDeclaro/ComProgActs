class  PlayWithSubstring
{
  public static void main ( String[] args )
  {
    String str = new String( "Golf is a good walk spoiled." ); // create the original object

    String sub1 = str.substring(-0);   
    String sub2 = str.substring(10,str.length());  
    
    // String sub2 = str.substring(-0,29); 
    System.out.println( sub1 );
   System.out.println( sub2);


  }
}