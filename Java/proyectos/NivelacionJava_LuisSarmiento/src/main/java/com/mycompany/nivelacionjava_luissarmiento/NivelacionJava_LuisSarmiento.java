/**
* Estudiante: Luis Angel Sarmiento Diaz 
* Fecha: 27/02/2026
* Problema: Ejericisios de nivelación.
*/

/*
 * Paquetes
 */
package com.mycompany.nivelacionjava_luissarmiento;

/*
* Clases
*/
import java.util.Scanner;
import ejercicios.introductorios.MenuIntroductorio;
import ejercicios.estructura.secuencial.MenuEstructuraSecuencial;
import ejercicios.condicional.simple.compuesto.MenuCondicionalSimpleCompuesto;
import ejercicios.condicional.anidado.MenuCondicionalAnidado;
import ejercicios.condicional.operadores.logicos.MenuCondicionalOperadoresLogicos;
import ejercicios.mientras.MenuWhile;
import ejercicios.para.MenuFor;
import ejercicios.hacer.mientras.MenuDoWhile;
import ejercicios.cadena.caracteres.MenuCadenaCaracteres;
import ejercicios.clases.MenuClases;
import ejercicios.metodos.MenuMetodos;

public class NivelacionJava_LuisSarmiento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion;
        
        try{
            do{
                System.out.println("NIVELACION DE JAVA");
                System.out.println("""
                Opciones disponibels:
                1.Ejercicios Introductorios
                2.Ejercicios de Estructura Secuencial
                3.Ejercicios con If Simple y Compuesto
                4.Ejercicios con If Anidado
                5.Ejercicios con If y Operadores Logicos
                6.Ejercicios con While                      
                7.Ejercicios con For 
                8.Ejercicios con Do While
                9.Ejercicios con Cadenas de Caracteres
                10.Ejercicios con Clases
                11.Ejercicios con Metodos
                12.Salir
                """);
                System.out.print("Escoge una opcion:");
                opcion = input.nextInt();
                System.out.println("");
                switch(opcion){
                    case 1:
                        MenuIntroductorio menu1 = new MenuIntroductorio();
                        menu1.menuIntroductorio();
                        System.out.println("");
                        break;
                    case 2:
                        MenuEstructuraSecuencial menu2 = new MenuEstructuraSecuencial();
                        menu2.menuEstructuraSecuencial();
                        System.out.println("");
                        break;
                    case 3:
                        MenuCondicionalSimpleCompuesto menu3 = new MenuCondicionalSimpleCompuesto();
                        menu3.menuCondicionalSimpleCompuesto();
                        System.out.println("");
                        break;
                    case 4:
                        MenuCondicionalAnidado menu4 = new MenuCondicionalAnidado();
                        menu4.menuCondicionalAnidado();
                        System.out.println("");
                        break;
                    case 5:
                        MenuCondicionalOperadoresLogicos menu5 = new MenuCondicionalOperadoresLogicos();
                        menu5.menuCondicionalOperadoresLogicos();
                        System.out.println("");
                        break;
                    case 6:
                        MenuWhile menu6 = new MenuWhile();
                        menu6.menuWhile();
                        System.out.println("");
                        break;
                    case 7:
                        MenuFor menu7 = new MenuFor();
                        menu7.menuFor();
                        System.out.println("");
                        break;
                    case 8:
                        MenuDoWhile menu8 = new MenuDoWhile();
                        menu8.menuDoWhile();
                        System.out.println("");
                        break;
                    case 9:
                        MenuCadenaCaracteres menu9 = new MenuCadenaCaracteres();
                        menu9.menuDoWhile();
                        System.out.println("");
                        break;
                    case 10:
                        MenuClases menu10 = new MenuClases();
                        menu10.menuClases();
                        System.out.println("");
                        break;
                    case 11:
                        MenuMetodos menu11 = new MenuMetodos();
                        menu11.menuMetodos();
                        System.out.println("");
                        break;
                    case 12:
                        System.out.println("[Alerta]:Saliendo del sistema");
                        break;
                    default:
                        System.out.println("[Alerta]:Opcion no disponible");
                        System.out.println("");
                        break;
                }
                
            }while(opcion!=12);
            System.out.println("[Alerta]:Fin del programa.");
        }catch(Exception e){
            System.out.println("[Error]:Se ha presentado una excepcion, Fin del programa.");
        }
    }
}