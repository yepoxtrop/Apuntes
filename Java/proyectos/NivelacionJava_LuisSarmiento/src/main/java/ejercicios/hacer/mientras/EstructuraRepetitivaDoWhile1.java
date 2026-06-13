/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.hacer.mientras;

import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class EstructuraRepetitivaDoWhile1 {
    private Scanner teclado;
    private int valor;

    public void RepetitivaDoWhile1() {
        teclado=new Scanner(System.in);
        do {
            System.out.print("Ingrese un valor entre 0 y 999 (0 finaliza):");
            valor=teclado.nextInt();
            if (valor>=100) {
                System.out.println("Tiene 3 dígitos.");
            } else {
                if (valor>=10) {
                    System.out.println("Tiene 2 dígitos.");
                } else {
                    System.out.println("Tiene 1 dígito.");
                }
            }
        } while (valor!=0);
    }
}
