package Zad2;

public class Skrzypek extends Muzyk{

    public Skrzypek(String imie, double czas){
        super(imie,czas);
    }

    @Override
    protected String instrument() {
        return "skrzypce";
    }

    @Override
    protected int stawka() {
        return 200;
    }


}
