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
public class CondicionalSueldo {
    private Scanner input;
    private int años;
    private double sueldo, nuevoSueldo;
    public  void sueldoOperario() {
        input = new Scanner(System.in);
        
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
