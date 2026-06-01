// Promesas en JavaScript con clase Promise
// Resolve: se ejecuta cuando la promesa se cumple exitosamente
// Reject: se ejecuta cuando la promesa se cumple con un error
let miPromesa = new Promise((resolve, reject) =>{
    let expresion = true;
    if(expresion){
        resolve("La promesa se ha cumplido exitosamente");
        return;
    }else{
        reject("La promesa se ha cumplido con un error");
        return;
    }
});

miPromesa
.then((valor)=>{
    console.log(valor);
}, (error)=>{
    console.error(error);
})
.catch((error)=>{
    console.error(error);
});