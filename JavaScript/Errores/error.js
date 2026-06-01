"use strict";

try{//El bloque try se utiliza para envolver el código que puede generar un error.
    x = 10; // ReferenceError: x is not defined
}catch(error){//El bloque catch se ejecutará si ocurre un error en el bloque try.
    console.error("An error occurred: " + error);
}finally{//Lo que hay acá siempre se jecutará, sin importar si hubo un error o no.
    console.log("This block will always execute.");
}