import java.util.Scanner;
class RepeatedEchoWord {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    
    System.out.print("Enter a word: ");
    String word = sc.nextLine();
    int n = word.length();
    System.out.println(" ");
    
    int count = 0;
    while(count <n){  
      System.out.println(word);
      count++;
    }

    
  }
}