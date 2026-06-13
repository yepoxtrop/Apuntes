from random import randint

nombre = input("Ingrese su nombre:");
apellido= input("Ingrese su apellido:");
year_nacimiento = input("Ingrese su año de nacimiento(yyyy):");
numero_aleatorio = randint(0,9999);

id_personal = nombre[0:2]+apellido[0:2]+year_nacimiento[2:4]+str(numero_aleatorio); 


print(f"""Bienvenido a ciudad Gotica:
        Nombre:{nombre}
        Apellido:{apellido}
        Año de nacimiento:{year_nacimiento}
        Id personal:{id_personal}
""")