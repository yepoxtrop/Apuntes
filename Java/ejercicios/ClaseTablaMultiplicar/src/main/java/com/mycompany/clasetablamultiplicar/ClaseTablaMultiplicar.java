/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clasetablamultiplicar;

import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class ClaseTablaMultiplicar {
    public void cargarValor() {
        Scanner teclado=new Scanner(System.in);
        int valor;
        do {
            System.out.print("Ingrese valor:");
            valor=teclado.nextInt();
            if (valor!=-1) {
                calcular(valor);
            }
        } while (valor!=-1);
    }
    
    public void calcular(int v) {
        for(int f=v;f<=v*10;f=f+v) {
            System.out.print(f+"-");
        }
    }
    
    public static void main(String[] ar) {
        ClaseTablaMultiplicar tabla;
        tabla=new ClaseTablaMultiplicar();
        tabla.cargarValor();
    }
}
