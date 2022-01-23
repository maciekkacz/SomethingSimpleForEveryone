import java.util.Scanner;

public class taskFour {
    private static Scanner input = new Scanner(System.in);
    private static int sum;

    public static void main(String[] args) {
        System.out.println("You are ready to start the summation game");
        boolean gameOverWhenYouEnterZero = true;


        while (gameOverWhenYouEnterZero){
            System.out.println("give me a number");
            int userNumber = input.nextInt();
            sum = sum + userNumber;
            if (userNumber == 0) {
                gameOverWhenYouEnterZero = false;
            }
        }
        System.out.println("the sum given is " + sum);

    }


}
