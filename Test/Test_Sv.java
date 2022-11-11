/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import java.net.*;
import java.io.*;

/**
 *
 * @author Administrator
 */
public class Test_Sv {

    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(8888);
            while (true) {
                System.out.println("Cho ket noi tu Client");
                Socket sk = server.accept();
                PrintWriter gui = new PrintWriter(new OutputStreamWriter(sk.getOutputStream()));
                BufferedReader nhan = new BufferedReader(new InputStreamReader(sk.getInputStream()));
                System.out.println("Co 1 ket noi tu Client:" + sk.getInetAddress().getHostAddress());
                int mess = Integer.valueOf(nhan.readLine());
                System.out.println("<Client>" + mess);
                String send = "";
                switch (mess) {
                    case (0):
                        send = "One";
                        gui.println(send);
                        gui.flush();
                    case (1):
                        send = "Two";
                        gui.println(send);
                        gui.flush();
                    case (2):
                        send = "Three";
                        gui.println(send);
                        gui.flush();
                    case (3):
                        send = "Four";
                        gui.println(send);
                        gui.flush();
                    case (4):
                        send = "Fine";
                        gui.println(send);
                        gui.flush();
                    case (5):
                        send = "Six";
                        gui.println(send);
                        gui.flush();
                    case (6):
                        send = "Seven";
                        gui.println(send);
                        gui.flush();
                    case (7):
                        send = "Eight";
                        gui.println(send);
                        gui.flush();
                    case (8):
                        send = "Nine";
                        gui.println(send);
                        gui.flush();

                }
                int mess2 = Integer.valueOf(nhan.readLine());
                System.out.println("<Client>" + mess2);
                switch (mess2) {
                    case (0):
                        send = "One";
                        gui.println(send);
                        gui.flush();
                    case (1):
                        send = "Two";
                        gui.println(send);
                        gui.flush();
                    case (2):
                        send = "Three";
                        gui.println(send);
                        gui.flush();
                    case (3):
                        send = "Four";
                        gui.println(send);
                        gui.flush();
                    case (4):
                        send = "Fine";
                        gui.println(send);
                        gui.flush();
                    case (5):
                        send = "Six";
                        gui.println(send);
                        gui.flush();
                    case (6):
                        send = "Seven";
                        gui.println(send);
                        gui.flush();
                    case (7):
                        send = "Eight";
                        gui.println(send);
                        gui.flush();
                    case (8):
                        send = "Nine";
                        gui.println(send);
                        gui.flush();
                }
            }
        } catch (Exception ex) {
            System.out.println("Loi:" + ex.getMessage());
        }
    }
}
