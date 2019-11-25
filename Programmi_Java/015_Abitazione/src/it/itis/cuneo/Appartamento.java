package it.itis.cuneo;

/**
 * Created by inf.devigusm0708 on 20/11/2019.
 */
public class Appartamento extends Abitazione {
    private int piano;
    private boolean ascensore;
    private int nTerrazzi;

    public Appartamento(int piano, boolean ascensore, int nTerrazzi) {
        this.piano = piano;
        this.ascensore = ascensore;
        this.nTerrazzi = nTerrazzi;
    }

    public Appartamento(int nStanze, int superficie, String indirizzo, String citta, int piano, boolean ascensore, int nTerrazzi) {
        super(nStanze, superficie, indirizzo, citta);
        this.piano = piano;
        this.ascensore = ascensore;
        this.nTerrazzi = nTerrazzi;
    }

    public Appartamento(Abitazione abitazione, int piano, boolean ascensore, int nTerrazzi) {
        super(abitazione);
        this.piano = piano;
        this.ascensore = ascensore;
        this.nTerrazzi = nTerrazzi;
    }

    public int getPiano() {
        return piano;
    }

    public void setPiano(int piano) {
        this.piano = piano;
    }

    public boolean isAscensore() {
        return ascensore;
    }

    public void setAscensore(boolean ascensore) {
        this.ascensore = ascensore;
    }

    public int getnTerrazzi() {
        return nTerrazzi;
    }

    public void setnTerrazzi(int nTerrazzi) {
        this.nTerrazzi = nTerrazzi;
    }

    @Override
    public String toString() {
        return  "Appartamento{" +  super.toString() +
                "piano=" + piano +
                ", ascensore=" + ascensore +
                ", nTerrazzi=" + nTerrazzi +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Appartamento that = (Appartamento) o;

        if (piano != that.piano) return false;
        if (ascensore != that.ascensore) return false;
        return nTerrazzi == that.nTerrazzi;
    }
}
