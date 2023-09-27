import java.util.Scanner;

class RunOfIntegers {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int start, end;
    
    System.out.print("Enter Start: ");
    start = sc.nextInt();
    
    System.out.print("Enter End: ");
    end = sc.nextInt();

    System.out.println(" ");
    while(start <=9){
      System.out.println(start);    
      start+=1;
    }
     System.out.println("Program ends.");    
    
  }
}