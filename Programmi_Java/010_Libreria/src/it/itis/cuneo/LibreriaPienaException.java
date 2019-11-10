package it.itis.cuneo;


//classe usata per le eccezioni dei libri e per quelli che non stanno nel vettore
public class LibreriaPienaException extends Exception{

    private  int codice;
    private String descrizione;

    public LibreriaPienaException(int codice, String descrizione) {
        this.codice = codice;
        this.descrizione = descrizione;
    }

    @Override
    public String toString() {
        return "LibreriaPienaException{" + "codice=" + codice + ", descrizione='" + descrizione + '\'' + '}';
    }
}