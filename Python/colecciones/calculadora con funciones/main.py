print("***CALCULADORA BASICA CON FUNCIONES***"); 

estado = True;

def mensaje_bienvenida():
    return"""Operaciones que puedes realzar:
        1.Suma
        2.Resta
        3.Multiplicacion
        4.Division
        5.Salir
    """;
    
def solcitar_valores():
    num1 = int(input("Ingrese el primer numero:"));
    num2 = int(input("Ingrese el segundo numero:"));
    return num1, num2

def operacion_matematica(opcion, num1, num2):
    if opcion == 1:
        suma = num1 + num2;
        print(f"La suma es:{suma}\n"); 
    elif opcion == 2:
        resta = num1 - num2;
        print(f"La resta es:{resta}\n"); 
    elif opcion == 3:
        multiplicacion = num1 * num2;
        print(f"La multiplicacion es:{multiplicacion}\n");
    elif opcion == 4:
        if num2 == 0:
            print("No es posible realizar una division entre 0\n");
        else:
            division = num1 / num2;
            print(f"La division es:{division}\n");
    elif opcion == 5:
        print("Cerrando calculadora\n");
    else:
        print("Opcion invalida\n")

while estado == True:
    print(mensaje_bienvenida())
    
    opcion = int(input("Escoge alguna opcion:")); 
    
    num1, num2 = solcitar_valores();
    
    operacion = operacion_matematica(opcion ,num1, num2); 
    
    if opcion == 5:
        estado = False