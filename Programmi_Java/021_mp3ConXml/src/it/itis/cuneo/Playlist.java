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

    public void scriviXml(){
        BufferedWriter bw = null;
        try {
            simulaPercorso();
            bw = new BufferedWriter(new FileWriter(FILE_NAME));
            bw.write(this.toXml());
            System.out.println(this.toXml());
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void simulaPercorso() {
    }

    //https://www.mkyong.com/java/jaxb-hello-world-example/
    public void marshallingXml(){
        try {
            File file = new File(Percorso.FILE_NAME);
            JAXBContext jaxbContext = JAXBContext.newInstance(Playlist.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(this, file);
            jaxbMarshaller.marshal(this, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }


    public void unmarshallingXml() {
        try {
            File file = new File(Percorso.FILE_NAME);
            JAXBContext jaxbContext = JAXBContext.newInstance(Percorso.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Percorso percorso = (Percorso) jaxbUnmarshaller.unmarshal(file);
            System.out.println(percorso);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

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
