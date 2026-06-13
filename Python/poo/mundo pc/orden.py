from computadora import Computadora; 
from monitor import Monitor
from raton import Raton
from teclado import Teclado

class Orden(object):
    id = 0;
    
    def __init__(self):
        Orden.id +=1; 
        self.contador_ordenes = Orden.id;
        self.computadoras = []
    
    def agregar_Computadoras(self):
        #Creacion de mouse
        marca_mouse = input("Ingrese la marca del mouse:"); 
        entrada_mouse = input("Ingrese el tipo de entrada del mouse:");
        raton = Raton(marca_mouse, entrada_mouse);
        
        #Creacion de teclado
        marca_teclado = input("Ingrese la marca del teclado:"); 
        entrada_teclado = input("Ingrese el tipo de entrada del teclado:");
        teclado = Teclado(marca_teclado, entrada_teclado);
        
        #Creacion de monitor
        monitor = Monitor(); 
        
        #Creacion de computadora
        nombre_computadora = input("Ingrese el nombre de la pc:")
        computadora = Computadora(nombre_computadora, monitor, teclado, raton)
        
        self.computadoras.append(computadora)
        
        
    def get_computadoras(self):
        for i in self.computadoras:
            return i.__str__()
        
    def __str__(self):
        return f"""***ORDENES***
        -Id:{self.contador_ordenes}
        -Computadoras:
            {self.get_computadoras()}
        """