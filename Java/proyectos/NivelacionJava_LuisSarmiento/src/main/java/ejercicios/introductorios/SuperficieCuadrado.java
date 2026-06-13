package ejercicios.introductorios;

import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class SuperficieCuadrado {
    private Scanner teclado;
    private int lado;
    private int superficie;
    
    public void area() {
        teclado=new Scanner(System.in);
        
        System.out.print("Ingrese el valor del lado del cuadrado:");
        lado=teclado.nextInt();
        superficie=lado * lado;
        System.out.print("La superficie del cuadrado es:");
        System.out.print(superficie);
    }
}
