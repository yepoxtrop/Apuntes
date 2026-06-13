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
public class WhileAlturas {
    private Scanner input;
    private int personas, turno;
    private double altura, totalAltura, promedio;
        
    public void alturas() {
        input = new Scanner(System.in);
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
