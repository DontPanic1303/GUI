package Zad6;

public abstract class Figura implements Obliczenie {
    protected int x;
    protected int y;

    public Figura(int x, int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public double pole() {
        return 0;
    }

    @Override
    public double obwod() {
        return 0;
    }

    abstract String nazwa();
    abstract void pozycja(int a, int b);
    public String toString(){
        return nazwa()+" o srodku"+x+" "+y;
    }
}
