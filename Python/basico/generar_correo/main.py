from random import randint

nombre = input("Ingrese su nombre:");
apellido= input("Ingrese su apellido:");

correo = f"{nombre.lower()}.{apellido.lower()}@ciudadgotica.com";  


print(f"""Bienvenido a ciudad Gotica:
        Nombre:{nombre}
        Apellido:{apellido}
        Correo:{correo}
""")