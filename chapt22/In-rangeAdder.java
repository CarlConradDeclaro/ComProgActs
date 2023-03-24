 import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int lowRange,highRange,data;
    
    System.out.println("Low end of range:");
    lowRange = sc.nextInt();

    System.out.println("High end of range:");
    highRange = sc.nextInt();

     System.out.println("Enter data:");
     data = sc.nextInt();
     int sumOFinRange =0;
    int sumOFoutRange =0;
     
    while(data !=0){   
          if(data>=lowRange && data<=highRange ){
            sumOFinRange+=data;
          }else if(data<lowRange || data>highRange){
            sumOFoutRange+=data;
       }

        System.out.println("Enter data:");
        data = sc.nextInt();   
    }
    System.out.println("Sum of in range values: "+ sumOFinRange);
    System.out.println("Sum of out  range values: "+ sumOFoutRange);

  }
}