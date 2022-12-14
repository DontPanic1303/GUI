package Zad1;

public class ZProstokatTest {
    public static void main(String[] args) {

        ZProstokat zp[] = {
                new ZProstokat(4, 'a', 'e'),        // konstruktor z 3 parametrami
                new ZProstokat(5, 3 , '*', '+'),   // konstruktor z 4 parametrami
                new ZProstokat(1, 2, 'a','a'),
                new ZProstokat(3, 3, '+', 'x'),
                new ZProstokat(1, 2, 'x', 'y'),
                new ZProstokat(3, 4, '^', '$')
        };

        for (ZProstokat z : zp)
            try {
                z.rysuj();
            } catch(ZProstokatException e) {
                System.out.println(e.getMessage());
            }
    }
}
