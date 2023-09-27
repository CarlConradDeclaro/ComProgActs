  

#include <stdio.h>
#include <stdbool.h>
#include <ctype.h>

// PROTOTYPE FUNCTIONS

//PRELIM
void areaOfCircle();
// MIDTERM
void  LabExPart2();         // Midterm LabEx Part 2 - Conditional Statement (actual code)
void FxngVarDclrtnsFormatting(); // LabEx - fixing Variable declarations and formatting outputs
void  MidtermExamCoding(); // Midterm Exam Coding

//SEMI-FINALS
void activity01();     // SF-Lab.Activity #01
void Activity02();    //SF-Lab.Activity #02 - Prime Numbers (Due on Nov 17, 2022 @11:59pm)
void activity03();   // SF-Lab.Activity #03 - Prime Numbers Part 2 (Due on Nov 22, 2022 @11:59pm)
void switchCase();  // Using switch case statement - Assignment
void LabExSwitchCaseWhileLoop();      //LabEx-Switch Case + While Loop  
void NestedForLoop(); //Assignment - Nested For Loop
void semiFinal();    //Semi-Final Exam => Coding

//FINALS
void finalAct01();         //Finals-Lab.Activity #01
void finalActivity02();   //Finals-Lab.Activity #02 - Functions, pass by reference.
void activity03Arrays(); // Finals activtiy
void workingWithArrays();
void FinalExam();

 





//Functions that are used to make this project working
void mainMenu();
void subm();
void start();
void executeActivities();

// Functions from other activities
void sum(),difference(),product(),quotient(),remaider(),swap(),swap2(),displayArray(),updateMultiTable();
 


//main func
int main(){         
            
  
          start(); 


  
  return 0;
}

 

