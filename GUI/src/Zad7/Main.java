package Zad7;

import Zad8.Figura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {

        List<Spiewak> listaFig = new ArrayList<Spiewak>();

        listaFig.add(new Spiewak("Darrey"){
            public String spiewaj(){
                return "eeae";
            }
        });

        listaFig.add(new Spiewak("Darrey"){
            public String spiewaj(){
                return "bebe";
            }
        });

        listaFig.add(new Spiewak("Houston"){
            public String spiewaj(){
                return "a4iBBiii";
            }
        });

        listaFig.add(new Spiewak("Carrey"){
            public String spiewaj(){
                return "oaooooooooooo";
            }
        });

        listaFig.add(new Spiewak("Madonna"){
            public String spiewaj(){
                return "aAa";
            }
        });

        Collections.sort(listaFig);

        for (Spiewak s : listaFig)
            System.out.println(s);

    }
}
