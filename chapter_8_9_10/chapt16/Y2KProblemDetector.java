import java.util.Scanner;

class Main
{
  public static void main (String[]args)
  {
     Scanner sc = new Scanner(System.in);

        int findAge = 0;
    
        System.out.print("Year of Birth: ");
        int birthYear = sc.nextInt();

        System.out.print("Current year: ");
        int currentYear = sc.nextInt();
        
        findAge  = (2000+currentYear)-(1900+birthYear);

        if(findAge >100){
           findAge  = (2000+currentYear)-(2000+birthYear);
        }
    
    System.out.println("Age is: " + findAge);
 
  }
}
