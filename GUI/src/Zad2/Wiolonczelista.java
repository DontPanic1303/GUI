package Zad2;

public class Wiolonczelista extends Muzyk{

    public Wiolonczelista(String imie, double czas){
        super(imie,czas);


    }

    @Override
    protected String instrument() {
        return "wiolonczela";
    }

    @Override
    protected int stawka() {
        return 250;
    }



}
