import java.util.Random;
import java.util.Scanner;

class MagicBall{

    public static void main(String[] args)
{
    String[] responses = {"Without a doubt", "Yes definitely", "You can count on it.",
        "For sure!", "Ask me later.", "I'm not sure.", "I can't tell you right now",
        "I'll tell you after my nap.", "No way!", "I don't think so.",
        "Without a doubt, no.", "The answer is clearly No."};

    try (Scanner in = new Scanner(System.in)) {
        Random random = new Random();
        while (true) {
            System.out.print("Enter another question or zzz to quit >>");
            String question = in.nextLine();
            if (question.equalsIgnoreCase("zzz"))
                break;
            System.out.println("Magic 8 ball says:" + responses[random.nextInt(responses.length)]);
        }
    }
}
}