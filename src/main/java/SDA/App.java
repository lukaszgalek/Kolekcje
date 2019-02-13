package SDA;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(4);
        lista.add(2);
        lista.add(10);
        lista.add(8);
        lista.add(6);


    Metody.zadanie1(lista);
        System.out.println();
        System.out.println(Metody.zadanie3(lista));

        List<String> lS = new ArrayList<String>( );
        lS.add("Aldona");
        lS.add("abcedee");
        lS.add("Ala");
        lS.add("Alaa");

Metody.zadanie4(lS);
        System.out.println(Metody.zadanie5(lS));
    }
}
