import javax.swing.JOptionPane; //Import package 
public class RandomGuess {
    public static void main(String[] args) {

        // First Dialog
        JOptionPane.showMessageDialog(null, "Think of a number between 1 and 10");
        //Second Dialog
        JOptionPane.showMessageDialog(null, "The correct number is:" + (1 +(int)(Math.random() * 10 )));
    }   
}
