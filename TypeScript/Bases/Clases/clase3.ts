//Interfaces
interface PlantillaObjPersona {
    Nombre:string, //obligatorios
    Apellido:string,
    Edad:number
    Ciudad?:string //opcional
}

const persona1: PlantillaObjPersona = {
    Nombre: "Pepe",
    Apellido: "Lopez",
    Edad: 12
};

console.log(persona1);