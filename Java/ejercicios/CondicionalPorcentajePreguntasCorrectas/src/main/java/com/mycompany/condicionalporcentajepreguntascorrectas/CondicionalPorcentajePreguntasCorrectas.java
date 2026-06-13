/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicionalporcentajepreguntascorrectas;

import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class CondicionalPorcentajePreguntasCorrectas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int preguntas, correctas;
        float porcentaje;
        System.out.print("Ingrese el numero de preguntas:");
        preguntas = input.nextInt();
        System.out.print("Ingrese el numero de preguntas correctas:");
        correctas = input.nextInt();
        porcentaje = (correctas*100)/preguntas;
        if (porcentaje >= 90){
            System.out.println("Nivel Maximo");
        }else {
            if (porcentaje>=75 && porcentaje<90){
                System.out.println("Novel Medio");
            }else{
                if(porcentaje>=50 && porcentaje<75){
                    System.out.println("Nivel Regular");
                }else {
                    System.out.println("Fuera de nivel");
                }
            }
        }
    }
}
