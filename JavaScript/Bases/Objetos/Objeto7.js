// Formas de crear objetos en JS

// Con una funcion
function Persona(nombre, apellido, email, edad) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.edad = edad;
    this.nombreCompleto = function() {
        return this.nombre+" "+this.apellido
    }
}
let persona = new Persona("neo", "mendez", "neo@example.com", 15);

// Con clases,en este caso clase object
let persona2 = new Object();
persona2.nombre = "Neo",
persona2.apellido = "Mendez",
persona2.email = "neo.1597534682@example.com",
persona2.edad = 19,
persona2.nombreCompleto = function(){
    return `${this.nombre} ${this.apellido}`
}

// Con llaves
let persona3 = {
    nombre:"Neo",
    apellido:"Mendez",
    email:"neo.1597534682@example.com",
    edad:19,
    nombreCompleto: function(){
        return `${this.nombre} ${this.apellido}`
    }
};