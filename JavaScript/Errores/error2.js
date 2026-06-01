"use strict";

try{
    x = 10; 
}catch(error){
    throw new Error("An error occurred: " + error);// Error personalizado que se lanza con un mensaje específico.
}finally{
    console.log("This block will always execute.");
}