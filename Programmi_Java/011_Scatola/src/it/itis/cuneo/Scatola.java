package it.itis.cuneo;

public class Scatola {

    public static final int MAX_BOTTIGLIE = 10;
    private Bottiglia[] vBottiglie;
    //cntLibro<= MAX_LIBRI
    private int contBottiglie;

    public Scatola(){
        //costruttore di array
        vBottiglie = new Bottiglia[MAX_BOTTIGLIE];
        contBottiglie=0;
    }

    public void addBottiglia(Bottiglia bottiglia) throws ScatolaPienaException{

        //possibile perche nella libreria PienaException ha l?extend
        if(contBottiglie> MAX_BOTTIGLIE)
            //se viene rilanciata l'eccezione il codice dopo non lo esegue
            throw new ScatolaPienaException(1, "Troppe bottiglie");
        vBottiglie[contBottiglie] = bottiglia;
        contBottiglie++;
    }

    public static void main(String[] args) {
        //dfDay e' il pattern
        //Libro libro2 = new Libro("Pinocchio", )
        Bottiglia bottiglia1 = new Bottiglia("Alice", "2", InputOutputUtility.convertiDataOraToCalendar("12/10/2019", InputOutputUtility.dfDay ));

        //Libro libro2 = new Libro("Pinocchio", )
        Scatola scatola = new Scatola();
        try {
            scatola.addBottiglia(bottiglia1);
            scatola.addBottiglia(bottiglia1);
            scatola.addBottiglia(bottiglia1);
            scatola.addBottiglia(bottiglia1);
        } catch (ScatolaPienaException e) {
            e.printStackTrace();
            //System.out.println(e.toString());
            System.err.println(e.toString());
        }

        //System.out.println(.toString());
        System.err.println(scatola.toString());


    }
}