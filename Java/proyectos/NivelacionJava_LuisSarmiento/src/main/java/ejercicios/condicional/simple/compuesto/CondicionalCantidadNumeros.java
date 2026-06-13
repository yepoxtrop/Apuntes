/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.condicional.simple.compuesto;

import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class CondicionalCantidadNumeros {
    private Scanner input;
    private int num;
    public  void CantidadNumeros() {
        input = new Scanner(System.in);
        
        
        System.out.print("Ingrese un numero:");
        num = input.nextInt();
        
        if (num>=10 && num<=99) {
            System.out.println("Numero con dos digitos");
        } else {
            if (num<10){
                System.out.println("Numero de un digito");
            }else{
                System.out.println("Numero con mas digitos");
            }
        }
    }
}
