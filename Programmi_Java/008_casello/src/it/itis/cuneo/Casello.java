package it.itis.cuneo;

import java.nio.channels.ScatteringByteChannel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by inf.devigusm0708 on 21/10/2019.
 */
public class Casello {
    private Calendar dataEntrata;
    private Calendar dataUscita;
    private String identificativo;

    public void setIdentificativo(String identificativo)
    {
        this.identificativo = identificativo;
    }

    public String getIdentificativo()
    {
        return this.identificativo;
    }

    public void setDataEntrata(Calendar dataEntrata)
    {
        this.dataEntrata = dataEntrata;
    }

    public void setDataUscita(Calendar dataUscita)
    {
        this.dataUscita = dataUscita;
    }

    public Calendar getDataEntrata()
    {
        return this.dataEntrata;
    }

    public Calendar getDataUscita()
    {
        return this.dataUscita;
    }

    public Casello(String identificativo, Calendar dataEntrata, Calendar dataUscita)
    {
        this.identificativo = identificativo;
        this.dataEntrata = dataEntrata;
        this.dataUscita = dataUscita;
    }

    public Casello(Casello casello)
    {
        this.identificativo = casello.getIdentificativo();
        //Metodo aziendale
        //L' istanza creata che punta al 1970 ha come valore predefinito il 01/01/1970
        //non è accessibile

        //Data di entrata
        Calendar cDataIngresso = Calendar.getInstance();
        cDataIngresso.setTime(casello.getDataEntrata().getTime());
        this.dataEntrata = cDataIngresso;

        //Data di uscita
        Calendar cDataUscita = Calendar.getInstance();
        cDataUscita.setTime(casello.getDataUscita().getTime());
        this.dataUscita = cDataUscita;
    }

        public Calendar differenza(Casello casello)
        {
            Calendar differenza;
                differenza
            return differenza;
        }


    public static void main(String[] args) {
        //Stringa --> Data (SimpleDateFormat
        //es.   23/10/2019 09:25:52
        //pattern dd/mm/yyyy hh24:mi,ss
        //pattern: formato data
        //formato della data di input
        //rappresentato in una stringa
        final String FORMATO_DMY__HMS = "dd/MM/yyyy hh:mm:ss";
        String strDataPartenza = "07/08/2001 13:30:40";
        Calendar cDataIngresso = Calendar.getInstance();
        SimpleDateFormat sdfHH = new SimpleDateFormat(FORMATO_DMY__HMS);
        //parsificare una stringa secondo formato, permette di ottenere una variabile di altro tipo
        //Eccezione: è un anomalia software che si verifica quando il codice genera un errore in tempo di esecuzione, in questo caso indica che la stringa non sta indicando il formato richiesto
        Date dataPartenza = null;
        try {
            dataPartenza = sdfHH.parse(strDataPartenza);
        } catch (ParseException e) {
            //errore nel formato stringa
            //viene stampato uno stackTrace: Una traccia dello stack, è l' elenco delle chiamate ai metodi, log
            e.printStackTrace();
        }
        //Mantiene il numero di secondi dal primo Gennaio
        cDataIngresso.setTime(dataPartenza);
        String strData = sdfHH.format(dataPartenza);

        System.out.println("cDataEntrata: format " +cDataIngresso);

        System.out.println("Data di partenza: " + dataPartenza);

        //DATA USCITA
        String strDataArrivo = "07/08/2001 13:59:21";
        Calendar cDataUscita = Calendar.getInstance();
        Date dataArrivo = null;
        try
        {dataArrivo = sdfHH.parse(strDataArrivo);
        } catch (ParseException e)
        {
            e.printStackTrace();;
        }
        cDataUscita.setTime(dataPartenza);
        System.out.println("Data di uscita: " + dataArrivo);

        Casello casello = new Casello("1" , cDataIngresso , cDataUscita);
        Casello casello2= new Casello(casello);
        System.out.println(casello.differenza(casello2));
    }
}
