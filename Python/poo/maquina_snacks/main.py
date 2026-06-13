from snakcs import Snacks; 
from snack import Snack;

papas = Snack("papas",3000);
gaseosa = Snack("gaseosa",5000);
sandwich = Snack("sandwich",6000);

maquina_snacks = Snacks();
maquina_snacks.agregar_snack(papas); 
maquina_snacks.agregar_snack(gaseosa); 
maquina_snacks.agregar_snack(sandwich); 

pedido = []; 

print("***MAQUINA DE SNACKS***");
while True:
    print("Snacks Dispoibles"); 
    
    maquina_snacks.mostrar_snacks()
    
    print("""Menu:
    1.Comprar Snacks
    2.Mostrar Ticket
    3.Salir""")
    
    opcion = int(input("Escoja una opción:")); 
    
    if opcion == 1:
        longitud_pedido_actual = len(pedido); 
        peticion = int(input("Ingrese el id del producto que desea comprar:")); 
        
        for snack in maquina_snacks.lista_snacks:
            if peticion == snack.contador_snack:
                pedido.append(snack); 
                print(f"Snack agregado:{snack}\n")
        
        if len(pedido) <=longitud_pedido_actual:
            print("Ese id no existe dentro del sistema.\n"); 
            
               
    elif opcion == 2:
        total_pagar = 0; 
        print("***Ticket de venta***")
        
        for snack in pedido:
            print(f" {snack.nombre} - {snack.precio} COP"); 
            total_pagar += snack.precio; 
            
        print(f"Total:{total_pagar}")
    elif opcion == 3:
        print("Saliendo del sistemas...\n"); 
        break;
    else:
        print("Opcion no disponible\n"); 