/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.clases;

import ejercicios.clases.ClaseEmpleado;
import ejercicios.clases.ClaseOperaciones;
import ejercicios.clases.Cuadrado;
import ejercicios.clases.Persona;
import ejercicios.clases.Punto;
import ejercicios.clases.Triangulo;
import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class MenuClases {
    public void menuClases(){
        Scanner input = new Scanner(System.in);
        int opcion;
        
        try{
            do{
                System.out.println("EJERCICIOS DE CLASS");
                System.out.println("""
                Opciones disponibels:
                1.Clase empleado
                2.Clase operaciones
                3.Clase cuadrado
                4.Clase persona
                5.Clase punto
                6.Clase triangulo
                7.Salir
                """);
                System.out.print("Escoge una opcion:");
                opcion = input.nextInt();
                switch(opcion){
                    case 1 -> {
                        ClaseEmpleado ejemplo1 = new ClaseEmpleado();
                        ejemplo1.ejemplo();
                        System.out.println("");
                    }
                    case 2 -> {
                        ClaseOperaciones ejemplo2 = new ClaseOperaciones();
                        ejemplo2.ejemplo();
                        System.out.println("");
                    }
                    case 3 -> {
                        Cuadrado ejemplo3 = new Cuadrado();
                        ejemplo3.ejemplo();
                        System.out.println("");
                    }
                    case 4 -> {
                        Persona ejemplo4 = new Persona();
                        ejemplo4.ejemplo();
                        System.out.println("");
                    }
                    case 5 -> {
                        Punto ejemplo5 = new Punto();
                        ejemplo5.ejemplo();
                        System.out.println("");
                    }
                    case 6 -> {
                        Triangulo ejemplo6 = new Triangulo();
                        ejemplo6.ejemplo();
                        System.out.println("");
                    }
                    case 7 -> {
                        System.out.println("[Alerta]:Saliendo del menu actual.");
                    }
                    default -> {
                        System.out.println("[Alerta]:Opcion no disponible");
                        System.out.println("");
                    }
                }
                
            }while(opcion!=7);
            System.out.println("[Alerta]:Entrando al menu original.");
        }catch(Exception e){
            System.out.println("[Error]:Se ha presentado una excepcion en el submenu.");
        }
    }
}
