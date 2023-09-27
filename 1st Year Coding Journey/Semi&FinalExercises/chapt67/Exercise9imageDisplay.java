public class Exercise9imageDisplay {
    public static void main(String[] args){
     
          String  x = " ";
          int y =0;
          String image = ".,-+oOX";
           for(int k = 0; k<64; k+=8){    
        	  for(int i=0;i<64;i+=8){
        	    for(int j=0;j<64;j++){
        	        System.out.print(x);
        	         }
        	        System.out.println(x);                 
              	}
          x = ""+image.charAt(y);
          if(y < 6){ y++;}
	   }
   
    } 
}