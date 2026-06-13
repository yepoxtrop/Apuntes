/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicionalcompuestonumerosiguales;

import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class CondicionalCompuestoNumerosIguales {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, total;
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
