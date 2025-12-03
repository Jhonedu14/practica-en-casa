/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package plantilla_while_if_else;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Plantilla_while_if_else {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        boolean bandera = true;     // bandera para controlar el ciclo
        String respuesta;           // guarda si continúa "si/no"
        String reporte = "";        // acumulador para reporte final
        int contador = 0;           // lleva cuántos registros hizo

        // ------------------------------------------------------
        // VARIABLES QUE TÚ CAMBIARÍAS SEGÚN EL PROBLEMA:
        // String nombre;
        // int edad;
        // double nota;
        // double precio;
        // ------------------------------------------------------

        while (bandera) {   // SE USA CUANDO NO SABES CUÁNTOS REGISTROS HABRÁ

            // PEDIR DATOS ----------------------------
            System.out.println("Ingrese nombre:");
            String nombre = entrada.nextLine();

            System.out.println("Ingrese un valor numerico:");
            int numero = entrada.nextInt();
            entrada.nextLine(); // limpiar buffer

            // CONDICIONES (IF / ELSE) ------------------
            String categoria = ""; // variable que cambia según condición

            if (numero < 5) {
                categoria = "Valor muy bajo";
            } else if (numero >= 5 && numero <= 10) {
                categoria = "Valor intermedio";
            } else {
                categoria = "Valor alto";
            }

            // GUARDAR EN ACUMULADOR ---------------------
            contador = contador + 1;
            reporte = reporte + "Registro " + contador + ": "
                    + nombre + " - valor " + numero
                    + " (" + categoria + ")\n";

            // PREGUNTAR SI SE REPITE --------------------
            System.out.println("¿Desea ingresar otro? (si/no)");
            respuesta = entrada.nextLine();

            if (respuesta.equals("no")) {
                bandera = false;  // termina el ciclo
            }
        }

        // MOSTRAR RESULTADO ------------------------------
        System.out.println("\nREPORTE FINAL");
        System.out.println(reporte);
        System.out.println("Total de registros: " + contador);
    }
}
    
    

