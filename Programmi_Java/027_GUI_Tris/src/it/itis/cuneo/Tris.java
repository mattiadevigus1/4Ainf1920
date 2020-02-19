package it.itis.cuneo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tris {

    public static JFrame frame = new JFrame();
    public static JButton btn1 = new JButton("");
    public static JButton btn2 = new JButton("");
    public static JButton btn3 = new JButton("");
    public static JButton btn4 = new JButton("");
    public static JButton btn5 = new JButton("");
    public static JButton btn6 = new JButton("");
    public static JButton btn7 = new JButton("");
    public static JButton btn8 = new JButton("");
    public static JButton btn9 = new JButton("");

    public static void main(String[] args) {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 350);

        GridLayout contentPane = new GridLayout(3, 6, 10, 10);

        frame.setLayout(contentPane);

        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.add(btn5);
        frame.add(btn6);
        frame.add(btn7);
        frame.add(btn8);
        frame.add(btn9);

        frame.setVisible(true);

        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if (btn1.getText() == "")
                {
                    btn1.setText("x");
                }
                else
                {
                    btn1.setText("o");
                }
            }
        });

        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if (btn2.getText() == "")
                {
                    btn2.setText("x");
                }
                else
                {
                    btn2.setText("o");
                }
            }
        });

        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if (btn3.getText() == "")
                {
                    btn3.setText("x");
                }
                else
                {
                    btn3.setText("o");
                }
            }
        });

        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if (btn4.getText() == "")
                {
                    btn4.setText("x");
                }
                else
                {
                    btn4.setText("o");
                }
            }
        });

        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if (btn5.getText() == "")
                {
                    btn5.setText("x");
                }
                else
                {
                    btn5.setText("o");
                }
            }
        });

        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if (btn6.getText() == "")
                {
                    btn6.setText("x");
                }
                else
                {
                    btn6.setText("o");
                }
            }
        });

        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if (btn7.getText() == "")
                {
                    btn7.setText("x");
                }
                else
                {
                    btn7.setText("o");
                }
            }
        });

        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if (btn8.getText() == "")
                {
                    btn8.setText("x");
                }
                else
                {
                    btn8.setText("o");
                }
            }
        });

        btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if (btn9.getText() == "")
                {
                    btn9.setText("x");
                }
                else
                {
                    btn9.setText("o");
                }
            }
        });



    }
}
