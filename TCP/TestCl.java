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
import java.util.Scanner;

public class TestCl {

    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 8888);
            System.out.println("Ket noi server thanh cong:");
            PrintWriter gui = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
            BufferedReader nhan = new BufferedReader(new InputStreamReader(s.getInputStream()));
            Scanner sc = new Scanner(System.in);
           
                System.out.println("Nhap :");
                float mess = sc.nextFloat();
                System.out.println("<Client>:"+mess);
                int receive=(int)mess;
                gui.println(receive);
                gui.flush();
                
                String tn = nhan.readLine();
                System.out.println("<Server>: " + tn);
                
                System.out.println("Nhap:");
                float mess2 = sc.nextFloat();
                System.out.println("<Client>:"+mess);
                int receive2=(int)mess2;
                gui.println(receive2);
                gui.flush();
                
                String tn2 = nhan.readLine();
                System.out.println("<Server>: " + tn2);
                
                nhan.close();
                gui.close();
                s.close();
        } catch (Exception ex) {
            System.out.println("Loi:" + ex.getMessage());
        }
    }
}
