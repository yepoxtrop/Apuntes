# Reloj Digital

Este ejercicio practico construye un reloj digital usando HTML, CSS y JavaScript. La aplicacion muestra la hora actual en formato de horas, minutos y segundos, junto con la fecha del dia.

## Objetivo

Practicar el manejo del DOM con datos de tiempo generados por JavaScript:

- Obtener la fecha y hora actual con `Date`.
- Actualizar informacion en pantalla cada segundo.
- Seleccionar elementos HTML por su id.
- Modificar el contenido de elementos con `textContent`.
- Formatear numeros menores a 10 agregando un cero inicial.
- Mostrar dias y meses usando arreglos.

## Archivos del proyecto

| Archivo | Descripcion |
| --- | --- |
| `index.html` | Estructura principal del reloj, contenedor de hora y contenedor de fecha. |
| `script.js` | Logica para obtener la hora actual y actualizar los valores en pantalla. |
| `styles.css` | Estilos visuales del reloj, fondo, tarjetas y diseno responsive. |
| `README.MD` | Documentacion del ejercicio. |

## Funcionamiento

1. La pagina contiene varios elementos `span` destinados a mostrar hora, minutos, segundos, dia, mes y ano.
2. JavaScript usa `setInterval()` para ejecutar una funcion cada 1000 milisegundos.
3. En cada ejecucion se crea un objeto `Date` con la fecha y hora actual.
4. Se obtienen las horas, minutos, segundos, dia del mes, mes y ano.
5. Los valores menores a 10 se muestran con un cero inicial.
6. El nombre del dia y del mes se obtiene desde los arreglos `dias` y `meses`.
7. Cada valor se inserta en su elemento correspondiente usando `textContent`.

## Conceptos usados

### Arreglos de dias y meses

```js
const dias = [
    "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"
];

const meses = [
    "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
    "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
];
```

### Actualizacion cada segundo

```js
setInterval(() => {
}, 1000);
```

### Objeto `Date`

```js
let fecha = new Date();
let horas = fecha.getHours();
let minutos = fecha.getMinutes();
let segundos = fecha.getSeconds();
```

### Formato con cero inicial

```js
campoHora.textContent = horas < 10 ? "0" + horas : horas;
campoMinutos.textContent = minutos < 10 ? "0" + minutos : minutos;
campoSegundos.textContent = segundos < 10 ? "0" + segundos : segundos;
```

### Mostrar datos en el DOM

```js
campoDia.textContent = dia < 10 ? "0" + dia : dia;
campoMes.textContent = meses[mes];
```

## Tecnologias usadas

- HTML5
- CSS3
- JavaScript
- DOM

## Como probar el ejercicio

1. Abre el archivo `index.html` en el navegador.
2. Observa la hora mostrada en pantalla.
3. Espera unos segundos y verifica que los segundos cambien automaticamente.
4. Revisa que tambien aparezca la fecha actual.
5. Prueba el ejercicio en una pantalla pequena para ver el diseno responsive.

## Resumen

Este ejercicio refuerza como usar JavaScript para trabajar con fechas, intervalos de tiempo y actualizaciones dinamicas en el DOM. Es una practica util para comprender como una pagina puede cambiar automaticamente sin que el usuario presione botones.
