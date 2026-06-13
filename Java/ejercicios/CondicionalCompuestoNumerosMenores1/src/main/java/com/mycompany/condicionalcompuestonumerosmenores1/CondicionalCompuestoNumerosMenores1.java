/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicionalcompuestonumerosmenores1;

import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class CondicionalCompuestoNumerosMenores1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
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
