/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.mientras;

import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class WhileSueldosEmpleados {
    private Scanner input;
    private int empleados, contador, sueldoNormal, sueldoMayor;
    private double totalSueldos, sueldo; 
        
    public void sueldoEmpleados() {
        input = new Scanner(System.in);
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
