package Zad5;

public class Prostokat extends Figura{

    private int a;
    private int b;

    public Prostokat(int x, int y, int a, int b){
        super(x,y);
        this.a=a;
        this.b=b;
    }

    @Override
    String nazwa() {
        return "prostokat";
    }

    @Override
    void pozycja(int aa, int bb) {
            if (((aa>=x)&&(aa<=x+a))&&((bb<=y)&&(bb>=y-b)))
        System.out.println("Punkt ("+aa+","+bb+") znajduje się wewnątrz prostokąta");
            else
        System.out.println("Punkt ("+aa+","+bb+") nie znajduje się wewnątrz prostokąta");

    }

    public String toString(){
        return "Prostokąt\n"+"Lewy górny - ("+x+","+y+")\n"+"Szerokość: "+a+", Wysokość: "+b+"\n";
    }
}
