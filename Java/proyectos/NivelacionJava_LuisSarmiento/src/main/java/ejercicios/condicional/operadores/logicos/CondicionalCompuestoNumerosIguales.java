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
public class CondicionalCompuestoNumerosIguales {
    
    private Scanner input;
    private int num1, num2, num3, total;
    public void NumerosIguales() {
        input = new Scanner(System.in);
        System.out.print("Ingrese num1:");
        num1 = input.nextInt();
        System.out.print("Ingrese num2:");
        num2 = input.nextInt();        
        System.out.print("Ingrese num3:");
        num3 = input.nextInt();
        
        if(num1 == num2 && num2 == num3){
            total = (num1 + num2)*num3;
            System.out.print("Total:");
            System.out.println(total);
        }else {
            System.out.println("No hay total");
        }
        
    }
}
