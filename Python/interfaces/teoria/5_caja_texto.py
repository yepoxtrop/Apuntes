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

#Funcion caputrar valores
def capturar_texto():
    texto = caja_texto.get(); 
    label['text'] = texto

#Caja de texto
caja_texto = ttk.Entry(
    ventana, 
    font='arial',
)
caja_texto.pack();

boton = ttk.Button(
    ventana,
    text='Enviar',
    command=lambda: capturar_texto(),
)
boton.pack(); 

label = ttk.Label(
    ventana,
    text=''
)
label.pack()
#Visualizar venta
ventana.mainloop()

