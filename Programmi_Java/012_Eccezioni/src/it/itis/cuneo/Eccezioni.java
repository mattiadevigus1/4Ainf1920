package it.itis.cuneo;

public class Eccezioni {

    public static void main(String[] args) {

        int i;
        for(i=0;i<5;i++)
            try {
                int lol= 5/0;
                System.out.println(lol);
            } catch (Exception e) {
                System.out.println("Eccezione");
            }
            finally {
                System.out.println("FINE");
            }



    }

}
