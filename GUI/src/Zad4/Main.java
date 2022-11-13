package Zad4;

public class Main {
    public static void main(String[] arg) {
        Bird ptak = new Bird();
        Plane samolot = new Plane();
        UFO ufo = new UFO();
        Virus virus = new Virus();

        Flyable[] flyables = { ptak, samolot, ufo,  virus};
        Speakable[] speakables = { ptak, ufo,};

        for (int i = 0; i < flyables.length; i++) {
            System.out.println( flyables[i].getClass().getName());
            System.out.println(flyables[i].distance());
        }
        System.out.println();
        System.out.println("najkrutsza odleglosc");
        System.out.println(dystans(flyables).getClass().getName());
        System.out.println();

        for (int i = 0; i < speakables.length; i++) {
            System.out.println( speakables[i].getClass().getName());
            System.out.println( speakables[i].speak());
        }
        System.out.println();
        System.out.println("najglosniejszy");
        System.out.println(najglosniejszy(speakables).getClass().getName());

    }

    public static Flyable dystans(Flyable[] flyables){
        int index = 0;
        double dystans = flyables[0].distance();
        for (int i = 1; i < flyables.length; i++) {
            if (flyables[index].distance()>flyables[i].distance()){
                index = i;
                dystans = flyables[i].distance();
            }
        }
        return flyables[index];
    }

    public static Speakable najglosniejszy(Speakable[] speakables){

        int indeks =0;
        int najwiecej=speakables[0].speak().length();

        for (int i = 1; i < speakables.length; i++) {
            int najwiecej2=speakables[i].speak().length();
            if (najwiecej2>najwiecej){
                najwiecej = najwiecej2;
                indeks = i;
            }

        }

        return speakables[indeks];
    }
}

