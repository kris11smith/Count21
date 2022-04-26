// Kris Smith
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Count21 {

public static void main(String[] args) {

    try (Scanner scan = new Scanner(System.in)) {
    }

    int x = 5; //running total
    int y = 2; //input num
    String strInput = "";
    do {
        strInput = JOptionPane.showInputDialog(null, "Welcome to Count 21. \n In this game you will play against "
            + "the computer and add the numbers 1, 2, or 3 together. \n Whoever pushes the "
            + "numbers over 21 loses. \n Do you want to add 1, 2, or 3? ");
        y = Integer.parseInt(strInput);
        x+=y; 

        if (y == 1) {JOptionPane.showMessageDialog(null, "You chose the number 1."
            + " 1 will be added to the running total of" + (x + 1) +" .");
        }
        else if (y == 2) {JOptionPane.showMessageDialog (null, "You chose the number 2."
           + "2 will be added to the running total of" + (x + 2) + " .");
        }
        else if (y == 3) {JOptionPane.showMessageDialog (null, "You chose the number 3."
            + "3 will be added to the running total of" + (x + 3) + " .");
        }
        else{ 
            JOptionPane.showMessageDialog(null, "You didn't type a valid number, please try again. \n");
       }
    } while (x < 21);
}
}
