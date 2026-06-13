/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.hacer.mientras;

import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class DoWhileSumaNumeros {
    private Scanner input;
    private int suma, numero;
        
    public  void SumaNumeros() {
        input = new Scanner(System.in);
        suma = 0;
        do {
            System.out.print("Ingrese un numero:");
            numero = input.nextInt();
            suma += numero;
        }while(numero != 9999);
        
        if (suma<0){
            System.out.println("Resultado Negativo");
        } else if(suma>0){
            System.out.println("Resultado Positivo");
        } else {
            System.out.println("Resultado Nuetro");
        }
    }
}
