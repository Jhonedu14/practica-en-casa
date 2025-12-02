/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
                    
       
        System.out.println("Bienvenido a Peaje Buena Via, "
                + "por favor, ingrese su nombre y su apellido: ");
                    String propietario = entrada.nextLine();
        
        System.out.printf("\nSeñor %s,¿Cual es el  tipo de vehiculo que tiene?\n"
                ,propietario);
        
        System.out.printf("\nTipo 1: Vehiculo liviano particular\nTipo 2: "
                + "Vehiculo grande particular"
                + "\nTipo 3: Taxi\nTipo 4: Bus \n\n");
            int opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el valor de su"
                            + " vehiculo liviano particular por favor: ");
                    double valor1 = entrada.nextDouble();
                    double avaluo1;
                    double peaje1;
                    avaluo1 = (valor1 * 0.01) / 100;
                    peaje1 = avaluo1 + 2;
                   
                    System.out.printf("\nPeaje \"Buena Via\"\n\tPropietario: %s"
                       + "\nTipo: vehiculo liviano particular\n\tValor1: $ %.0f"
                         + "\n\tPeaje1: $ %.1f\n"
                          ,propietario,valor1,peaje1);
                break;
                
                case 2:
                    System.out.println("Ingrese el valor de su vehiculo "
                            + "grande particular por favor: ");
                    double valor2 = entrada.nextDouble();
                    double avaluo2;
                    double peaje2;
                    avaluo2 = (valor2 * 0.02) / 100;
                    peaje2 = avaluo2 + 2.5;
                    
                    System.out.printf("\nPeaje \"Buena Via\"\n\tPropietario: %s"
                      +"\nTipo: vehiculo grande liviano particular\n"
                            + "\tValor: $ %.0f\n\tPeaje: $ %.1f\n"
                            ,propietario,valor2,peaje2);
                break;  
                
                case 3:
                  System.out.println("Ingrese el valor de su taxi por favor: ");
                    double valor3 = entrada.nextDouble();
                    double avaluo3;
                    double peaje3;
                    avaluo3 = (valor3 * 0.04) / 100;
                    peaje3 = avaluo3 + 1.5;
                    
                    System.out.printf("\nPeaje \"Buena Via\"\n\tPropietario: %s"
                            + "\nTipo: taxi\n\tValor: $ %.0f\n\tPeaje: $ %.1f\n"
                            ,propietario,valor3,peaje3);
                break;   
                
                case 4:
                    System.out.println("Ingrese el valor de su bus urbano: ");
                    double valor4 = entrada.nextDouble();
                    double avaluo4;
                    double peaje4;
                    avaluo4 = (valor4 * 0.05) / 100;
                    peaje4 = avaluo4 + 2.2;
                    System.out.printf("\nPeaje \"Buena Via\"\n\tPropietario: %s"
                            + "\nTipo: bus urbano\n\tValor: $ %.0f\n"
                            + "\tPeaje: $ %.2f\n"
                            ,propietario,valor4,peaje4);
                break;
               
                default:
                    System.out.println("Numero ingresado no coincide "
                            + "con el numero de la opcion");
                break;
            }

    
    }
    }
    

