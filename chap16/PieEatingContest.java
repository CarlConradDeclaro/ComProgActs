 import java.util.Scanner;

class PieEatingContest
{
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter weight: ");
        int weight = sc.nextInt();
        
        if(weight>=220 && weight<=280){
           System.out.print("You are allowed to enter the contest");     
        }else
          System.out.print("You are not allowed to enter the contest");       
   }
}