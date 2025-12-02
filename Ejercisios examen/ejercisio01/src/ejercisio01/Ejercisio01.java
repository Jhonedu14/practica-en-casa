/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercisio01;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Ejercisio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre_ciudadano;
        int edad;
        double temperatura_c;
        double temperatura_f;
        int frecuencia;
        int presion;
        String categoria_presion;
        int total_registrados = 0;
        double total_edades = 0;
        double total_temperaturas_f = 0;
        double total_frecuencias = 0;
        String respuesta;
        boolean bandera = true;

        String reporte_final = " Reporte final de Ciudadanos  ingresados\n";
        reporte_final = String.format(reporte_final + "---------------------\n");

        while (bandera) {

            System.out.println("Ingrese la edad del ciudadano por favor:");
            edad = entrada.nextInt();
            entrada.nextLine();

            if (edad >= 5) {

                System.out.println("Ingrese nombres completos del ciudadano:");
                nombre_ciudadano = entrada.nextLine();

                System.out.println("Ingrese la temperatura corporal en C:");
                temperatura_c = entrada.nextDouble();

                System.out.println("Ingrese la frecuencia cardiaca en "
                        + "latidos por minuto:");
                frecuencia = entrada.nextInt();

                System.out.println("Ingrese la presion arterial:");
                presion = entrada.nextInt();

                entrada.nextLine();

                temperatura_f = temperatura_c * 9 / 5 + 32;

                if (presion < 60) {
                    categoria_presion = "Presion mal tomada";
                } else if (presion >= 60 && presion <= 80) {
                    categoria_presion = "Normal";
                } else if (presion > 80 && presion < 100) {
                    categoria_presion = "Elevada minima";
                } else {
                    categoria_presion = "Elevada maxima";
                }

                total_registrados = total_registrados + 1;
                total_edades = total_edades + edad;
                total_temperaturas_f = total_temperaturas_f + temperatura_f;
                total_frecuencias = total_frecuencias + frecuencia;

                reporte_final = String.format("%sCiudadano %d:\n"
                        + "  Nombre: %s\n"
                        + "  Edad: %d años\n"
                        + "  Temperatura: %.2f °F\n"
                        + "  Frecuencia cardiaca: %d lpm\n"
                        + "  Presion diastólica: %d (%s)\n\n",
                        reporte_final,
                        total_registrados,
                        nombre_ciudadano,
                        edad,
                        temperatura_f,
                        frecuencia,
                        presion,
                        categoria_presion);

            }

            System.out.println("Desea ingresar otro ciudadano si o no");
            respuesta = entrada.nextLine();

            switch (respuesta) {
                case "si":
                    bandera = true;
                    break;
                case "no":
                    bandera = false;
                    break;
            }
        }

        if (total_registrados > 0) {

            double promedio_edad = total_edades / total_registrados;
            double promedio_temperatura_f = total_temperaturas_f
                    / total_registrados;
            double promedio_frecuencia = total_frecuencias / total_registrados;

            reporte_final = String.format(
                    "%sResumen final\n"
                    + "------------------------------\n"
                    + "Ciudadanos registrados: %d\n"
                    + "Promedio de edades: %.2f años\n"
                    + "Promedio de temperatura: %.2f °F\n"
                    + "Promedio de frecuencia cardiaca: %.2f lpm\n",
                    reporte_final,
                    total_registrados,
                    promedio_edad,
                    promedio_temperatura_f,
                    promedio_frecuencia);

        } else {

            reporte_final = "no se registran ciudadanos si >= 5 años)";
        }

        System.out.println("\n" + reporte_final);
    }
}
