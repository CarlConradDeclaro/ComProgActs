import java.util.Scanner;

class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);

    String yearBirth, currentYear, age;
    String  twentyFirst = "20";
    String twentyCen = "19";

       System.out.println ("Year of Birth: ");
       yearBirth = sc.nextLine();
    
       System.out.println ("Current year: ");
       currentYear = sc.nextLine();
    
        String yearB = twentyCen + yearBirth;
        String currentYe = twentyFirst + currentYear;
    
        int  birth = Integer.parseInt(yearB);
        int  year = Integer.parseInt(currentYe);
    
        int findAge =  year-birth ;
    
            if (findAge > 100){
            	String theBirth = twentyFirst + yearBirth;
            	int b = Integer.parseInt(theBirth);
            	findAge = year-b;
              }

        System.out.println("Age: " + findAge);

  }
}
