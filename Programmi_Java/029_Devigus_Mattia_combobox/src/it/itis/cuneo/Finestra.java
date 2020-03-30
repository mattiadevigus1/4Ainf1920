package it.itis.cuneo;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Finestra extends JFrame implements  ActionListener {
    JLabel surname;
    JLabel name;
    JTextField txtSurname;
    JTextField txtName;
    JButton send;
    JLabel lblEr;
    JList list;
    DefaultListModel listModel;
    ArrayList<String> aDati;

    DefaultComboBoxModel comboBoxModel;


    public Finestra() {
        setTitle("");
        initComponent();
        pack();
        setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void initComponent() {
        setLayout(new FlowLayout());

        surname = new JLabel("Cognome: ");
        this.add(surname);
        txtSurname = new JTextField(20);
        this.add(txtSurname);

        name = new JLabel("Nome: ");
        this.add(name);
        txtName = new JTextField(20);
        this.add(txtName);

        list = new JList();
        this.add(list);

        send = new JButton("Invia");
        this.add(send);
        send.addActionListener(this);

        lblEr = new JLabel();
        this.add(lblEr);

        listModel = new DefaultListModel();
        list = new JList(listModel);
        JScrollPane jsp = new JScrollPane(list);
        this.add(jsp);

        comboBoxModel = new DefaultComboBoxModel();
        JComboBox comboText = new JComboBox(comboBoxModel);
        JScrollPane jsp2 = new JScrollPane(comboText);
        this.add(jsp2);
    }

    @Override
    public void actionPerformed(ActionEvent ar) {
        if (txtSurname.getText() == "" || txtName.getText() == "") {
            JOptionPane.showMessageDialog(null, "Devi inserire i dati!");
        } else {
            String stringa = txtSurname.getText() + " " + txtName.getText();
            listModel.addElement(stringa);
            comboBoxModel.addElement(stringa);
            txtSurname.setText("");
            txtName.setText("");
            aDati.add(stringa);
        }

    }

    public static void main(String[] args) {
        Finestra finestra = new Finestra();
    }
}

