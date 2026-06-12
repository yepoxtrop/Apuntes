var total = 0;
var egresos = 0;
var egresosArrays = [];
var ingresos = 0;
var ingresosArrays = [];

document.getElementById("botonEnviar").addEventListener("click", (event)=>{
    event.preventDefault();

    // Elemento DOM
    let valorActual = document.getElementById("valorActual");
    let valorActualIngresos = document.getElementById("valorActualIngresos");
    let valorActualEgresos = document.getElementById("valorActualEgresos");
    let tablaIngresos = document.getElementById("tablaIngresos");
    let tablaEgresos = document.getElementById("tablaEgresos");

    // valor de los campos
    let opcion = document.getElementById("opcionValor").value;
    let descripcion = document.getElementById("descripcionValor").value;
    let valor = parseFloat(document.getElementById("valor").value);

    // validar campo valor
    if (isNaN(Number(valor))) {
        alert("Por favor, ingrese un valor numérico válido.");
        return;
    }else{
        if (opcion === "ingreso") {
            total += Number(valor);
            valorActual.innerHTML = "$" + total;
            ingresos += Number(valor);
            valorActualIngresos.innerHTML = "$" + ingresos;
            tablaIngresos.innerHTML += `<tr><td>${descripcion}</td><td>$${Number(valor)}</td></tr>`;
            ingresosArrays.push({descripcion: descripcion, valor: Number(valor)});
        }else{
            total -= Number(valor);
            valorActual.innerHTML = "$" + total;
            egresos += Number(valor);
            valorActualEgresos.innerHTML = "$" + egresos;
            tablaEgresos.innerHTML += `<tr><td>${descripcion}</td><td>$${Number(valor)}</td></tr>`;
            egresosArrays.push({descripcion: descripcion, valor: Number(valor)});
        }
    }
    console.log(Number(valor))
});
