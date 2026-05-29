import { Persona } from "./persona.js";

export class Empleado extends Persona{

    constructor(nombre, apellido, edad, sueldo){
        super(nombre, apellido, edad);
        this._idEmpleado = this.idPersona;
        this._sueldo = sueldo;
    }

    get idEmpleado(){
        return this._idEmpleado;
    }

    get sueldo(){
        return this._sueldo;
    }

    set sueldo(nuevoSueldo){
        this._sueldo = nuevoSueldo;
    }

    toString(){
        return super.toString() + `\nSueldo${this.sueldo}`;
    }

}