/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.mientras;

/**
 *
 * @author sarmi
 */
public class WhileMultiplosOcho {
    private int contador = 1;
    public void MultiplosOcho() {
        
        
        while (contador<=500){
            System.out.print(contador*8+"-");
            contador += 1;
        }
    }
}
