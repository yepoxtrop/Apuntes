/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.condicional.operadores.logicos;

import ejercicios.condicional.operadores.logicos.CondicionalCompuestoNumerosIguales;
import ejercicios.condicional.operadores.logicos.CondicionalCompuestoNumerosMenores1;
import ejercicios.condicional.operadores.logicos.CondicionalCompuestoNumerosMenores2;
import ejercicios.condicional.operadores.logicos.CondicionalCoordenadas;
import ejercicios.condicional.operadores.logicos.CondicionalNavidad;
import ejercicios.condicional.operadores.logicos.CondicionalRangoNumeros;
import ejercicios.condicional.operadores.logicos.CondicionalSueldo;
import ejercicios.condicional.operadores.logicos.CondicionesCompuestas1;
import ejercicios.condicional.operadores.logicos.CondicionesCompuestas2;
import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class MenuCondicionalOperadoresLogicos {
    public void menuCondicionalOperadoresLogicos(){
        Scanner input = new Scanner(System.in);
        int opcion;
        
        try{
            do{
                System.out.println("EJERCICIOS DE IF CON OPERADORES LOGICOS");
                System.out.println("""
                Opciones disponibels:
                1.Numeros iguales
                2.Numero menores a 10
                3.Algun numero menor a 10
                4.Coordenadas
                5.Es navidad
                6.Rango de numeros
                7.Sueldo                
                8.Numero mayor
                9.Primer trimestre
                10.Salir
                """);
                System.out.print("Escoge una opcion:");
                opcion = input.nextInt();
                switch(opcion){
                    case 1 -> {
                        CondicionalCompuestoNumerosIguales ejemplo1 = new CondicionalCompuestoNumerosIguales();
                        ejemplo1.NumerosIguales();
                        System.out.println("");
                    }
                    case 2 -> {
                        CondicionalCompuestoNumerosMenores1 ejemplo2 = new CondicionalCompuestoNumerosMenores1();
                        ejemplo2.numerosMenores10();
                        System.out.println("");
                    }
                    case 3 -> {
                        CondicionalCompuestoNumerosMenores2 ejemplo3 = new CondicionalCompuestoNumerosMenores2();
                        ejemplo3.algunNumeroMenor10();
                        System.out.println("");
                    }
                    case 4 -> {
                        CondicionalCoordenadas ejemplo4 = new CondicionalCoordenadas();
                        ejemplo4.coordenadas();
                        System.out.println("");
                    }
                    case 5 -> {
                        CondicionalNavidad ejemplo5 = new CondicionalNavidad();
                        ejemplo5.navidad();
                        System.out.println("");
                    }
                    case 6 -> {
                        CondicionalRangoNumeros ejemplo6 = new CondicionalRangoNumeros();
                        ejemplo6.rangoNumeros();
                        System.out.println("");
                    }
                    case 7 -> {
                        CondicionalSueldo ejemplo7 = new CondicionalSueldo();
                        ejemplo7.sueldoOperario();
                        System.out.println("");
                    }
                    case 8 -> {
                        CondicionesCompuestas1 ejemplo8 = new CondicionesCompuestas1();
                        ejemplo8.CompuestasOperadores1();
                        System.out.println("");
                    }
                    case 9 -> {
                        CondicionesCompuestas2 ejemplo9 = new CondicionesCompuestas2();
                        ejemplo9.CompuestasOperadores2();
                        System.out.println("");
                    }
                    case 10 -> {
                        System.out.println("[Alerta]:Saliendo del menu actual.");
                    }
                    default -> {
                        System.out.println("[Alerta]:Opcion no disponible");
                        System.out.println("");
                    }
                }
                
            }while(opcion!=10);
            System.out.println("[Alerta]:Entrando al menu original.");
        }catch(Exception e){
            System.out.println("[Error]:Se ha presentado una excepcion en el submenu.");
        }
    }
}
