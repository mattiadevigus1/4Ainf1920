package it.itis.cuneo;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Hotel {
    public static final String FILE_PATH = "C:\\Users\\Mattia Devigus\\Desktop\\035_hotel\\hotel.xml" ;
    public ArrayList<Camera> camera;

    public Hotel() {
        super();
        camera = new ArrayList<Camera>();
    }

    public ArrayList<Camera> getCamera() {
        return camera;
    }


    public void addCamera(Camera camera)
    {
        this.camera.add(camera);
    }

    @XmlElement
    public void setCamera(ArrayList<Camera> camera) {
        this.camera = camera;
    }

    public void marshallingXml()
    {
        try{
            File file = new File(Hotel.FILE_PATH);
            JAXBContext jaxbContext = JAXBContext.newInstance(Hotel.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(this, file);
            jaxbMarshaller.marshal(this, System.out);
        }
        catch (JAXBException e)
        {
            e.printStackTrace();
        }
    }

    public void unmarshallingXml() {
        try {
            File file = new File(Hotel.FILE_PATH);
            JAXBContext jaxbContext = JAXBContext.newInstance(Hotel.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Hotel hotel = (Hotel) jaxbUnmarshaller.unmarshal(file);
            System.out.println(hotel);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }

    public void simula()
    {
        Hotel hotel= new Hotel();
        Camera camera= new Camera("Camera" , 2, 1 , "Brutta");
        hotel.addCamera(camera);
        Camera camera1 = new Camera("Camera1" , 5, 2 , "bella");
        hotel.addCamera(camera1);
        Camera camera2 = new Camera("Camera2" , 1 , 1 , "Boh");
    }


    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        hotel.simula();
        hotel.unmarshallingXml();
        hotel.marshallingXml();
    }

}
