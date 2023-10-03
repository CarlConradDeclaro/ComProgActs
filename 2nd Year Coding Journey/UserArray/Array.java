  import java.util.Scanner;

  
interface Arrays{
        void add(int data); //add element to the array
        void viewArray();//view an element if present in the array
        void remove(int index);//remove an element from the array
        void search(int data);//search for an element in the array
        void ascendingSort(); //sort an array in  ascending way
        void descendingSort();//sort an array in descending way
        void edit(int index,int data);//edit an element in the array       
}

class MyArray implements Arrays{
   int[] arr;
   int size,count;
    MyArray(int size){
        this.size = size;
        arr = new int[size];
        count =0;
    }

    @Override
    public void add(int data) {     
       arr[count] =data;
       count++;
       System.out.println("\n+++ New element added +++");
    }

    @Override
        public void viewArray(){
     
            String bars = ""; // just for design
            for(int k=0; k<size;k++){
                bars+="+-+";
            }           
            System.out.println("\n\n"+bars);

             //print the array
            for(int i: arr){
                System.out.print(" "+i+" ");
            }

            System.out.println();
            System.out.println(bars);
            
        }

    @Override
    public void remove(int index) {       
          if(index >size){
                 System.out.println("<<<"+index + " is OutOfBounds>>>");
                 return;
           }
                       
             arr[index] = 0;       
          System.out.println("\n+++Removed Successfuly+++");
    }

    @Override
    public void search(int data) {
    // Ternary search
       int low =0;
       int high = arr.length-1;
                      
            while(low<=high){
                int mid1 = low+ (high-low)/3;
                int mid2 = high- (high-low)/3;

                    if(data == arr[mid1]){
                        System.out.println("\n+++ Element: " + data + " is present at index: " + mid1+ " +++");
                        return;
                    }
                    if(data == arr[mid2]){
                        System.out.println("\n+++ Element: " + data + " is present at index: " + mid2+ " +++");
                        return;
                    }
                    if(data < arr[mid1]){
                        high = mid1-1;
                    }else if(data > arr[mid2]){
                        low = mid2+1;
                    }else{
                        high = mid2-1;
                        low = mid1+1;
                    }
               } 
       System.out.println("\n<<<"+data + " not found>>>");   
    }

    @Override
    public void ascendingSort() {
           //Selection Sort     
	     for(int i=0;i<getCount();i++){
	         int min=i; 
	         for(int j=i+1;j<getCount();j++){
	             if(arr[j]<arr[min])
	               min = j;
	         }
	         int x = arr[min]; 
	         arr[min] = arr[i];  
	         arr[i] = x; 
	     }   
        System.out.println("\n+++ The array has been sorted ascendingly +++");           
    }

    @Override
    public void descendingSort( ) {
               
        for(int i=0;i<getCount();i++){
	         int min=i; 
	         for(int j=i+1;j<getCount();j++){
	             if(arr[j]>arr[min])
	               min = j;
	         }
	         int x = arr[min]; 
	         arr[min] = arr[i];  
	         arr[i] = x; 
	     }
         System.out.println("\n+++ The array has been sorted descendingly. +++");           
    }

    @Override
    public void edit(int index, int data) {
             if(index > getSize()-1){
                 System.out.println("<<<"+index + " is OutOfBounds>>>");
                 return;
             }
             System.out.println("\nElement "+ index + " has been change to " +data);
             System.out.println("\nIndex "+ index + " has been change to " +data);
             arr[index] = data; 
    }  

    public int[] getArr() {
        return arr;
    }
    
    boolean isEmpty(){
        return getCount() == 0 ? true : false;
    }
    boolean isFull(){
        return getCount() > getSize()-1 ? true : false;
    }
  
    public int getSize() {
        return size;
    }

    public int getCount() {
        return count;
    }
   
}


public class Array {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
                
        System.out.print("\n            Welcome. \nEnter desired size for your array \nSize: ");
        int size = sc.nextInt();
        MyArray myArray = new MyArray(size);
       
        boolean run = true;
        do{
            System.out.print("\nOperations: \n 1,Add\n 2,Ascending Sort\n 3,Descending Sort\n 4,Search\n 5,Edit\n 6,Remove\n 7,ViewArray\n 8,Exit \nEnter: ");
            int operation  = sc.nextInt();
            switch(operation){
                case 1 :
                    if(myArray.isFull()){
                        System.out.println("\n<<<Array is Full!>>>");
                        break;
                    }else{
                      System.out.print("Enter Element: ");
                      myArray.add(sc.nextInt());
                    }
                    break;
                case 2: 
                    if(myArray.isEmpty()){
                        System.out.println("\n<<<Array is is Empty!>>>");
                        break;
                    }else{
                    myArray.ascendingSort();
                    }
                    break;
                case 3:
                     if(myArray.isEmpty()){
                        System.out.println("\n<<<Array is is Empty!>>>");
                        break;
                    }else{
                    myArray.descendingSort();
                    }
                    break;
                 case 4: 
                      if(myArray.isEmpty()){
                           System.out.println("\n<<<Array is is Empty!>>>");
                           break;
                       }else{
                          System.out.print("Enter element: ");
                          int element = sc.nextInt();
                          myArray.search(element);
                       }                
                       break;  
                case 5: 
                     if(myArray.isEmpty()){
                        System.out.println("\n<<<Array is is Empty!>>>");
                        break;
                    }else{
                        myArray.viewArray();
                        System.out.print("Enter index: ");
                        int index = sc.nextInt();
                        System.out.print("Enter new element: ");
                        int data = sc.nextInt();
                        myArray.edit(index,data);
                    }
                    break;
                case 6:
                      if(myArray.isEmpty()){
                        System.out.println("\n<<<Array is is Empty!>>>");
                        break;
                    }else{
                    myArray.viewArray();
                    System.out.print("Enter index to remove: ");
                    myArray.remove(sc.nextInt());
                    }
                    break;
                case 7: 
                     if(myArray.isEmpty()){
                        System.out.println("\n<<<Array is is Empty!>>>");
                        break;
                    }else{
                    myArray.viewArray();
                    }
                    break;
               
                default:
                    run =false;
                    break;
            }                           
        }while(run);                
    }
<<<<<<< HEAD
}
=======
}
 