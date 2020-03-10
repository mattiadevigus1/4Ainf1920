/*
    Autore: Mattia Devigus
    Data: 10/03/2020
 */


package it.itis.cuneo;

public class Thread{
    public static final String stringa = "prova" ;
    public static int delaytot = 0;

    public static void main(String[] args) {
        long time = System.nanoTime();
        Carattere carattere = new Carattere(stringa, 0);
        carattere.start();
        try {
            carattere.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
