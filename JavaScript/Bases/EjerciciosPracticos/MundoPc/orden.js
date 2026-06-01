import { Computadora } from "./Computadora.js";

export class Orden{

    static contadorOrdenes = 0;

    constructor(){
        this._idOrden = ++Orden.contadorOrdenes;
        this._computadoras = [];
    }

    agregarComputadora(computadora){
        this._computadoras.push(computadora);
    }

    mostrarOrden(){
        let computadorasOrden = '';
        for(let computadora of this._computadoras){
            computadorasOrden += computadora.toString() + '\n';
        }
        return `Orden: [idOrden: ${this._idOrden}, computadoras: \n${computadorasOrden}]`;
    }

    toString(){
        return this.mostrarOrden();
    }
}