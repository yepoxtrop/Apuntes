//Funciones normales
function funcion1 () {
    console.log("Función 1 ejecutada");
}
function funcion2 () {
    console.log("Función 2 ejecutada");
}

// Proceso sincrono
funcion1();
funcion2();


//Funciones callback
function impremirMensaje (mensaje) {
    console.log(mensaje);
}
function sumar (a, b, callback) {
    const resultado = a + b;
    callback(resultado);// Funcion que es pasada como argumento
}

// Proceso asincrono
sumar(5, 3, impremirMensaje); // Llamada a la función sumar con la función callback impremirMensaje

// Proceso asincrono con setTimeout
function funcionAsincrona(){
    console.log("Esto se ejecuta después de 3 segundos");
}

setTimeout(funcionAsincrona, 3000); // Llama a la función funcionAsincrona después de 3 segundos (3000 milisegundos)