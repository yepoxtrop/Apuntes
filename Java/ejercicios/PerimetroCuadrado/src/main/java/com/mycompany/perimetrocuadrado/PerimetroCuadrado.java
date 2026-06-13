package com.mycompany.perimetrocuadrado;
import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class PerimetroCuadrado {

    public static void main(String[] args) {
        /*Varaible para entrada de datos*/
        Scanner input = new Scanner(System.in);
        
        /*Definicion de variables*/
        int ladoCuadrado, perimetroCuadrado;
        
        System.out.print("Ingrese el lado del cuadrado:");
        ladoCuadrado = input.nextInt();
        perimetroCuadrado = ladoCuadrado * 4; 
        
        System.out.print("El perimetro es:");
        System.out.println(perimetroCuadrado);
    }
}
