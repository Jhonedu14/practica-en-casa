/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_ciclo_while_jugadores;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejercicio_ciclo_while_jugadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre;
        String posicion;
        int edad;
        double estatura;
        int sumaEdades = 0;
        double sumaEstaturas = 0;
        int numJugadores = 0;
        double promedioEdades = 0;
        double promedioEstaturas = 0;
        String cadenaReporteJugadores = "";
        String cadenaReporteEdades = "";
        boolean bandera = true;

        while (bandera == true) {

            numJugadores = numJugadores + 1;

            System.out.println("Ingrese el nombre del jugador:");
            nombre = entrada.nextLine();

            System.out.println("Ingrese la posición en el campo de juego:");
            posicion = entrada.nextLine();

            System.out.println("Ingrese la edad del jugador:");
            edad = entrada.nextInt();
            entrada.nextLine();

            System.out.println("Ingrese la estatura del jugador:");
            estatura = entrada.nextDouble();
            entrada.nextLine();

            cadenaReporteJugadores = String.format("%s%d. %s -%s-, edad %d, "
                    + "estatura %.2f\n", cadenaReporteJugadores, numJugadores,
                    nombre, posicion, edad, estatura);

            cadenaReporteEdades = String.format("%s%d\n", cadenaReporteEdades,
                    edad);

            sumaEdades = sumaEdades + edad;
            sumaEstaturas = sumaEstaturas + estatura;

            System.out.println("Ingrese si para continuar");
            String respuesta = entrada.nextLine();

            if (!respuesta.equals("si")) {
                bandera = false;
            }
        }
        if (numJugadores > 0) {
            promedioEdades = (double) sumaEdades / numJugadores;
            promedioEstaturas = sumaEstaturas / numJugadores;
        }

        String reporteFinal = String.format("Listado de Jugadores\n%sListado"
                + " de Edades\n%sPromedio de edades: %.1f\nPromedio de "
                + "estaturas: %.2f\n", cadenaReporteJugadores,
                cadenaReporteEdades, promedioEdades, promedioEstaturas);

        System.out.println(reporteFinal);
    }
}
