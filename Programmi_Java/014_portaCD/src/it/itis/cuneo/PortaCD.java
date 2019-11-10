package it.itis.cuneo;

import org.w3c.dom.css.CSSImportRule;

import java.util.Objects;

public class PortaCD {
    private CD cd;
    private CD cd1;
    private CD cd2;

    public PortaCD(CD cd , CD cd1, CD cd2) {
        this.cd = cd;
        this.cd1= cd1;
        this.cd2= cd2;
    }

    public CD getCd() {
        return cd;
    }

    public void setCd(CD cd) {
        this.cd = cd;
    }

    public CD getCd1() {
        return cd1;
    }

    public void setCd1(CD cd1) {
        this.cd1 = cd1;
    }

    public CD getCd2() {
        return cd2;
    }

    public void setCd2(CD cd2) {
        this.cd2 = cd2;
    }

    @Override
    public String toString() {
        return "PortaCD{" +
                "cd=" + cd +
                ", cd1=" + cd1 +
                ", cd2=" + cd2 +
                '}';
    }
    
    public int confronto(PortaCD portaCD) {
        int cont = 0;
        if(this.cd == portaCD.cd)
        {cont++;}
        if(this.cd1 == portaCD.cd1)
        {cont++;}
        if(this.cd2 == portaCD.cd2)
        {cont++;}
        return cont;
    }
}
