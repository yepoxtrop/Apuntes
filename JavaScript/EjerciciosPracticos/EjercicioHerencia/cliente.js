import { Persona } from "./persona.js";

export class Cliente extends Persona{

    constructor(nombre, apellido, edad, sueldo){
        super(nombre, apellido, edad);
        this._idCliente = this.idPersona;
        this._fechaRegistro = new Date();
    }

    get idCliente(){
        return this._idCliente;
    }

    get fechaRegistro(){
        return this._fechaRegistro;
    }

    set fechaRegistro(nuevaFecha){
        this._fechaRegistro = nuevaFecha;
    }

    toString(){
        return super.toString() + `\nFecha de Registro${this.fechaRegistro}`;
    }

}