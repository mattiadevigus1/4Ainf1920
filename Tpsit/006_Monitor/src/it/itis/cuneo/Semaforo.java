package it.itis.cuneo;

public class Semaforo {
    public int num ;

    public Semaforo(int num) {
        this.num = 0;
    }

    public Semaforo() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public synchronized void lock()
    {
        while (num == 0)
        {
               try
               {
                   wait();
               } catch (InterruptedException e)
               {
                   e.printStackTrace();
               }
        }
        num--;
    }

    public synchronized void unlock()
    {
        num++;
        notify();
    }
}
