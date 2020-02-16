package it.itis.cuneo;

package it.itis.cuneo;

public class Espressione {

    public static final int t = 5;
    public static final int j = 4;


    public static void main(String[] args) {

        Buffer c1 = new Buffer();
        Buffer c2 = new Buffer();

        c1.setA(t);
        c1.setB(6);
        c1.setC(j);

        c2.setA(t);
        c2.setB(2);
        c2.setC(j);

        System.out.println(c1.toString());
        System.out.println(c2.toString());


        Moltiplicazione th1 = new Moltiplicazione(c1);
        Moltiplicazione th3 = new Moltiplicazione(c2);
        Somma th2 = new Somma(c1);
        Somma th4 = new Somma(c2);
        Moltiplicazione th5 = new Moltiplicazione(c1, c2);


        th1.start();
        th3.start();

        try {
            th1.join();
            th3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        th2.start();
        th4.start();
        try {
            th2.join();
            th4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        th5.start();
        try {
            th5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(c1.getZ());


    }
}