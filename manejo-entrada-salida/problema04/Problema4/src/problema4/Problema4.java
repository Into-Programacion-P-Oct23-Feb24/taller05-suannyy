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
        double cpu;
        double pantalla;
        double teclado;
        double raton;
        double total;
        System.out.println("Ingrese el precio del CPU");
        cpu = entrada.nextDouble();
        System.out.println("Ingrese el precio de la pantalla");
        pantalla = entrada.nextDouble();
        System.out.println("Ingrese el precio del teclado");
        teclado = entrada.nextDouble();
        System.out.println("Ingrese el precio del raton");
        raton = entrada.nextDouble();
        total = cpu + pantalla + teclado + raton;
        System.out.printf("El precio a pagar de la computadora es: %.2f", total);

    }

}
