import tkinter as tk;
from tkinter import ttk;
from tkinter.messagebox import showinfo; #ventanas informativas

#Crear ventana
ventana = tk.Tk();

#Redimensionar 
ventana.geometry('900x600');
ventana.resizable(0,0);

#Titulo
ventana.title('Ejemeplo1')

#Configuraciones
ventana.configure(
    background='#000000'#Fondo
)

#Configurar grid
ventana.columnconfigure(0, weight=1)#Configuraciones de columnas desde el contenedor padre
ventana.columnconfigure(1, weight=1)
ventana.columnconfigure(2, weight=1)
ventana.rowconfigure(0, weight=1)

#Manejo de grid
boton1 = ttk.Button(ventana, text='boton1');
boton2 = ttk.Button(ventana, text='boton2');
boton3 = ttk.Button(ventana, text='boton3');
boton1.grid(row=0, column=0, sticky=tk.NW); #Cordenadas en grid
boton2.grid(row=0, column=1);
boton3.grid(row=0, column=2);

#Visualizar venta
ventana.mainloop()

