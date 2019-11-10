package it.itis.cuneo;

import java.util.Calendar;

public class Bottiglia {
    private String titolo;
    private String litri;
    private Calendar dataScadenza;

    public Bottiglia(String alice,  String litri, Calendar calendar) {
    }

    public Bottiglia(Calendar dataScadenza, String litri, String titolo) {
        this.dataScadenza = dataScadenza;
        this.litri = litri;
        this.titolo = titolo;
    }

    public  Bottiglia(Bottiglia bottiglia){
        this.dataScadenza= bottiglia.getDataScandeza();
        this.litri= bottiglia.getLitri();
        this.titolo= bottiglia.getTitolo();
    }

    public String getTitolo() {
        return titolo;
    }

    public String getLitri() {
        return litri;
    }

    public Calendar getDataScandeza() {
        return dataScadenza;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setLitri(String litri) {
        this.litri = litri;
    }


    public void setDataScadenza(Calendar dataPubblicazione) {
        this.dataScadenza = dataScadenza;
    }

    public boolean equals(Bottiglia bottiglia){
        boolean bEquals=false;

        if(titolo!= null && titolo.equals(bottiglia.getTitolo())
                && litri!= null && litri.equals(bottiglia.getLitri()) && dataScadenza.equals(bottiglia.getDataScandeza()))
        {
            bEquals=true;
        }
        return bEquals;
    }
}