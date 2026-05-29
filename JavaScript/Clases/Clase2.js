// Crear clase
class Persona{
    constructor(nombre, apellido){
        this._nombre = nombre; // Encapsulamiento con #
        this._apellido = apellido;
    }

    get nombre(){ //metodo get
        return this._nombre;
    }

    set nombre(nombre){
        this._nombre = nombre;
    }
    
}

let persona = new Persona('Neo', 'Mendez');
console.log(persona.nombre); //llamado al metodo get
persona.nombre = 'Javier'; //llamado al metodo set
console.log(persona);


// El concepto de hoinsting no aplica para las clases en js
