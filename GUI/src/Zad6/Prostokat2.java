package Zad6;

public class Prostokat2 extends Prostokat implements Rysowanie{

    private char tusz;

    public Prostokat2(int x, int y, int a, int b, char tusz){
        super(x,y,a,b);
        this.tusz=tusz;
    }

    @Override
    public void rysuj() {
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(tusz);
            }
            System.out.println();
        }
    }
}