//FUNCTIONS THAT ARE USED TO MAKE THIS PROJECT WORKING
  void start(){
        
    char thaChosenOne;
    int exit = 1;
    char choices;
        
       do{     
           mainMenu();
            exit=1;
               printf("Choice: ");
                    scanf(" %c", &choices);         
          
                    while(exit != 0){
                         switch(toupper(choices)){                   
                             case 'P':             
                                     do{
                                         subm(0);                  
                                         printf("Choice: ");
                                         scanf(" %c", &thaChosenOne);
                                         executeActivities(0,thaChosenOne);                                                    
                                         }while(toupper(thaChosenOne)!='X'); 
                                         break;                   
                            case 'M':            
                                     do{
                                         subm(1);                  
                                         printf("Choice: ");
                                         scanf(" %c", &thaChosenOne);
                                         executeActivities(1,thaChosenOne);                   
                                         }while(toupper(thaChosenOne)!='X'); 
                                         break;               
                            case 'S':    
                                     do{
                                         subm(2);
                                         printf("Choice: ");
                                         scanf(" %c", &thaChosenOne);
                                         executeActivities(2,thaChosenOne);                 
                                         }while(toupper(thaChosenOne)!='X'); 
                                         break;               
                            case 'F':
                                    do{
                                       subm(3); 
                                       printf("Choice: ");
                                       scanf(" %c", &thaChosenOne);
                                       executeActivities(3,thaChosenOne);  
                                       }while(toupper(thaChosenOne)!='X'); 
                                       break;               
               }
                            exit = 0;                  
            }
          } 
         while(toupper(choices) != 'X') ; //  it's working hahahahuhuuh shesshhhhhhh       
       printf("\nThank you &  Merry Christmas and a Happy New Year.\n");    
     } 
  void mainMenu(){
         
        typedef char *string;  
        
               char bars[1][50]= {"\n||====================================||\n"};
               char mainMenu[1][50] ={"||       MAIN MENU                    ||"};        
                  printf("%s",bars[0]);
                  printf("%s",mainMenu[0]);
                  printf("%s",bars[0]);             
            string Menu[]  = {"P-Prelim      ","M-Midterm     ","S-Semi-Finals ","F-Finals      ","X-Exit        "}; 
              for (int i = 0; i <5; i++) {
                        printf("|        %s                |\n",Menu[i]);
                        }
                    printf("========================================\n");
      }
  void subm(int index){
        
         typedef char *string;  
         char bars[1][50]= {"\n========================================\n"};
         char title[1][30] ={"             SUB - MENU      "};   
              printf("%s",bars[0]);
              printf("%s",title[0]);
              printf("%s",bars[0]);
              printf("\n");   
        string Menu[]= {"P-PRELIM\n","M-MIDTERM\n","S-SEMI-FINALS\n","F-FINALS\n","X-Exit"}; 
        string subMenu[4][8] = {{"1-Area of Circle  ","X-Back            "},
                              {"1-LabExPart2      "   ,"2-MidExamCoding   ","3-fixingVariable  ","x-Back            "},
                              {"1-SF-acitivity#1  ",  "2-Activity#2PM    ",  "3-Activity#3PM    ",  "4-switchCaseAsment","5-LabExSCase+WLoop","6-NestedForLoop   ","7-SemifinalCoding ","X-Back            "},
                              {"1- Finals-Act#01  ","2- Finals-Act#02  " ,"3- Finals-Act#03  ","4- Finals-Act#04  ","5-FinalExam       ","x-Back            "}};           
                int temp = index;
                if(temp == 0){
                  temp = 0;         
                }else if(temp == 1){
                  temp = 1;             
                }else if(temp == 2){
                  temp = 2;
                }else if(temp == 3){
                  temp = 3;
                }
            for(int i = temp; i<temp+1; i++) {      
                printf("              %s",Menu[i] );
                printf("  + - + - + - + - + - + - + - + - + - +\n");
                printf("-                                       -\n"  );
                    for (int j = 0; j <8; j++) {                             
                    if(subMenu[i][j]  !=  NULL){
                    printf("|  %s                   |\n",  subMenu[i][j]);
                }
             }
                   printf("+                                       +\n"  );  
          }
               printf("  - + - + - + - + - + - + - + - + - + - \n");
      }
  void executeActivities(int semester, int thaChosenOne){
      
    int x = semester;    
    char y = (char)thaChosenOne;     
              switch(x){  
                    case 0:  //Prelim
                              switch(y){
                                case  '1':areaOfCircle();break;                           
                                     }
                               break;    
                    case 1:  //midterm
                            switch(y){
                                 case  '1': LabExPart2();break;                     
                                 case  '2': MidtermExamCoding(); break; 
                                 case  '3': FxngVarDclrtnsFormatting(); break; 
                                   }
                             break;                 
                    case 2: //semi-final
                            switch(y){
                                   case '1': activity01();break; 
                                   case '2': Activity02();break;      
                                   case '3': activity03(); break; 
                                   case '4': switchCase();break;
                                   case '5': LabExSwitchCaseWhileLoop();break;    
                                   case '6': NestedForLoop();break; 
                                   case '7': semiFinal(); break;    
                                   }
                             break;    
                    case 3:   // final
                            switch(y){
                                   case '1': finalAct01();break;
                                   case '2': finalActivity02();break;   
                                   case '3': activity03Arrays();break;
                                   case '4': workingWithArrays();break; 
                                   case '5': FinalExam(); break;
                                   }
                              break;    
           }    
      }
 

