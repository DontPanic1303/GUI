package Zad2;

public class Flecista extends Muzyk{

    public Flecista(String imie, double czas){
        super(imie,czas);
    }

    @Override
    protected String instrument() {
        return "flet";
    }

    @Override
    protected int stawka() {
        return 300;
    }

}
