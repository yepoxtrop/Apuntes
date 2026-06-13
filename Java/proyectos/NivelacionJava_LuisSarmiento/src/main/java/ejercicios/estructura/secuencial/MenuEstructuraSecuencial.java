/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.estructura.secuencial;

/*
* Paquetes y clases
*/
import java.util.Scanner;
import ejercicios.estructura.secuencial.ComprasArticulos;
import ejercicios.estructura.secuencial.PerimetroCuadrado;
import ejercicios.estructura.secuencial.SumaProductoNumeros;
import ejercicios.estructura.secuencial.SumasProductos;
import ejercicios.estructura.secuencial.SumasPromedios;                

public class MenuEstructuraSecuencial {
    public void menuEstructuraSecuencial(){
        Scanner input = new Scanner(System.in);
        int opcion;
        
        try{
            do{
                System.out.println("EJERCICIOS DE ESTRUCCTURA SECUENCIAL");
                System.out.println("""
                Opciones disponibels:
                1.Compras de articulos
                2.Perimetro de un cuadrado
                3.Suma del producto de numeros
                4.Suma de productos
                5.Suma de promedios
                6.Salir
                """);
                System.out.print("Escoge una opcion:");
                opcion = input.nextInt();
                switch(opcion){
                    case 1 -> {
                        ComprasArticulos ejemplo1 = new ComprasArticulos();
                        ejemplo1.compras();
                        System.out.println("");
                    }
                    case 2 -> {
                        PerimetroCuadrado ejemplo2 = new PerimetroCuadrado();
                        ejemplo2.perimetro();
                        System.out.println("");
                    }
                    case 3 -> {
                        SumaProductoNumeros ejemplo3 = new SumaProductoNumeros();
                        ejemplo3.suma();
                        System.out.println("");
                    }
                    case 4 -> {
                        SumasProductos ejemplo4 = new SumasProductos();
                        ejemplo4.operaciones();
                        System.out.println("");
                    }
                    case 5 -> {
                        SumasPromedios ejemplo5 = new SumasPromedios();
                        ejemplo5.promedio();
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
