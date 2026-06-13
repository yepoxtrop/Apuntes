/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dowhilesumanumeros;

import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class DoWhileSumaNumeros {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int suma, numero;
        suma = 0;
        do {
            System.out.print("Ingrese un numero:");
            numero = input.nextInt();
            suma += numero;
        }while(numero != 9999);
        
        if (suma<0){
            System.out.println("Resultado Negativo");
        } else if(suma>0){
            System.out.println("Resultado Positivo");
        } else {
            System.out.println("Resultado Nuetro");
        }
    }
}
