// Promesas con async
// La palabra clave async se utiliza para declarar una función asíncrona, que devuelve una promesa.

async function miFuncionAsincrona(){
    return "Hola, soy una función asíncrona";
}

miFuncionAsincrona()
.then((valor)=>{
    console.log(valor);
})
.catch((error)=>{
    console.error(error);
});
