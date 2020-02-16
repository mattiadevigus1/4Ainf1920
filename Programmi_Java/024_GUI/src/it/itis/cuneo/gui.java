package it.itis.cuneo;

import javax.swing.*;
import java.awt.*;

public class gui {
    public static void main(String[] args) {

        //Imposta frame
        JFrame frame = new JFrame("Squadre");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        //Crea elementi
        JPanel panel = new JPanel();

        JLabel label = new JLabel("Squadra 1");
        JTextField tf = new JTextField(10);
        JButton button1 = new JButton("Invia");


        JLabel label2 = new JLabel("Squadra 2");
        JTextField tf2 = new JTextField(10);
        JButton button2 = new JButton("Invia");

        panel.add(label);
        panel.add(tf);
        panel.add(button1);

        panel.add(label2);
        panel.add(tf2);
        panel.add(button2);

        //Metti nel frame
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setVisible(true);
    }
}
