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
public class CadenaDeCaracteres2 {
    private Scanner teclado;
    private String apenom1,apenom2;
    private int edad1,edad2;
        
    public void Caracteres2() {
        teclado=new Scanner(System.in);
        System.out.print("Ingrese el apellido y el nombre:");
        apenom1=teclado.nextLine();
        System.out.print("Ingrese edad:");
        edad1=teclado.nextInt();
        System.out.print("Ingrese el apellido y el nombre:");
        teclado.nextLine();
        apenom2=teclado.nextLine();
        System.out.print("Ingrese edad:");
        edad2=teclado.nextInt();
        System.out.print("La persona de mayor edad es:");
        if (edad1>edad2) {
            System.out.print(apenom1);
        } else {
            System.out.print(apenom2);
        }
    }
}
