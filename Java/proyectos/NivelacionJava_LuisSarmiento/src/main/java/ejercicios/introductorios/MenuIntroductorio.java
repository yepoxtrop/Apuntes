/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.introductorios;

/*
* Paquetes y clases
*/
import java.util.Scanner;
import ejercicios.introductorios.Clase1;
import ejercicios.introductorios.SuperficieCuadrado;
import ejercicios.introductorios.SueldoOperario;

public class MenuIntroductorio {
    
    public void menuIntroductorio(){
        Scanner input = new Scanner(System.in);
        int opcion;
        
        try{
            do{
                System.out.println("EJERCICIOS INTRODUCTORIOS");
                System.out.println("""
                Opciones disponibels:
                1.Hola Mundo
                2.Area de un cuadrado
                3.Sueldo de un operario
                4.Salir
                """);
                System.out.print("Escoge una opcion:");
                opcion = input.nextInt();
                switch(opcion){
                    case 1 -> {
                        Clase1 ejemplo1 = new Clase1();
                        ejemplo1.saludo();
                        System.out.println("");
                    }
                    case 2 -> {
                        SuperficieCuadrado ejemplo2 = new SuperficieCuadrado();
                        ejemplo2.area();
                        System.out.println("");
                    }
                    case 3 -> {
                        SueldoOperario ejemplo3 = new SueldoOperario();
                        ejemplo3.sueldo();
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
