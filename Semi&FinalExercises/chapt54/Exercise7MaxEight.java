import java.util.Scanner;
public class Exercise7MaxEight
{
	public static void main(String[] args) {
	    System.out.println(maxEight(1,2,36,884,5,6,43347,8));
	}
 
  public static long maxEight( int n1, int n2, int n3, int n4, int n5, int n6,int n7,int n8){
      
      int maxVal =  n1 > n2 ? n1 : n2;
      maxVal = n2 > maxVal ? n2 : maxVal;
      maxVal = n3 > maxVal ? n3 : maxVal;
      maxVal = n4 > maxVal ? n4 : maxVal;
      maxVal = n5 > maxVal ? n5 : maxVal;
      maxVal = n6 > maxVal ? n6 : maxVal;
      maxVal = n7 > maxVal ? n7 : maxVal;
      maxVal = n8 > maxVal ? n8 : maxVal;
      return maxVal;
  }
}