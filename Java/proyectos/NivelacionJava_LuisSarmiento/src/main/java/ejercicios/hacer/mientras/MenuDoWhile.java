/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.hacer.mientras;

import ejercicios.hacer.mientras.DoWhileCuentas;
import ejercicios.hacer.mientras.DoWhileSumaNumeros;
import ejercicios.hacer.mientras.EstructuraRepetitivaDoWhile1;
import ejercicios.hacer.mientras.EstructuraRepetitivaDoWhile2;
import ejercicios.hacer.mientras.EstructuraRepetitivaDoWhile3;

import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class MenuDoWhile {
    public void menuDoWhile(){
        Scanner input = new Scanner(System.in);
        int opcion;
        
        try{
            do{
                System.out.println("EJERCICIOS DE DO WHILE");
                System.out.println("""
                Opciones disponibels:
                1.Cuentas bancarias
                2.Suma de numeros
                3.Cantidad de numeros
                4.Promedio de numeros
                5.Peso de piezas
                6.Salir
                """);
                System.out.print("Escoge una opcion:");
                opcion = input.nextInt();
                switch(opcion){
                    case 1 -> {
                        DoWhileCuentas ejemplo1 = new DoWhileCuentas();
                        ejemplo1.Cuentas();
                        System.out.println("");
                    }
                    case 2 -> {
                        DoWhileSumaNumeros ejemplo2 = new DoWhileSumaNumeros();
                        ejemplo2.SumaNumeros();
                        System.out.println("");
                    }
                    case 3 -> {
                        EstructuraRepetitivaDoWhile1 ejemplo3 = new EstructuraRepetitivaDoWhile1();
                        ejemplo3.RepetitivaDoWhile1();
                        System.out.println("");
                    }
                    case 4 -> {
                        EstructuraRepetitivaDoWhile2 ejemplo4 = new EstructuraRepetitivaDoWhile2();
                        ejemplo4.RepetitivaDoWhile2();
                        System.out.println("");
                    }
                    case 5 -> {
                        EstructuraRepetitivaDoWhile3 ejemplo5 = new EstructuraRepetitivaDoWhile3();
                        ejemplo5.RepetitivaDoWhile3();
                        System.out.println("");
                    }
                    case 6 -> {
                        System.out.println("[Alerta]:Saliendo del menu actual.");
                    }
                    default -> {
                        System.out.println("[Alerta]:Opcion no disponible");
                        System.out.println("");
                    }
                }
                
            }while(opcion!=6);
            System.out.println("[Alerta]:Entrando al menu original.");
        }catch(Exception e){
            System.out.println("[Error]:Se ha presentado una excepcion en el submenu.");
        }
    }
}
