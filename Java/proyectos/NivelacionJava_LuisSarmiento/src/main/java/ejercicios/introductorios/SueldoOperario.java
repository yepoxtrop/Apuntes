/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.introductorios;

import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class SueldoOperario {
    private Scanner teclado;
    private int horasTrabajadas;
    private float costoHora;
    private float sueldo;
    
    public void sueldo() {
        /*Definicion de scanner para entrada*/
        teclado = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de horas trabajadas por el empleado:");
        horasTrabajadas=teclado.nextInt(); /*Entrada de informacion*/
        System.out.print("Ingrese el valor de la hora:");
        costoHora=teclado.nextFloat(); /*Entrada de informacion*/
        sueldo=horasTrabajadas * costoHora;
        System.out.print("El empleado debe cobrar:");
        System.out.print(sueldo);
    }
}
