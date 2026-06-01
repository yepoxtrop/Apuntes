export class Persona{

    static contadorPersona = 0;

    constructor(nombre, apellido, edad){
        this._idPersona = Persona.contadorPersona++;
        this._nombre = nombre;
        this._apellido = apellido;
        this._edad = edad;
    }

    get idPersona(){
        return this._idPersona;
    }

    get nombre(){
        return this._nombre;
    }

    set nombre(nuevoNombre){
        this._nombre = nuevoNombre;
    }

    get apellido(){
        return this._apellido;
    }

    set apellido(nuevoApellido){
        this._apellido = nuevoApellido;
    }

    get edad(){
        return this._edad;
    }

    set edad(nuevaEdad){
        this._edad = nuevaEdad;
    }

    toString(){
        return `===Persona===\nId:${this.idPersona}\nNombre:${this.nombre}\nApellido:${this.apellido}\nEdad:${this.edad}`;
    }
}