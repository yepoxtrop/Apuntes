//Implementar interfaz en una clase
interface PlantillaObjPersona {
    Nombre:string, //obligatorios
    Apellido:string,
    Edad:number
    Ciudad?:string //opcional
}

class Persona implements PlantillaObjPersona{
    Nombre: string;
    Apellido: string;
    Edad: number;
    Ciudad?: string | undefined;
    Educacion: string; //campo nuevo

    constructor(nombre:string, apellido:string, edad:number, educacion:string, ciudad?:string ){
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.Edad = edad;
        this.Educacion = educacion;
        this.Ciudad = ciudad;
    }
}

console.log(new Persona("Luis", "Raimundo", 19, "Universidad"))