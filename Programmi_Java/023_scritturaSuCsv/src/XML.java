import javax.xml.bind.annotation.XmlElement;

public class XML {
    private String id ;
    private String name;
    private String autore;

    public XML(String id, String name, String autore) {
        this.id = id;
        this.name = name;
        this.autore = autore;
    }

    public XML() {
    }

    public String getId() {
        return id;
    }

    @XmlElement
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public String getAutore() {
        return autore;
    }

    @XmlElement
    public void setAutore(String autore) {
        this.autore = autore;
    }
}
