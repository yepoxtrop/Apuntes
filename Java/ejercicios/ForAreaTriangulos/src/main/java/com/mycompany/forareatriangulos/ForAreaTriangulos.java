/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.forareatriangulos;

import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class ForAreaTriangulos {

    public static void main(String[] args) {
        int numTriangulos, base, altura, areasMayores, area, areasMenores ;
        Scanner input = new Scanner(System.in);
        areasMayores = 0;
        areasMenores = 0;
        
        System.out.print("Ingrese la cantidad de triangulos:");
        numTriangulos = input.nextInt(); 
        
        for (int i=1;i<=numTriangulos; i++){
            System.out.print("Ingrese la base:");
            base = input.nextInt(); 
            System.out.print("Ingrese la altura:");
            altura = input.nextInt();
            area = (base*altura)/2;
            if (area >12){
                areasMayores += 1;
            }else{
                areasMenores += 1;
            }
            System.out.println("");
        }
        
        System.out.println("Areas mayores a 12:"+areasMayores);
        System.out.println("Areas menores a 12:"+areasMenores);
        
    }
}
