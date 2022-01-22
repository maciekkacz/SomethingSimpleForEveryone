import java.util.Scanner;

public class threeLoops {
    private static int numberOne;
    private static int numberTwo;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        numberOne = input.nextInt();
        System.out.println("the second number must be greater than the first");
        System.out.println("Enter the second number");
        numberTwo = input.nextInt();
        System.out.println("loop while");
        while1(numberOne,numberTwo);
        System.out.println("loop fori");
        fori(numberOne,numberTwo);

    }
    public static void fori(int numberOne, int numberTwo) {
        int sum1 = 0;
        for (int i = numberOne; i <= numberTwo; i++) {
            sum1 = sum1 + numberOne++;
        }
        System.out.println(sum1);
    }
    public static void while1(int numberOne, int numberTwo){
        int sum = 0;
        while (numberOne<=numberTwo){
            sum = sum + numberOne;
            numberOne++;
        }
        System.out.println(sum);
    }

}
