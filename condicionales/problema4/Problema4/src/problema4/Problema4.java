/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double habitacion;
        int dias;
        double subtotal;
        double descuento;
        double total;
        System.out.println("Ingrese el precio de la habitacion");
        habitacion = entrada.nextDouble();
        System.out.println("Ingrese la cantidad de dias que se hospedara");
        dias = entrada.nextInt();
        subtotal = habitacion * dias;
        descuento = 0;
        //total = subtotal;
        if ((dias >= 5) && (dias <= 10)) {
            descuento = (subtotal * 10) / 100;

        } else {
            if ((dias > 10) && (dias <= 15)) {
                descuento = (subtotal * 15) / 100;

            } else {
                if (dias > 15) {
                    descuento = (subtotal * 20) / 100;

                }
            }
        }
        total = subtotal - descuento;
        System.out.printf("El subtotal a pagar es de: %.2f\n"
                + "El descuento es de: %.2f\n"
                + "El total a pagar es:%.2f", subtotal, descuento, total);
    }
}
