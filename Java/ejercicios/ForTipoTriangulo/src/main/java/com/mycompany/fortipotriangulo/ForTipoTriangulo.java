/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fortipotriangulo;

import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class ForTipoTriangulo {

    public static void main(String[] args) {
        int numTriangulos, lado1, lado2, lado3, equilatero, escaleno, isoceles;
        Scanner input = new Scanner(System.in);
        equilatero = 0;
        escaleno = 0;
        isoceles = 0;
        
        System.out.print("Ingrese la cantidad de triangulos:");
        numTriangulos = input.nextInt(); 
        
        for (int i=1;i<=numTriangulos; i++){
            System.out.print("Ingrese el lado 1:");
            lado1 = input.nextInt(); 
            System.out.print("Ingrese el lado 2:");
            lado2 = input.nextInt();
            System.out.print("Ingrese el lado 3:");
            lado3 = input.nextInt();
            
            if (lado1 == lado2 && lado2 == lado3){
                System.out.println("Es equilatero.");
                equilatero += 1;
            }else{
                if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
                    System.out.println("Es isósceles .");
                    isoceles += 1;
                }else{
                    System.out.println("Es escaleno .");
                    escaleno += 1;
                }
            }
            System.out.println("");
        }
        
        System.out.println("equilatero:"+equilatero);
        System.out.println("isósceles:"+isoceles);
        System.out.println("escaleno:"+escaleno);
        
        if (equilatero<isoceles && equilatero<escaleno){
            System.out.println("El menor fue equilatero");
        }else{
            if(isoceles<equilatero && isoceles<escaleno){
                System.out.println("El menor fue isoceles");
            }else{
                if (escaleno<isoceles && escaleno<equilatero){
                    System.out.println("El menor fue escaleno");
                }else{
                    System.out.println("Todos son iguales");
                }
                
            }
        }
    }
}
