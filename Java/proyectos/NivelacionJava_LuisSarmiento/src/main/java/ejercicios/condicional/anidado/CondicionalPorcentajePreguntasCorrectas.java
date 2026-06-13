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
public class CondicionalPorcentajePreguntasCorrectas {
    
    private Scanner input;
    private int preguntas, correctas;
    private float porcentaje;
    public void preguntasPorcentaje() {
        input = new Scanner(System.in);
        
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
