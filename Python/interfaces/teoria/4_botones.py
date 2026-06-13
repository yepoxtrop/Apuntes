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

#Funcion saludar
def saludar ():
    print('Hola bro')
    showinfo(title='Mensaje', message='Hola bro')

#Componente Boton
boton = ttk.Button(
    ventana,
    text="Enviar",
    command=lambda: saludar() #Fucnionalidad
);
boton.pack(
    pady=20
);

#Visualizar venta
ventana.mainloop()

