package it.itis.cuneo;

public class Vettore {
    private Punto inizio;
    private Punto fine;

    public Vettore(Punto inizio , Punto fine) {
        this.inizio = new Punto(inizio);
        this.fine = new Punto(fine);
    }

    @Override
    public String toString() {
        return "Vettore{ \"inizio\": " + inizio + ", \"fine\": " + fine + " }";
    }


    public static void main(String[] args) {
        Punto punto = new Punto (3,2);
        Punto punto1 = new Punto(5,6);
        Vettore vettore= new Vettore(punto, punto1);
        System.out.println(vettore.toString());
    }
}
