import java.util.Random;
import java.util.Scanner;

public class sixTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random gen = new Random();
        int attempt = 0;
        int aim = 0;
        int aDrawnNumber = gen.nextInt(101);
        System.out.println("Randomizes a number between 0 and 100 ");
        while (aim != aDrawnNumber) {
            System.out.println("Guess what number it is: ");
            aim = input.nextInt();
            attempt++;
            if (aim < aDrawnNumber) {
                System.out.println
                        ("Unfortunately, that's not enough. Enter a larger number");
            } else if (aim > aDrawnNumber) {
                System.out.println
                        ("The number given is too much. Enter a smaller number");
            } else if (aim == aDrawnNumber) {
                System.out.println
                        ("Bravo! You guessed it in the test: " + attempt);
            }
        }
    }
}