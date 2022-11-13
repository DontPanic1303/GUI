package Zad12;

class Player extends Thread {

    private int suma=0;

    public Player(String nazwa)
    {
        super(nazwa);

    }
    // praca wątku gracza
    public void run()
    {
        while (true) {

            try {
                //losowe opóznienie czasowe
                int czas = (int)(Math.random()*2000);
                Thread.sleep(czas);
            }
            catch (InterruptedException e)
            {
                return;	// ważne w momencie przerwania działania wątku (przez inny wątek)
            }
            int k = (int) (Math.random()*100+1);
            System.out.println(this.getName()+": "+k);
            suma += k;

        }

    }

    public int getSuma() {
        return suma;
    }

}
