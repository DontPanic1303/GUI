package Zad4;

public class Plane implements Flyable{


    @Override
    public String drive() {
        return "silnik";
    }

    @Override
    public double distance() {
        return Math.random()*1000000;
    }
}
