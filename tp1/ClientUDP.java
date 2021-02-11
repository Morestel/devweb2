package tp1;

import java.net.*;

public class ClientUDP {
    public static void main(String[] args){
        if (args.length < 2){
            System.err.println("Usage: java EchoUDPClient [nom serveur] [message]");
            System.exit(1);
        }

        byte[] message = args[1].getBytes();
        DatagramSocket socket = null;
        try{
            int port = ServeurUDP.PORT_ECHO;
            InetAddress serveur = InetAddress.getByName(args[0]);
            DatagramPacket envoie = new DatagramPacket(message, message.length, serveur, port);
            socket = new DatagramSocket();
            socket.send(envoie);
            System.out.println("Le message " + args[1] + "a été envoyé");
        }catch(Exception e){
            System.err.println("impossible d'envoyer le message"+e);
            System.exit(1);
        }
        int taille = 1024;
        try{
            socket.setSoTimeout(2000);
            DatagramPacket recoie = new DatagramPacket(new byte[taille], taille);
            socket.receive(recoie);
            System.out.print("On a recu " + new String(recoie.getData(), 0, recoie.getLength()));
            System.out.print(" depuis " + recoie.getAddress() + "port " + recoie.getPort());
        }catch(Exception e){
            System.err.println("Impossible d'avoir la réponse " + e);
            System.exit(1);
        }
    }
}
