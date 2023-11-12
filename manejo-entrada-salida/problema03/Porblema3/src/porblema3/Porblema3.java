/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package porblema3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Porblema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double minutos;
        double mensual;
        double total_pago;
        System.out.println("Ingrese el costo por minutos de su operador");
        minutos = entrada.nextDouble();
        System.out.println("Ingrese el consumo mensual de minutos");
        mensual = entrada.nextDouble();
        total_pago = minutos * mensual;
        System.out.printf("El total a pagar a final de mes es de : %.2f", total_pago);

    }

}
