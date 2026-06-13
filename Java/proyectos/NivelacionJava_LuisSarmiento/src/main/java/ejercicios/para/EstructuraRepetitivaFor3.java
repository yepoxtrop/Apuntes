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
public class EstructuraRepetitivaFor3 {
    private Scanner teclado;
    private int aprobados,reprobados,f,nota;
    public  void RepetitivaFor3() {
        teclado=new Scanner(System.in);
        
        aprobados=0;
        reprobados=0;
        for(f=1;f<=10;f++) {
            System.out.print("Ingrese la nota:");
            nota=teclado.nextInt();
            if (nota>=7) {
                aprobados=aprobados+1;
            } else {
            	reprobados=reprobados+1;
            }
        }
        System.out.print("Cantidad de aprobados:");
        System.out.println(aprobados);
        System.out.print("Cantidad de reprobados:");
        System.out.print(reprobados);
    }
}
