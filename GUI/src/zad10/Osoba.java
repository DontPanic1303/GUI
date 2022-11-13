package zad10;

public class Osoba implements Comparable<Osoba>{

    protected String nazwisko;
    protected int wiek;

    public Osoba(String nazwisko, int wiek){
        this.nazwisko=nazwisko;
        this.wiek=wiek;
    }

    public int compareTo(Osoba o) {
        if (this.nazwisko.compareTo(o.nazwisko)<0)
            return -1;
        else if (this.nazwisko.compareTo(o.nazwisko)>0)
            return 1;
        else
            return this.wiek - o.wiek;
    }

    @Override
    public String toString() {
        return nazwisko + " " + wiek;
    }
}
