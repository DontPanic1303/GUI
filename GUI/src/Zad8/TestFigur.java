package Zad8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class TestFigur {

    public static void main(String[] args) {

        // lista figur
        // https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
        List<Figura> listaFig = new ArrayList<Figura>();

        // dodawanie figur do listy figur za pomoca metody add z List
        // ...
        listaFig.add(new Prostokat(1,1,4,9));
        listaFig.add(new Kolo(1,1,5));
        listaFig.add(new Prostokat(2,2,6,6));
        // ...

        System.out.println("Figury przed sortowaniem:");
        System.out.println();

        for (Figura f: listaFig)
             System.out.println(f);

            // sortowanie listy figur
         Collections.sort(listaFig);


        System.out.println("Figury po sortowaniu:");
        System.out.println();

        for (Figura f: listaFig)
            System.out.println(f);
        // ...

    }
}
