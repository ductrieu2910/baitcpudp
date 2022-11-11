/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
package TCP;
import java.net.*;
import java.io.*;

public class TestSv {

    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(8888);
            System.out.println("Cho ket noi tu Client");
            Socket sk = server.accept();
            System.out.println("Có 1 ket noi tu Client:" + sk.getInetAddress().getHostAddress());
            
            PrintWriter gui = new PrintWriter(new OutputStreamWriter(sk.getOutputStream()));
            BufferedReader nhan = new BufferedReader(new InputStreamReader(sk.getInputStream()));
           
           while(true){
            int mess = Integer.valueOf(nhan.readLine());
            System.out.println("<Client>:"+mess);
            String send="";
            switch (mess) {
                case (0):
                    send="One";
                    gui.println(send);
                    gui.flush();
                    break;
                case (1):
                    send="Two";
                    gui.println(send);
                    gui.flush();
                    break;
                case (2):
                    send="Three";
                    gui.println(send);
                    gui.flush();
                    break;
                case (3):
                    send="Four";
                    gui.println(send);
                    gui.flush();              
                    break;
                case (4):
                    send="Fine";
                    gui.println(send);
                    gui.flush();                 
                    break;
                case (5):
                    send="Six";
                    gui.println(send);
                    gui.flush();                    
                    break;
                case (6):
                    send="Seven";
                    gui.println(send);
                    gui.flush();
               
                    break;
                case (7):
                    send="Eight";
                    gui.println(send);
                    gui.flush();              
                    break;
                case (8):
                    send="Nine";
                    gui.println(send);
                    gui.flush();
                    break;
                default:
                    send="Gia tri khong dung";
                    gui.println(send);
                    gui.flush();
                }
          int mess2 = Integer.valueOf(nhan.readLine());
            System.out.println("<Client>:"+mess);
            
            switch (mess2) {
                case (0):
                    send="One";
                    gui.println(send);
                    gui.flush();
                    break;
                case (1):
                    send="Two";
                    gui.println(send);
                    gui.flush();
                    break;
                case (2):
                    send="Three";
                    gui.println(send);
                    gui.flush();
                    break;
                case (3):
                    send="Four";
                    gui.println(send);
                    gui.flush();              
                    break;
                case (4):
                    send="Fine";
                    gui.println(send);
                    gui.flush();                 
                    break;
                case (5):
                    send="Six";
                    gui.println(send);
                    gui.flush();                    
                    break;
                case (6):
                    send="Seven";
                    gui.println(send);
                    gui.flush();
               
                    break;
                case (7):
                    send="Eight";
                    gui.println(send);
                    gui.flush();              
                    break;
                case (8):
                    send="Nine";
                    gui.println(send);
                    gui.flush();
                    break;
                default:
                    send="Gia tri khong dung";
                    gui.println(send);
                    gui.flush();
                }
            }
        } catch (Exception ex) {
            System.out.println("Loi:" + ex.getMessage());
        }
    }
}
