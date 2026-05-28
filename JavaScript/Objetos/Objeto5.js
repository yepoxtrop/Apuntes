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