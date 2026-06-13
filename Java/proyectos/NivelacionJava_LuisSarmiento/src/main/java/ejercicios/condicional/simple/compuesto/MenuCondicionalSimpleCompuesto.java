/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.condicional.simple.compuesto;

/*
* Paquetes y clases
*/
import java.util.Scanner;
import ejercicios.condicional.simple.compuesto.CondicionPromedio;
import ejercicios.condicional.simple.compuesto.CondicionalCantidadNumeros;
import ejercicios.condicional.simple.compuesto.EstructuraCondicionalCompuesta1;
import ejercicios.condicional.simple.compuesto.EstructuraCondicionalSimple1;
import ejercicios.condicional.simple.compuesto.NumeroMayorSuma;

public class MenuCondicionalSimpleCompuesto {
    public void menuCondicionalSimpleCompuesto(){
        Scanner input = new Scanner(System.in);
        int opcion;
        
        try{
            do{
                System.out.println("EJERCICIOS DE IF ANIDADO Y COMPUESTO");
                System.out.println("""
                Opciones disponibels:
                1.Promedio de notas
                2.Cantidad de numeros
                3.Condicional compuesto 1
                4.Condicional simple 1
                5.Operaciones de numeros
                6.Salir
                """);
                System.out.print("Escoge una opcion:");
                opcion = input.nextInt();
                switch(opcion){
                    case 1 -> {
                        CondicionPromedio ejemplo1 = new CondicionPromedio();
                        ejemplo1.promedioNotas();
                        System.out.println("");
                    }
                    case 2 -> {
                        CondicionalCantidadNumeros ejemplo2 = new CondicionalCantidadNumeros();
                        ejemplo2.CantidadNumeros();
                        System.out.println("");
                    }
                    case 3 -> {
                        EstructuraCondicionalCompuesta1 ejemplo3 = new EstructuraCondicionalCompuesta1();
                        ejemplo3.CondicionalCompuesta1();
                        System.out.println("");
                    }
                    case 4 -> {
                        EstructuraCondicionalSimple1 ejemplo4 = new EstructuraCondicionalSimple1();
                        ejemplo4.CondicionalSimple1();
                        System.out.println("");
                    }
                    case 5 -> {
                        NumeroMayorSuma ejemplo5 = new NumeroMayorSuma();
                        ejemplo5.operacionesNumeros();
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
