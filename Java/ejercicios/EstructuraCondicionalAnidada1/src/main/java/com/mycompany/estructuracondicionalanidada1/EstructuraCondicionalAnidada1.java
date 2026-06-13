/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estructuracondicionalanidada1;
import java.util.Scanner;
/**
 *
 * @author sarmi
 */
public class EstructuraCondicionalAnidada1 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int nota1,nota2,nota3;
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
