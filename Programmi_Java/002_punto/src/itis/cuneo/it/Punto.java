package itis.cuneo.it;

import java.lang.Math;
import java.security.PublicKey;

public class Punto {
    private int asseX;
    private int asseY;
    private int quadrante;
    private int distanza;
    private boolean equals;


    //costruttore
    public Punto(int valore1, int valore2, int valore3, int valore4, boolean valore5)
    {
        this.asseX = valore1;
        this.asseY= valore2;
        this.quadrante=valore3;
        this.distanza= valore4;
        this.equals= valore5;
    }

    public void setAsseX(int valore1)
    {
        this.asseX= valore1;
    }

    public int getAsseX()
    {
        return this.asseX;
    }

    public void setAsseY(int valore2)
    {
        this.asseY= valore2;
    }

    public int getAsseY()
    {
        return this.asseY;
    }

    public void setQuadrante(int valore3)
    {
       this.quadrante=valore3;
    }

    public void setDistanza(int valore4)
    {
        this.distanza=valore4;
    }


    public int getQuadrante()
    {
        if(this.asseX > 0  && this.asseY > 0)
        {
            this.quadrante=1;
        }

        if(this.asseX >0 && this.asseY <0)
        {
            this.quadrante=4;
        }

        if(this.asseX <0 && this.asseY <0)
        {
            this.quadrante=3;
        }

        if(this.asseX <0 && this.asseY >0)
        {
            this.quadrante=2;
        }

        return this.quadrante;
    }
    public int getDistanza(Punto punto2)
    {
        int distanza;
        distanza = (int) Math.sqrt((this.asseX - punto2.getAsseX())*(this.asseX - punto2.getAsseX())  + (this.asseY - punto2.getAsseY())*(this.asseY - punto2.getAsseY()) );
        return distanza;
    }
    public boolean equals(Punto punto2)
    {
        boolean k=false;
        if(this.asseX == punto2.getAsseX() && this.asseY == punto2.getAsseY())
        {
            k=true;
        }
        else
        {
            k=false;
        }
        return k;
    }

    public String toString() {
        return ("{\n\tx:" + this.asseX + ",\n\ty:" + this.asseY + "\n\b};");
    }


        public static void main(String[] args) {
        Punto punto = new Punto(2,1,0,0,false);
        punto.asseX= punto.getAsseX();
        punto.asseY= punto.getAsseY();
        punto.quadrante = punto.getQuadrante();
        Punto punto2= new Punto(2,1,0,0,false);
        punto.distanza= punto.getDistanza(punto2);
        punto.equals= punto.equals(punto2);
        System.out.println("Il quadrante vale: " + punto.quadrante);
        System.out.println("La distanza fra i 2 punti è:  " + punto.distanza);
        System.out.println("Punti uguali:  " + punto.equals);
        System.out.println(punto.toString());
    }
}
