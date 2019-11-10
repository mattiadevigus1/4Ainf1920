package it.itis.cuneo;

import java.lang.annotation.Retention;
import java.security.PublicKey;

public class Punto {
    private double x;
    private double y;

    //Costruttore
    public Punto(double valore1, double valore2)
    {
        this.x = valore1;
        this.y = valore2;
    }

    public Punto(Punto punto)
    {
        this.x = getX();
        this.y= getY();
    }

    public void setX(double valore1)
    {
        this.x = valore1;
    }

    public void setY(double valore2)
    {
        this.y = valore2;
    }

    public double getX()
    {
        return this.x;
    }

    public double getY()
    {
        return this.y;
    }

}