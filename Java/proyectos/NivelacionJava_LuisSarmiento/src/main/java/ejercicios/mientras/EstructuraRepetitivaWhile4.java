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
public class EstructuraRepetitivaWhile4 {
    private Scanner teclado;
    private int x,cantidad,n;
    private float largo;
        
    public void RepetitivaWhile4() {
        teclado=new Scanner(System.in);
        x=1;
        cantidad=0;
        System.out.print("Cuantas piezar procesará:");
        n=teclado.nextInt();
        while (x<=n) {
            System.out.print("Ingrese la medida de la pieza:");
            largo=teclado.nextFloat();
            if (largo>=1.20 && largo<=1.30) {
                cantidad = cantidad +1;
            }
            x=x + 1;
        }
        System.out.print("La cantidad de piezas aptas son:");
        System.out.print(cantidad);
    }
}
