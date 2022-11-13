package Zad2;

abstract class Muzyk {

    private String imie;
    private double czas;


    protected Muzyk(String imie, double czas) {
       this.imie=imie;
       this.czas=czas;
    }


    protected String imie() {
       return imie;
    }


    protected double czas() {
       return czas;
    }


    abstract protected String instrument();
    abstract protected int stawka();


    public String toString() {
      return imie+", czas = "+czas+" godz., stwaka = " +stawka();
    }


    public static Muzyk maxHonorarium(Muzyk[] muzycy)
    {
        int kto=0;
        double cena=muzycy[0].czas*muzycy[0].stawka();

        for (int i = 1; i < muzycy.length; i++) {
            if (muzycy[i].czas*muzycy[i].stawka()>cena){
                cena = muzycy[i].czas*muzycy[i].stawka();
                kto = i;
            }
        }

       return muzycy[kto];
    }

}
