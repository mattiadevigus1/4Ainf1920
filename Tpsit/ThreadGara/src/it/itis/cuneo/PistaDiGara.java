package it.itis.cuneo;

/**
 * Created by inf.devigusm0708 on 30/01/2020.
 */
public class PistaDiGara {
    public static void main(String[] args) {
        Corridore corridore1 = new Corridore("Alex" , 1);
        Corridore corridore2 = new Corridore("Bernardo" , 2);

        corridore1.start();
        corridore2.start();
    }

}
