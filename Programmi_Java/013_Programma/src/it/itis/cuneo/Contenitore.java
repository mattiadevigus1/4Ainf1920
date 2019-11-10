package it.itis.cuneo;

public class Contenitore
{
    Programma programma1;
    Programma programma2;
    Programma programma3;

    public Contenitore() {
        super();

        this.programma1 = new Programma();
        this.programma2 = new Programma();
        this.programma3 = new Programma();
    }

    public Programma getProgramma(int nCont, int nProgramma, Contenitore contenitore2, Contenitore contenitore3)
    {
        if(nCont == 1)
        {
            if(nProgramma == 1)
            {
                return(this.programma1);
            }
            else if(nProgramma == 2)
            {
                return(this.programma2);

            }
            else if (nProgramma == 3)
            {
                return(this.programma3);
            }
        }
        else if (nCont == 2)
        {
            if(nProgramma == 1)
            {
                return(contenitore2.programma1);
            }
            else if(nProgramma == 2)
            {
                return(contenitore2.programma2);

            }
            else if (nProgramma == 3)
            {
                return(contenitore2.programma3);
            }
        }
        else if (nCont == 3)
        {
            if(nProgramma == 1)
            {
                return(contenitore3.programma1);
            }
            else if(nProgramma == 2)
            {
                return(contenitore3.programma2);

            }
            else if (nProgramma == 3)
            {
                return(contenitore3.programma3);
            }
        }

        return(null);
    }

    public void setProgramma(int nCont, int nProgramma, Contenitore contenitore2, Contenitore contenitore3, Programma obiettivo)
    {
        if(nCont == 1)
        {
            if(nProgramma == 1)
            {
                this.programma1 = obiettivo;
            }
            else if(nProgramma == 2)
            {
                this.programma2 = obiettivo;

            }
            else if (nProgramma == 3)
            {
                this.programma3 = obiettivo;
            }
        }
        else if (nCont == 2)
        {
            if(nProgramma == 1)
            {
                contenitore2.programma1 = obiettivo;
            }
            else if(nProgramma == 2)
            {
                contenitore2.programma2 = obiettivo;

            }
            else if (nProgramma == 3)
            {
                contenitore2.programma3 = obiettivo;
            }
        }
        else if (nCont == 3)
        {
            if(nProgramma == 1)
            {
                contenitore3.programma1 = obiettivo;
            }
            else if(nProgramma == 2)
            {
                contenitore3.programma2 = obiettivo;

            }
            else if (nProgramma == 3)
            {
                contenitore3.programma3 = obiettivo;
            }
        }

    }

    public void killProgramma(int nCont, int nProgramma, Contenitore contenitore2, Contenitore contenitore3)
    {
        if(nCont == 1)
        {
            if(nProgramma == 1)
            {
                this.programma1 = null;
            }
            else if(nProgramma == 2)
            {
                this.programma2 = null;

            }
            else if (nProgramma == 3)
            {
                this.programma3 = null;
            }
        }
        else if (nCont == 2)
        {
            if(nProgramma == 1)
            {
                contenitore2.programma1 = null;
            }
            else if(nProgramma == 2)
            {
                contenitore2.programma2 = null;

            }
            else if (nProgramma == 3)
            {
                contenitore2.programma3 = null;
            }
        }
        else if (nCont == 3)
        {
            if(nProgramma == 1)
            {
                contenitore3.programma1 = null;
            }
            else if(nProgramma == 2)
            {
                contenitore3.programma2 = null;

            }
            else if (nProgramma == 3)
            {
                contenitore3.programma3 = null;
            }
        }

    }

    public int getN()
    {
        return 3;
    }

    public int cercaProgrammaPerDenominazione(String denominazione)
    {
        if(this.programma1.denominazione == denominazione)
        {
            return 1;
        }
        else if (this.programma2.denominazione == denominazione)
        {
            return 2;
        }
        else if (this.programma3.denominazione == denominazione)
        {
            return 3;
        }

        return -1;
    }

    public String toString()
    {
        return ("Contenitore = { \"Denominazione1\": " + this.programma1.denominazione +  " \"Denominazione2\": " + this.programma2.denominazione + " \"Denominazione3\": " + this.programma2.denominazione + "}");
    }

    // TODO: 27/10/2019  public confrontaContenitore()

    public static void main(String[] args) {
        // TODO: 27/10/2019
    }
}
