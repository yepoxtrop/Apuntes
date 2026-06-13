/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.condicional.operadores.logicos;

import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class CondicionalCompuestoNumerosMenores1 {
    
    private Scanner input;
    private int num1, num2, num3;
    
    public void numerosMenores10() {
        input = new Scanner(System.in);
        System.out.print("Ingrese num1:");
        num1 = input.nextInt();
        System.out.print("Ingrese num2:");
        num2 = input.nextInt();        
        System.out.print("Ingrese num3:");
        num3 = input.nextInt();
        
        if(num1 < 10 && num2 < 10 && num3 < 10){
            System.out.println("Todos son menores a 10");
        }else {
            System.out.println("No todos son menores a 10");
        }
    }
}
