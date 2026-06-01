// Metodo constructor
function Persona(nombre, apellido, email, edad) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.edad = edad;
    this.nombreCompleto = function() {
        return this.nombre+" "+this.apellido
    }
}

// Crear objeto
let persona = new Persona("neo", "mendez", "neo@example.com", 15);

// Agregar propiedades para todos los objetos con protoype
Persona.prototype.telefono = '+57 XXX-XXX-XX-XX' ;

// Llamada a objeto
console.log(persona.telefono);

// Modificacion de nuevo valor
persona.telefono = '+1 XXX-XXX-XX-XX';
console.log(persona.telefono);