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
public class PerimetroCuadrado {
    private Scanner input;
    private int ladoCuadrado, perimetroCuadrado;
    
    public void perimetro() {
        /*Varaible para entrada de datos*/
        input = new Scanner(System.in);
        
        
        System.out.print("Ingrese el lado del cuadrado:");
        ladoCuadrado = input.nextInt();
        perimetroCuadrado = ladoCuadrado * 4; 
        
        System.out.print("El perimetro es:");
        System.out.println(perimetroCuadrado);
    }
}
