# Modulos
import tkinter as tk;
from tkinter import ttk;
from tkinter import messagebox;

# Ventana
ventana = tk.Tk();
ventana.geometry('600x400');
ventana.resizable(0,0);
ventana.title('Formulario Login');
ventana.configure(
    background='#000000'
);

# Grid
ventana.columnconfigure(0, weight=1);
ventana.rowconfigure(0, weight=1);

# Frame Principal
frame_principal = ttk.Frame(ventana);
frame_principal.columnconfigure(0, weight=1);
frame_principal.columnconfigure(1, weight=3);

# Titulo
titulo = ttk.Label(
    frame_principal,
    text='Formulario Login'
    
); 
titulo.grid(column=0, row=0, columnspan=2);

# Usuario
label_usuario = ttk.Label(
    frame_principal,
    text='Usuario'
);
label_usuario.grid(column=0, row=1, sticky=tk.W, padx=5, pady=20);

# Caja de texto usuario
caja_usuario = ttk.Entry(
    frame_principal,
    width=30
);
caja_usuario.grid(column=1, row=1, sticky=tk.E, padx=5, pady=20);

# Contraseña
label_contraseña = ttk.Label(
    frame_principal,
    text='Contraseña'
);
label_contraseña.grid(column=0, row=2, sticky=tk.W, padx=5, pady=20);

# Caja de texto contraseña
caja_contraseña = ttk.Entry(
    frame_principal,
    width=30,
    show='*'
);
caja_contraseña.grid(column=1, row=2, sticky=tk.E, padx=5, pady=20);

# Boton
boton = ttk.Button(
    frame_principal,
    text='Iniciar Sesión'
);
boton.grid(column=0, row=3, columnspan=2);

def iniciar_sesion(event):
    usuario = caja_usuario.get();
    contraseña = caja_contraseña.get();
    if usuario == 'admin' and contraseña == 'admin':
        print('Inicio de sesión exitoso');
        messagebox.showinfo('Login', 'Inicio de sesión exitoso');
    else:
        print('Usuario o contraseña incorrectos');
        messagebox.showerror('Login', 'Usuario o contraseña incorrectos');
        

boton.bind('<Return>', iniciar_sesion); #Evento para presionar enter
boton.bind('<Button-1>', iniciar_sesion); #Evento para hacer click en el boton

# Estilos
estilo = ttk.Style();
estilo.theme_use('clam');
estilo.configure(
    ventana,
    background='#000000',
    foreground='#FFFFFF',
    font=('Arial', 12),
    fieldbackground='#333333',
)
estilo.configure('TFrame', background='#000000')

frame_principal.grid(column=0, row=0);
ventana.mainloop();