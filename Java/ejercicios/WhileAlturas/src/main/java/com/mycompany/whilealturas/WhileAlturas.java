/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.whilealturas;

import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class WhileAlturas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int personas, turno;
        double altura, totalAltura, promedio;
        turno = 1;
        totalAltura = 0;
        
        System.out.print("Ingrese la cantidad de personas:");
        personas = input.nextInt();
        
        while(turno<=personas){
            System.out.println("Ingrese la altura:");
            altura = input.nextDouble();
            totalAltura += altura; 
            turno += 1;
        }
        promedio = totalAltura/personas;
        
        System.out.println("El total de altura es:"+totalAltura);
        System.out.println("El promedio de altura es:"+promedio);
    }
}
