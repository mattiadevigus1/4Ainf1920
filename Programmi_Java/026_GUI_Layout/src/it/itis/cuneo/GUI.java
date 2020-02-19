package it.itis.cuneo;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class GUI {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();

        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(boxlayout);
        panel.setSize(400, 400);

        panel.setBorder(new EmptyBorder(new Insets(150, 200, 150, 200)));

        JButton jb1 = new JButton("Button");
        JButton jb2 = new JButton("Short");
        JButton jb3 = new JButton("long-long - long button");

        jb1.setAlignmentX(Component.CENTER_ALIGNMENT);
        jb2.setAlignmentX(Component.CENTER_ALIGNMENT);
        jb3.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel.add(jb1);
        panel.add(jb2);
        panel.add(jb3);

        frame.add(panel);
        frame.setVisible(true);
    }

}
