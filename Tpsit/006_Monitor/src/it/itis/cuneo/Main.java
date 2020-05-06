package it.itis.cuneo;

public class Main {
    public static final int NUM = 20;
    private Semaforo semaforo;
    private int val;

    public Main()
    {
        semaforo = new Semaforo();
        val = NUM;
    }

    public Semaforo getSemaforo() {
        return semaforo;
    }

    public void setSemaforo(Semaforo semaforo) {
        this.semaforo = semaforo;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public static void main(String[] args) {
        Main main = new Main();

        Decrementatore th1 = new Decrementatore(main);
        Decrementatore th2 = new Decrementatore(main);
        Decrementatore th3 = new Decrementatore(main);

        th1.start();
        th2.start();
        th3.start();
        try {
        th1.join();
        th2.join();
        th3.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Prova:" + th1.getNum() + " " + th2.getNum() + " " +  th3.getNum() + " ");
    }
}
