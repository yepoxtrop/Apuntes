/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicionalnavidad;

import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class CondicionalNavidad {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dia, mes, año;
        System.out.print("Ingrese el día");
        dia = input.nextInt();
        System.out.print("Ingrese el mes");
        mes = input.nextInt();
        System.out.print("Ingrese el año");
        año = input.nextInt();
        
        if (dia == 25 && mes == 12){
            System.out.println("Es navidad");
        }else{
            System.out.println("Aun no es navidad");
        }
    }
}
