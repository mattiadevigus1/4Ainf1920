public class Dindondan {
    public static void main(String[] args) {
        Runnable cam1 = new Campana("din" , 5);
        Thread thr1 = new Thread(cam1);
        thr1.start();

        Thread thr2 = new Thread(new Campana("don" , 5));
        thr2.start();

        Thread thr3 = new Thread(new Campana("dan" , 5));
        thr3.start();
    }

}
