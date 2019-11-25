package it.itis.cuneo;

/**
 * Created by inf.devigusm0708 on 20/11/2019.
 */
public class Abitazione {
    private int nStanze;
    private int superficie;
    private String indirizzo;
    private String citta;

    public Abitazione() {
    }

    public Abitazione(int nStanze, int superficie, String indirizzo, String citta) {
        this.nStanze = nStanze;
        this.superficie = superficie;
        this.indirizzo = indirizzo;
        this.citta = citta;
    }

    public Abitazione(Abitazione abitazione) {
        this.nStanze = abitazione.getnStanze();
        this.superficie = abitazione.getSuperficie();
        this.indirizzo = abitazione.getIndirizzo();
        this.citta = abitazione.getCitta();
    }

    public int getnStanze() {
        return nStanze;
    }

    public void setnStanze(int nStanze) {
        this.nStanze = nStanze;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    @Override
    public String toString() {
        return  "nStanze=" + nStanze +
                ", superficie=" + superficie +
                ", indirizzo='" + indirizzo + '\'' +
                ", citta='" + citta + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Abitazione that = (Abitazione) o;

        if (nStanze != that.nStanze) return false;
        if (superficie != that.superficie) return false;
        if (indirizzo != null ? !indirizzo.equals(that.indirizzo) : that.indirizzo != null) return false;
        return citta != null ? citta.equals(that.citta) : that.citta == null;
    }
}
