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
public class EstructuraRepetitivaDoWhile2 {
    private Scanner teclado;
    private int suma,cant,valor,promedio;
        
    public  void RepetitivaDoWhile2() {
        teclado=new Scanner(System.in);
        suma=0;
        cant=0;
        do {
            System.out.print("Ingrese un valor (0 para finalizar):");
            valor=teclado.nextInt();
            if (valor!=0) {
                suma=suma+valor;
                cant++;
            }
        } while (valor!=0);
        if (cant!=0) {
            promedio=suma/cant;
            System.out.print("El promedio de los valores ingresados es:");
            System.out.print(promedio);
        } else {
            System.out.print("No se ingresaron valores.");
        }
    }
}
