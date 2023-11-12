/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema.pkg5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double netflix;
        double youtube;
        double dropbox;
        double spotify;
        int edad;
        double total;
        double descuento;
        System.out.println("Digite el costo de Netflix");
        netflix = entrada.nextDouble();
        System.out.println("Digite el costo de Youtube");
        youtube = entrada.nextDouble();
        System.out.println("Digite el costo de DropBox");
        dropbox = entrada.nextDouble();
        System.out.println("Digite el costo de Spotify");
        spotify = entrada.nextDouble();
        System.out.println("Digite su edad");
        edad = entrada.nextInt();
        total = netflix + youtube + dropbox + spotify;
        if (edad < 30) {
            descuento = (total * 20) / 100;
            total = total - descuento;
            System.out.printf("El total a pagar con descuento es de :%.2f", total);

        } else {
            System.out.printf("El total a pagar es: %.2f", total);
        }

    }

}
