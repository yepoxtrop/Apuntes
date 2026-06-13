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
public class NumeroParImparNulo {
    private Scanner input;
    private  int num;
    
    public void tipoNumero() {
        input = new Scanner(System.in); 
        
        
        System.out.print("Ingrese un numero");
        num = input.nextInt();
        
        if (num == 0){
            System.out.println("Es nulo");
        } else {
            if (num%2 == 0){
                System.out.println("Es par");
            }else{
                System.out.println("Es impar");
            }
        }
    }
}
