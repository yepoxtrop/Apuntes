import tkinter as tk;
from tkinter import ttk;
from tkinter.messagebox import showinfo; #ventanas informativas

class App(tk.Tk):
    def __init__(self):
        super().__init__();
        self.configurar_ventana();
        self.configurar_grid();
        self.crear_tabla();
        
    
    def configurar_ventana(self):
        self.geometry('900x600');
        self.resizable(0,0);
        self.columnconfigure(0, weight=1);
        self.columnconfigure(1, weight=0); #Para que la barra de scroll no se redimensione
        self.title('Ejemeplo1');
        self.configure(
            background='#000000'#Fondo
        );
        
    def configurar_grid(self):
        self.columnconfigure(0, weight=1);
        self.columnconfigure(1, weight=0);
    
    def crear_tabla(self):
        # Columnas de tablas y tablas
        columnas = ('Nombre', 'Apellido', 'Edad');
        self.tabla = ttk.Treeview(self, columns=columnas, show='headings');

        # Encabezados de columnas
        self.tabla.heading('Nombre', text='Nombre', anchor=tk.CENTER); #anchor para centrar el texto
        self.tabla.heading('Apellido', text='Apellido', anchor=tk.CENTER); 
        self.tabla.heading('Edad', text='Edad', anchor=tk.CENTER);

        # Formato de columnas
        self.tabla.column('Nombre', width=100, anchor=tk.CENTER);
        self.tabla.column('Apellido', width=100, anchor=tk.CENTER);    
        self.tabla.column('Edad', width=50, anchor=tk.CENTER);

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
            self.tabla.insert(parent='', index=tk.END, values=dato);

        self.tabla.grid(column=0, row=0, sticky=tk.NSEW);

        # Barra de scroll
        scrollbar = ttk.Scrollbar(self, orient=tk.VERTICAL, command=self.tabla.yview);
        self.tabla.configure(yscroll=scrollbar.set);
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
        self.tabla.bind('<<TreeviewSelect>>', self.mostrar_info); #Evento para seleccionar una fila
    
    def mostrar_info(self, event):
        item = self.tabla.selection()[0]; #Obtener el item seleccionado
        info = self.tabla.item(item, 'values'); #Obtener los valores del item seleccionado
        showinfo(title='Información', message=f'Nombre: {info[0]}\nApellido: {info[1]}\nEdad: {info[2]}'); #Mostrar la información en una ventana
    
if __name__ == '__main__':
    app = App();
    app.mainloop();