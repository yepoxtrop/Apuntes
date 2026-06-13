/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.mientras;

/**
 *
 * @author sarmi
 */
public class WhileSecuenciaOnce {
    private int contador = 1;

    public void SecuenciaOnce() {
        
        while (contador<=25){
            System.out.print(contador*11+"-");
            contador += 1;
        }
    }
}
