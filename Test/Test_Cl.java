/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import java.net.*;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Test_Cl {

    public static void main(String[] args) {
        try {
            Socket client = new Socket("localhost", 8888);
            PrintWriter gui = new PrintWriter(new OutputStreamWriter(client.getOutputStream()));
            BufferedReader nhan = new BufferedReader(new InputStreamReader(client.getInputStream()));
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap 1 so thuc:");
            float a = sc.nextFloat();
            int mess = (int) a;
            gui.println(mess);
            gui.flush();
            String response=nhan.readLine();
            System.out.println("<Server>: "+response);
            float b = sc.nextFloat();
            int mess2 = (int) b;
            gui.println(mess2);
            gui.flush();
            String response2=nhan.readLine();
            System.out.println("<Server>: "+response2);
        } catch (Exception ex) {
            System.out.println("Loi:" + ex.getMessage());
        }
    }
}
