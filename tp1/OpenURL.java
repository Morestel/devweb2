package tp1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class OpenURL {
    public static void main(String[] args){
        // TODO Auto-generated method stub
        try {
            URL url = new URL ("https://google.com");
            
        try {
            java.net.URLConnection urlcon = url.openConnection();
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            
            String input;
            while ((input = reader.readLine())!=null){
                System.out.println(input);
            }
            
            reader.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
