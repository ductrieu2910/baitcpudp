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
import java.util.Scanner;
public class UDP_client {
    public static void main(String[] args) {
         try {
            DatagramSocket client = new DatagramSocket(6789);
            byte[] nhan = new byte[1024];
            byte[] gui = new byte[1024];
            Scanner sc=new Scanner(System.in);
            System.out.println("Nhan chuoi can gui:");
            String mess=sc.nextLine();
            gui=mess.getBytes();
            InetAddress host = InetAddress.getByName("localhost");
            int port=8888;
            DatagramPacket guipactket =new DatagramPacket(gui,gui.length,host, port);
            client.send(guipactket);
            DatagramPacket nhanpactket =new DatagramPacket(nhan,nhan.length);
            client.receive(nhanpactket);
            String response = new String(nhanpactket.getData());
            System.out.println("<Server>: So tu la "+response);
        } catch (Exception ex) {
            System.out.println("Loi:" + ex.getMessage());
        }
    }
}
