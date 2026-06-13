/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.mientras;

import ejercicios.mientras.EstructuraRepetitivaWhile1;
import ejercicios.mientras.EstructuraRepetitivaWhile2;
import ejercicios.mientras.EstructuraRepetitivaWhile3;
import ejercicios.mientras.EstructuraRepetitivaWhile4;
import ejercicios.mientras.WhileAlturas;
import ejercicios.mientras.WhileMultiplosOcho;
import ejercicios.mientras.WhileNotasSuperiores;
import ejercicios.mientras.WhileNumerosParesImpares;
import ejercicios.mientras.WhileSecuenciaOnce;
import ejercicios.mientras.WhileSueldosEmpleados;
import ejercicios.mientras.WhileSumaListas;
import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class MenuWhile {
    public void menuWhile(){
        Scanner input = new Scanner(System.in);
        int opcion;
        
        try{
            do{
                System.out.println("EJERCICIOS DE WHILE");
                System.out.println("""
                Opciones disponibels:
                1.Numeros del 1 al 100 
                2.Rango de numeros de 1 a n
                3.Promedio de 10 numeros
                4.Procesar piezas
                5.Alturas
                6.Multiplos de 8
                7.Notas superiores                
                8.Numeros pares e impares
                9.Secuencia de once
                10.Sueldo empleados
                11.Suma de listas
                12.Salir
                """);
                System.out.print("Escoge una opcion:");
                opcion = input.nextInt();
                switch(opcion){
                    case 1 -> {
                        EstructuraRepetitivaWhile1 ejemplo1 = new EstructuraRepetitivaWhile1();
                        ejemplo1.RepetitivaWhile1();
                        System.out.println("");
                    }
                    case 2 -> {
                        EstructuraRepetitivaWhile2 ejemplo2 = new EstructuraRepetitivaWhile2();
                        ejemplo2.RepetitivaWhile2();
                        System.out.println("");
                    }
                    case 3 -> {
                        EstructuraRepetitivaWhile3 ejemplo3 = new EstructuraRepetitivaWhile3();
                        ejemplo3.RepetitivaWhile3();
                        System.out.println("");
                    }
                    case 4 -> {
                        EstructuraRepetitivaWhile4 ejemplo4 = new EstructuraRepetitivaWhile4();
                        ejemplo4.RepetitivaWhile4();
                        System.out.println("");
                    }
                    case 5 -> {
                        WhileAlturas ejemplo5 = new WhileAlturas();
                        ejemplo5.alturas();
                        System.out.println("");
                    }
                    case 6 -> {
                        WhileMultiplosOcho ejemplo6 = new WhileMultiplosOcho();
                        ejemplo6.MultiplosOcho();
                        System.out.println("");
                    }
                    case 7 -> {
                        WhileNotasSuperiores ejemplo7 = new WhileNotasSuperiores();
                        ejemplo7.notasSuperiores();
                        System.out.println("");
                    }
                    case 8 -> {
                        WhileNumerosParesImpares ejemplo8 = new WhileNumerosParesImpares();
                        ejemplo8.NumerosParesImpares();
                        System.out.println("");
                    }
                    case 9 -> {
                        WhileSecuenciaOnce ejemplo9 = new WhileSecuenciaOnce();
                        ejemplo9.SecuenciaOnce();
                        System.out.println("");
                    }
                    case 10 -> {
                        WhileSueldosEmpleados ejemplo10 = new WhileSueldosEmpleados();
                        ejemplo10.sueldoEmpleados();
                        System.out.println("");
                    }
                    case 11 -> {
                        WhileSumaListas ejemplo11 = new WhileSumaListas();
                        ejemplo11.SumaListas();
                        System.out.println("");
                    }
                    case 12 -> {
                        System.out.println("[Alerta]:Saliendo del menu actual.");
                    }
                    default -> {
                        System.out.println("[Alerta]:Opcion no disponible");
                        System.out.println("");
                    }
                }
                
            }while(opcion!=12);
            System.out.println("[Alerta]:Entrando al menu original.");
        }catch(Exception e){
            System.out.println("[Error]:Se ha presentado una excepcion en el submenu.");
        }
    }
}
