class Snack(object):
    id = 0; 
    
    def __init__(self, nombre, precio):
        Snack.id += 1; 
        self.contador_snack = Snack.id;
        self.nombre = nombre;
        self.precio = precio;
        
    def __str__(self):
        return f"""         
        ***SNACK***
        -Id:{self.contador_snack}
        -Nombre:{self.nombre}
        -Precio:{self.precio}\n
        """