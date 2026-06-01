// Promesas con async/await
// La palabra clave async se utiliza para declarar una función asíncrona, que devuelve una promesa.
// La palabra clave await se utiliza para esperar a que una promesa se resuelva o se rechace, y devuelve el valor resuelto o el error rechazado.

async function miFuncionAsincrona(){
    let promesa = new Promise((resolve, reject)=>{
        resolve("Hola, soy una promesa resuelta");
    });
    
    return await promesa;
};
miFuncionAsincrona()
.then((valor)=>{
    console.log(valor);
})

