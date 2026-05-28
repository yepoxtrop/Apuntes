function Persona(nombre, apellido, email, edad) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.edad = edad;
}

// Crear objeto
let persona = {
    nombre:"Neo",
    apellido:"Mendez",
    email:"neo.1597534682@example.com",
    edad:19,
    get nombreCompleto(){ //Metodo get
        return `${this.nombre} ${this.apellido}`
    },
    set nuevoNombre(nuevoNombre){ //Metodo set
        this.nombre = nuevoNombre;
    }
};

// Llamada a metodo get
console.log(persona.nombreCompleto);

// Llamada al metodo set
persona.nuevoNombre = "Michael";
console.log(persona.nombreCompleto);