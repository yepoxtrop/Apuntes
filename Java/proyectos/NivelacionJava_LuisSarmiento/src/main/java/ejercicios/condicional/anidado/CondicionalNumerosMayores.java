/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.condicional.anidado;

import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class CondicionalNumerosMayores {
    private Scanner input; 
    private int num1, num2, num3; 
    public void numeroMayor() {
        input = new Scanner(System.in);
        
        System.out.println("Ingrese num1:");
        num1 = input.nextInt();
        System.out.println("Ingrese num2:");
        num2 = input.nextInt();        
        System.out.println("Ingrese num3:");
        num3 = input.nextInt();
        
        if(num1>num2){
            System.out.println("Num 1 es el mayor");
        } else {
            if (num2>num3){
                System.out.println("Num 2 es el mayor");
            }else{
                System.out.println("Num 3 es el mayor");
            }
        }
    }
}
