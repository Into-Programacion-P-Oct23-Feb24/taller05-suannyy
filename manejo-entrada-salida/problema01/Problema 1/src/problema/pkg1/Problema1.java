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
        int lado_1;
        int lado_2;
        int lado_3;
        int area;
        System.out.println("Ingrese el primer lado del triangulo");
        lado_1 = entrada.nextInt();
        System.out.println("Ingrese el segundo lado del triangulo");
        lado_2 = entrada.nextInt();
        System.out.println("Ingrese el tercer lado del triangulo");
        lado_3 = entrada.nextInt();
        area = lado_1 * lado_2 * lado_3;
        System.out.printf("El perimetro del triangulo es: %s",area);
                
    }

}
