//Funciones normales
function funcion1 () {
    console.log("Función 1 ejecutada");
}

function funcion2 () {
    console.log("Función 2 ejecutada");
}

//Funciones callback
function impremirMensaje (mensaje) {
    console.log(mensaje);
}

function sumar (a, b, callback) {
    const resultado = a + b;
    callback(resultado);// Funcion que es pasada como argumento
}

sumar(5, 3, impremirMensaje); // Llamada a la función sumar con la función callback impremirMensaje