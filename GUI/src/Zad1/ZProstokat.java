package Zad1;

public class ZProstokat {

    private int szerokosc;
    private int wysokosc;

    private char border;
    private char wnetrzne;

    private static int nrP =1;
    private static int nrK =1;

    private int nrProstokatu;
    private int nrKwadratu;

    private String figura;

    public ZProstokat(int szerokosc, int wysokosc, char wnetrzne, char border){
        this.szerokosc=szerokosc;
        this.wysokosc=wysokosc;
        this.border=border;
        this.wnetrzne=wnetrzne;

        if (szerokosc == wysokosc) {
            nrKwadratu = nrK++;
            figura = "Kwadrat ("+nrKwadratu+")";
        } else {
            nrProstokatu = nrP++;
            figura = "Prostokąt ("+nrProstokatu+")";
        }
    }
    public ZProstokat(int szerokosc, char border, char wnetrzne){
        this(szerokosc,szerokosc,border,wnetrzne);
    }

    public void rysuj() throws ZProstokatException{


        if (((wysokosc==1||szerokosc==1)&&( border != wnetrzne))
                ||((wysokosc<0)||(szerokosc<0))) {
            System.out.println(figura+" rozmiaru "+ szerokosc+" x "+wysokosc);
            throw new ZProstokatException("Błędny prostokąt!");
        }

//        int b = 0;
//        int w = 0;
//
//        for (int i = 1; i <= wysokosc; i++) {
//            for (int j = 1; j <= szerokosc; j++) {
//                if (((i == 1)||(i==wysokosc))||((j==1)||(j==szerokosc)))
//                    b++;
//                else
//                    w++;
//            }
//        }

        int w =(wysokosc-2)*(szerokosc-2);
        int b = wysokosc*szerokosc-w;

        System.out.println(figura+" rozmiaru "+ szerokosc+" x "+wysokosc+
                ", "+wnetrzne+"="+w+", "+border+"="+b);

        for (int i = 1; i <= wysokosc; i++) {
            for (int j = 1; j <= szerokosc; j++) {
               if (((i == 1)||(i==wysokosc))||((j==1)||(j==szerokosc)))
                    System.out.print(border);
               else
                    System.out.print(wnetrzne);
            }
            System.out.println();
        }
        System.out.println();
    }

}
