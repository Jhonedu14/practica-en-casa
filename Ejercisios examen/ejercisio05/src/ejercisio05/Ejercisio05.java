/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercisio05;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Ejercisio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String cadena = "";
        int contador = 1;

        while (contador <= 10) {
            int valor = contador * (contador + 1);

            cadena = String.format("%s%d\n", cadena, valor);

            contador = contador + 1;
        }
        System.out.printf("Calculo generado: \n", cadena);
        System.out.printf(cadena);
    }
}
    
    

