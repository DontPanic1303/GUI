package Zad4;

public class Virus implements Flyable{
    @Override
    public String drive() {
        return "powietrze";
    }

    @Override
    public double distance() {
        return Math.random();
    }
}
