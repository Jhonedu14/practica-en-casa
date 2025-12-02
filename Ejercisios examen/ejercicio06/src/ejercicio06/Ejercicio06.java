/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int numero = 1;
        int contador = 1;
        String mensaje = "";
        String cadena = "";
        double resultado = 1;

        while (contador <= 15) {
            numero = numero * -1;
            contador = contador + 2;
            resultado = resultado + ((double) numero / contador);
            
            if (numero == 1){
                mensaje = String.format("+ %d/%d", numero,contador);
            } else {
                mensaje = String.format("%d/%d", numero,contador);
        }
            cadena = String.format("%s %s", cadena,mensaje);
        }
        System.out.printf("1%s",cadena);
        System.out.printf("\nEl resultado de la serie es:%.4f\n",resultado);
    }

    }
    
