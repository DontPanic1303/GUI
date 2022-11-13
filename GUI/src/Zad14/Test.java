package Zad14;

public class Test {
    public static void main(String[] args) {

        // ...

        Buffer buffer = new Buffer(10);
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        Thread watek = new Thread(producer);
        Thread watek2 = new Thread(consumer);
        watek.start();
        watek2.start();

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            watek.interrupt();
            watek2.interrupt();
        }

    }
}
