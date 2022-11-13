package Zad12;

class Referee extends Thread {

    private int time;
    private Player[] pl;

    public Referee(int time, Player[] pl)
    {
        this.time=time;
        this.pl=pl;
    }

    void startGame(){

        // start wątku arbitra
        this.start();

        for (int i = 0; i < pl.length; i++) {
            pl[i].start();
        }

    }

    // praca wątku arbitra
    public void run()
    {
        int i = 1;

        while (i <= time) {

            System.out.println("Czas"+i++);

            try {
                sleep(1000);	// Thread.sleep(...)
            }
            catch (InterruptedException e)
            {
                return;
            }

        }

        for (int j = 0; j < pl.length; j++) {
            pl[j].interrupt();
        }

    }

    void result()
    {
        for (int i = 0; i < pl.length; i++) {
            System.out.println("wynik "+pl[i].getName()+": "+pl[i].getSuma());
        }
        if (pl[0].getSuma()>pl[1].getSuma()){
            System.out.println(pl[0].getName()+" wygrał!");
        } else if (pl[0].getSuma()<pl[1].getSuma()){
            System.out.println(pl[1].getName()+" wygrał!");
        } else
            System.out.println("Remis");
    }

}
