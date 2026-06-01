// Crear objeto
let persona = {
    nombre:"Neo",
    apellido:"Mendez",
    email:"neo.1597534682@example.com",
    edad:19,
    nombreCompleto: function(){
        return `${this.nombre} ${this.apellido}`;
    },
    profesion: function(titulo) {
        return `${this.nombre} ${this.apellido} es ${titulo} de ${this.edad}`;
    }
};

let persona2 = {
    nombre:"Mario",
    apellido:"Dev",
    email:"Dev@example.com",
    edad:21
};


// Uso de 'call' para usar el metodo de otro objeto, en un objeto especifico
console.log(persona.nombreCompleto.call(persona2));
console.log(persona.profesion.call(persona2, 'Ingeniero de sistemas'));
