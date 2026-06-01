// Funciones callback en JavaScript con setTimeout()
let reloj = () => {
    let fecha = new Date();
    console.log(`La hora es: ${fecha.getHours()}:${fecha.getMinutes()}:${fecha.getSeconds()}`);
};

setInterval(reloj, 1000); // Llama a la función reloj cada segundo (1000 milisegundos)