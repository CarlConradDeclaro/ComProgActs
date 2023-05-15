public class Main
{
  public static void main (String[] args ) 
  {
      int[][] array = {  {1, 2, 3},
                         {4, 5},
                         {6, 7, 8, 9}
                      };
    
       int maxC = 0;
       for(int[] i: array){
           int x = i.length;
           if(x > maxC ){
               maxC = x;
           }
       }
    
     int[] sums = new int[maxC];
     for(int i=0; i<array.length;i++){
         int[] row = array[i];
         int nColumns = row.length;
            for(int j=0; j<nColumns;j++){
               sums[j]+=row[j];
            }
     }
    
    for(int i: sums){
        System.out.println("Sum: "+i);
    }
    
  }
}

 