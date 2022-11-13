package zad10;

public class Student extends Osoba{

    protected int numerGrupy;

    public Student(String nazwisko, int wiek, int numerGrupy) {
        super(nazwisko, wiek);
        this.numerGrupy=numerGrupy;
    }

    public int compareTo(Osoba o) {

        if (o.getClass() == Student.class) {
            Student s = (Student) o;
            if (this.nazwisko.compareTo(s.nazwisko) < 0)
                return -1;
            else if (this.nazwisko.compareTo(s.nazwisko) > 0)
                return 1;
            else if (this.wiek - s.wiek > 0)
                return 1;
            else if (this.wiek - s.wiek < 0)
                return -1;
            else
                return this.numerGrupy - s.numerGrupy;
        } else
          return super.compareTo(o);
    }

    @Override
    public String toString() {
        return super.toString()+" "+numerGrupy;
    }
}
