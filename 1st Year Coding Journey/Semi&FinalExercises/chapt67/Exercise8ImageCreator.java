 public class Exercise8ImageCreator{
	public static void main(String[] args) {
	   
   int x =0;
   for(int k = 0; k<=64; k+=8){    
	  for(int i=0;i<64;i+=8){
	    for(int j=0;j<64;j++){
	        System.out.print(x);
	         }
	        System.out.println(x);                 
      	}
      x+=8;
	  }
	}
}