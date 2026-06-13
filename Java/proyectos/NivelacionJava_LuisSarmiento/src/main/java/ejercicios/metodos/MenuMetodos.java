/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.metodos;

import ejercicios.metodos.MayorMenor;
import ejercicios.metodos.TablaMultiplicar;
import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class MenuMetodos {
    public void menuMetodos(){
        Scanner input = new Scanner(System.in);
        int opcion;
        
        try{
            do{
                System.out.println("EJERCICIOS DE METHODS");
                System.out.println("""
                Opciones disponibels:
                1.Numero menor
                2.Tabla de multiplicar
                3.Salir
                """);
                System.out.print("Escoge una opcion:");
                opcion = input.nextInt();
                switch(opcion){
                    case 1 -> {
                        MayorMenor ejemplo1 = new MayorMenor();
                        ejemplo1.ejemplo();
                        System.out.println("");
                    }
                    case 2 -> {
                        TablaMultiplicar ejemplo2 = new TablaMultiplicar();
                        ejemplo2.ejemplo();
                        System.out.println("");
                    }
                    case 3 -> {
                        System.out.println("[Alerta]:Saliendo del menu actual.");
                    }
                    default -> {
                        System.out.println("[Alerta]:Opcion no disponible");
                        System.out.println("");
                    }
                }
                
            }while(opcion!=3);
            System.out.println("[Alerta]:Entrando al menu original.");
        }catch(Exception e){
            System.out.println("[Error]:Se ha presentado una excepcion en el submenu.");
        }
    }
}
