import java.util.Scanner;

class WordSeparatedByDots {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String firstWord,secondWord;
    
    System.out.println("Enter first word: ");
    firstWord = sc.nextLine();

    System.out.println("Enter second word: ");
    secondWord = sc.nextLine();

    int count = 0;
    int extraSpace = 30-(firstWord.length()+secondWord.length()) ;

    System.out.print(firstWord);
    while( count < extraSpace  ){   
      System.out.print(".");
        count++;  
    }
    System.out.print(secondWord);
  }
}