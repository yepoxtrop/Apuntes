import tkinter as tk;
from tkinter import ttk;
from tkinter.messagebox import showinfo; #ventanas informativas

#Crear ventana
ventana = tk.Tk();

#Redimensionar 
ventana.geometry('900x600');
ventana.resizable(0,0);
ventana.columnconfigure(0, weight=1);
ventana.columnconfigure(1, weight=0); #Para que la barra de scroll no se redimensione

#ventana.rowconfigure(0, weight=1);

#Titulo
ventana.title('Ejemeplo1')

#Configuraciones
ventana.configure(
    background='#000000'#Fondo
)

# Columnas de tablas y tablas
columnas = ('Nombre', 'Apellido', 'Edad');
tabla = ttk.Treeview(ventana, columns=columnas, show='headings');

# Encabezados de columnas
tabla.heading('Nombre', text='Nombre', anchor=tk.CENTER); #anchor para centrar el texto
tabla.heading('Apellido', text='Apellido', anchor=tk.CENTER); 
tabla.heading('Edad', text='Edad', anchor=tk.CENTER);

# Formato de columnas
tabla.column('Nombre', width=100, anchor=tk.CENTER);
tabla.column('Apellido', width=100, anchor=tk.CENTER);    
tabla.column('Edad', width=50, anchor=tk.CENTER);

# Agregar datos a la tabla
datos = (
    ('Juan', 'Pérez', 30),
    ('María', 'Gómez', 25),
    ('Carlos', 'López', 35),
    ('Juan', 'Pérez', 30),
    ('María', 'Gómez', 25),
    ('Carlos', 'López', 35),
    ('Juan', 'Pérez', 30),
    ('María', 'Gómez', 25),
    ('Carlos', 'López', 35),
    ('Juan', 'Pérez', 30),
    ('María', 'Gómez', 25),
    ('Carlos', 'López', 35),
);

for dato in datos:
    tabla.insert(parent='', index=tk.END, values=dato);

tabla.grid(column=0, row=0, sticky=tk.NSEW);

# Barra de scroll
scrollbar = ttk.Scrollbar(ventana, orient=tk.VERTICAL, command=tabla.yview);
tabla.configure(yscroll=scrollbar.set);
scrollbar.grid(column=1, row=0, sticky=tk.NS);

# Estilos
estilo = ttk.Style();
estilo.theme_use('clam'); #Tema
estilo.configure('Treeview', 
                 background='#000000', 
                 foreground='white', 
                 fieldbackground='#000000',
                 rowheight=25
                 ); #Colores de fondo y texto

estilo.map('Treeview', background=[('selected', '#333333')], foreground=[('selected', 'white')]); #Color de fondo y texto al seleccionar una fila

def mostrar_info(event):
    item = tabla.selection()[0]; #Obtener el item seleccionado
    info = tabla.item(item, 'values'); #Obtener los valores del item seleccionado
    showinfo(title='Información', message=f'Nombre: {info[0]}\nApellido: {info[1]}\nEdad: {info[2]}'); #Mostrar la información en una ventana

tabla.bind('<<TreeviewSelect>>', mostrar_info); #Evento para seleccionar una fila

#Visualizar venta
ventana.mainloop()

