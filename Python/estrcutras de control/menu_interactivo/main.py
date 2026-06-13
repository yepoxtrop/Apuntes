print("***Menu Interactivo***");

while True:
    print("1.Crear cuenta");
    print("2.Enviar mensaje");
    print("3.Salir");
    opcion = int(input("Escoja una opción:")); 
    
    if opcion == 1:
        print("Cuenta creada\n"); 
    elif opcion == 2:
        print("Mensjae enviado\n");
    elif opcion == 3:
        print("Sistema finalizdo\n")
        break;
    else:
        print("Opcion no disponible");