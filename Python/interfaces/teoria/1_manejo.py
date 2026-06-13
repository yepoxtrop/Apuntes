import tkinter;

#Crear ventana
ventana = tkinter.Tk();

#Redimensionar 
ventana.geometry('900x600');
ventana.resizable(0,0);

#Titulo
ventana.title('Ejemeplo1')

#Configuraciones
ventana.configure(
    background='#000000'#Fondo
)


#Visualizar venta
ventana.mainloop()