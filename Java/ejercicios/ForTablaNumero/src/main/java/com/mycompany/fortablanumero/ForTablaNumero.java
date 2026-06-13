/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fortablanumero;

import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class ForTablaNumero {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int num;
        System.out.print("Ingrese un numero del 1 a 10:");
        num = input.nextInt();
        
        if(num>=1 && num<=10){
            for (int i=1; i<=12; i++){
                System.out.print(num*i+"-");
            }
        }else{
            System.out.println("Numero no disponible");
        }
        
        
    }
}
