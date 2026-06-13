/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.estructura.secuencial;

import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class SumasProductos {
    private Scanner input;
    private int num1, num2, num3, num4, suma, prodcuto;
    
    public void operaciones() {
        /*Varaible para entrada de datos*/
        input = new Scanner(System.in);
        
        System.out.print("Ingrese el num1:");
        num1 = input.nextInt();
        System.out.print("Ingrese el num2:");
        num2 = input.nextInt();
        System.out.print("Ingrese el num3:");
        num3 = input.nextInt();
        System.out.print("Ingrese el num4:");
        num4 = input.nextInt();

        suma = num1 + num2;
        prodcuto = num3 * num4;  
        
        System.out.print("La suma es:");
        System.out.println(suma);
        System.out.print("El prodcuto es:");
        System.out.println(prodcuto);
    }
}
