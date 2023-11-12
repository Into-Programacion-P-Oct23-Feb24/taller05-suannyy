/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double hijo_1;
        double hijo_2;
        double hijo_3;
        double gasto_mensual;
        System.out.println("Cuanto gasto causo el hijo 1");
        hijo_1 = entrada.nextDouble();
        System.out.println("Cuanto gasto causo el hijo 2");
        hijo_2 = entrada.nextDouble();
        System.out.println("Cuanto gasto causo el hijo 3");
        hijo_3 = entrada.nextDouble();
        gasto_mensual = hijo_1 + hijo_2 + hijo_3;
        System.out.printf("El gasto mensual de los tres hijos es: %.2f",gasto_mensual);
    }

}
