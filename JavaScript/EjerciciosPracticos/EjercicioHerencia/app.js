import { Persona } from "./persona.js";
import { Cliente } from "./cliente.js";
import { Empleado } from "./empleado.js";


let persona = new Persona("Juan", "Toledo", 22);
console.log(persona.toString());

let cliente = new Cliente("Anyie", "Aguirre", 32, );
console.log(cliente.toString());

let empleado = new Empleado("Angel", "Diax", 19, "1SMLV");
console.log(empleado.toString());