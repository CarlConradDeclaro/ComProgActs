import java.util.Scanner;

class OneLetterPerLine {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String Word;
    
    System.out.print("Enter a word: ");
    Word = sc.nextLine();
    int n = Word.length();
    int counter = 0;
    
    while(counter < n){
        System.out.println( Word.charAt(counter) );
        counter++;
    }
 
   }
}