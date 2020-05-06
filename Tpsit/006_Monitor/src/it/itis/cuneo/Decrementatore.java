package it.itis.cuneo;

public class Decrementatore extends Thread {
    private Main main;
    private int num;

    public Decrementatore(Main main) {
        this.main = main;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void run()
    {
        while (main.getVal() != 0)
        {
            main.getSemaforo().unlock();
            //blocchiamo semaforo
            main.getSemaforo().lock();
            if (main.getVal() != 0)
            {
                //decrementiamo valore
                main.setVal(main.getVal()-1);
                num++;
            }
            main.getSemaforo().unlock();
            main.getSemaforo().lock();
        }
    }
}
