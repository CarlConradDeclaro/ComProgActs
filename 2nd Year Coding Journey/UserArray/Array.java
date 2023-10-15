import java.util.Scanner;

class MyArray extends Exception {
   int[] arr;
   int size,count;
   Scanner sc = new Scanner(System.in);

   MyArray(String str){
      super(str);
   }
    MyArray(int size){
        this.size = size;
        arr = new int[size];
        count =0;
    }

    public void add() {    
       // if the array is full it will throw an exception using isFull() method       
        if(!(isFull())){  
            System.out.print("Enter Element: ");               
            arr[count] =sc.nextInt();
            count++;
            System.out.println("\n+++ New element added +++");           
        }
    }

    public void viewArray(){               
    // if the array is empty it will also throw an exception using isEmpty() method  
        if(!(isEmpty())){
            System.out.println();
            for(int i: arr)
                System.out.print(" "+i+" "); //print the array           
            }  
              System.out.println();           
        }

    public void remove() {               
        if(!(isEmpty())){
            try{
                viewArray();
                System.out.print("\nEnter index to remove: ");             
                arr[sc.nextInt()] =0;
                System.out.println("\n+++Removed Successfuly+++");
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }             
        }
    }

    public void search() {  
        if(!(isEmpty())) {  // exception is thrown if the array is empty     
             System.out.print("Enter element: ");
             int data = sc.nextInt();  
                
             for (int i =0; i<arr.length;i++) {
                if(data == arr[i]){
                    System.out.println("\n### Element: " + data + " is present at index: " + i+ " ###");
                 return;
                }
            }
            System.out.println("\n<<<"+data + " not found>>>"); 
       }                        
    }

    public void ascendingSort() {
            // if the array is empty it will also throw an exception using isEmpty() method  
            if(!(isEmpty())){// User-Defined Exceptions      
                
                for(int i=0;i<getCount();i++){ //Selection Sort     
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
      }

    public void descendingSort( ) {     
           if(!(isEmpty())){// User-Defined Exceptions      
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
    }

    public void edit() {
            if (!isEmpty()) {
                viewArray();
                System.out.print("\nEnter index: ");
                int index = sc.nextInt();

                 try {
                     arr[index] = 0;//I just initialize 0 to check if the index is not outOfBounds
                     System.out.print("\nEnter new element: ");
                     int data = sc.nextInt();
                     System.out.println("\nIndex " + index + " has been changed to " + data);
                     arr[index] = data;
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    }             
            }
    }

    public int[] getArr() { return arr; }
    
    boolean isEmpty(){   
            //this will throw an execption if the array is empty and also it will return boolean value;
            try {
                if(getCount() == 0)
                throw new MyArray("\n<<<Array is is Empty!>>>");// user-defined exception
            }catch(MyArray e){
                System.out.println(e.getMessage());
            }              
        return getCount() == 0 ? true : false;
    }

    boolean isFull(){
            //this will throw an execption if the array is full and also it will return boolean value;       
            try{
                if(getCount() > getSize()-1 )
                throw new MyArray("\n<<<Array is Full!>>>");
            }catch(MyArray e){
                        System.out.println(e.getMessage());
            }       
        return getCount() > getSize()-1 ? true : false;
    }

    public int getSize() { return size; }

    public int getCount() { return count; }
   
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
                    myArray.add();                 
                    break;
                case 2:                     
                    myArray.ascendingSort();                 
                    break;
                case 3:                   
                    myArray.descendingSort();                   
                    break;
                 case 4: 
                    myArray.search();            
                    break;  
                case 5:                                          
                    myArray.edit();      
                    break;
                case 6:                  
                    myArray.remove();
                  
                    break;
                case 7:   
                    myArray.viewArray();       
                    break;          
                default:
                    run =false;
                    break;
            }                           
        }while(run);                
    }
}