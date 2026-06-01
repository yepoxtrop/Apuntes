import { Orden } from "./Orden.js";
import { Computadora } from "./Computadora.js";
import { Monitor } from "./Monitor.js";
import { Raton } from "./Raton.js";
import { Teclado } from "./teclado.js";

let monitor1 = new Monitor('HP', '24 pulgadas');
let teclado1 = new Teclado('HP', 'USB');
let raton1 = new Raton('HP', 'USB');
let computadora1 = new Computadora('HP Pavilion', monitor1, teclado1, raton1);

let monitor2 = new Monitor('Dell', '27 pulgadas');
let teclado2 = new Teclado('Dell', 'Bluetooth');
let raton2 = new Raton('Dell', 'Bluetooth');
let computadora2 = new Computadora('Dell Inspiron', monitor2, teclado2, raton2);

let orden1 = new Orden();
orden1.agregarComputadora(computadora1);
orden1.agregarComputadora(computadora2);
console.log(orden1.mostrarOrden());

