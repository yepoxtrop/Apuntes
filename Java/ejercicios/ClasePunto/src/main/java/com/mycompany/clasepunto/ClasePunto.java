/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clasepunto;

import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class ClasePunto {

    private Scanner teclado;
    int x,y;
    
    public void inicializar() {
        teclado=new Scanner(System.in);
        System.out.print("Ingrese coordenada x :");
        x=teclado.nextInt();
        System.out.print("Ingrese coordenada y :");
        y=teclado.nextInt();
    }
    
    void imprimirCuadrante() {
        if (x>0 && y>0) {
            System.out.print("Se encuentra en el primer cuadrante.");
        } else {
            if (x<0 && y>0) {
                System.out.print("Se encuentra en el segundo cuadrante.");
            } else {
                if (x<0 && y<0) {
                    System.out.print("Se encuentra en el tercer cuadrante.");
                } else {
                    if (x>0 && y<0) {
                        System.out.print("Se encuentra en el cuarto cuadrante.");
                    } else {
                        System.out.print("El punto no está en un cuadrante.");
                    }
                }
            }
        }
    }
    
    public static void main(String[] ar) {
        ClasePunto punto1;
        punto1=new ClasePunto();
        punto1.inicializar();
        punto1.imprimirCuadrante();
    }
}
