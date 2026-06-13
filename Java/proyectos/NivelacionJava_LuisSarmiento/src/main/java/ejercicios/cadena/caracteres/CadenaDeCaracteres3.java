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
public class CadenaDeCaracteres3 {
    private Scanner teclado;
    private String apellido1,apellido2;
        
    public void Caracteres3() {
        teclado=new Scanner(System.in);
        System.out.print("Ingrese primer apellido:");
        apellido1=teclado.next();
        System.out.print("Ingrese segundo apellido:");
        apellido2=teclado.next();
        if (apellido1.equals(apellido2)) {
            System.out.print("Los apellidos son iguales");
        } else {
            System.out.print("Los apellidos son distintos");
        }
    }
}
