//Herencia
class Persona{
    nombre;
    edad;
    genero;

    constructor(nombre:String, edad:number, genero:String){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }
}

class Estudiante extends Persona{
    colegio;

    constructor(nombre:String, edad:number, genero:String, colegio:String){
        super(nombre, edad, genero);
        this.colegio = colegio;
    }
}

console.log(new Estudiante('Juan', 21, "M", "Restrepo Millan"))