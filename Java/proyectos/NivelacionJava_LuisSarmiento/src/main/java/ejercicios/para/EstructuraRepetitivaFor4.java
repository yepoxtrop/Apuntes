/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.para;

import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class EstructuraRepetitivaFor4 {
    private Scanner teclado;
    private int mul3,mul5,valor,f;
        
    public void RepetitivaFor4() {
        teclado=new Scanner(System.in);
        mul3=0;
        mul5=0;
        for(f=1;f<=10;f++) {
            System.out.print("Ingrese un valor:");
            valor=teclado.nextInt();
            if (valor%3==0) {
                mul3=mul3+1;
            } 
            if (valor%5==0) {
                mul5=mul5+1;
            }
        }
        System.out.print("Cantidad de valores ingresados múltiplos de 3:");
        System.out.println(mul3);
        System.out.print("Cantidad de valores ingresados múltiplos de 5:");
        System.out.print(mul5);
    }
}
