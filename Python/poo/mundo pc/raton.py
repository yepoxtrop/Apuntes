from dispositivo_entrada import Dispositivo_Entrada

class Raton(Dispositivo_Entrada):
    id = 0; 
    
    def __init__(self, marca, tipo_entrada):
        Raton.id += 1;
        
        super().__init__(marca, tipo_entrada); 
        self.contador_raton = Raton.id; 
    
    def __str__(self):
        return f"""***RATON***
            -Id:{self.contador_raton}
            -Marca:{self.get_marca()}
            -Tipo de entrada:{self.get_tipo_entrada()}
            -Estado:{super().__str__()}
        """
         