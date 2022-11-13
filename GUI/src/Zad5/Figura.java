package Zad5;

public abstract class Figura {
    protected int x;
    protected int y;

    public Figura(int x, int y){
        this.x=x;
        this.y=y;
    }

    abstract String nazwa();
    abstract void pozycja(int a, int b);
    public String toString(){
        return nazwa()+" o srodku"+x+" "+y;
    }
}
