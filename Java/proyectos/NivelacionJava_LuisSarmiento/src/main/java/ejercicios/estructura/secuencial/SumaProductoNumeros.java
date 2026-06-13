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
public class SumaProductoNumeros {
    private Scanner teclado;
    private int num1,num2,suma,producto;
    
    public void suma() {
        teclado=new Scanner(System.in);
    	
    	System.out.print("Ingrese primer valor:");
    	num1=teclado.nextInt();
    	System.out.print("Ingrese segundo valor");
    	num2=teclado.nextInt();
    	suma=num1 + num2;
    	producto=num1 * num2;
    	System.out.print("La suma de los dos valores es:");
    	System.out.println(suma);
    	System.out.print("El producto de los dos valores es:");
    	System.out.println(producto);
    }
}
