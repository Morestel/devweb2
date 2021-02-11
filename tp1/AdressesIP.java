package tp1;

import java.net.*;

public class AdressesIP{
    public static void main(String[] args){
        try{
            InetAddress localhost = InetAddress.getLocalHost();
            System.out.println("On est sur " + localhost);
            System.out.println(" nom: " + localhost.getHostName());
            System.out.println(" adresse: " + localhost.getHostAddress());

            System.out.println("Machiesnd ont le nom est " + args[0]);
            InetAddress[] adressesIP = InetAddress.getAllByName(args[0]);
            for (int i = 0; i < adressesIP.length; i++){
                System.out.print(adressesIP[i]);
                System.out.print(" nom: " + adressesIP[i].getHostName());
                System.out.println(" adresse: " + adressesIP[i].getHostAddress());
                }
            }
            catch (UnknownHostException uhe){}
        }
}