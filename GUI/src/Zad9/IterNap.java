package Zad9;

import java.util.Iterator;
import java.util.function.Consumer;


public class IterNap implements java.lang.Iterable<Character> {

    private String a;
    private int poczatek;
    private int coIle;

    public IterNap(String  a){
       this.a=a;
       this.poczatek=0;
       this.coIle=1;
    }


    public void ustawPoczatek (int b){
        poczatek=b;
    }

    public void ustawKrok(int c){
        coIle=c;
    }

    @Override
    public void forEach(Consumer action) {

        Iterable.super.forEach(action);
    }

    public Iterator<Character> iterator(){
        return new Iterator<Character>() {
            int i = poczatek;
            @Override
            public boolean hasNext() {
                return i < a.length();
            }
            @Override
            public Character next() {
                int ktory = i;
                i +=coIle;
                return a.charAt(ktory);
            }
        };

    }
}
