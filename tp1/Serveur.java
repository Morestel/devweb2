package tp1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {
    public static void main(String[] args) throws IOException{
        final int PORT = 8888;
        ServerSocket server = new ServerSocket(PORT, 1);
        System.out.println("En attende de client...");
        while(true){
            Socket s = server.accept();
            try{
                BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
                PrintWriter out = new PrintWriter(s.getOutputStream());
                String ligne;
                ligne = in.readLine();
                while(!(ligne.equals("xyz") || ligne == null)){
                    System.out.println("Recu montant euros: " + ligne);
                    System.out.println("Envoye montant en dollars: " + Integer.parseInt(ligne)/(double)0.84);
                    out.println(ligne);
                    out.flush();
                    ligne = in.readLine();
                }
                System.out.println("Bye !");
            }catch(IOException e){}
            s.close();
        }
    }
}
