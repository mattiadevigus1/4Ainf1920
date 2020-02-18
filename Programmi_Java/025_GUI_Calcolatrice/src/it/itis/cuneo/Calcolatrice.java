package it.itis.cuneo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Calcolatrice {
    public static JFrame frame = new JFrame("Calcolatrice");
    public static JPanel panel = new JPanel();
    public static JLabel num1 = new JLabel();
    public static JLabel num2 = new JLabel();
    public static JTextField tx1 = new JTextField(10);
    public static JTextField tx2 = new JTextField(10);
    public static JButton button = new JButton("Calcola");
    public static JLabel lCompleto = new JLabel("Calcolo");
    public static JTextField tx3 = new JTextField(10);

    public static void main(String[] args) {

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400,400);

        panel.add(num1);
        panel.add(tx1);

        panel.add(num2);
        panel.add(tx2);

        panel.add(button);

        lCompleto = new JLabel("Cognome+Nome");
        lCompleto.setText(num1.getText() + num2.getText());

        panel.add(lCompleto);


        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setVisible(true);
    }

}
