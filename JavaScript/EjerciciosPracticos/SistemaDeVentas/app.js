import { Orden } from "./orden.js";
import { Producto } from "./producto.js";

let orden = new Orden();
orden.agregarProducto(35000, "Gafas")
orden.agregarProducto(35000, "Gafas")
orden.agregarProducto(35000, "Gafas")
orden.agregarProducto(35000, "Gafas")
orden.agregarProducto(35000, "Gafas")
console.log(orden.calcularTotal());
orden.toString()