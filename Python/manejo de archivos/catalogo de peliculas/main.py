from funciones import *

while True:
    print("***CATALOGO DE PELICULAS***");
    print("""Opciones:
    1.Agregar peliculas
    2.Listar peliculas
    3.Eliminar catalogo de peliculas
    4.Finalizar programa
    """)
    try:
        opcion = int(input("Escoja una opcion(1-4):")); 
    except ValueError as error:
        print("Tipo de dato invalido"); 
    else:
        if opcion == 4:
            break;
        elif opcion > 4: 
            print("Opcion invalida")
        else:
            opciones(opcion); 
    