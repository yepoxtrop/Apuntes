/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.para;

import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class ForOperacionesNumeros {
    private Scanner input;
    private int numero, negativos, postivos, multiplos, pares;
        
    public void OperacionesNumeros() {
        input = new Scanner(System.in); 
        negativos =0;
        postivos = 0; 
        multiplos = 0; 
        pares = 0;
        
        for(int i=0; i<10; i++){
            System.out.print("Ingrese un numero:");
            numero = input.nextInt();
            if (numero>0){
                postivos +=1;
                System.out.println("Positivo");
            }else if(numero<0){
                negativos +=1;
                System.out.println("Negativo");
            }
            
            if (numero%15 == 0){
                multiplos +=1;
                System.out.println("Multiplo de 15");
            }
            
            if (numero%2 ==0){
                pares += numero;
            }
            System.out.println("");
        }
        
        System.out.println("Numeros negativos:"+negativos);
        System.out.println("Numeros positivos:"+postivos);
        System.out.println("Multiplos de 15:"+multiplos);
        System.out.println("Total(sua) de pares:"+pares);

    }
}
