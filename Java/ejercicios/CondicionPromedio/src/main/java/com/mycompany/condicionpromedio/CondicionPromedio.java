package com.mycompany.condicionpromedio;

import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class CondicionPromedio {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nota1, nota2, nota3;
        float promedio;
        
        System.out.print("Ingrese la nota1:");
        nota1 = input.nextInt();
        System.out.print("Ingrese la nota2:");
        nota2 = input.nextInt();        
        System.out.print("Ingrese la nota3:");
        nota3 = input.nextInt();
        
        promedio = (nota1 + nota2 + nota3)/3; 
        
        if (promedio>=7){
            System.out.println("Aprobado");
        } else {
            System.out.println("Desaprobado");
        }
    }
}
