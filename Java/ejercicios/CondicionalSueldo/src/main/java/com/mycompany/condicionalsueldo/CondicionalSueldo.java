/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicionalsueldo;

import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class CondicionalSueldo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int años;
        double sueldo, nuevoSueldo;
        System.out.print("Ingrese sus años de antiguedad:");
        años = input.nextInt();
        System.out.print("Ingrese su sueldo actual:");
        sueldo = input.nextDouble();
        
        if(sueldo < 500 && años >= 10){
            nuevoSueldo = (sueldo*0.2)+sueldo;
            System.out.println("Su nuevo sueldo es:"+nuevoSueldo);
        }else {
            if(sueldo < 500 && años < 10){
                nuevoSueldo = (sueldo*0.05)+sueldo;
                System.out.println("Su nuevo sueldo es:"+nuevoSueldo);
            }else {
                if(sueldo > 500 ){
                    System.out.println("No hay cambio en el sueldo");
                }
            }
        }
    }
}
