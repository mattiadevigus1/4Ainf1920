package it.itis.cuneo;

/* Esercizio Java:
Creare un’applicazione che consenta ad un utente di prenotare il biglietto di sola andata per una data destinazione, utilizzando una GUI apposita.

1. L’utente deve inserire le seguenti informazioni: − cognome; − nome; − telefono; − città di partenza; − città di destinazione; − data.

2. Dopo l’inserimento dei dati, l’utente può premere il pulsante “Conferma”, per confermare la prenotazione o il pulsante “Annulla”, per non confermarla. − La pressione sul pulsante “Conferma” ha come effetto la memorizzazione della prenotazione in un array di oggetti “Prenotazione” e la comunicazione all’utente stesso dell’avvenuta registrazione, mediante visualizzazione di una finestra di dialogo. − La pressione del pulsante “Annulla” ha come effetto la cancellazione dei dati inseriti dalla GUI e la comunicazione dell’avvenuto annullamento attraverso una finestra di dialogo.

3. Aggiungere un altro pulsante stampa, che permette di aprire in una finestra di dialogo la stampa degli elementi caricati nell'array, utilizzando il codice qui sotto riportato:
JOptionPane.showMessageDialog(null, vPrenotazioni.toString());

4: Inserire un pulsante salva, per scaricare le informazioni della lista di prenotazioni su un file csv.

Autore: Devigus Mattia

 */


import com.sun.org.apache.xpath.internal.axes.PredicatedNodeTest;
import javafx.scene.layout.Pane;
import org.omg.CORBA.PRIVATE_MEMBER;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GUI extends JFrame implements ActionListener{
    private JFrame f;
    private JLabel label, label2, label3, label4, label5, label6;
    private JTextField txt1, txt2, txt3, txt4,txt5,txt6, txt7;
    private JButton button = new JButton("Conferma e Salva");
    private JButton button1 = new JButton("Annulla");
    private JButton button2 = new JButton("Stampa");
    public ArrayList<Prenotazione> listP = new ArrayList <Prenotazione>();

    public static final String path = "preventivo.csv";
    public static final String separator = ";";
    public static String str = "";

    public GUI(){
        setTitle("Prenota il tuo biglietto");
        initComponents();
    }

    private void initComponents(){
        f=new JFrame();

        label = new JLabel("        Cognome");
        label2= new JLabel("               Nome");
        label3= new JLabel("          Telefono");
        label4= new JLabel("Città Partenza");
        label5= new JLabel(" Citta di Arrivo");
        label6= new JLabel("                  Data");

        txt1 = new JTextField(13);
        txt2 = new JTextField(13);
        txt3 = new JTextField(13);
        txt4 = new JTextField(13);
        txt5 = new JTextField(13);
        txt6 = new JTextField(13);


        f.add(label);
        f.add(txt1);

        f.add(label2);
        f.add(txt2);

        f.add(label3);
        f.add(txt3);

        f.add(label4);
        f.add(txt4);

        f.add(label5);
        f.add(txt5);

        f.add(label6);
        f.add(txt6);

        f.add(button);
        f.add(button1);
        f.add(button2);

        f.setLayout(new FlowLayout(FlowLayout.CENTER));
        //setting flow layout of right alignment

        f.setSize(300,300);
        f.setVisible(true);

        button.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);

    }

    public void writeCSV(String csv) {
        try {
            FileWriter fileWriter = new FileWriter(path , true);
            //Scrivi ciò che vuoi mettere nel file;
            fileWriter.write(csv);
            fileWriter.close();
            System.out.println("Scrittura avvenuta con successo!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        GUI gui = new GUI();
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button)
        {
            String cognome= txt1.getText();
            String nome= txt2.getText();
            String telefono= txt3.getText();
            String cittap= txt4.getText();
            String cittad= txt5.getText();
            String data= txt6.getText();
            Prenotazione prenotazione = new Prenotazione(cognome , nome , telefono, cittap, cittad, data);
            listP.add(prenotazione);
            String str = prenotazione.toRowCSV();
            writeCSV(str);
            System.out.println(listP.toString());

            txt1.setText("");
            txt2.setText("");
            txt3.setText("");
            txt4.setText("");
            txt5.setText("");
            txt6.setText("");;
        }

        else if (e.getSource() == button1){
            txt1.setText("");
            txt2.setText("");
            txt3.setText("");
            txt4.setText("");
            txt5.setText("");
            txt6.setText("");
            JOptionPane.showMessageDialog(null, "Hai cancellato correttament. Scrivi");
        } else if (e.getSource() == button2)
        {
            JOptionPane.showMessageDialog(null, listP.toString());
        }
    }

    @Override
    public String toString() {
        return "GUI{" +
                "listP=" + listP +
                '}' ;
    }
}
