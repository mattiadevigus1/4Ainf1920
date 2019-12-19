import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderExample {

    public static void main(String [] args) throws FileNotFoundException, IOException {
        BufferedReader reader = new BufferedReader(new FileReader("c://prova.txt"));
        String line = reader.readLine();
        while(line!=null) {
            System.out.println(line);
            line = reader.readLine();
        }
    }

}