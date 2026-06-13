from dispositivo_entrada import Dispositivo_Entrada

class Teclado(Dispositivo_Entrada):
    id = 0; 
    
    def __init__(self, marca, tipo_entrada):
        Teclado.id += 1;
        
        super().__init__(marca, tipo_entrada); 
        self.contador_teclado = Teclado.id; 
    
    def __str__(self):
        return f"""***TECLADO***
            -Id:{self.contador_teclado}
            -Marca:{self.get_marca()}
            -Tipo de entrada:{self.get_tipo_entrada()}
            -Estado:{super().__str__()}
        """
         