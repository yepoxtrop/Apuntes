document.getElementById("boton-resultado").addEventListener("click", (event)=>{
    event.preventDefault();
    let formulario = document.getElementById("formulario");
    let numero1 = formulario['numero1'].value;
    let numero2 = formulario['numero2'].value;
    numero1 = Number(numero1);
    numero2 = Number(numero2);

    if (isNaN(numero1) || isNaN(numero2)){
        window.alert("Valores Registrados NO numericos");   
        numero1.value = "";
        numero2.value = "";
    }

    numero1 = Number(numero1);
    numero2 = Number(numero2);   
    let resultado = document.getElementById("resultado");
    resultado.innerHTML = `El resultado de la sume es: ${numero1+numero2}`;
});