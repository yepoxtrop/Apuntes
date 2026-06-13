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
public class ForPromedioEdades {
    private Scanner input;
    private int edad, mañana, tarde, noche;
    private double promedioMañana, promedioTarde, promedioNoche;
        
    public void PromedioEdades() {
        input = new Scanner(System.in);
        mañana = 0;
        tarde = 0;
        noche = 0;
        
        System.out.println("TURNO MAÑANA");
        for (int i =1; i<=50; i++){
            System.out.print("Ingrese su edad:");
            edad = input.nextInt();
            mañana += edad;
        }
        System.out.println("");

        System.out.println("TURNO TARDE");
        for (int j =1; j<=60; j++){
            System.out.print("Ingrese su edad:");
            edad = input.nextInt();
            tarde += edad;
        }
        System.out.println("");
        
        System.out.println("TURNO NOCHE");
        for (int k =1; k<=110; k++){
            System.out.print("Ingrese su edad:");
            edad = input.nextInt();
            noche += edad;
        }
        System.out.println("");
        
        promedioMañana = mañana / 50;
        promedioTarde = tarde / 60;
        promedioNoche = noche / 110;
        
        System.out.println("Promedio Mañana:"+promedioMañana);
        System.out.println("Promedio Tarde:"+promedioTarde);
        System.out.println("Promedio Noche:"+promedioNoche);
        
        if (promedioMañana<promedioTarde && promedioMañana<promedioNoche){
            System.out.println("Promedio menor MAÑANA");
        }else if(promedioTarde<promedioMañana && promedioTarde<promedioNoche){
            System.out.println("Promedio menor TARDE");
        }else if(promedioNoche<promedioMañana && promedioNoche<promedioTarde){
            System.out.println("Promedio menor NOCHE");
        }else{
            System.out.println("Promedio menor NINGUNO");
        }
    }
}
