import java.util.*;

 class Exercise5DocPrinter
{
    
    public static void Exercise5DocPrinter(){
        
 	Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine()){
		    
		    String line = sc.nextLine();
		    
    		  if(line.trim().startsWith("//")){
    		       System.out.println(line);
    		    }
	    	}
	 
    }
    
    
    
    
    
	public static void main(String[] args) {
	
	    Exercise5DocPrinter();
		
	} 
}
