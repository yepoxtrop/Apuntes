/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.condicional.simple.compuesto;

import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class NumeroMayorSuma {
    private Scanner input;
    private int num1,num2,suma,resta,multiplicacion;
    private float division; 
    
    public void operacionesNumeros() {
        input = new Scanner(System.in);
        
        
        System.out.print("Ingrese num1:");
        num1 = input.nextInt();
        
        System.out.print("Ingrese num2:");
        num2 = input.nextInt();
        
        if (num1>num2){
            suma = num1 + num2;
            resta = num1 - num2;
            System.out.print("La suma es:");
            System.out.println(suma);
            System.out.print("La resta es:");
            System.out.println(resta);
        } else {
            multiplicacion = num1 * num2;
            division = num1 / num2;
            System.out.print("La division es:");
            System.out.println(division);
            System.out.print("La multiplicacion es:");
            System.out.println(multiplicacion);
        }
    }
}
