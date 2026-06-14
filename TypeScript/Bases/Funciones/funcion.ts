//function [nombreFuncion](Parametros:tipoDato):tipoDeDatoRetornado{}
function mensaje(nombre:String, rol:any):String{//any significa que recibe cualquier tipo de dato
    return `Hola ${nombre}, eres ${rol}`;
}

console.log(mensaje("Juan", "Ingeniero"));
