// Crear objeto
let persona = {
    nombre:"Neo",
    apellido:"Mendez",
    email:"neo.1597534682@example.com",
    edad:19,
    nombreCompleto: function(){
        return `${this.nombre} ${this.apellido}`
    }
};

// Agregar nueva propiedads
persona.telefono = "+57 xxx-xxx-xx-xx"

// Imprimir objeto
console.log(persona)

// Eliminar propiedad del objeto
delete persona.telefono;

// Imprimir objeto
console.log(persona)