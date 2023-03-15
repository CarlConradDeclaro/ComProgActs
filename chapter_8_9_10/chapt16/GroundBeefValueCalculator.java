 import java.util.Scanner;  

  class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   
          double perPoundPackageA,percentLeanPackageA;
          double perPoundPackageB,percentLeanPackageB;
          double packageA,packageB;
          String BestValue = "";
         
          System.out.println("Price per pound package A: ");
          perPoundPackageA = sc.nextDouble();
          System.out.println("Percent lean package A: ");
          percentLeanPackageA = sc.nextDouble();
          
          System.out.println("Price per pound package B: ");
          perPoundPackageB = sc.nextDouble();
          System.out.println("Percent lean package B: ");
          percentLeanPackageB = sc.nextDouble();
          
          packageA = perPoundPackageA*100/percentLeanPackageA;
          packageB = perPoundPackageB*100/percentLeanPackageB;

             if(packageA != packageB){
                 if(packageA < packageB){
                      BestValue =  "\nPackage A is the best value ";
                 } 
                  BestValue =  "\nPackage B is the best value ";
             } 
             
          System.out.printf ("Package A cost per pound of lean: %.1f  \nPackage B cost per pound of lean: %.6f \n%s",packageA,packageB,BestValue);
        
  }
}
