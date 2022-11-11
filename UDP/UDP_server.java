/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Administrator
 */
package UDP;

import java.net.*;
import java.io.*;
import java.util.StringTokenizer;

public class UDP_server {

    public static void main(String[] args) {
        try {
            DatagramSocket server = new DatagramSocket(8888);
            byte[] nhan = new byte[1024];
            byte[] gui = new byte[1024];
            System.out.println("Cho goi tin tu client:");
            while (true) {
                DatagramPacket nhanpacket = new DatagramPacket(nhan, nhan.length);
                server.receive(nhanpacket);
                String mess = new String(nhanpacket.getData());
                System.out.println("<Client>:" + mess);
//                int i = 0, count = 1;
//                char[] arrmess = mess.toCharArray();
//                while (arrmess[i] == ' ') {
//                    i++;
//                }
//                for (int j = i; j < arrmess.length - 1; j++) {
//                    if (arrmess[j] == ' ' && arrmess[j + 1] != ' ') {
//                        count++;
//                    }
//                }
                StringTokenizer stringTokenizer = new StringTokenizer(mess);
                int count =stringTokenizer.countTokens();
                String response=String.valueOf(count);
                gui = response.getBytes();
                InetAddress ipclient = nhanpacket.getAddress();
                int portclient = nhanpacket.getPort();
                DatagramPacket guipacket = new DatagramPacket(gui, gui.length, ipclient, portclient);
                server.send(guipacket);
            }
        } catch (Exception ex) {
            System.out.println("Loi:" + ex.getMessage());
        }
    }
}
