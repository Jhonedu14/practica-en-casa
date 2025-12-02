/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercisio02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejercisio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre_herramienta;
        double precio_unitario;
        int tipo_herramienta;
        String categoria;
        double valor_base;
        double porcentaje_impuesto;
        double valor_impuesto;
        double valor_final;
        int contador;
        String reporte_final;
        contador = 1;
        
        reporte_final = String.format("Listado de herramientas\n");

        while (contador <= 4) {
            System.out.println("Ingrese el nombre de la herramienta:");
            nombre_herramienta = entrada.nextLine();

            System.out.println("Ingrese el precio unitario:");
            precio_unitario = entrada.nextDouble();

            System.out.println("Ingrese el tipo (1=Construcción,"
                    + " 2=Electricidad, 3=Jardinería):");
            tipo_herramienta = entrada.nextInt();

            entrada.nextLine();

            if (tipo_herramienta == 1) {
                categoria = "Construcción";
            } else {
                if (tipo_herramienta == 2) {
                    categoria = "Electricidad";
                } else {
                    if (tipo_herramienta == 3) {
                        categoria = "Jardinería";
                    } else {
                        categoria = "Sin Categoría";
                    }
                }
            }
            if (precio_unitario <= 0) {
                valor_base = 0;
                porcentaje_impuesto = 0;
                valor_impuesto = 0;
                valor_final = 0;
            } else {
                valor_base = precio_unitario;

                if (tipo_herramienta == 1 || tipo_herramienta == 2) {
                    porcentaje_impuesto = 8;

                } else {
                    if (tipo_herramienta == 3) {
                        porcentaje_impuesto = 10;

                    } else {
                        porcentaje_impuesto = 18;
                    }
                }

                valor_impuesto = valor_base * (porcentaje_impuesto / 100);

                valor_final = valor_base + valor_impuesto;
            }

            reporte_final = String.format("%s%d. %s (%s), valor base: $%.2f, "
                    + "impuesto (%.0f%%): $%.2f, valor final: $%.2f\n",
                    reporte_final,
                    contador,
                    nombre_herramienta,
                    categoria,
                    valor_base,
                    porcentaje_impuesto,
                    valor_impuesto,
                    valor_final);

            contador = contador + 1;
        }
        System.out.println(reporte_final);
    }

}

