/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicionalcantidadnumeros;

import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class CondicionalCantidadNumeros {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num;
        System.out.print("Ingrese un numero:");
        num = input.nextInt();
        
        if (num>=10 && num<=99) {
            System.out.println("Numero con dos digitos");
        } else {
            if (num<10){
                System.out.println("Numero de un digito");
            }else{
                System.out.println("Numero con mas digitos");
            }
        }
    }
}
