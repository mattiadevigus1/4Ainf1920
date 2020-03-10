package it.itis.cuneo;

import java.util.Random;

public class Carattere extends java.lang.Thread {
    public static final int MIN = 1000;
    public static final int MAX = 3000;

    private String stringa;
    private int i;

    public Carattere(String stringa, int i) {
        this.stringa = stringa;
        this.i = i;
    }

    public Carattere() {
    }

    public String getStringa() {
        return stringa;
    }

    public void setStringa(String stringa) {
        this.stringa = stringa;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Stringa{" +
                "stringa='" + stringa + '\'' +
                ", i=" + i +
                '}';
    }

    public void run()
    {
        if (i < stringa.length()) {
            Carattere carattere = new Carattere(stringa, i+1);
            carattere.start();
            try{
                carattere.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Random random = new Random();
            int delay = random.nextInt((MAX - MIN) + 1) + MIN;
            try {
                sleep(delay);
                Thread.delaytot += delay;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("'" + stringa.charAt(i)  + "' " + "Ritardo: " + delay + "ms");
        }
    }

}
