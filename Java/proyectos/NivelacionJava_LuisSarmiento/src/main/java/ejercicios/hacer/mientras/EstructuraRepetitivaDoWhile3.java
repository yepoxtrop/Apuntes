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
public class EstructuraRepetitivaDoWhile3 {
    private Scanner teclado;
    private int cant1,cant2,cant3,suma;
    private float peso;
        
    
    public void RepetitivaDoWhile3() {
        teclado=new Scanner(System.in);

        cant1=0;
        cant2=0;
        cant3=0;
        do {
            System.out.print("Ingrese el peso de la pieza (0 pera finalizar):");
            peso=teclado.nextFloat();
            if (peso>10.2) {
                cant1++;
            } else {
                if (peso>=9.8) {
                    cant2++;
                } else {
                    if (peso>0) {
                        cant3++;
                    }
                }
            }
        } while(peso!=0);
        suma=cant1+cant2+cant3;
        System.out.print("Piezas aptas:");
        System.out.println(cant2);
        System.out.print("Piezas con un peso superior a 10.2:");
        System.out.println(cant1);
        System.out.print("Piezas con un peso inferior a 9.8:");
        System.out.println(cant3);
    }
}
