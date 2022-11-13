package Zad4;

public class UFO implements Flyable, Speakable{
    @Override
    public String drive() {
        return "silnik na antymaterie";
    }

    @Override
    public double distance() {
        return Math.random()*9999+99;
    }

    @Override
    public String speak() {

        return "DFEWREWs#r32FE";
    }
}
