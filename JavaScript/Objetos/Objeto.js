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

// ASignacion de nuevos valores
persona.nombre = "Javier";

// Acceso a propiedades
console.log(persona.nombre);

// Acceso y ejecucion de metodos
console.log(persona.nombreCompleto())