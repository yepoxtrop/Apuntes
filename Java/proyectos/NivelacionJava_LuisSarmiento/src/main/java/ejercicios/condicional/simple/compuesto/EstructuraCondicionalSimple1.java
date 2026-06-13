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
public class EstructuraCondicionalSimple1 {
    private Scanner teclado;
    private float sueldo;
    
    public  void CondicionalSimple1() {
    	Scanner teclado=new Scanner(System.in);
    	
    	System.out.print("Ingrese el sueldo:");
    	sueldo=teclado.nextFloat();
    	if (sueldo>3000) {
    	    System.out.println("Esta persona debe abonar impuestos");
    	}
    }
}
