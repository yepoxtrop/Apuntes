import { Producto } from "./producto.js";

export class Orden{

    static MAX_PRODUCTOS = 5;
    static contadorOrdenes = 0;

    constructor(){
        this._idOrden = Orden.contadorOrdenes ++;
        this._productos = [];
        this._contadorProductosAgregados = 0;
    }

    get idOrden(){
        return this._idOrden;
    }

    get productos(){
        return this._productos;
    }

    get contadorProductosAgregados(){
        return this._contadorProductosAgregados;
    }

    set contadorProductosAgregados(num){
        this._contadorProductosAgregados = this._contadorProductosAgregados + num;
    }

    agregarProducto(precio, nombre){
        if (this.contadorProductosAgregados+1 > 5){
            throw new Error('Se supera el limite de objetos')
        }else{
            let listProductos = this.productos;
            listProductos.push(new Producto(precio, nombre));
            this.contadorProductosAgregados = 1;
        }
    }

    calcularTotal(){
        let total = 0;
        if (this.contadorProductosAgregados == 0){
            return '0 COP';
        }else{
            for (let index = 0; index < this.productos.length; index++) {
                total = total +this.productos[index].precio;       
            }
            return total;
        }
    }

    toString(){
        console.log("********* ORDEN *********")
        for (let index = 0; index < this.productos.length; index++) {
            console.log(this.productos[index].toString());     
        }
    }
}