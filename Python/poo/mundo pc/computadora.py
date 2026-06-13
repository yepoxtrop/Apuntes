class Computadora(object):
    id = 0; 
    
    def __init__(self, nombre, monitor = None, teclado = None, raton = None):
        Computadora.id +=1; 
        self.contador_computadora = Computadora.id;
        self.nombre = nombre; 
        self.monitor = monitor;
        self.teclado = teclado;
        self.raton = raton; 
        
    def __str__(self):
        return f"""***COMPUTADORA***
            -Id:{self.id}
            -Nombre:{self.nombre}
            {self.monitor}
            {self.teclado}
            {self.raton}
        """