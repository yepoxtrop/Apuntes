/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.clases;

/**
 *
 * @author sarmi
 */
import java.util.Scanner;
public class Cuadrado {
    private Scanner teclado;
    int lado;
    
    public void inicializar() {
        teclado=new Scanner(System.in);
        System.out.print("Ingrese valor del lado :");
        lado=teclado.nextInt();
    }
    
    public void imprimirPerimetro() {
        int perimetro;
        perimetro=lado*4;
        System.out.println("El perímetro es:"+perimetro);
    }
    
    public void imprimirSuperficie() {
        int superficie;
        superficie=lado*lado;
        System.out.println("La superficie es:"+superficie);
    }
    
    public void ejemplo() {
        Cuadrado cuadrado1;
        cuadrado1=new Cuadrado();
        cuadrado1.inicializar();
        cuadrado1.imprimirPerimetro();
        cuadrado1.imprimirSuperficie();
    }
}
