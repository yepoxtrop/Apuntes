/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.mientras;

import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class EstructuraRepetitivaWhile3 {
    private Scanner teclado;
    private int x,suma,valor,promedio;
    public void RepetitivaWhile3() {
        teclado=new Scanner(System.in);
        x=1;
        suma=0;
        while (x<=10) {
            System.out.print("Ingrese un valor:");
            valor=teclado.nextInt();
            suma=suma+valor;
            x=x+1;
        }
        promedio=suma/10;
        System.out.print("La suma de los 10 valores es:");
        System.out.println(suma);
        System.out.print("El promedio es:");
        System.out.print(promedio);
    }
}
