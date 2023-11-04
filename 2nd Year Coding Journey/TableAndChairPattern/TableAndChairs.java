package TableAndChairPattern;

class TableAndChairs{

      static void DynamicTableAndChair(int x,int y){
             if(x<5 || y<16) {
                  System.out.println("Number of Rows must Greater than or equal 5 \nNumber of Columns must Greater than or equal 16");
                  return;
             }
            int row = x;  
            int column = y;


            int interval = (column/4) + 1;
            
            for (int i = 0 - (row-8); i <=row; i++) {
                  for (int j = 1; j <=column; j++) {                          
                         if(  i <3   &&    (  j <2 || j > column-1 )){
                             System.out.print("X");
                         }else if(i == 3 &&  ( (j<2 || j>interval )  && (j<column-(column/4) || j>column-1   )  )  ){
                                System.out.print("X");                        
                         }else if(i == 4 && ( (j<=interval-2 )  ||  j == interval+1   ||  j == (column-(column/4))-1 || ( j >(column-(column/4))+1 )  )){
                               System.out.print("X"); 
                        }else if(i >= 5 && (  j<2 || j == interval-2  || j == interval+1 ||  j==  (column-(column/4))-1 || j == (column-(column/4))+2 ) || j == column){
                               System.out.print("X"); 
                        }else
                            System.out.print(" ");  
                         
                  }            // 1 ,5 8
              System.out.println();         
            }
      }

         

      public static void main(String[] args) {
             
            DynamicTableAndChair(8, 30);
        
       
      }

}









