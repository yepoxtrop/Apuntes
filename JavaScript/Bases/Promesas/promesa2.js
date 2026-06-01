// Uso de setTimeout con promesas

let prmesa = new Promise((resolve, reject)=>{
    setTimeout(() => {resolve('Promesa resuelta después de 3 segundos')}, 3000);
});

prmesa
.then((valor)=>{
    console.log(valor);
})
.catch((error)=>{
    console.error(error);
});
