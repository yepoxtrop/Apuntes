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
console.clear();

// Acceso y ejecucion de metodos
console.log(persona.nombreCompleto());
console.clear();

// Recorrer objeto para ver sus propiedades (for in)
for(propiedad in persona){
    console.log(propiedad);
    console.log(persona[propiedad]);
    console.log("-------------------")
}
