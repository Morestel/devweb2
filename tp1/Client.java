package tp1;

import java.io.*;
import java.net.*;


public class Client {
    public static void main(String[] args) throws IOException{

        final int PORT = 8888;
        Socket s = new Socket("localhost", PORT);
        InputStream in = s.getInputStream();
        OutputStream out = s.getOutputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        PrintWriter writer = new PrintWriter(out);
        String commande = "5\n";
        System.out.print("Envoie: " + commande);
        writer.print(commande);
        writer.flush();
        String reponse = reader.readLine();
        System.out.println("Recu: "+ reponse);
        commande = "xyz";
        System.out.print("Envoie :" + commande);
        writer.print(commande);
        writer.flush();
        s.close();
    }
}
