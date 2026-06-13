/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.forsumanumeros;

import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class ForSumaNumeros {

    public static void main(String[] args) {
        int num, total ;
        total = 0;
        Scanner input = new Scanner(System.in);
        
        for (int i=1; i<=10; i++){
            System.out.print("Ingrese un numero:");
            num = input.nextInt();
            if (i>=5){
                total += num;
            }
        }
        System.out.println("Total:"+total);
    }
}
