  import java.util.*;
 public class Main
{
	public static void main(String[] args) {
 
   // 	 System.out.println(TwoSum({2,4,5,7,9},15));
   //   System.out.println(factorial(3));
   //  System.out.println(palindrome("level"));
   //  FizzBuzz();
   //  System.out.println(reverse("abcde12345"));
   // System.out.println(MAxNum(new int[]{12,2321,432,55345,3,2}));
   //	System.out.println(CountsVowels("aegaaaiouio dfgb tu"));
   // System.out.println(binarySearch(new int[]{1,2,3,4,5},3));
    
        // int[] arr = {1,1,1,1,1, 2, 2, 3, 4, 4, 5,1,1,1};
        // int[] result = removeDuplicates(arr);
        //   for (int num : result) {
        //     System.out.print(num + " ");
        // }
        
        
        System.out.println(CalculatePower(2,3));

	}
	
	public static boolean TwoSum(int[] arr,int target){
	    for(int i=0;i<arr.length;i++){
	        for(int j=i;j<arr.length;j++){
	            if((arr[i] + arr[j] == target) && i!=j)
	                return true;
	        }
	    }
	    return false;
	}
	
	public static int factorial(int x){
	    int fact = x;
	    for(int i=1; i<x; i++)
	        fact*=i;
	            
	     return fact ;     
	}
	
	public static String palindrome(String s){
	    int lastChar =s.length()-1;
	    String palindromeWord = s.toLowerCase();
	    for(int i=0;i<palindromeWord.length()/2;i++){
	        if( palindromeWord.charAt(i) == ' ' ||    palindromeWord.charAt(lastChar) == ' ' )
	        continue;
	        if(palindromeWord.charAt(i) != palindromeWord.charAt(lastChar)  )
	          return "Not Palindrome";
	        lastChar--;
	    }
	    
	    return "is Palindrome" ;
	}
	
	public static void FizzBuzz(){
	    for(int i=1;i<=100;i++){
	        if(i%3 == 0 && i%5 == 0)
	          System.out.println("FizzBuzz");
	        else if(i%3 == 0)
	          System.out.println("Fizz");
	        else if(i%5 == 0)
	          System.out.println("Buzz");  
	        else 
	          System.out.println(i);
	    }
	}
	
	public static String reverse(String s){
	   String newS = "";
	    for(int i =s.length()-1 ; i>=0;i--){
	        newS+=s.charAt(i);
	    }
	    return newS;
	}

	public static int MAxNum(int[] arr){
	       int x = arr[0]; 
	       for(int i=1;i<arr.length;i++){
	           if(x < arr[i])
	              x = arr[i];
	       }
	       return x;
	}
	
	public static int CountsVowels(String s){
	    HashMap<Character, Integer> vowelMap = new HashMap<>();
        vowelMap.put('a', 1);
        vowelMap.put('e', 1);
        vowelMap.put('i', 1);
        vowelMap.put('o', 1);
        vowelMap.put('u', 1);
        
        int count =0;
        for(int i=0;i<s.length();i++){
              if(vowelMap.containsKey(s.charAt(i)))
              count++;
        }
	    return count;
	}
	
   public static int binarySearch(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
   
            if (arr[m] == x)
                return m;
            if (arr[m] < x)
                l = m + 1;
            else
                r = m - 1;
        }
     return -1;
    }
	
	
	public static int[] removeDuplicates(int[] arr){
        List<Integer> rd = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(!rd.contains(arr[i]))
                rd.add(arr[i]);
        }
    
        int[] result = new int[rd.size()];
        for (int i = 0; i < rd.size(); i++) {
            result[i] = rd.get(i);
        }
        return result;
	}
	
	
    public static double CalculatePower(double base, int exponent) {
        if (exponent < 0) {
            base = 1 / base;
            exponent = -exponent;
        }
        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
	
	
	
	
}
