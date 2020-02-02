package it.itis.cuneo;


import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Camera {
    private String nome;
    private int letto;
    private int bagno;
    private String vista;

    public Camera(String nome, int letto, int bagno, String vista) {
        this.nome = nome;
        this.letto = letto;
        this.bagno = bagno;
        this.vista = vista;
    }

    public String getNome() {
        return nome;
    }

    @XmlAttribute
    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getLetto() {
        return letto;
    }

    @XmlElement
    public void setLetto(int letto) {
        this.letto = letto;
    }


    public int getBagno() {
        return bagno;
    }

    @XmlElement
    public void setBagno(int bagno) {
        this.bagno = bagno;
    }

    public String getVista() {
        return vista;
    }

    @XmlElement
    public void setVista(String vista) {
        this.vista = vista;
    }
}
