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
public class WhileNumerosParesImpares {
    private Scanner input;
    private int numeros, cantidad, numero, pares, impares;
    public void NumerosParesImpares() {
        input = new Scanner(System.in);
        
        cantidad = 0;
        pares = 0;
        impares = 0;
        
        System.out.print("Indique la cantidad de numeros a revisar:");
        numeros = input.nextInt();
        
        while (cantidad<numeros){
            System.out.print("Ingrese el numero:");
            numero = input.nextInt();
            if (numero%2 == 0){
                pares +=1;
            }else {
                impares +=1; 
            }
            cantidad +=1; 
        }
        
        System.out.println("Pares:"+pares);
        System.out.println("Impares:"+impares);
    }
}
