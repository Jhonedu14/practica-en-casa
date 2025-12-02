/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercisio08;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Ejercisio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
 Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String acumulador = "";
        int numero = 1;

        while (numero <= 10) {
            System.out.println("ingrese el numero");
            numero = entrada.nextInt();

            if (numero % 2 == 0) {
                numero = numero * (-1);
            } else {
                numero = numero * 1;
            }

            acumulador = acumulador + numero + "\n";
        }

        System.out.println("Resultados:");
        System.out.printf(acumulador);
    }
}

