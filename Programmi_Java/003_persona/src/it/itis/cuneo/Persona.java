package it.itis.cuneo;

public class Persona {
    private int eta;
    private String nome;
    private String sesso;
    private String professione;

    public Persona(int valore1, String valore2, String valore3, String valore4)
    {
        this.eta = valore1;
        this.nome = valore2;
        this.sesso = valore3;
        this.professione= valore4;

    }

    public void setEta(int valore1)
    {
        this.eta = valore1;
    }

    public int getEta()
    {
        return this.eta;
    }

    public void setNome(String valore2)
    {
        this.nome = valore2;
    }

    public String getNome()
    {
        return this.nome;
    }

    public void setSesso(String valore3)
    {
        this.sesso = valore3;
    }

    public String getSesso()
    {
        return this.sesso;
    }

    public void setProfessione(String valore4)
    {
        this.professione = valore4;
    }

    public String getProfessione()
    {
        return this.professione;
    }

    public String chiSei() {
        return ("Persona:\n{\n Eta:" + this.eta + "\n Nome:" + this.nome + "\n Sesso: " + this.sesso + "\n Professione: "+ this.professione+ "\n}");
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona(18 , "Mattia" , "Maschio" ,  "Studente");
        persona1.eta = persona1.getEta();
        persona1.nome = persona1.getNome();
        persona1.sesso= persona1.getSesso();
        persona1.professione= persona1.getProfessione();
        System.out.println(persona1.chiSei());


    }
}