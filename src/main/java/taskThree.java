import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class taskThree {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("give me a number");
        int number = input.nextInt();

        ArrayList<Integer> list = fileNumber(number);
        System.out.println(list);

        Stream<Integer> stream = list.stream();
        Object[] objects = stream.map(x -> x * x)
                .filter(x -> x % 2 == 0)
                .toArray();
        System.out.println("numbers after the change");
        System.out.println(Arrays.toString(objects));


    }
    public static ArrayList<Integer> fileNumber(int number){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= number; i++) {
            list.add(i);
        }
        return new ArrayList<>(list);
    }


}
