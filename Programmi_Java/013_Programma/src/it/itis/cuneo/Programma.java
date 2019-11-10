package it.itis.cuneo;

public class Programma {

    String denominazione;
    String produttore;
    String versione;
    String os;
    int anno;

    public Programma (String denominazione, String produttore, String versione, String os, int anno)
    {
        super();
        this.denominazione = denominazione;
        this.produttore = produttore;
        this.versione = versione;
        this.os = os;
        this.anno = anno;
    }

    public Programma ()
    {
        super();
        this.denominazione = null;
        this.produttore = null;
        this.versione = null;
        this.os = null;
        this.anno = 0;
    }


    public Programma (Programma programma)
    {
        super();

        this.denominazione = programma.denominazione;
        this.produttore = programma.produttore;
        this.versione = programma.versione;
        this.os = programma.os;
        this.anno = programma.anno;
    }

    public int getAnno() {
        return anno;
    }

    public String getDenominazione() {
        return denominazione;
    }

    public String getOs() {
        return os;
    }

    public String getProduttore() {
        return produttore;
    }

    public String getVersione() {
        return versione;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public void setDenominazione(String denominazione) {
        this.denominazione = denominazione;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setProduttore(String produttore) {
        this.produttore = produttore;
    }

    public void setVersione(String versione) {
        this.versione = versione;
    }

    public String toString()
    {
        return "CD = { \"Denominazione\": " + this.denominazione + " \"Produttore\": " + this.produttore + " \"Versione\": " + this.versione + " \"Os\": " + this.os  + " \"Anno\": " + this.anno +"}";
    }

    public String compareAnno(Programma programma)
    {
        if(this.anno == programma.anno)
        {
            return("I due anni sono uguali");
        }

        else if(this.anno > programma.anno)
        {
            return("Il primo anno è maggiore");
        }
        else if(this.anno < programma.anno)
        {
            return("Il secondo anno è maggiore");
        }
        return(null);
    }
}

