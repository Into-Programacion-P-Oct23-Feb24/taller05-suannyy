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
        String articulo;
        double precio;
        int cantidad;
        double descuento;
        double total;
        System.out.println("Ingrese la descripcion del articulo");
        articulo = entrada.nextLine();
        System.out.println("Ingrese el precio del articulo");
        precio = entrada.nextDouble();
        System.out.println("Ingrese la cantidad de articulos");
        cantidad = entrada.nextInt();
        total = precio * cantidad;
        if (cantidad > 50) {
            descuento = (total * 15) / 100;
            total = total - descuento;
            System.out.printf("El total a pagar con descuento es de:%.2f", total);
        } else {
            System.out.printf("El total a pagar es de: %.2f");
        }
    }

}
