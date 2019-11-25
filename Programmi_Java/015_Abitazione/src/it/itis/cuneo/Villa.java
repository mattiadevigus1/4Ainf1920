package it.itis.cuneo;

/**
 * Created by inf.devigusm0708 on 20/11/2019.
 */
public class Villa extends Abitazione{
    private int nPiani;
    private int superfice;
    private boolean piscina;

    public Villa(int nPiani, int superfice, boolean piscina) {
        this.nPiani = nPiani;
        this.superfice = superfice;
        this.piscina = piscina;
    }

    public Villa(int nStanze, int superficie, String indirizzo, String citta, int nPiani, int superfice, boolean piscina) {
        super(nStanze, superficie, indirizzo, citta);
        this.nPiani = nPiani;
        this.superfice = superfice;
        this.piscina = piscina;
    }

    public Villa(Abitazione abitazione, int nPiani, int superfice, boolean piscina) {
        super(abitazione);
        this.nPiani = nPiani;
        this.superfice = superfice;
        this.piscina = piscina;
    }

    public int getnPiani() {
        return nPiani;
    }

    public void setnPiani(int nPiani) {
        this.nPiani = nPiani;
    }

    public int getSuperfice() {
        return superfice;
    }

    public void setSuperfice(int superfice) {
        this.superfice = superfice;
    }

    public boolean isPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    @Override
    public String toString() {
        return "Villa{" + super.toString() +
                "nPiani=" + nPiani +
                ", superfice=" + superfice +
                ", piscina=" + piscina +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Villa villa = (Villa) o;

        if (nPiani != villa.nPiani) return false;
        if (superfice != villa.superfice) return false;
        return piscina == villa.piscina;
    }
}
