package Zad4;

public class Bird implements Flyable, Speakable{


    @Override
    public String drive() {
        return "miesnie";
    }

    @Override
    public double distance() {
        return Math.random()*100;
    }

    @Override
    public String speak() {

        return "DFDSUHFLIKDFL34254D";
    }
}
