package it.itis.cuneo;

public class Angolo {
    private int g;
    private int p;
    private int s;

    public Angolo(int valore1 , int valore2 , int valore3)
    {
        g= valore1;
        p= valore2;
        s= valore3;
    }

    public int getGradi()
    {
        return this.g;
    }

    public int getPrimi()
    {
        return this.p;
    }

    public int getSecondi()
    {
        return this.s;
    }

    public int aggiungiGradi(int n)
    {
        int k= this.g;
        k= k + n;
        return k;
    }

    public int aggiungiPrimi(int n)
    {
        int k= this.g;
        k= k + n;
        return k;
    }

    public int aggiungiSecondi(int n)
    {
        int k= this.s;
        k= k + n;
        return k;
    }

    public String visualizzaAngolo() {
        return (this.g + "°" + this.p + "'" + this.s + "''");
    }

    public int differenzaSecondi(Angolo angolo)
    {
        int k ;
        k=  this.s - angolo.getSecondi();
        return k;
    }

    public void sommaAngolo(Angolo angolo, Angolo angolo1)
    {
        this.g= angolo.getGradi() + angolo1.getGradi();
        this.p= angolo.getPrimi() + angolo1.getPrimi();
        this.s= angolo.getSecondi() + angolo1.getSecondi();
        return;
    }

    public static void main(String[] args) {
        Angolo angolo = new Angolo(40, 20, 10);
        System.out.println(angolo.visualizzaAngolo());

        Angolo angolo1 = new Angolo(20,13,5);
        System.out.println(angolo1.visualizzaAngolo());

        Angolo angoloSomma = new Angolo(0,0,0);
        angoloSomma.sommaAngolo(angolo, angolo1);
        System.out.println(angoloSomma.visualizzaAngolo());


        int differenza = angolo.differenzaSecondi(angolo1);
        System.out.println("La differenza tra i secondi vale : " + differenza);

        int n=5;

        angolo.g= angolo.aggiungiGradi(n);
        System.out.println("Gradi aumentati di n: " + angolo.g);

        angolo.p= angolo.aggiungiPrimi(n);
        System.out.println("Primi aumentati di n: " + angolo.p);

        angolo.s= angolo.aggiungiSecondi(n);
        System.out.println("Secondi aumentati di n: " + angolo.s);
    }
}
