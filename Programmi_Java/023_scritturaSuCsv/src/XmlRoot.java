import javax.xml.bind.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

@XmlRootElement
public class XmlRoot {
    XML xml1 = new XML();
    public static final String path  = "C:\\Users\\Mattia Devigus\\Desktop\\csv\\xmldoc.xml" ;
    public static String  separator = "," ;
    public ArrayList<XML> xml;

    public XmlRoot(ArrayList<XML> xml) {
        this.xml = xml;
    }

    public XmlRoot() {
    }

    public ArrayList<XML> getXml() {
        return xml;
    }

    @XmlElement
    public void setXml(ArrayList<XML> xml) {
        this.xml = xml;
    }

    //Lettura XML
    public void marshallingXML () {
        File file = new File (path);

        try {

            JAXBContext jaxbContext = JAXBContext.newInstance(XmlRoot.class);

            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            //This è i riferimento alla classeattuale
            jaxbMarshaller.marshal(this, file);
            jaxbMarshaller.marshal(this, System.out);

        } catch (JAXBException e) {

            e.printStackTrace();

        }
    }

    //Unmarshalling
    public void unMarshallingXml () {
        try {

            File file = new File(CSV.path);
            JAXBContext jaxbContext = JAXBContext.newInstance(XmlRoot.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            XmlRoot customer = (XmlRoot) jaxbUnmarshaller.unmarshal(file);
            System.out.println(customer);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }

}
