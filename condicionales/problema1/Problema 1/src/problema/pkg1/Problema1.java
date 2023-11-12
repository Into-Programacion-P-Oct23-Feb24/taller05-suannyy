/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema.pkg1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double valor_kvh;
        double consumo_kvh;
        int edad;
        double total_pago;
        double descuento;
        System.out.println("Ingrese el valor Kilovatio/hora");
        valor_kvh = entrada.nextDouble();
        System.out.println("Ingrese el consumo mensual del Kilovatio/hora");
        consumo_kvh = entrada.nextDouble();
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        total_pago = valor_kvh * consumo_kvh;
        if (edad > 65) {
            descuento = (total_pago * 20) / 100;
            total_pago = total_pago - descuento;
            System.out.printf("El total a paga mensual es de: %.2f", total_pago);

        } else {
            System.out.printf("El total a pagar mensual es : %.2f", total_pago);
        }

    }
}
