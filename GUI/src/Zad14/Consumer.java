package Zad14;

class Consumer implements Runnable {

    private Buffer buff;

    // konstruktor
    public Consumer(Buffer b) {
        this.buff=b;
    }

    @Override
    public void run() {
        while (true){
            try {
                System.out.println("Consumer wyklada "+buff.get());
                Thread.sleep((int) (Math.random()*2000));
            } catch (InterruptedException e) {
                return;
            }
        }
    }

}
