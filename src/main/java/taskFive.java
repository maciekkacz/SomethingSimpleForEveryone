import java.util.ArrayList;
import java.util.Collections;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.Stream;

public class taskFive {

    public static void main(String[] args) {
        boolean gameOverWhenYouEnterZero = true;
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Zaczynamy zabawę");

        while (gameOverWhenYouEnterZero) {
            System.out.println("Podaj liczbę lub wpisz 0");
            int number = input.nextInt();
            if (number == 0){
            gameOverWhenYouEnterZero = false;

            }
            list.add(number);


        }
        int size = list.size();

        System.out.println("Rozmiar " + size);

        Integer min = Collections.min(list);
        Integer max = Collections.max(list);
        Stream<Integer> stream = list.stream();
        OptionalDouble average1 = stream.mapToDouble(x -> x).average();
        Stream<Integer> stream1 = list.stream();
        s


        System.out.println("suma " + sum );
        System.out.println("Najwieksza liczba " + max);
        System.out.println("Najmniejsza liczba " + min);
        System.out.println("średnia liczba " + average1);
    }

    public static int sumNumbers(ArrayList<Integer> list){
        Integer sum = null;
        for (Integer integer : list) {
            sum = sum + integer;
        }
        return sum;
    }
}
