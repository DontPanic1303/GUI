package Zad8;

public abstract class Figura implements Obliczenie, Comparable<Figura> {
    protected int x;
    protected int y;
    static int kolejnosc =0;
    protected int ktory;

    public Figura(int x, int y){
        this.x=x;
        this.y=y;
        this.ktory=kolejnosc++;
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

    public int compareTo(Figura f){

        if (this.pole() - f.pole() < 0)
            return -1;	// < 0
        else if (this.pole() - f.pole() > 0)
            return 1; 	// > 0
        else if (this.obwod() - f.obwod() < 0)
            return -1;
        else if (this.obwod() - f.obwod() > 0)
            return 1;
        else
            return this.ktory - f.ktory;

    }
}
