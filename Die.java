import java.util.Random; // To use the Random class for random number generation

public class Die{


  public static int roll() {
    Random rand = new Random();
    int num = rand.nextInt(6); 
    num = num + 1; 
    return num;
  }

  public static void main (String [] args) {
  
    int die1 = roll();
    int die2 = roll();
    
    System.out.println("You rolled a "+ die1 +" and a "+ die2+ ".");

  }
}