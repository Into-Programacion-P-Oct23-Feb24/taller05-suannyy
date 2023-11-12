/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String marca;
        String origen;
        double costo;
        double impuesto;
        double total;
        System.out.println("Ingrese la marca del automovil");
        marca = entrada.nextLine();
        System.out.println("Ingrese el pais de origen del automovil");
        origen = entrada.nextLine();
        System.out.println("Ingrese el costo del automovil");
        costo = entrada.nextDouble();
        total = costo;
        if (origen.equals("Alemania")) {
            impuesto = (total * 20) / 100;
            total = total + impuesto;
            System.out.printf("La marca del automovil es: %s\n"
                    + "El origen del carro es: %s"
                    + "El costo es de: %.2f\n"
                    + "EL impuesto a pagar es de %.2f\nEl total a pagar es:%.2f",
                    marca, origen, costo, impuesto, total);
        } else {
            if (origen.equals("Japon")) {
                impuesto = (total * 30) / 100;
                total = total + impuesto;
                System.out.printf("La marca del automovil es: %s\n"
                        + "El origen del carro es: %s"
                        + "El costo es de: %.2f\n"
                        + "EL impuesto a pagar es de %.2f\nEl total a pagar es:%.2f",
                        marca, origen, costo, impuesto, total);
            } else {
                if (origen.equals("Italia")) {
                    impuesto = (total * 15) / 100;
                    total = total + impuesto;
                    System.out.printf("La marca del automovil es: %s\n"
                            + "El origen del carro es: %s"
                            + "El costo es de: %.2f\n"
                            + "EL impuesto a pagar es de %.2f\nEl total a pagar es:%.2f",
                            marca, origen, costo, impuesto, total);
                } else {
                    if (origen.equals("USA")) {
                        impuesto = (total * 8) / 100;
                        total = total + impuesto;
                        System.out.printf("La marca del automovil es: %s\n"
                                + "El origen del carro es: %s"
                                + "El costo es de: %.2f\n"
                                + "EL impuesto a pagar es de %.2f\nEl total a pagar es:%.2f",
                                marca, origen, costo, impuesto, total);
                    }
                }

            }

        }
    }
}
