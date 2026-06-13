from snack import Snack; 

class Snacks(object):
    
    def __init__(self):
        self.lista_snacks = []; 
    
    def agregar_snack(self, producto=None):
        if producto == None:
            nombre = input("Ingresa el nombre del snack:");
            precio = int(input("Ingresa el precio del snacks:"));
            snack = Snack(nombre, precio);
            self.lista_snacks.append(snack);
        else:
            self.lista_snacks.append(producto);
    
    def mostrar_snacks(self):
        print("***SNACKS DISPONIBLES***")
        for i in self.lista_snacks:
            print(i)
        pass