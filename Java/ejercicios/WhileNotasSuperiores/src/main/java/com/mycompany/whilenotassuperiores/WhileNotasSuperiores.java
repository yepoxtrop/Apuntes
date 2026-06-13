/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.whilenotassuperiores;

import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class WhileNotasSuperiores {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int notasMayores, notasMenores, notas, nota;
        notas = 0;
        notasMayores = 0;
        notasMenores = 0;
        while(notas<10){
            System.out.println("Ingrese la nota:");
            nota = input.nextInt();
            if (nota>=7){
                notasMayores += 1;
            }else {
                notasMenores +=1;
            }
            notas +=1;
        }
        System.out.println("Los alumnos con notas >= 7:"+notasMayores);
        System.out.println("Los alumnos con notas < 7:"+notasMenores);
    }
}
