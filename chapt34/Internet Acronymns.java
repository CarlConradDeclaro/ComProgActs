 import java.util.Scanner;

import java.util.*;  
class Main{
  public static void main(String[] args) {
     
    String phrase;
    char   color  ;    
    String message = "Phrase is: ";   
    Scanner scan = new Scanner( System.in ); 
      
     boolean x = true;
    do{    
      while(x){
        System.out.print("Enter Acronym: ");
        phrase = scan.nextLine().trim().toUpperCase();
            switch ( phrase )
            {
                
              case "SMG":                  
                message = message + "Social Media Ghost" ;
                System.out.println( message ) ;
                break;  
              case "BBL":                  
                message = message + "Brazillian Butt lift" ;
                System.out.println( message ) ;
                break;

              case "BTW":                  
                message = message + "By the Way" ;
                System.out.println( message ) ;
                break; 
              case "DIY":                  
                message = message + "Do it Yourself" ;
                System.out.println( message ) ;
                break; 
                 
              case "LOL":
                message = message + "Laugh Out Loud" ;
                System.out.println( message ) ;
                break;
                       
              case "BFF":
                message = message + "Best Friends Forever" ;
                System.out.println( message ) ;
                break;
                       
              case "SO":
                message = message + "Significant Other" ;
                System.out.println( message ) ;
                break;
                      
              case "THS":                  
              case "THKS":                  
              case "TX":                  
                message = message + "Thanks" ;
                System.out.println( message ) ;
                break;
                
              default:
                message = message + "unknown" ;
                    System.out.println( message ) ;
            }   
                 message = "";
      }
    }while(scan.hasNext());
  }
}