package tp1;

import java.net.*;

public class ServeurUDP {
    public final static int PORT_ECHO = 7777;

    public static void main(String[] args){
        int taille = 1024;
        byte[] tampon = new byte[taille];
        String message = null;
        try{
            DatagramSocket socket = new DatagramSocket(PORT_ECHO);
            do{
                DatagramPacket paquet = new DatagramPacket(tampon, taille);
                socket.receive(paquet);
                message = new String(paquet.getData(), 0, paquet.getLength());
                System.out.println("message " + message);
                System.out.println("machine " + paquet.getAddress() + " port " + paquet.getPort());
                socket.send(paquet);
            }while(!message.equals("stop"));
        }
        catch(Exception e){
            System.err.println("probleme"+e);
        }
    }
}
