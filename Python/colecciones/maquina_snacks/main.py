snacks = [
    {"id":0,"nombre":"papas","precio":3000},
    {"id":1,"nombre":"gaseosa","precio":5000},
    {"id":2,"nombre":"sandwich","precio":6000},
];

pedido = [];

print("***MAQUINA DE SNACKS***");
while True:
    print("Snacks Dispoibles"); 
    
    for snack in snacks:
        print(f"    Id:{snack['id']} -> Nombre:{snack['nombre']} - Precio:{snack['precio']}"); 
    
    print("""Menu:
    1.Comprar Snacks
    2.Mostrar Ticket
    3.Salir""")
    
    opcion = int(input("Escoja una opción:")); 
    
    if opcion == 1:
        longitud_pedido_actual = len(pedido); 
        peticion = int(input("Ingrese el id del producto que desea comprar:")); 
        
        for snack in snacks:
            if peticion == snack["id"]:
                pedido.append(snack); 
                print(f"Snack agregado:{snack}\n")
        
        if len(pedido) <=longitud_pedido_actual:
            print("Ese id no existe dentro del sistema.\n"); 
            
               
    elif opcion == 2:
        total_pagar = 0; 
        print("***Ticket de venta***")
        
        for snack in pedido:
            print(f" {snack['nombre']} - {snack['precio']} COP"); 
            total_pagar += snack['precio']; 
            
        print(f"Total:{total_pagar}")
    elif opcion == 3:
        print("Saliendo del sistemas...\n"); 
        break;
    else:
        print("Opcion no disponible\n"); 