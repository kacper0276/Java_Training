package ProgramowanieSieciowe;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InnetAddresNauka {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("www.ckziubrodnica.pl");
            System.out.println("Host: " + ip.getHostName());
            System.out.println("Ip: " + ip.getHostAddress());

            InetAddress address[] = InetAddress.getAllByName("www.ckziubrodnica.pl");
            for(int i = 0; i < address.length; i++) {
                System.out.println("address: " + address[i]);
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
