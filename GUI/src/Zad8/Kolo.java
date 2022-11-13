package Zad8;

public class Kolo extends Figura{

    private int r;

    public Kolo(int x, int y, int r){
        super(x,y);
        this.r=r;
    }

    @Override
    String nazwa() {
        return "kolo";
    }

    @Override
    void pozycja(int a, int b) {
        if (Math.sqrt((Math.pow(x-a,2)+Math.pow(y-b,2)))<r)
            System.out.println("Punkt ("+a+","+b+") znajduje się wewnątrz koła");
        else
        System.out.println("Punkt ("+a+","+b+") nie znajduje się wewnątrz koła");
    }
    public String toString(){
        return "Koło\nSrodek - ("+x+","+y+")\nPromień - "+r+"\n";
    }

    @Override
    public double pole() {
        return Math.PI*r*r;
    }

    @Override
    public double obwod() {
        return Math.PI*r*2;
    }

}
