package Zad6;

public class Kolo2 extends Kolo implements Transformacja{

    private int hx;
    private int hy;

    public Kolo2(int x, int y, int r){
        super(x,y,r);
    }

    @Override
    public void przesunDo(int x, int y) {
        hx=this.x;
        this.x=x;
        hy=this.y;
        this.y=y;
    }

    @Override
    public void powrot() {
        x=hx;
        y=hy;
    }
}
