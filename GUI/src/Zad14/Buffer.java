package Zad14;

public class Buffer {
    private int[] tab;
    private boolean stan;
    private int l;
    private boolean pg = false;
    public Buffer(int k){
        tab = new int[k];
        l = 0;
    }

    public synchronized void put(int n) throws InterruptedException{

        while (pg){
            wait();
        }

        if (l+1!=tab.length) {
            tab[l++] = n;
            System.out.println("Producer wkłada "+n);
        }
        if (l==tab.length-1)
            pg=true;

        notify();

    }

    public synchronized int get() throws InterruptedException{

        while (!pg){
            wait();
        }


            int tmp = tab[0];
            for (int i = 0; i < l - 1; i++) {
                tab[i] = tab[i + 1];
            }
            if (l>0)
            l--;

        if (l==0)
            pg=false;

            notify();
            return tmp;

    }

}
