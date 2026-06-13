/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.whilesueldosempleados;

import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class WhileSueldosEmpleados {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int empleados, contador, sueldoNormal, sueldoMayor;
        double totalSueldos, sueldo; 
        contador = 0;
        totalSueldos = 0;
        sueldoNormal = 0;
        sueldoMayor = 0;
        
        System.out.print("Ingrese la cantidad de empleados:");
        empleados = input.nextInt();
        
        while(contador<empleados){
            System.out.println("Ingrese el sueldo:");
            sueldo = input.nextInt();
            if (sueldo >= 100 && sueldo <= 300){
                sueldoNormal +=1;
            }else {
                if (sueldo>300){
                    sueldoMayor += 1;
                }
            }
            totalSueldos += sueldo;
            contador +=1;
        }
        System.out.println("Sueldos entre 100 y 300:"+sueldoNormal);
        System.out.println("Sueldos mayores a 300:"+sueldoMayor);
        System.out.println("Total:"+totalSueldos);
    }
}
