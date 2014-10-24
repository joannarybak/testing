/*
 * Program łączący się z zegarem atomowym  w Boulder, stan Colorado, i
 * wyświetlający uzyskany czas.
 */
package listing3.pkg1;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Asia
 */
public class Listing31 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        try (Socket s = new Socket("localhost", 8189)) //  tworzy gniazdo i łączy je z portem hosta zdalnego.
        {
            InputStream inStream = s.getInputStream(); // zwraca strumienie umożliwiające odczyt danych do gniazda.
            Scanner in = new Scanner(inStream);
            while (in.hasNextLine()) {
                String line = in.nextLine();
                System.out.println(line);           }
        }
    }
    
}
