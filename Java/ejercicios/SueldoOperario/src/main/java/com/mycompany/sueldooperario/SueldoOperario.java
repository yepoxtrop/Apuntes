package com.mycompany.sueldooperario;
import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class SueldoOperario {

    public static void main(String[] args) {
        /*Definicion de scanner para entrada*/
        Scanner teclado = new Scanner(System.in);
        
        /*Definicion de variables*/
        int horasTrabajadas;
        float costoHora;
        float sueldo;
        
        
        System.out.print("Ingrese la cantidad de horas trabajadas por el empleado:");
        horasTrabajadas=teclado.nextInt(); /*Entrada de informacion*/
        System.out.print("Ingrese el valor de la hora:");
        costoHora=teclado.nextFloat(); /*Entrada de informacion*/
        sueldo=horasTrabajadas * costoHora;
        System.out.print("El empleado debe cobrar:");
        System.out.print(sueldo);
        teclado.close();
    }
}
