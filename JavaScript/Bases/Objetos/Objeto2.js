// Crear objeto en base a la clase Object
let persona = new Object();
persona.nombre = "Neo",
persona.apellido = "Mendez",
persona.email = "neo.1597534682@example.com",
persona.edad = 19,
persona.nombreCompleto = function(){
    return `${this.nombre} ${this.apellido}`
}

// ASignacion de nuevos valores
persona.nombre = "Javier";

// Acceso a propiedades
console.log(persona.nombre);
console.log(persona['apellido']); // otra forma de acceder

// Acceso y ejecucion de metodos
console.log(persona.nombreCompleto())