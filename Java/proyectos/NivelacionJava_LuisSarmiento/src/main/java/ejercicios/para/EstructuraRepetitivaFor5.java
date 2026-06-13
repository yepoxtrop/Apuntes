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
public class EstructuraRepetitivaFor5 {
    private Scanner teclado;
    private int cantidad,n,f,valor;
        
    public void RepetitivaFor5() {
        teclado=new Scanner(System.in);
        cantidad=0;
        System.out.print("Cuantos valores ingresará:");
        n=teclado.nextInt();
        for(f=1;f<=n;f++) {
            System.out.print("Ingrese el valor:");
            valor=teclado.nextInt();
            if (valor>=1000) {
                cantidad=cantidad+1;
            }
        }
        System.out.print("La cantidad de valores ingresados mayores o iguales a 1000 son:");
        System.out.print(cantidad);
    }
}
