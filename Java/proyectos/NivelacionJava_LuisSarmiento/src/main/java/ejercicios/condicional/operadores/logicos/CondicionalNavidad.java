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
public class CondicionalNavidad {
    private Scanner input;
    private int dia, mes, año;
    
    public void navidad() {
        input = new Scanner(System.in);
        System.out.print("Ingrese el día");
        dia = input.nextInt();
        System.out.print("Ingrese el mes");
        mes = input.nextInt();
        System.out.print("Ingrese el año");
        año = input.nextInt();
        
        if (dia == 25 && mes == 12){
            System.out.println("Es navidad");
        }else{
            System.out.println("Aun no es navidad");
        }
    }
}
