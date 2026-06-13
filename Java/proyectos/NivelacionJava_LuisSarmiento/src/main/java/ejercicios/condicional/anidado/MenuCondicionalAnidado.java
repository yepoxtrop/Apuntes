/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.condicional.anidado;

/*
* Paquetes y clases
*/
import java.util.Scanner;
import ejercicios.condicional.anidado.CondicionalAnidadoCantidadNumeros;
import ejercicios.condicional.anidado.CondicionalNumerosMayores;
import ejercicios.condicional.anidado.CondicionalPorcentajePreguntasCorrectas;
import ejercicios.condicional.anidado.EstructuraCondicionalAnidada1;
import ejercicios.condicional.anidado.NumeroParImparNulo;

public class MenuCondicionalAnidado {
    public void menuCondicionalAnidado(){
        Scanner input = new Scanner(System.in);
        int opcion;
        
        try{
            do{
                System.out.println("EJERCICIOS DE IF ANIDADO");
                System.out.println("""
                Opciones disponibels:
                1.Cantidad de numeros
                2.Numeros mayores
                3.Porcentaje de preguntas correctas
                4.Resultado de calificaciones
                5.Tipo de numero
                6.Salir
                """);
                System.out.print("Escoge una opcion:");
                opcion = input.nextInt();
                switch(opcion){
                    case 1 -> {
                        CondicionalAnidadoCantidadNumeros ejemplo1 = new CondicionalAnidadoCantidadNumeros();
                        ejemplo1.canitdadNumeros();
                        System.out.println("");
                    }
                    case 2 -> {
                        CondicionalNumerosMayores ejemplo2 = new CondicionalNumerosMayores();
                        ejemplo2.numeroMayor();
                        System.out.println("");
                    }
                    case 3 -> {
                        CondicionalPorcentajePreguntasCorrectas ejemplo3 = new CondicionalPorcentajePreguntasCorrectas();
                        ejemplo3.preguntasPorcentaje();
                        System.out.println("");
                    }
                    case 4 -> {
                        EstructuraCondicionalAnidada1 ejemplo4 = new EstructuraCondicionalAnidada1();
                        ejemplo4.CondicionalAnidada1();
                        System.out.println("");
                    }
                    case 5 -> {
                        NumeroParImparNulo ejemplo5 = new NumeroParImparNulo();
                        ejemplo5.tipoNumero();
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
