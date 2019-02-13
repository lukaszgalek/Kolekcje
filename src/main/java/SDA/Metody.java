package SDA;

import java.util.List;

public class Metody {


    public static void zadanie1 (List<Integer> lista){
for(int i : lista){
    System.out.println(i );
}
    }
    public static void zadanie2 (List<Integer> lista){
        for(int i : lista){
            System.out.println(i+ " index: " + lista.indexOf(i) );
        }
    }

    public static int zadanie3 (List<Integer> lista){
        int wynik=0;
        for(int i : lista){
            wynik+=i;

        }return wynik/lista.size();
    }

    public static void zadanie4 (List<String>lista) {
        String szukana = "abc";
        for (int i = 0; i <= lista.size() - 1; i++) {
            String przeszukana = lista.get(i).substring(0, 3);
            if (przeszukana.equals(szukana)) {
                System.out.println(lista.get(i));
            }
        }
    }
        public static int zadanie5 ( List<String>lista){
        int count = 0;
        for( int i = 0; i<= lista.size()-1; i++){
          String temp =   lista.get(i);
          int ilosc = temp.length();
          if ( ilosc%2==0 ){
              ++count;
          }

          }return count;
    }
}
