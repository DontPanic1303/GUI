package Zad14;

class Producer implements Runnable {

    private Buffer buff;

    public Producer(Buffer b) {
        this.buff=b;
    }

    @Override
    public void run() {
        while (true){
            try {
                buff.put((int) (Math.random()*100));
                Thread.sleep((int) (Math.random()*2000));
            } catch (InterruptedException e) {
                return;
            }
        }
    }


}
