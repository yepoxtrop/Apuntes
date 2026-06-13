/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.condicional.simple.compuesto;

import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class CondicionPromedio {
    private Scanner input;
    private int nota1, nota2, nota3;
    private float promedio;
    
    public void promedioNotas() {
        input = new Scanner(System.in);
        
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
