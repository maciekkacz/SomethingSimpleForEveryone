package ZadaniaRekrutacyjne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task1 {

    //1.  Napisać  program,  który  wczytuje  od  użytkownika  liczby,  do  momentu  aż  zostanie  podana  liczba  150.
    //Po  zakończeniu  działania  programu  wyświetlona  zostaje  informacja  o  sumie  oraz  średniej  z  wszystkich
    //podanych  liczb  (poza  150)  oraz  jak  wiele  podanych  zostało  liczb  dodatnich,  podzielnych  przez  3.
    //Przykład: 4      2     3     6     1     6   1     0 Wynik: 7          1         2

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> listNumber = new ArrayList<>();
        ArrayList<Integer> positiveNumbersAndDivisibleByThree = new ArrayList<>();
        int sum = 0;

        boolean checkNumber = true;

        while (checkNumber) {
            int exitNumber = 150;
            System.out.println("Enter any number or end the program by entering 150");
            int number = input.nextInt();
            if (number > exitNumber || number < exitNumber) {
                listNumber.add(number);
                System.out.println("A number has been added = " + number);
                sum = sum + number;
                if (number % 3 == 0 && number > 0) {
                    positiveNumbersAndDivisibleByThree.add(number);
                }
            }
            if (number == exitNumber) {
                System.out.println("the number was given as 150");
                checkNumber = false;
            }
            System.out.println(listNumber);
        }

        System.out.println("The sum of the numbers is: " + sum);
        Integer max = Collections.max(listNumber);
        System.out.println("The greatest number is: " + max);
        Integer min = Collections.min(listNumber);
        System.out.println("The smallest number is: " + min);
        System.out.println("positive number and divisible by 3 " + positiveNumbersAndDivisibleByThree);
    }
}
