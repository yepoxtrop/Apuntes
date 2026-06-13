/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.condicional.anidado;

import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class CondicionalAnidadoCantidadNumeros {
    private Scanner input; 
    private int num;
    
    public void canitdadNumeros() {
        input = new Scanner(System.in);
        
        
        System.out.print("Ingrese un numero:");
        num = input.nextInt();
        
        if (num>=10 && num<=99) {
            System.out.println("Numero con dos digitos");
        } else {
            if (num>=100){
                System.out.println("Numero con tres o mas digitos");
            }else{
                if (num<10 && num >=0){
                    System.out.println("Numero con un digito");
                }else{
                    System.out.println("Numero negativo no valido");
                }
                
            }
        }
    }
}
