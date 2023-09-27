import java.util.Scanner;

class FantasyGame {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String charterName;
    int strength,health,luck,total;
    
    System.out.print("Welcome to Yertle's Quest\n");
    System.out.print("Enter the name of your character:");
    charterName = sc.nextLine();
    System.out.print("Enter strength (1-10): ");
    strength = sc.nextInt();
    System.out.print("Enter health (1-10): ");
    health = sc.nextInt();
    System.out.print("Enter luck (1-10): ");
    luck = sc.nextInt();

    total = strength + health + luck;
    
    if(total>15){
      strength =5;
      health =5;
      luck = 5;
      System.out.println("You have give your character too many points! \nDefault values have been assigned: "+charterName+ ", strength: "+strength+", health: "+health+", luck: "+ luck);
    }else{
          System.out.println("\n" +charterName+ "\nstrength: "+strength+"\nhealth: "+health+"\nluck: " + luck);
    }
  }
}