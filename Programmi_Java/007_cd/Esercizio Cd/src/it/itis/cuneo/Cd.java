package it.itis.cuneo;

public class Cd {
    private String titolo;
    private String autore;
    private int brani;
    private int durata;

    //Costruttore
    public Cd(String valore1, String valore2, int valore3, int valore4) {
        this.titolo = valore1;
        this.autore = valore2;
        this.brani = valore3;
        this.durata = valore4;
    }

    //Costruttore di copia
    public Cd(Cd disco) {
        this.titolo = disco.getTitolo();
        this.autore = disco.getAutore();
        this.brani = disco.getBrani();
        this.durata = disco.getDurata();
    }

    //Setter
    public void setTitolo(String valore1) {
        this.titolo = valore1;
    }

    public void setAutore(String valore2) {
        this.autore = valore2;
    }

    public void setBrani(int valore3) {
        this.brani = valore3;
    }

    public void setDurata(int valore4) {
        this.durata = valore4;
    }

    //Getter
    public String getTitolo() {
        return this.titolo;
    }

    public String getAutore() {
        return this.autore;
    }

    public int getBrani() {
        return this.brani;
    }

    public int getDurata() {
        return this.durata;
    }

    @Override
    public String toString() {
        return "CD: Titolo: " + this.titolo + " Autore: " + this.autore + " Numero di brani:" + this.brani + " Durata: " + this.durata;
    }

    public boolean equals(Cd cd) {
        boolean k = false;
        if (this.titolo == cd.titolo) {
            k = true;
        }
        return k;
    }
}
