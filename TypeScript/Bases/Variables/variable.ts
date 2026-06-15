//Variables Numericas
var numero:number = 1; // nombreVariable:tipoDato
var numero2:number = 2;
var total:number = numero+numero2;
console.log(total)

//Variables String
var cadena:String = "Me llamo yepoxtrop";
console.log(cadena)

//Variables booleanas
var estado:Boolean = false;
console.log(estado?cadena:"No me llamo yepoxtrop");

//Variables especiales
var ubicacion:any = undefined; //Cualquier tipo de dato
var contrasena:unknown = null; //Cualquier tipo de dato con validaciones
//var red:never = ''; //por lo general genera error al ser definido

//Variables undefined y null
var desconocido:undefined = undefined; //No se puede cambiar su tipo de dato a futuro
var vacio:null = null; //No se puede cambiar su tipo de dato a futuro

//Variable con doble tipo de valor
var dni:string|null = '1.00'; //Puede ter un valor de texto o un valor nulo
