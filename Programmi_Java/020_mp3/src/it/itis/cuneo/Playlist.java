package it.itis.cuneo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Playlist{
    List<Brano> lista;
    private static int cont= 0;

    public Playlist(List<String> lista) {
        this.lista = new ArrayList<>(20);
    }

    public Playlist() {
    }

    public List<Brano> getLista() {
        return lista;
    }

    public void setLista(List<Brano> lista) {
        this.lista = lista;
    }

    private void aggiungi(Brano brano)
    {
        lista.add(brano);
        cont++;
    }

    private void elimina(Brano brano)
    {
        lista.remove(brano);
    }


    @Override
    public String toString() {
        return "Playlist{" +
                "lista=" + lista +
                '}';
    }

    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Mattia Devigus\\Desktop\\020_mp3\\lol.csv";
        File file = new File(path);
        if (file.exists())
        {System.out.println("Il file esiste \n");}
        else if (file.createNewFile())
        {
            System.out.println("Il file è stato creato \n");
        }


        List list = new ArrayList(20);
        Brano brano = new Brano("Prova", "Io", "20" );
        Brano brano2 = new Brano("Pro2va", "I2o", "220" );
        Playlist playlist = new Playlist(list);
        playlist.aggiungi(brano);
        playlist.aggiungi(brano2);
        playlist.elimina(brano);
        FileWriter bw = new FileWriter(file);
        bw.append("Name");
        bw.append(",");
        bw.append("Role");
        bw.append(",");
        bw.append("Topic");
        bw.append("\n");
        int i;
        for (i=0;i<20;i++) {
            bw.append(String.join(","));
            bw.append("\n");
        }
        System.out.println(playlist.toString());
    }
}
