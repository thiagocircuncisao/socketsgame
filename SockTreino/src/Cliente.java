
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thiago
 */
public class Cliente {
    public static void main(String[] args) throws Exception{
        Socket cliente = new Socket("127.0.0.1", 12345);
        PrintWriter esc = new PrintWriter(cliente.getOutputStream(), true);
        Scanner teclado = new Scanner(System.in);
        String msg = teclado.nextLine();
        esc.println(msg);
    }
}
