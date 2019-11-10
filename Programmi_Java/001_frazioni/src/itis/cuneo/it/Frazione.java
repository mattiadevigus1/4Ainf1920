package itis.cuneo.it;

public class Frazione {
    //
    private int num;
    private int den;

    //NUMERATORE
    //new Frazione
     public Frazione(int num, int den)
     {
            this.num = num;
            this.den= den;
     }

    //setnum
     public void setNum(int num)
     {
         this.num = num;
     }
     //restituisci valore
     public int getNum()
     {
         return this.num;
     }

     //DENOMINATORE
    //setnum
    public void setDen(int den)
    {
        this.den = den;
    }
    //restituisci valore
    public int getDen()
    {
        return this.den;
    }

    public Frazione getNumSom(Frazione frazione)
    {
        Frazione frazioneRes2= new Frazione(0,0);
        frazioneRes2.num = (this.num*frazione.getDen() + this.den * frazione.getNum());
        frazioneRes2.den = (this.den*frazione.getDen());
        return frazioneRes2;
    }

    public Frazione getNumSot(Frazione frazione)
    {
        Frazione frazioneRes2= new Frazione(0,0);
        frazioneRes2.num = (this.num*frazione.getDen()) - (this.den * frazione.getNum());
        frazioneRes2.den = (this.den*frazione.getDen());
        return frazioneRes2;
    }

    public Frazione getNumMol(Frazione frazione)
    {
        Frazione frazioneRes2= new Frazione(0,0);
        frazioneRes2.num = (this.num * frazione.getNum());
        frazioneRes2.den = (this.den*frazione.getDen());
        return frazioneRes2;
    }

    public Frazione getNumDen(Frazione frazione)
    {
        Frazione frazioneRes2= new Frazione(0,0);
        frazioneRes2.num = (this.num * frazione.getDen());
        frazioneRes2.den = (this.den* frazione.getNum());
        return frazioneRes2;
    }


    public static void main(String[] args) {
        Frazione frazione = new Frazione(2, 2);
        Frazione frazione1= new Frazione(4, 4);
        Frazione frazioneRes= new Frazione(0,0);
        frazioneRes= frazione.getNumSom(frazione1);
        System.out.println("La Somma delle due frazioni vale:");
        System.out.println(frazioneRes.num);
        System.out.println(frazioneRes.den);

        frazioneRes= frazione.getNumSot(frazione1);
        System.out.println("La Sottrazioni delle due frazioni vale:");
        System.out.println(frazioneRes.num);
        System.out.println(frazioneRes.den);

        frazioneRes= frazione.getNumMol(frazione1);
        System.out.println("La Moltiplicazione delle due frazioni vale:");
        System.out.println(frazioneRes.num);
        System.out.println(frazioneRes.den);

        frazioneRes= frazione.getNumDen(frazione1);
        System.out.println("La Divisione delle due frazioni vale:");
        System.out.println(frazioneRes.num);
        System.out.println(frazioneRes.den);

    }

}
