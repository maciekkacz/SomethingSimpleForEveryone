import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class OddNumbers {
    private static Scanner input = new  Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give number");
        int userNumbers = input.nextInt();
        int[] numberList = new int[userNumbers];

        for (int i = 0; i < userNumbers; i++) {
            numberList[i] = i+1;
        }

        for (int i = 0; i < numberList.length; i++) {
            if (numberList[i] % 2 != 0){
                System.out.print(numberList[i] + ", ");
            }
        }
    }
}
