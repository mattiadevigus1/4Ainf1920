/*
    Autore: Devigus Mattia
    Data creazione: 2020/02/03
 */


import javax.xml.xpath.XPath;
import java.io.*;

public class CSV {

    //Modifica con il tuo percorso
    public static final String path= "C:\\Users\\Mattia Devigus\\Desktop\\csv\\doc1.csv" ;
    //Separatore
    public static final String separator = "," ;
    public static String row = "";

    //Costruttore
    public CSV() {
    }

    //Questo sottoprogramma, CREA il file csv. Per modificare percorso file, modificare path in riga 13;
    public void createCSV()
    {
        try
        {
            //Crea nuovo File
            File file = new File(path);

            //Verifica che il file non esista già
            if (file.createNewFile())
            {
                System.out.println("File creato con successo");
            } else
            {
                System.out.println("Riprendo da creazione....");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Questo sottoprogramma, SCRIVE il file csv. Per modificare percorso file, modificare path in riga 13;
    public void writeCSV()
    {
        try {
            FileWriter fileWriter = new FileWriter(path);
            //Scrivi ciò che vuoi mettere nel file;
            fileWriter.write("Mattia" + "," + "Devigus" + "," + "25");
            fileWriter.close();
            System.out.println("Scrittura avvenuta con successo!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    //Questo sottoprogramma, LEGGE il file csv. Per modificare percorso file, modificare path in riga 13;
    public void readCSV () {
        //Lettura File
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(path));
            //Finchè non finiscono le righe, separa la riga con il separatore settato nella riga 13 e metti nel vettore gli elementi divisi;
            while ((row = br.readLine()) != null) {
                String[] vettore = row.split(separator);
                System.out.println("Stampo:" + vettore[0] + " " +  vettore[1] + " " +  vettore[2]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void marshaller () {

    }

    public static void main(String[] args) {
        //Main
        CSV csv = new CSV();
        csv.createCSV();
        csv.writeCSV();
        csv.readCSV();
        XmlRoot xmlRoot = new XmlRoot();
        xmlRoot.unMarshallingXml();
    }
}
