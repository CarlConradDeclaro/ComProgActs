public class Exercise1ArraySum
{
  public static void main (String[] args ) 
  {
    int[] val = {0, 1, 2, 3,5}; 
    int sum =0;
     for(int i:val){
        sum+=i;
     }
    System.out.println( "Sum of all numbers = " + sum );
  }
}
