/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicionalrangonumeros;

import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class CondicionalRangoNumeros {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("Ingrese num1:");
        num1 = input.nextInt();
        System.out.print("Ingrese num2:");
        num2 = input.nextInt();        
        System.out.print("Ingrese num3:");
        num3 = input.nextInt();
        
        if(num1 > num2 && num1 > num3 ){
            System.out.println("El numero mayor es:"+num1);
            if(num2>num3){
                System.out.println("El numero menor es:"+num3);
            }else{
                System.out.println("El numero menor es:"+num2);
            }
        }else {
            if(num2 > num1 && num2 > num3 ){
                System.out.println("El numero mayor es:"+num2);
                if(num1>num3){
                    System.out.println("El numero menor es:"+num3);
                }else{
                    System.out.println("El numero menor es:"+num1);
                }
            }else {
                System.out.println("El numero mayor es:"+num3);
                if(num1>num2){
                    System.out.println("El numero menor es:"+num2);
                }else{
                    System.out.println("El numero menor es:"+num1);
                }
            }
        }
    }
}
