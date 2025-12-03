/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package plantila_swcht_while;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Plantila_swcht_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        boolean bandera = true;
        String respuesta;
        String reporte = "";
        int contador = 0;

        // ------------------------------------------------------
        // VARIABLES QUE TÚ CAMBIARÍAS SEGÚN EL PROBLEMA:
        // String producto;
        // int tipoProducto;
        // double precio;
        // ------------------------------------------------------

        while (bandera) {

            // PEDIR DATOS --------------------------------
            System.out.println("Ingrese nombre del item:");
            String nombre = entrada.nextLine();

            System.out.println("Seleccione tipo (1, 2 o 3):");
            int tipo = entrada.nextInt();
            entrada.nextLine(); // limpiar

            // CLASIFICACIÓN CON SWITCH -------------------
            String categoria;
            switch (tipo) {
                case 1:
                    categoria = "Categoria A";
                    break;
                case 2:
                    categoria = "Categoria B";
                    break;
                case 3:
                    categoria = "Categoria C";
                    break;
                default:
                    categoria = "Categoria desconocida";
                    break;
            }

            // ACUMULADOR DE REPORTE ----------------------
            contador = contador + 1;
            reporte = reporte + "Registro " + contador + ": " +
                    nombre + " - tipo " + tipo +
                    " (" + categoria + ")\n";

            // PREGUNTAR PARA REPETIR ---------------------
            System.out.println("¿Desea ingresar otro? (si/no)");
            respuesta = entrada.nextLine();

            if (respuesta.equals("no")) {
                bandera = false;
            }
        }

        // MOSTRAR REPORTE -------------------------------
        System.out.println("\nREPORTE FINAL:");
        System.out.println(reporte);
        System.out.println("Total de registros: " + contador);
    }
    }
    

