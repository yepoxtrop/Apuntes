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
public class ForAreaTriangulos {
    private Scanner input;
    private int numTriangulos, base, altura, areasMayores, area, areasMenores ;
         
    public void AreaTriangulos() {
        input = new Scanner(System.in);
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
