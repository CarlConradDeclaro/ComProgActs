import java.util.Scanner;
import java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      DecimalFormat numform = new DecimalFormat("000,000"); 
      
            System.out.print("Enter age in years: ");
            int age = sc.nextInt();
            System.out.print("Enter months : ");
            int months = sc.nextInt();
            System.out.print("Enter days:");
            int days = sc.nextInt();
            
            int daysInMonths = 30*months + days ;
            
            if(months == 1){daysInMonths += 1;  
            }if(months == 2){daysInMonths -= 1;
            }if(months == 5){daysInMonths += 1;
            }if(months == 6){daysInMonths += 1;
            }if(months == 7){daysInMonths += 2;
            }if(months == 8){daysInMonths -= 3;
            }if(months == 9){daysInMonths -= 3;
            }if(months == 10){daysInMonths += 4;
            }if(months == 11){daysInMonths += 4;
            }if(months == 12){ daysInMonths += 5;
            } 
            
            int AgeInSecs = (age*365+daysInMonths)* (24*60*60);
            double  percentage= (AgeInSecs /  2.5e9) * 100;
            
            System.out.println("Age in Seconds is: " + numform.format(AgeInSecs));
            System.out.printf("Your lifespan is: %.2f%%   ",  percentage );
 
    }
}