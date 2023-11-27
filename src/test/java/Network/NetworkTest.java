package Network;

import java.io.IOException;
import java.net.*;

public class NetworkTest {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://www.google.com");
        checkConnection(url);
        checkPing(url.getHost());
    }


    static void checkConnection(URL url){
        try {
            URLConnection connection = url.openConnection();
            connection.connect();
            System.out.println("Internet is connected");
        } catch (MalformedURLException e) {
            System.out.println("Internet is not connected");
        } catch (IOException e) {
            System.out.println("Internet is not connected");
        }
    }

    static void checkPing(String url){
        try{
            InetAddress address = InetAddress.getByName(url);
            System.out.println("Pinging " + address);
            int timeout = 3000;
            for (int i = 0; i < 4; i++) {
                long start = System.currentTimeMillis();
                boolean reachable = address.isReachable(timeout);
                long end = System.currentTimeMillis();
                System.out.println("Reachable: " + reachable + ", Time: " + (end - start));
            }
        }catch (IOException i){
            throw new Error(i);
        }
     }
}
