package Zad3;

abstract class Spiewak {

    private String nazwisko;
    private int numer;
    private static int numerStartowy =0;

    protected Spiewak(String nazwisko){
        this.nazwisko=nazwisko;
        this.numer=++numerStartowy;
    }

    abstract String spiewaj();

    public String toString(){
        return "("+numer+")"+" "+nazwisko+": "+spiewaj();
    }

    public static Spiewak najglosniej(Spiewak[] spiewak){
        int indeks =0;
        int najwiecej=0;

        for (int i = 0; i < spiewak.length; i++) {
            char[] spiew = spiewak[i].spiewaj().toCharArray();

            int ileRazy=0;

            for (int j = 0; j < spiew.length; j++) {

                if (Character.isLetter(spiew[j])){
                   ileRazy++;

                    for (int k = j+1; k < spiew.length; k++) {

                        if (Character.toLowerCase(spiew[j])==Character.toLowerCase(spiew[k]))
                            spiew[k]=0;

                    }
                }
            }

            if (ileRazy>najwiecej){
                najwiecej = ileRazy;
                indeks = i;
            }

        }

        return spiewak[indeks];
    }


}
