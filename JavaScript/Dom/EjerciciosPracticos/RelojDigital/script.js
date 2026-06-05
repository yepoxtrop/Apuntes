const dias = [
    "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"
];
const meses = [
    "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
];

setInterval(()=>{
    let campoHora = document.getElementById("horas");
    let campoMinutos = document.getElementById("minutos");
    let campoSegundos = document.getElementById("segundos");
    let campoDia = document.getElementById("dia");
    let campoDia2 = document.getElementById("dia2");
    let campoMes = document.getElementById("mes");
    let campoAño = document.getElementById("año");

    let fecha = new Date();
    let horas = fecha.getHours();
    let minutos = fecha.getMinutes();
    let segundos = fecha.getSeconds();
    let dia = fecha.getDate();
    let mes = fecha.getMonth();
    let año = fecha.getFullYear();

    campoHora.textContent = horas < 10 ? "0" + horas : horas;
    campoMinutos.textContent = minutos < 10 ? "0" + minutos : minutos;
    campoSegundos.textContent = segundos < 10 ? "0" + segundos : segundos;
    campoDia.textContent = dia < 10 ? "0" + dia : dia;
    campoDia2.textContent = dias[fecha.getDay() - 1];
    campoMes.textContent = meses[mes];
    campoAño.textContent = año;

},1000);