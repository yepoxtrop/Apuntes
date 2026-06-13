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
public class ComprasArticulos {
    private Scanner input;
    private int cantidad;
    private float precio, total; 
    
    public void compras() {
        /*Varaible para entrada de datos*/
        input = new Scanner(System.in);
        
        
        System.out.print("Ingrese el precio del articulo:");
        precio = input.nextFloat();
        System.out.print("Ingrese la cantidad a llevar:");
        cantidad = input.nextInt();
        
        total = cantidad * precio;
        
        System.out.print("El total a pagar es:");
        System.out.println(total);
    }
}
