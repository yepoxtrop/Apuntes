/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dowhilecuentas;

import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class DoWhileCuentas {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int cuenta;
        float saldo,suma;
        suma=0;
        do {
            System.out.print("Ingrese número de cuenta:");
            cuenta=input.nextInt();
            if (cuenta>=0) {
                System.out.print("Ingrese saldo:");
                saldo=input.nextFloat();
                if (saldo>0) {
                    System.out.println("Saldo Acreedor.");
                    suma=suma+saldo;
                } else {
                    if (saldo<0) {
                        System.out.println("Saldo Deudor.");
                    } else {
                        System.out.println("Saldo Nulo.");
                    }
                }
            }
        } while(cuenta>=0);
        System.out.print("Total de saldos Acreedores:");
        System.out.print(suma);
    }
}
