from peliculas import Pelicula
import os; 

def opciones(opcion):
    if opcion == 1:
        nombre = input("Ingrese el nombre de la pelicula:"); 
        pelicula = Pelicula(nombre); 
        agregar_pelicula(pelicula)
    elif opcion == 2:
        listar_peliculas(); 
    elif opcion == 3:
        eliminar_catalogo();

def agregar_pelicula(pelicula:Pelicula):
    try:
        with open('./peliculas.txt', 'a', encoding='utf-8') as archivo:
            archivo.write(f"{pelicula.__str__()}\n"); 
    except FileNotFoundError as error:
        with open('./peliculas.txt', 'w', encoding='utf-8') as archivo:
            archivo.write(f"{pelicula.__str__()}\n"); 
            
def listar_peliculas():
    try:
        with open('./peliculas.txt', 'r', encoding='utf-8') as archivo:
            lectura = archivo.read() 
            print(lectura, end="\n")
    except FileNotFoundError as error:
        print(f"Archivo no encontrado:{error}");
        
def eliminar_catalogo():
    try:
        os.remove("./peliculas.txt");
    except FileNotFoundError as error:
        print(f"Archivvo no encontrado:{error}");
    except PermissionError as error:
        print(f"No se puede borrar archivo, permisos insuficientes:{error}");