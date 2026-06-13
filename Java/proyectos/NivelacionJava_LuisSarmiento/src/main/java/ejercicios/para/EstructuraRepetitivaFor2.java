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
public class EstructuraRepetitivaFor2 {
    
    private Scanner teclado;
    private int suma,f,valor,promedio;
    public void RepetitivaFor2() {
        teclado=new Scanner(System.in);
        
        suma=0;
        for(f=1;f<=10;f++) {
            System.out.print("Ingrese valor:");
            valor=teclado.nextInt();
            suma=suma+valor;
        }
        System.out.print("La suma es:");
        System.out.println(suma);
        promedio=suma/10;
        System.out.print("El promedio es:");
        System.out.print(promedio);
    }
}