// ACTIVITIES
  void areaOfCircle(){
      float area;
      float radius;
      float pi= 3.14;  
       printf("\n(Find the are of a Circle)\n");
                     printf("\nPlease Enter the radius: ");
                     scanf("%f",&radius);
                     area = pi*radius*radius;
                     printf("The are of the circle is: %.2f", area);
  printf("\n\n\n\n");
}  
  void LabExPart2(){
      // descriptions of stages in life
#define Infant "Infant = 0-1 year."
#define Toddler "Toddler = 2-4 years."
#define Child "Child = 5-12 years."
#define Teen "Teen = 13-19 years."
#define Adult "Adult = 20-39 years."
#define Middle "Middle = 40-59 years."
#define Senior "Senior = 60+."
#define Instruction "Enter your age to determine where you belong in this category.\n"


  printf("\n\n\n");    
          int inputAge;
                  printf("\n");
                  printf("%s\n", Instruction); // this is an instruction for the user
                  printf("Stages in life:\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n\n",Infant,Toddler,Child,Teen,Adult,Middle,Senior); // this is the category of stages in life.
          
                    // here are list of stages in life, I created this to declare what specific stage in life that the user is going to enter.
                  char stagesOFlife[7][20]= {"Infant","Toddler","Child","Teen","Adult","Middle","Senior",};
                  char end[1][20]={"Program end."};
                  
                   // here we're goin to ask the user to input an age
                  printf("Please enter your age: ");
                  scanf("%d",&inputAge );
                  printf("\n");
                  
                  // nested if statements using conditional oparators
           if(inputAge >-1){   // let's first check the age if it is not lessthan 0
                       
                           if(inputAge >= 0 && inputAge <= 1){ // if the age is greaterthan or equal to 0 and lessthan or equal 1....
                           printf("Stage of Life: %s\n\n",stagesOFlife[0]);  //this line of program will execute, otherwise the nextlines.
                       }else if(inputAge >=2 && inputAge <=4){
                            printf("Stage of Life: %s\n\n",stagesOFlife[1]);
                       }else if(inputAge >=5 && inputAge <=12){
                            printf("Stage of Life: %s\n\n",stagesOFlife[2]);
                       }else if(inputAge >=13 && inputAge <=19){
                            printf("Stage of Life: %s\n\n",stagesOFlife[3]);
                       }else if(inputAge >=20 && inputAge <=39){
                            printf("Stage of Life: %s\n\n",stagesOFlife[4]);
                       }else if(inputAge >=40 && inputAge <=59){
                            printf("Stage of Life: %s\n\n",stagesOFlife[5]);
                       }else if(inputAge > 60){
                            printf("Stage of Life: %s\n\n",stagesOFlife[6]);
                       }          
                     }
            else {
                     printf("\nInvalid \"age\" \n"); // we have here a message to tell the user that age is invalid
                   }                                                                 
            printf("%s",end[0]);    
      printf("\n\n");
   }      
  void MidtermExamCoding(){
                 printf("\n\n\n");    
                  float subjects = 5;  //5 subjects only
                  float grado[5]; // all the grades will be put here
                  float sum =0; 
                  float total=0;
                  float average = 0;        
                  printf("Enter the grades \n");
                  for(int i=0; i<subjects;i++){ // here, the compiler will ask each grade 5 times
                      printf("Grade %d: ", i+1);
                      scanf("%f", &grado[i]);                     
                  }
                  printf("\n");
                  for( int i=0; i<subjects;i++){
                      total+=grado[i];// this will calculate the sum of the 5 subjects
                  }                 
                  average= total/subjects; // to calculate the average
                  printf("The average is: %.1f \n", average);                  
                  // the codes here will determine the corresponding letter grade
                  if(average>=1.0 && average<=1.5){
                      printf("\nGrade is: A");
                  }else if(average>=1.6 && average<=2.0){
                      printf("\nGrade is: B");
                  }else if(average>=2.1 && average<=2.5){
                      printf("\nGrade is: C");
                  }else if(average>=2.6 && average<=3.0){
                      printf("\nGrade is: D");
                  }else if(average>=3.1 && average<=5.0){
                      printf("\nGrade is: F");
                  }
                  else{
                      printf("\nThe average is invalid: %.1f", average);// this code here will work if the average is less than 1.0 and greater than 5.0
                  }        
      printf("\n\n\n");
          }   
  void switchCase(){
          printf("\n\n\n");    
              float subjects = 5;  //5 subjects only
              float grado[5]; // all the grades will be put here
              float sum =0; 
              float total=0;
              float average = 0;
              char letterGrade;
              
              printf("\nPlease enter only between 1.0 to 5.0 grades only, to get a valid result\n");
              printf("Enter the grades \n");
              for(int i=0; i<subjects;i++){ // here, the compiler will ask each grade 5 times
                  printf("Grade %d: ", i+1);
                  scanf("%f", &grado[i]);
              }
              printf("\n");
              for( int i=0; i<subjects;i++){
                  total+=grado[i];// this will calculate the sum of the 5 subjects
              }
     
              average= total/subjects; // to calculate the average
           
              int x = (average/5.0)*100;  
                      switch(x){
                          
                              case 20 ... 30:
                                      letterGrade= 'A';
                                      break;
                              case 31 ... 40:
                                      letterGrade= 'B';
                                      break;
                              case 41 ...  50:
                                      letterGrade= 'C';
                                      break;
                              case 51 ... 60:
                                      letterGrade= 'D';
                                      break;
                              case 61 ... 100:
                                      letterGrade= 'F';
                                      break;        
                                        
                              default:
                                        
                                       printf("Invalid grade: %.1f \n", average);
                                       break;
                          }
                                            printf("The average is: %.1f \n", average);
                                            printf("The grade is: %c \n", letterGrade);
   printf("\n\n\n\n");
          }
  void LabExSwitchCaseWhileLoop(){
         printf("\n\n\n");    
              int counter = 0; 
              int noOfSubjects;
          
              float grade = 0, sum = 0, ave = 0;
              printf("\n");
              printf ("Number of Subjects: \n");
              scanf("%d", &noOfSubjects);
          
          while(counter<noOfSubjects)
          {
               counter++;
               printf("Enter Grade %d =>", counter); 
               scanf("%f",&grade);
               sum+=grade;
          }
         ave=sum/noOfSubjects;
               printf("The average is %.1f",ave);
  printf("\n\n\n\n");
    }
  void activity01(){
    printf("\n\n\n");    
                  int subjects;  
                  float grado;  
                  float total=0;
                  float average = 0;  
                  char letterGrade;    
                  int i=1;
                  int p=1;                      
                      printf("This program calculates the average of as many grades you wish to enter. \n");
                      while(p<2){          
                          printf(" First, enter the number of grades to process: ");    
                          scanf("%d", &subjects);
                          printf("Now enter the %d grades to be averaged. ", subjects );   
                        if(subjects>=2){ // this will check if the input of the user is greater than two 
                             printf("\n");   
                               while(i<=subjects){
                                     printf("Enter grade #%d:  ", i);    
                                     scanf("%f", &grado);               
                                           if(grado>=1.0 && grado<=5.0){
                                              total+=grado; // the grades will be calutated here if it is in-range
                                             i++; 
                                          } else
                                              printf("*** Invalid entry. Grade must be from 1.0 to 5.0 *** \n"); 
                           }           
                               average = total /subjects;             
                               printf("\n");   
                                
                  int x = (average/5.0)*100;  
                          switch(x){              
                                  case 20 ... 30:
                                          letterGrade= 'A';
                                          break;
                                  case 31 ... 40:
                                          letterGrade= 'B';
                                          break;
                                  case  41 ...  50:
                                          letterGrade= 'C';
                                          break;
                                  case 51 ... 60:
                                          letterGrade= 'D';
                                          break;
                                  case 61 ... 100:
                                          letterGrade= 'F';
                                          break;        
                              }
                             printf("The average of the %d grades entered is  %.1f  \n", subjects, average);
                                                 printf("You have a letter grade of: %c \n", letterGrade);
                                    p++;
                          }
                        else
                          printf("*** Number of grades must be greater than or equal to two ***  \n \n");             
       
                        }
      printf("\n\n\n\n");
              }
  void NestedForLoop(){
          printf("\n\n\n");    
                int sizeOfTheTable;
                char a;  
                int p =1;
                int x =1;
                bool v;
                bool b = true;
                
                         do{      
                              printf("\nInput the prefferd size of the table: ");
                              scanf("%d", &sizeOfTheTable);   
                           
                               for(int i=1;i<=sizeOfTheTable;i++){
                                  for(int j=1;j<=sizeOfTheTable;j++){
                                      printf("%4d", i*j);
                                    }
                                 printf("\n");
                               }   
                        v = true;     
                           while(v){
                                 printf("Do you want to try again? (y/n):  ");
                                 scanf(" %c", &a);          
                              
                                 if(a == 'y' || a == 'Y'){
                                   v = false;
                                   } else if( a == 'n' || a =='N'){
                                      b= false;
                                      v = false;
                                   }else 
                                       v = true;
                             }
                }while(b); 
              
                   printf("\n\n\n\n");
              }
  void Activity02(){
  printf("\n\n\n");    
              int n;
              int c=0; // The value of this should only be 1 or 2 to determine it's a prime number 
  
         //while(true){
            printf("\nInput a number => ");
              scanf("%d", &n);    
               for(int i=1; i<=n; i++){
                
                  int x = n%i;
                  if(x == 0){ // if the x is 0 then it will increment the c  
                  c++;
               }          
              }
           // here will determine if the n is a prime number or not
              if(c==1){
              printf("The number %d is neither prime nor composite.", n);
                
              }else if(c == 2  || c ==1){ 
                printf("The number %d is a prime number.", n);
               
              }else
              printf("The number %d is NOT a prime number.", n);
           
                c=0;  /* Every time it iterates, the c should always be cleared to zero,
                         because if you input the number the second time or even the third time,
                         the n is no longer a prime number.
                      */       
            //  }  
      printf("\n\n\n");
  }
  void activity03(){
    printf("\n\n\n");    
            int n;
            int c=0; 
            int x;
      
            //   while(true){
                  printf("\nInput a number => ");
                    scanf("%d", &n);
        
               if(n==1){
                 printf("The number %d is neither a prime or composite", n);
               }       
                    for(int j=2; j<=n;j++){            
                          for(int i=1; i<=n; i++){                           
                              x = j%i;               
                              if(x == 0){ 
                               c++;                                                       
                          }
                       }
                      if(c == 2  || c ==1  ){
                       printf("%d ", j);              
                    } 
                       c=0;  
                    }     
             //    }  
      printf("\n\n");
    }
  void semiFinal(){
    printf("\n\n\n");    
                float grade;
                float units;
                float totalUnits;
                float x;
                float y;
                float totalGrade;
                int c= 1;
                int i=1;;
                float gwa;   
                   printf("Enter 0 to calculate\n");
             while(c<2){
                  printf("Enter the grade #%d =>: ", i);
                  scanf("%f", &grade);  
                 if(grade>=1.0 && grade<=5.0)
                { 
                     printf("Enter units for grade #%d =>: ",i);
                     scanf("%f", &units);
                     printf("\n");
                         x = grade*units;
                         totalGrade += x;  
                     
                        y += units;   
                        totalUnits = y;
                        i++;
                }
                if(grade==0){ 
                   c++;
                   gwa = totalGrade/totalUnits;
                   printf("\nGWA %.2f", gwa);
                  } 
             }
     printf("\n\n");
    }
  void finalAct01(){
        printf("\n\n\n");    
            int c,v;
            char yn;
         
           do{ 
                printf("Enter 2 numbers => ");
                scanf("%d", &c);
                scanf("%d", &v);
                printf("\n");
            
               sum(c,v);
               difference(c,v);
               product(c,v);
               quotient(c,v);
               remaider(c,v);
       
                  do{ 
                printf("Try again (y/n): ");
              scanf(" %c", &yn );
            }while(yn != 'y' && yn != 'Y' && yn != 'n' && yn != 'N');         
       }while(yn == 'y' || yn == 'Y'); 
      printf("\n\n\n\n");
    }
  void finalActivity02(){
    printf("\n\n\n");    
             int x=3;       
            int y=5;   
            printf("\nThis is a classic routine to swap two variables"); 
            printf("\nbefore swap x:%d y: %d",x,y);
            swap(&x,&y);
            printf("\n after swap -> x: %d y: %d",x,y);
     printf("\n\n");
       }
  void swap(int *x, int *y){
           printf("\n\n\n");    
               int  temp = *x;
                *x = *y;
                *y = temp;
      printf("\n\n");
            }
  void activity03Arrays(){
         printf("\n\n\n");    
          int array[6];
          int total =0;
          int grade;
          int totalGrade = 0;
              printf("Enter 5 Grades\n");      
                   for(int i =0; i<5; i++){
                        printf("Enter grade%d: ", i+1 );
                        scanf("%d", &grade);
                        array[i] = grade;
                        }      
              printf("Grades are:"  );
                    for(int i=0; i<5; i++){
                           total+=array[i];
                         }
                      int c = total/5;
                      array[5] = c;      
                          for(int i=0; i<5; i++){
                          printf("%d ", array[i]);
                         }
                       printf("\nThe Average is %d", array[5]);      
                       printf("\n\n\n");      
                } 
  void workingWithArrays(){

         printf("\n\n\n");    
         int array[6];
         int total =0;
         int grade;
         int totalGrade = 0;
                   
         printf("Enter 5 Grades\n");      
               for(int i =0; i<5; i++){
                   printf("Enter grade%d: ", i+1 );
                   scanf("%d", &grade);
                        array[i] = grade;
                   }   
                   
                   printf("\nEntered grades\n");
                    for(int i=0; i<5; i++){
                         total+=array[i];
                      }
                      
                    float Average = (float) total/5;
                    array[5] = Average;      
                      for(int i=0; i<5; i++){
                         printf("%d ", array[i]);
                      }
                        
                        int n = sizeof(array)/sizeof(array[0]);

               printf("\n\nGrades sorted in acending order\n");
                for(int i=0; i<5; i++){
                     int a,b;
                    for(int j=i+1; j<5; j++){
                      if(array[i] > array[j]){                  
                         swap2(&array[i], &array[j]);
                        }
                     }
                      printf(" %d ", array[i]);
                }         
              // Finding the biggest and smallest number in the array
                  int biggest,smallest;
                     for(int i=0; i<5; i++){      
                        for(int j=1; j<5; j++){
                          if(array[i] < array[j]){
                              biggest = array[i];
                            }else 
                            biggest = array[j];
                         }
                       }                            
                   for(int i=0; i<5; i++){ 
                        int v=0;
                         if(array[v] < array[i+1]){
                            smallest = array[v];     
                       }else
                          v++;
                    }                   
                  printf("\n\nsmallest num: %d", smallest);
                  printf("\nbiggest num: %d\n", biggest);
                  printf("The Average is: %.2f\n", Average );
                  printf("\n\n\n\n");    
}
  void swap2(int *a, int *b){
    int temp = *a;
    *a = *b;
    *b = temp;
}
  void sum(int x, int y){
        int sum = x+y;
        printf("the sum of %d and %d is => %d\n", x,y,sum);   
    }
  void difference(int x, int y){
        int difference = x-y;
        printf("the difference of %d and %d is => %d\n", x,y,difference);
    }
  void product(int x, int y){
       
     int temp = 0;
      for(int i=0; i<x;i++){
         temp  +=y ;
      }
        printf("the product of %d and %d is => %d\n", x,y,temp);
    }
  void quotient(int x, int y){
        float quotient = (float)x/y;
        printf("the quotient of %d and %d is => %.2f\n", x,y,quotient);
    }
  void remaider(int x, int y){
        int remaider = x%y;
        printf("the remaider of %d and %d is => %d\n", x,y,remaider);
    }
  void FinalExam(){
     int multible[5][5]= {{1, 2, 3, 4, 5},
                          {2, 4, 6, 8, 10},
                          {3, 6, 9, 12, 15},
                          {4, 8, 12, 16, 20},
                          {5, 10, 15, 20, 25}};
  
        
        displayArray(multible);
        printf("\n\nArray has been updated\n\n");
        updateMultiTable(multible);
        displayArray(multible);
   
  } 
  void displayArray(int table[5][5]){
         printf("\n\n\n");    
         for(int i=0; i<5 ;i++){
           for(int j=0; j<5;j++){
                printf("%4d", table[i][j]);
              }
             printf("\n");
           }
          printf("\n"); 
  }
  void updateMultiTable(int table[5][5]){
       for(int i=0; i<5;i++){
         for(int j=0; j<5;j++){  
            if (table[i][j] % 3 == 0){
                      table[i][j] = 88;
                 }               
              }
           
           }
     }
  void FxngVarDclrtnsFormatting(){
     
    printf("\n\n\n");    
    
        #define Pi 3.1415936536
        #define  NameOfSchool "University of Cebu - Main"
        #define a 5
        #define  b  6
        #define  sum 1+2
         
            bool x = true;
            bool y = false;
            const char letter = 'a';
            int num = 3000000000;
            char h='H';
            char e='e';
            char l='l';
            char o='o';
            int z = 35000000;
            
            printf("Welcome to %s \n",NameOfSchool);
            printf("%d\n",sum);
            printf("%d\n",a*b);
            printf("The Boolean values of x and y are: %d %d respectively.\n", x,y);
            
            printf("Literal constant: %.2f\n",Pi);
            printf("Literal constant: %d\n",3);
            printf("The constant declared is a small letter %c\n",letter);
            printf("The value of the variable num is %u \n",num);
            printf("This number is very very long => %lu \n",1234567801234567890);
            printf("%c%c%c%c%c \n",h,e,l,l,o);
            printf("%c%c%c%c%c%c%c%c%c%c%c%c%c",103,111,111,100,32,108,117,99,107,33,32,60,51);
            
              printf("\n\n\n");    
         
  
  }