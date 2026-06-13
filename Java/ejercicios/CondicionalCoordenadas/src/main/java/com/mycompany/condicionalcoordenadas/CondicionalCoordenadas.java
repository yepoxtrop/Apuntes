/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicionalcoordenadas;

import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class CondicionalCoordenadas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int puntox, puntoy;
        System.out.print("Ingrese punto en x:");
        puntox = input.nextInt();
        System.out.print("Ingrese punto en y:");
        puntoy = input.nextInt(); 
        
        if(puntox > 0 && puntoy > 0){
            System.out.println("Pertenece al cuadrante I");
        }else {
            if(puntox < 0 && puntoy > 0){
                System.out.println("Pertenece al cuadrante II");
            }else {
                if(puntox < 0 && puntoy < 0){
                    System.out.println("Pertenece al cuadrante III");
                }else {
                    System.out.println("Pertenece al cuadrante IV");
                }
            }
        }
    }
}
