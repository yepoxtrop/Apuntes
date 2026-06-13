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
public class ForSumaNumeros {
    private Scanner input;
    private int num, total ;
    public void SumaNumeros() {
        
        total = 0;
        Scanner input = new Scanner(System.in);
        
        for (int i=1; i<=10; i++){
            System.out.print("Ingrese un numero:");
            num = input.nextInt();
            if (i>=5){
                total += num;
            }
        }
        System.out.println("Total:"+total);
    }
}
