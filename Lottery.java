// Kristopher Smith
import java.util.Scanner; //Import scanner 

public class Lottery {

    public static void main (String[] args) {
        // Generate a lottery
        int lottery = (int)(Math.random() * 1000);
        try (// Enter guess
        Scanner input = new Scanner(System.in)) {
            System.out.print("Enter your lottery pick (three digits):");
            int guess = input.nextInt();

            // Lottery digits
            int lotteryDigit1 = lottery / 100;
            int lotteryDigit2 = (lottery % 100) / 10;
            int lotteryDigit3 = lottery % 10;

            // Guess digits
            int guessDigit1 = guess / 100;
            int guessDigit2 = (guess % 100) / 10;
            int guessDigit3 = guess % 10;

            System.out.println("The lottery number is " + lotteryDigit1
                    + lotteryDigit2 + lotteryDigit3);

            // Check the guess
            if (guess == lottery) {
                System.out.println("Exact match: you win $1,000,000");
            } else if ((guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit3)
                    || (guessDigit1 == lotteryDigit2
                    && guessDigit1 == lotteryDigit3 && guessDigit3 == lotteryDigit1)
                    || (guessDigit1 == lotteryDigit3
                    && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit2)
                    || (guessDigit1 == lotteryDigit3
                    && guessDigit2 == lotteryDigit2 && guessDigit3 == lotteryDigit1)
                    || (guessDigit1 == lotteryDigit1
                    && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit2)) {
                System.out.println("Match all digits: you win $1,000");
            } else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2
                    || guessDigit1 == lotteryDigit3 || guessDigit2 == lotteryDigit1
                    || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3
                    || guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2
                    || guessDigit3 == lotteryDigit3) {
                System.out.println("Match one digit: you win $10");
            } else {
                System.out.println("Sorry, no match");
            }
        }
    }
    }