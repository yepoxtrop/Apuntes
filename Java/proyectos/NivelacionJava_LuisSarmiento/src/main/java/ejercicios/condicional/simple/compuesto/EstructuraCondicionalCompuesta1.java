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
public class EstructuraCondicionalCompuesta1 {
    private Scanner teclado;
    private int num1,num2;
    
    public void CondicionalCompuesta1() {
    	teclado=new Scanner(System.in);
    	
    	System.out.print("Ingrese primer valor:");
    	num1=teclado.nextInt();
    	System.out.print("Ingrese segundo valor:");
    	num2=teclado.nextInt();
    	if (num1>num2) {
    		System.out.print(num1);
    	} else {
    		System.out.print(num2);
    	}
    }
}
