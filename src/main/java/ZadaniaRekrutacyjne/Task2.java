package ZadaniaRekrutacyjne;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Task2 {

    /*
    2. Napisać  program,  który  wczytuje  od  użytkownika  liczby  dopóty,  dopóki  nie  zostanie  podana  liczba
    mniejsza  od  1.  Następnie  dokonuje  losowania  tylu  liczb,  ile  wynosiła  maksymalna  z  wartości  podanych
    przez użytkownika.  Zakres  losowanych  liczb,  to  -199  do  199.  W  wyniku  powinien  zostać  wyświetlony
    stosunek średniej  arytmetycznej  wszystkich  „co  drugich"  wylosowanych  liczb  dodatnich  do  wszystkich  co
    trzecich wylosowanych  liczb  (można  zacząć  od  dowolnego  momentu,  ale  nie  później  niż  od  2  i  3  z
    podanych  liczb). W programie  nie  należy  używać  tablic. Przykład  podany  przez  użytkownika: 4  2 -5 Wylosowane
    liczby: 3  -12  22 5 Wynik: 0,227          //  bo  5  /  22

    */

    public static void main(String[] args) {

        ArrayList<Integer> listNumbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        Random generation = new Random();
        boolean checkingTheCondition = true;

        while (checkingTheCondition) {
            System.out.println("Podaj liczbę ");
            int number = input.nextInt();
            listNumbers.add(number);
            if (number < 1){
                checkingTheCondition = false;
            }
        }
        Integer max = Collections.max(listNumbers);
        List<Integer> integers = new ArrayList<>();

        for (Integer i = 0; i < max; i++) {
            int rangeOfNumbers = generation.nextInt(199)-199;
            integers.add(rangeOfNumbers);
        }


        for (Integer integer : integers) {
            System.out.print(integer + ", ");
        }

    }
}
