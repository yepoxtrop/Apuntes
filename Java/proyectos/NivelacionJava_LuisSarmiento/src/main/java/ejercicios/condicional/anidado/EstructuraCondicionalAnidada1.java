/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.condicional.anidado;

import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class EstructuraCondicionalAnidada1 {
    private Scanner teclado;
    private int nota1,nota2,nota3;
    public void CondicionalAnidada1() {
        teclado=new Scanner(System.in);
        
        System.out.print("Ingrese primer nota:");
        nota1=teclado.nextInt();
        System.out.print("Ingrese segunda nota:");
        nota2=teclado.nextInt();
        System.out.print("Ingrese tercer nota:");
        nota3=teclado.nextInt();
        int promedio=(nota1 + nota2 + nota3) / 3;
        if (promedio>=7) {
            System.out.print("Promocionado");    
        } else {
            if (promedio>=4) {
                System.out.print("Regular");
            } else {
                System.out.print("Reprobado");
            }
        }
    }
}
