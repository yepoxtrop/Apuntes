package com.mycompany.superficiecuadrado;
import java.util.Scanner; 

/**
 *
 * @author sarmi
 */
public class SuperficieCuadrado {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int lado;
        int superficie;
        System.out.print("Ingrese el valor del lado del cuadrado:");
        lado=teclado.nextInt();
        superficie=lado * lado;
        System.out.print("La superficie del cuadrado es:");
        System.out.print(superficie);
    }
}
