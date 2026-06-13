/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.condicional.operadores.logicos;

import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class CondicionalCoordenadas {
    
    private Scanner input;
    private int puntox, puntoy;
    
    public void coordenadas() {
        input = new Scanner(System.in);
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
