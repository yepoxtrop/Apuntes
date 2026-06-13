/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.para;

import ejercicios.para.EstructuraRepetitivaFor1;
import ejercicios.para.EstructuraRepetitivaFor2;
import ejercicios.para.EstructuraRepetitivaFor3;
import ejercicios.para.EstructuraRepetitivaFor4;
import ejercicios.para.EstructuraRepetitivaFor5;
import ejercicios.para.ForAreaTriangulos;
import ejercicios.para.ForCoordenadas;
import ejercicios.para.ForOperacionesNumeros;
import ejercicios.para.ForPromedioEdades;
import ejercicios.para.ForSumaNumeros;
import ejercicios.para.ForTablaCinco;
import ejercicios.para.ForTablaNumero;
import ejercicios.para.ForTipoTriangulo;

import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class MenuFor {
    public void menuFor(){
        Scanner input = new Scanner(System.in);
        int opcion;
        
        try{
            do{
                System.out.println("EJERCICIOS DE FOR");
                System.out.println("""
                Opciones disponibels:
                1.Numeros del 1 al 100 
                2.Promedio de 10 numeros
                3.Estudiantes aprobados o reprobados
                4.Multiplos de 3 y 5
                5.Numeros superiores a 1000
                6.Area de n triangulos
                7.Ubicacion de n coordenadas                
                8.Operaciones con numeros
                9.Promedio de n edades
                10.Suma de numeros
                11.Tabla de cienco
                12.Tabla de numeros
                13.Tipo de n triangulos
                14.Salir
                """);
                System.out.print("Escoge una opcion:");
                opcion = input.nextInt();
                switch(opcion){
                    case 1 -> {
                        EstructuraRepetitivaFor1 ejemplo1 = new EstructuraRepetitivaFor1();
                        ejemplo1.RepetitivaFor1();
                        System.out.println("");
                    }
                    case 2 -> {
                        EstructuraRepetitivaFor2 ejemplo2 = new EstructuraRepetitivaFor2();
                        ejemplo2.RepetitivaFor2();
                        System.out.println("");
                    }
                    case 3 -> {
                        EstructuraRepetitivaFor3 ejemplo3 = new EstructuraRepetitivaFor3();
                        ejemplo3.RepetitivaFor3();
                        System.out.println("");
                    }
                    case 4 -> {
                        EstructuraRepetitivaFor4 ejemplo4 = new EstructuraRepetitivaFor4();
                        ejemplo4.RepetitivaFor4();
                        System.out.println("");
                    }
                    case 5 -> {
                        EstructuraRepetitivaFor5 ejemplo5 = new EstructuraRepetitivaFor5();
                        ejemplo5.RepetitivaFor5();
                        System.out.println("");
                    }
                    case 6 -> {
                        ForAreaTriangulos ejemplo6 = new ForAreaTriangulos();
                        ejemplo6.AreaTriangulos();
                        System.out.println("");
                    }
                    case 7 -> {
                        ForCoordenadas ejemplo7 = new ForCoordenadas();
                        ejemplo7.Coordenadas();
                        System.out.println("");
                    }
                    case 8 -> {
                        ForOperacionesNumeros ejemplo8 = new ForOperacionesNumeros();
                        ejemplo8.OperacionesNumeros();
                        System.out.println("");
                    }
                    case 9 -> {
                        ForPromedioEdades ejemplo9 = new ForPromedioEdades();
                        ejemplo9.PromedioEdades();
                        System.out.println("");
                    }
                    case 10 -> {
                        ForSumaNumeros ejemplo10 = new ForSumaNumeros();
                        ejemplo10.SumaNumeros();
                        System.out.println("");
                    }
                    case 11 -> {
                        ForTablaCinco ejemplo11 = new ForTablaCinco();
                        ejemplo11.TablaCinco();
                        System.out.println("");
                    }
                    case 12 -> {
                        ForTablaNumero ejemplo12 = new ForTablaNumero();
                        ejemplo12.TablaNumero();
                        System.out.println("");
                    }
                    case 13 -> {
                        ForTipoTriangulo ejemplo13 = new ForTipoTriangulo();
                        ejemplo13.TipoTriangulo();
                        System.out.println("");
                    }
                    case 14 -> {
                        System.out.println("[Alerta]:Saliendo del menu actual.");
                    }
                    default -> {
                        System.out.println("[Alerta]:Opcion no disponible");
                        System.out.println("");
                    }
                }
                
            }while(opcion!=14);
            System.out.println("[Alerta]:Entrando al menu original.");
        }catch(Exception e){
            System.out.println("[Error]:Se ha presentado una excepcion en el submenu.");
        }
    }
}
