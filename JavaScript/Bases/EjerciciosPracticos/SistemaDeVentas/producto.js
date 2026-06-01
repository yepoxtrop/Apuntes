export class Producto{

    static contadorProductos = 0;

    constructor(precio, nombre){
        this._idProdcuto = Producto.contadorProductos ++;
        this._precio = precio;
        this._nombre = nombre;
    }

    get idProdcuto(){
        return this._idProdcuto;
    }

    get precio(){
        return this._precio;
    }

    set precio(nuevoPrecio){
        this._precio = nuevoPrecio;
    }

    get nombre(){
        return this._nombre;
    }

    set nombre(nuevoNombre){
        this._nombre = nuevoNombre;
    }

    toString(){
        return `====== Producto ======\nId:${this.idProdcuto}\nNombre:${this.nombre}\nPrecio:${this.precio}`;
    }
}