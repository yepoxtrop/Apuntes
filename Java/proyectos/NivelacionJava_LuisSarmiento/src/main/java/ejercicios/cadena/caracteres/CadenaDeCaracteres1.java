/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.cadena.caracteres;

import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class CadenaDeCaracteres1 {
    private Scanner teclado;
    private String nombre1,nombre2;
    private int edad1,edad2;
        
    public void Caracteres1() {
        teclado=new Scanner(System.in);
        System.out.print("Ingrese el nombre:");
        nombre1=teclado.next();
        System.out.print("Ingrese edad:");
        edad1=teclado.nextInt();
        System.out.print("Ingrese el nombre:");
        nombre2=teclado.next();
        System.out.print("Ingrese edad:");
        edad2=teclado.nextInt();
        System.out.print("La persona de mayor edad es:");
        if (edad1>edad2) {
            System.out.print(nombre1);
        } else {
            System.out.print(nombre2);
        }
    }
}
