/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadenadecaracteres3;

import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class CadenaDeCaracteres3 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String apellido1,apellido2;
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
