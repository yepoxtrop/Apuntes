package com.mycompany.comprasarticulos;
import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class ComprasArticulos {

    public static void main(String[] args) {
        /*Varaible para entrada de datos*/
        Scanner input = new Scanner(System.in);
        
        /*Definicion de variables*/
        int cantidad;
        float precio, total; 
        
        System.out.print("Ingrese el precio del articulo:");
        precio = input.nextFloat();
        System.out.print("Ingrese la cantidad a llevar:");
        cantidad = input.nextInt();
        
        total = cantidad * precio;
        
        System.out.print("El total a pagar es:");
        System.out.println(total);
    }
}
