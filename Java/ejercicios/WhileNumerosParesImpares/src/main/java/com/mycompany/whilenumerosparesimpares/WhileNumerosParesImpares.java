/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.whilenumerosparesimpares;

import java.util.Scanner;
/**
 *
 * @author sarmi
 */
public class WhileNumerosParesImpares {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeros, cantidad, numero, pares, impares;
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
