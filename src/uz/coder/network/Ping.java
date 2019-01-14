package uz.coder.network;

import java.io.IOException;
import java.net.InetAddress;


public class Ping {
    private static void sendPingRequest(String ipAddress) throws IOException {
        InetAddress myHost = InetAddress.getByName(ipAddress);
        System.out.println("Sending Ping Request to " + ipAddress);
        if (myHost.isReachable(5000)) {
            System.out.println("Host is reachable");
        } else {
            System.out.println("Sorry ! We can't reach to this host");
        }
    }

    private static void myPing(String ipAddress) throws IOException {
        InetAddress address = InetAddress.getByName(ipAddress);
        boolean reachable = address.isReachable(10000);
        System.out.println("Is gost reachable? " + reachable);
    }

    public static void main(String[] args) throws IOException {
        String ipAddress = "127.0.0.1";
        sendPingRequest(ipAddress);


        ipAddress = "192.168.36.1";
        sendPingRequest(ipAddress);

        ipAddress = "213.230.96.71";
        sendPingRequest(ipAddress);
        myPing(ipAddress);
    }
}
