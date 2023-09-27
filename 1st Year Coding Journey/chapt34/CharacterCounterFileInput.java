 import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

 
    System.out.print("Enter Strings: ");
    String words =  sc.nextLine();
      words.toLowerCase();
      int index =0;
      int numberOfVowels=0;
      int numberOfConsonants=0;
      int numberOfpunctuation=0;
      int blankSpace=0;
      int unknown=0;
      int counter = 0;
 
    
  while(counter < words.length()){  
   
    switch( words.toLowerCase().charAt(counter) ){   
               // number of vowels  
               case 'a': case 'e': case 'i': case 'u':case 'o':  
                     numberOfVowels+=1;                    
                     break;
                 // number of consonants     
               case 'b': case 'c': case 'd': case 'f':case 'g':
               case 'h': case 'j': case 'k': case 'l':case 'm':  
               case 'n': case 'p': case 'q': case 'r':case 's': 
               case 't': case 'v': case 'w': case 'x':case 'y': 
               case 'z': 
                     numberOfConsonants+=1;           
                     break; 
                // number of punctuation mark characters   
               case ',': case ':': case ';': case '-':case '(':
               case ')': case '?': case '"': case '[':case ']':  
               case '_': case '@': case '&': case '#':case '*':  
               case '/': case '\'':  case '!':   
                    numberOfpunctuation+=1;
                    break;
             // number of blank spaces  
               case ' ':   
                    blankSpace+=1;
                    break;
               // number of unknown characters  
             default:
                    unknown+=1;
              
          }                 
                counter++;
 }
    
          System.out.println("Number of Vowels = " + numberOfVowels );
          System.out.println("Number of Consonants characters = " + numberOfConsonants );
          System.out.println("Number of Punctuation = " + numberOfpunctuation );
          System.out.println("Number of Blank Spaces = " + blankSpace);
          System.out.println("Number of Unknown characters = " +unknown );

          int n = words.length();

          double percentOfVowels = (double)numberOfVowels/n*100;
          double percentOfConsonants = (double)numberOfConsonants/n*100;
          double percentOfpunctuation= (double)numberOfpunctuation/n*100;
          double percentOfblankSpace = (double)blankSpace/n*100;
          double percentOfunknown = (double)unknown/n*100;

     
          System.out.println("\nPercentage of Vowels = " + percentOfVowels + "%" );
          System.out.println("Percentage of Consonants characters = " + percentOfConsonants + "%" );
          System.out.println("Percentage of Punctuation = " + percentOfpunctuation + "%"  );
          System.out.println("Percentage of Blank Spaces = " + percentOfblankSpace + "%" );
          System.out.println("Percentage of Unknown characters = " + percentOfunknown + "%"  );

    
  }
}