package Zad3;

public class Main {
    public static void main(String[] args)
    {
        Spiewak s1 = new Spiewak("Dietrich"){
            public String spiewaj(){
                return "oooooooooooo";
            }
        };

        Spiewak s2 = new Spiewak("Piaf"){
            public String spiewaj(){
                return "a4iBBiii";
            }
        };

        Spiewak s3 = new Spiewak("Adele"){
            public String spiewaj(){
                return "aAa";
            }
        };

        Spiewak sp[] = {s1, s2, s3};

        for (Spiewak s : sp)
            System.out.println(s);

        System.out.println("\n" + Spiewak.najglosniej(sp));
    }
}
