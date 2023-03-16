import java.util.Scanner; 

class  Y2KProblemDetector{
  public static void main ( String[] args )
  { 
   Scanner sc = new Scanner( System.in );
       
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



// import java.util.Scanner;

// class Main
// {
//   public static void main (String[]args)
//   {
//      Scanner sc = new Scanner(System.in);

//         int findAge = 0;
    
//         System.out.print("Year of Birth: ");
//         int birthYear = sc.nextInt();

//         System.out.print("Current year: ");
//         int currentYear = sc.nextInt();
        
//         findAge  = (2000+currentYear)-(1900+birthYear);

//         if(findAge >100){
//            findAge  = (2000+currentYear)-(2000+birthYear);
//         }
    
//     System.out.println("Age is: " + findAge);
 
//   }
// }
