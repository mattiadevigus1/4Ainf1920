package it.itis.cuneo;

/**
 * Created by inf.devigusm0708 on 21/10/2019.
 */
public class Autostrada {
    private Casello caselloIngresso;
    private Casello caselloUscita;
    private int distanza;

    public Autostrada(Casello casello, Casello casello1, int valore1)
    {
        this.caselloIngresso = casello;
        this.caselloUscita = casello1;
        this.distanza = valore1;
    }
}
