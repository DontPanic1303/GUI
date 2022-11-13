package Zad13;

public class StringTask implements Runnable{

    private String napis;
    private int lPowielenie;
    private boolean done = false;
    private TaskState stan = TaskState.CREATED;
    private Thread watek;
    private boolean ab = true;

    public StringTask(String napis, int lPowielenie) {
        this.napis=napis;
        this.lPowielenie=lPowielenie;
    }

    public enum TaskState{
        CREATED,RUNNING,ABORTED,READY;
    }


    public boolean isDone() {
        return done;
    }

    public String getResult() {
        return napis;
    }

    public String getTxt() {
        return napis;
    }

    public void run() {
        stan = TaskState.RUNNING;

        String nap = "";

        for (int i = napis.length() -1 ; i >= 0; i--) {
            nap +=napis.charAt(i);
        }
        napis = nap;
        int i = 0;
        while (i<lPowielenie-1 && ab)
         {
            napis +=nap;
            i++;
        }
        if (ab)
            stan=TaskState.READY;
        else
            stan=TaskState.ABORTED;

        done = true;
    }

    public TaskState getState(){
        return stan;
    }

    public void start(){
        watek = new Thread(this);
        watek.start();
    }

    public void abort(){
        ab=false;
    }


}
