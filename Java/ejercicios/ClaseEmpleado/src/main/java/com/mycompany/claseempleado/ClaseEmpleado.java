/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.claseempleado;

import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class ClaseEmpleado {
    private Scanner input;
    private String nombre;
    private double sueldo;
    
    public void iniciar(){
        input = new Scanner(System.in);
        System.out.print("Ingrese el nombre:");
        nombre = input.nextLine();
        System.out.print("Ingrese el sueldo:");
        sueldo = input.nextDouble();
        System.out.println("");
    }
    
    public void imprimir(){
        System.out.println("Nombre:"+nombre);
        System.out.println("Sueldo:"+sueldo);
    }
    
    public void impuesto(){
        if (sueldo > 3000){
            System.out.println("Debe de pagar impuesto");
        }
    }
    
    public static void main(String[] args) {
        ClaseEmpleado empleado = new ClaseEmpleado();
        empleado.iniciar();
        empleado.imprimir();
        empleado.impuesto();
    }
}
