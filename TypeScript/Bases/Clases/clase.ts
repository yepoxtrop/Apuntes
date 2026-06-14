// Crear clase
class Persona{

    // Atributos de la clase
    nombre;
    apellido;

    // Contructor(Atributo:TipoDato){}
    constructor(nombre:String, apellido:String){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}

let persona1 = new Persona('Neo', 'Mendez');
console.log(persona1)