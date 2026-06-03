const arregloNombre = []

document.getElementById("boton").addEventListener('click', ()=>{
    let formulario = document.getElementById("formulario");
    let nombre = formulario["nombre"].value;
    let apellido = formulario["apellido"].value;
    let nombreCompleto = `${nombre} ${apellido}`;

    let listaPadre = document.getElementById("lista"); 
    arregloNombre.push(nombreCompleto);
    listaPadre.innerHTML += `<li>${nombreCompleto}</li>`
    console.log(listaPadre)
    
})