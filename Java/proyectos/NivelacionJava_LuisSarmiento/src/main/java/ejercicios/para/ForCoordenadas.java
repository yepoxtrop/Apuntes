/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.para;

import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class ForCoordenadas {
    private Scanner input;
    private int cuadranteI, cuadranteII, cuadranteIII, cuadranteIV, puntox, puntoy, coordenadas;
        
    public void Coordenadas() {
        input = new Scanner(System.in);
        cuadranteI = 0;
        cuadranteII = 0;
        cuadranteIII = 0;
        cuadranteIV = 0;

        System.out.print("Ingrese la cantidad de coordenadas:");
        coordenadas = input.nextInt(); 
        
        for(int i=1; i<=coordenadas; i++){
            System.out.print("Ingrese el punto x:");
            puntox = input.nextInt();
            System.out.print("Ingrese el punto y:");
            puntoy = input.nextInt();
            
            if (puntox > 0 && puntoy > 0){
                System.out.println("Cuadrante I");
                cuadranteI += 1;
            }else if(puntox < 0 && puntoy > 0) {
                System.out.println("Cuadrante II");
                cuadranteII += 1;
            }else if(puntox < 0 && puntoy < 0) {
                System.out.println("Cuadrante III");
                cuadranteIII += 1;
            }else{
                System.out.println("Cuadrante IV");
                cuadranteIV += 1;
            }
            System.out.println("");
        }
        
        System.out.println("Cuadrante I:"+cuadranteI);
        System.out.println("Cuadrante II:"+cuadranteII);
        System.out.println("Cuadrante III:"+cuadranteIII);
        System.out.println("Cuadrante IV:"+cuadranteIV);

    }
}
