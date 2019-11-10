package it.itis.cuneo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CD {
    private String titolo;
    private String autore;
    private int numeroBrani;
    private String durata;

    public CD(String titolo, String autore, int numeroBrani, String durata) {
        this.titolo = titolo;
        this.autore = autore;
        this.numeroBrani = numeroBrani;
        this.durata = durata;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setNumeroBrani(int numeroBrani) {
        this.numeroBrani = numeroBrani;
    }

    public void setDurata(String durata) {
        this.durata = durata;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public int getNumeroBrani() {
        return numeroBrani;
    }

    public String  getDurata() {
        return durata;
    }

    @Override
    public String toString() {
        return "CD{" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", numeroBrani=" + numeroBrani +
                ", durata=" + durata +
                '}';
    }
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        String dataStr = sdf.format(new Date());
        CD cd = new CD("Musica da Giostra" , "Dj Matrix" , 24 , dataStr);
        System.out.println(cd.toString());
        CD cd1 = new CD("Balla con Me" , "Papn's " , 20, dataStr);
        System.out.println(cd1.toString());
        CD cd2 = new CD("Balla con Te" , "Rovazzi " , 20, dataStr);
        PortaCD portaCD= new PortaCD(cd, cd1 , cd2);
        System.out.println(portaCD.toString());
        PortaCD portaCD2= new PortaCD(cd, cd1 , cd2);
        System.out.println(portaCD.confronto(portaCD2));
    }


}
