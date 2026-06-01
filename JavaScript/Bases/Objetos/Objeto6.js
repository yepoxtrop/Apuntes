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

// Llamada a objeto
console.log(persona);

// llamado a metodo del objeto
console.log(persona.nombreCompleto())