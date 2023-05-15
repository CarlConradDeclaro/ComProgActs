public class Main
{
  public static void main (String[] args ) 
  {
    int[] val = {0, 1, 2, 3}; 
    int temp;
 
    System.out.println( "Original Array: "  + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
    // reverse the order of the numbers in the array
    int n = val.length;
    for(int i=0;i<val.length/2;i++){
        temp = val[i];
        val[i] = val[n-1];
        val[n-1] = temp;
        n--;
    }
 System.out.println( "Reversed Array: "  + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
  }
}

 