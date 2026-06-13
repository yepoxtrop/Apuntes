print("***CAJERO AUTOMÁTICO***")

saldo = 0; 

while True:
    print("""Opciones que puedes realizar:
        1.Consultar Saldo.
        2.Retirar
        3.Depositar
        4.Salir
    """); 
    opcion = int(input("Escoja una opcion:")); 
    
    if opcion == 1:
        print(f"Su saldo actual es de:{saldo} COP\n");
    elif opcion == 2:
        valor = int(input("Cuanto desea retirar:")); 
        if saldo < valor:
            print("No es posible retirar, dinero insuficiente en su cuenta\n"); 
        else:
            saldo -= valor;
            print(f"Retiro exitoso, su saldo actual es de:{saldo} COP\n"); 
    elif opcion == 3:
        valor = int(input("Cuanto desea depositar:")); 
        saldo += valor;
        print(f"Deposito completo, su saldo actua es de:{saldo} COP\n"); 
    elif opcion == 4:
        print("Saliendo del sistemas");
        break;
    else:
        print("Opcion no valida\n")