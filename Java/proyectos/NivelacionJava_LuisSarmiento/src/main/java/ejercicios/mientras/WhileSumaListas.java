/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.mientras;

import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class WhileSumaListas {
    private Scanner input;
    private int lista1, lista2, contador1, contador2, numero1, numero2;
    public void SumaListas() {
        input = new Scanner(System.in);
        
        contador1 = 0;
        contador2 = 0;
        lista1 = 0;
        lista2 = 0;
        
        while (contador1<15){
            System.out.print("Ingrese un numero:");
            numero1 = input.nextInt();
            lista1 += numero1;
            contador1 += 1;
        }
        
        while (contador2<15){
            System.out.print("Ingrese un numero:");
            numero2 = input.nextInt();
            lista2 += numero2;
            contador2 += 1;
        }
        
        if (lista1>lista2){
            System.out.println("La lista1 es mayor");
        }else{
            if (lista2>lista1){
                System.out.println("La lista2 es a¿mayor");
            }else {
                System.out.println("Las lista son inguales");
            }
        }
        System.out.println("Lista 1:"+lista1);
        System.out.println("Lista 2:"+lista1);
    }
}
