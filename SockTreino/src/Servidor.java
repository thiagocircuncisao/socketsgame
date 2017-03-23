
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thiago
 */
public class Servidor {
    public static void main(String[] args) throws Exception{
            ServerSocket server = new ServerSocket(12345);
            System.out.println("Aguardando conexão");
            Socket cliente = server.accept();
            if(cliente.isConnected())
                System.out.println("Cliente conectado");
            Scanner read = new Scanner(cliente.getInputStream());
            String msg = read.nextLine();
            System.out.println(msg);
            PrintWriter esc = new PrintWriter(cliente.getOutputStream(), true);
            esc.println(msg);
    }
}
