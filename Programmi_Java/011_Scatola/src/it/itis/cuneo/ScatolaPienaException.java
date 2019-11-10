package it.itis.cuneo;

//classe usata per le eccezioni dei libri e per quelli che non stanno nel vettore
public class ScatolaPienaException extends Exception{

    private  int codice;
    private String descrizione;

    public ScatolaPienaException(int codice, String descrizione) {
        this.codice = codice;
        this.descrizione = descrizione;
    }

    @Override
    public String toString() {
        return "ScatolaPienaException{" + "codice=" + codice + ", descrizione='" + descrizione + '\'' + '}';
    }
}