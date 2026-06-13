/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.condicional.operadores.logicos;

import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class CondicionesCompuestas2 {
    private Scanner teclado;
    private int dia,mes,año;
    public void CompuestasOperadores2() {
        teclado=new Scanner(System.in);
        
        System.out.print("Ingrese nro de día:");
        dia=teclado.nextInt();
        System.out.print("Ingrese nro de mes:");
        mes=teclado.nextInt();
        System.out.print("Ingrese nro de año:");
        año=teclado.nextInt();
        if (mes==1 || mes==2 || mes==3) {
            System.out.print("Corresponde al primer trimestre");
        }
    }
}
