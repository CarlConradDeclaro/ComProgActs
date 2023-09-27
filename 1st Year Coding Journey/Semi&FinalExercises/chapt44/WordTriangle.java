import java.util.Scanner;
public class WordTriangle
{

   



     
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Enter a Word: ");
	    String word = sc.nextLine();
	    int n= word.length();
       
       System.out.println(" "+word);

	    for (int i=0;i<word.length();i++ ){ 
            
             n-=1;
             int s = i+1;
             String space = " ";
            for(int k=0;k<s;k++){
              space += " ";
            }
             if(s<n){         
	          String nWord = word.substring(s,n);          
	          System.out.println(space + nWord);           
	        } 
        }
	 
	  
	}
}