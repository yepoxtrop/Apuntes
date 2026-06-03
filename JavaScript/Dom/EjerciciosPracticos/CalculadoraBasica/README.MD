# Calculadora Basica

Este ejercicio practico construye una calculadora sencilla usando HTML, CSS, Bootstrap y JavaScript. La aplicacion permite ingresar dos numeros, presionar un boton y mostrar en pantalla el resultado de la suma.

## Objetivo

Practicar el manejo del DOM aplicado a un formulario real:

- Capturar valores escritos por el usuario.
- Escuchar el evento `click` de un boton.
- Evitar el comportamiento por defecto con `preventDefault()`.
- Convertir textos a numeros con `Number()`.
- Validar datos numericos con `isNaN()`.
- Mostrar el resultado modificando el contenido de un elemento HTML.

## Archivos del proyecto

| Archivo | Descripcion |
| --- | --- |
| `index.html` | Estructura principal de la calculadora, formulario, boton y contenedor del resultado. |
| `script.js` | Logica para leer los valores, validar los datos, sumar y mostrar el resultado. |
| `styles.css` | Estilos personalizados basicos para dar espacio al contenido. |
| `README.MD` | Documentacion del ejercicio. |

## Funcionamiento

1. El usuario escribe un valor en el campo `Numero 1`.
2. El usuario escribe otro valor en el campo `Numero 2`.
3. Al presionar el boton `SUMAR`, JavaScript captura el evento `click`.
4. Se leen los valores del formulario.
5. Los valores se convierten a tipo numerico usando `Number()`.
6. Si alguno de los valores no es numerico, se muestra una alerta.
7. Si los valores son validos, se muestra la suma en el elemento con id `resultado`.

## Conceptos usados

### Seleccion de elementos

```js
document.getElementById("boton-resultado")
document.getElementById("formulario")
document.getElementById("resultado")
```

### Evento `click`

```js
document.getElementById("boton-resultado").addEventListener("click", (event) => {
  event.preventDefault();
});
```

### Lectura de campos del formulario

```js
let formulario = document.getElementById("formulario");
let numero1 = formulario["numero1"].value;
let numero2 = formulario["numero2"].value;
```

### Conversion y validacion

```js
numero1 = Number(numero1);
numero2 = Number(numero2);

if (isNaN(numero1) || isNaN(numero2)) {
  window.alert("Valores Registrados NO numericos");
}
```

### Mostrar resultado

```js
resultado.innerHTML = `El resultado de la suma es: ${numero1 + numero2}`;
```

## Tecnologias usadas

- HTML5
- CSS3
- Bootstrap
- JavaScript
- DOM

## Como probar el ejercicio

1. Abre el archivo `index.html` en el navegador.
2. Escribe dos numeros en los campos del formulario.
3. Presiona el boton `SUMAR`.
4. Revisa el resultado mostrado debajo del boton.
5. Prueba escribir letras o valores no numericos para ver la validacion.

## Resumen

Este ejercicio refuerza como conectar una interfaz HTML con JavaScript para crear una funcionalidad interactiva. Aunque la calculadora solo realiza una suma, aplica conceptos importantes como eventos, formularios, conversion de datos, validaciones y modificacion del DOM.
