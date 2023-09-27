import java.util.Random;

class Main {
  public static void main(String[] args) {

    Random random =  new Random();

    String firstName,lastname;
    int first  = random.nextInt(10)+1;
    int second  = random.nextInt(10)+1;
 
    switch(first){
        case 1:firstName = "Adolf";
              break;
        case 2:firstName = "Edrian";
              break;
        case 3:firstName = "Evan";
              break;
        case 4: firstName = "James";
              break;
         case 5: firstName = "Harvie";
              break;
         case 6: firstName = "Lee ";
              break;
         case 7: firstName = "Rustum ";
              break;
         case 8: firstName = "Xavier ";
              break;
         case 9: firstName = "Sergekeneth";
              break;
         case 20: firstName = "Edriane ";
              break;
         default:firstName = "Unknown"; 
             break;     
    }
    
    switch(second){
        case 1: lastname = "Hitler";
             break;
        case 2: lastname = "Sangco";
             break;
        case 3:lastname = "Batac";
             break;
         case 4: lastname = "Galvez";
             break;
         case 5: lastname = "Purgatorio";
             break;
         case 6: lastname = "Manlosa ";
             break;
         case 7: lastname = "Domingo ";
             break;
         case 8: lastname = "Halasan ";
             break;
         case 9: lastname = "Lim";
             break;
         case 20:lastname = "Diaz ";
       
         default:lastname = "Unknown";
             break;     
    }
         System.out.println(firstName +" "+ lastname);
   
  }
}