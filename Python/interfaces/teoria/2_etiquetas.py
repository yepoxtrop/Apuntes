import tkinter as tk;

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

#Componentes
etiqueta = tk.Label(
    ventana, 
    text='Nombre',
)
etiqueta.configure(text="Adios") #Cambiar el texto del labeel

#Renderizar componente
etiqueta.pack(
    pady=20
)

#Visualizar venta
ventana.mainloop()