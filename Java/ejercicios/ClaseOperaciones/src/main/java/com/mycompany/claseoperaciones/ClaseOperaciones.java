/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.claseoperaciones;

import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class ClaseOperaciones {
    private Scanner input;
    private int num1,num2,suma,resta,multiplicacion;
    private double division;
    
    public void iniciar(){
        input = new Scanner(System.in);
        System.out.print("Ingrese numero 1:");
        num1 = input.nextInt();
        System.out.print("Ingrese numero 2:");
        num2 = input.nextInt();
        System.out.println("");
    }
    
    public void sumaNumeros(){
        suma = num1+num2;
        System.out.println("Suma:"+suma);
    }
    
    public void restaValores(){
        resta = num1-num2;
        System.out.println("Resta:"+resta);
    }
    
    public void multiplicacionValores(){
        multiplicacion = num1*num2;
        System.out.println("Multiplicacion:"+multiplicacion);
    }
    public void divisionValores(){
        division = num1/num2;
        System.out.println("Division:"+division);
    }
    
    public static void main(String[] args) {
        ClaseOperaciones ejemplo = new ClaseOperaciones();
        ejemplo.iniciar();
        ejemplo.sumaNumeros();
        ejemplo.restaValores();
        ejemplo.multiplicacionValores();
        ejemplo.divisionValores();
    }
}
