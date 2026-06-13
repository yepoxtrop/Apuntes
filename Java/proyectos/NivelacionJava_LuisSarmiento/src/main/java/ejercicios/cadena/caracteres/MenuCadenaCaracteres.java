/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.cadena.caracteres;

import ejercicios.cadena.caracteres.CadenaDeCaracteres1;
import ejercicios.cadena.caracteres.CadenaDeCaracteres2;
import ejercicios.cadena.caracteres.CadenaDeCaracteres3;
import java.util.Scanner;

/**
 *
 * @author sarmi
 */
public class MenuCadenaCaracteres {
    public void menuDoWhile(){
        Scanner input = new Scanner(System.in);
        int opcion;
        
        try{
            do{
                System.out.println("EJERCICIOS DE STRINGS");
                System.out.println("""
                Opciones disponibels:
                1.¿Es mayor de edad?
                2.Persona mayor que otra
                3.Apellidos iguales
                4.Salir
                """);
                System.out.print("Escoge una opcion:");
                opcion = input.nextInt();
                switch(opcion){
                    case 1 -> {
                        CadenaDeCaracteres1 ejemplo1 = new CadenaDeCaracteres1();
                        ejemplo1.Caracteres1();
                        System.out.println("");
                    }
                    case 2 -> {
                        CadenaDeCaracteres2 ejemplo2 = new CadenaDeCaracteres2();
                        ejemplo2.Caracteres2();
                        System.out.println("");
                    }
                    case 3 -> {
                        CadenaDeCaracteres3 ejemplo3 = new CadenaDeCaracteres3();
                        ejemplo3.Caracteres3();
                        System.out.println("");
                    }
                    case 4 -> {
                        System.out.println("[Alerta]:Saliendo del menu actual.");
                    }
                    default -> {
                        System.out.println("[Alerta]:Opcion no disponible");
                        System.out.println("");
                    }
                }
                
            }while(opcion!=4);
            System.out.println("[Alerta]:Entrando al menu original.");
        }catch(Exception e){
            System.out.println("[Error]:Se ha presentado una excepcion en el submenu.");
        }
    }
}
