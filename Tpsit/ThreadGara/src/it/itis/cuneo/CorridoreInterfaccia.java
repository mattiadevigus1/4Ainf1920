package it.itis.cuneo;

/**
 * Created by inf.devigusm0708 on 30/01/2020.
 */
public class CorridoreInterfaccia extends Thread {
    public static final int MIN = 0;
    public static final int MAX = 2;
    public static final int ARRIVO = 10;
    public static final int DELAYMAX = 1000 ;
    public static final int DELAYMIN = 1000 ;
    private String nome;
    private int num;
    private int sum;

    public Corridore(String nome, int num) {
        this.nome = nome;
        this.num = num;
    }

    public static int getMIN() {
        return MIN;
    }

    public static int getMAX() {
        return MAX;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void run() {
        int r = 0;
        int delay = 0;

        while (this.num <= ARRIVO)
        {
            delay = (int) Math.round(Math.random() * DELAYMAX - DELAYMIN);
            try{
                this.sleep(delay);}
            catch (InterruptedException e) {
                e.printStackTrace();
            }

            r+=  (int) Math.round(Math.random() * (MAX-MIN) + MIN);
            this.sum += r;
            System.out.println(this.nome + "-" + r + "-" + this.sum + "-" + "Dopo" + delay);
        }

        System.out.println(nome + "HA TERMINATO");

    }



}