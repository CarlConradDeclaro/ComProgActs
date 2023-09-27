class Weight 
{
    private int[] data;
    Weight(int[] arr){
       data = new int[ arr.length];
       for (int j=0; j< arr.length; j++){
          data[j] = arr[j];
        }
    }

  public int average()
  {
    int sum =0;
     for (int i=0; i<data.length; i++){
        sum+=data[i];
        }
     return sum/data.length;
  }
  
  
  public int subAverage(int start, int end){
      //        1            5
      int sum = 0;
      int x =start-1;
       for (int i=x; i<end; i++){
        sum+=data[i];
        }
      return sum/end;
  }
}

public class Exercise3SubrangeofDays

{  
  public static void main ( String[] args )
  {
    int[] values = { 98,  99,  98,  99, 100, 101, 102, 100, 104, 105,
                    105, 106, 105, 103, 104, 103, 105, 106, 107, 106,
                    105, 105, 104, 104, 103, 102, 102, 101, 100, 102};
    Weight june = new Weight( values );
    int avg = june.average();
    int subAve = june.subAverage(1,5);
    System.out.println("average = " + avg );
    System.out.println(subAve);
  }
}    