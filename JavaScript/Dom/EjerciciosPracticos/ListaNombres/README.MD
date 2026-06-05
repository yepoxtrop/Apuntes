# Lista de Nombres

Este ejercicio practico construye una lista dinamica de personas usando HTML, CSS y JavaScript. La aplicacion permite escribir un nombre y un apellido, presionar un boton y agregar el nombre completo a una lista en pantalla.

## Objetivo

Practicar el manejo del DOM para crear contenido dinamico:

- Capturar valores escritos en campos de texto.
- Escuchar el evento `click` de un boton.
- Leer datos desde un formulario.
- Unir valores usando template literals.
- Guardar nombres en un arreglo.
- Agregar elementos `li` a una lista HTML.

## Archivos del proyecto

| Archivo | Descripcion |
| --- | --- |
| `index.html` | Estructura principal del ejercicio, formulario, boton y lista de personas. |
| `script.js` | Logica para leer el nombre y apellido, guardarlos y mostrarlos en la lista. |
| `styles.css` | Estilos visuales del formulario, boton, lista y fondo de la pagina. |
| `README.MD` | Documentacion del ejercicio. |

## Funcionamiento

1. El usuario escribe un nombre en el campo `nombre`.
2. El usuario escribe un apellido en el campo `apellido`.
3. Al presionar el boton `+`, JavaScript ejecuta una funcion asociada al evento `click`.
4. Se leen los valores del formulario.
5. Se crea una variable `nombreCompleto` uniendo nombre y apellido.
6. El nombre completo se guarda en el arreglo `arregloNombre`.
7. Se agrega un nuevo elemento `li` dentro de la lista con id `lista`.

## Conceptos usados

### Arreglo para guardar datos

```js
const arregloNombre = []
```

### Evento `click`

```js
document.getElementById("boton").addEventListener("click", () => {
});
```

### Lectura de campos del formulario

```js
let formulario = document.getElementById("formulario");
let nombre = formulario["nombre"].value;
let apellido = formulario["apellido"].value;
```

### Creacion del nombre completo

```js
let nombreCompleto = `${nombre} ${apellido}`;
```

### Modificacion del DOM

```js
let listaPadre = document.getElementById("lista");
listaPadre.innerHTML += `<li>${nombreCompleto}</li>`;
```

## Tecnologias usadas

- HTML5
- CSS3
- JavaScript
- DOM

## Como probar el ejercicio

1. Abre el archivo `index.html` en el navegador.
2. Escribe un nombre en el primer campo.
3. Escribe un apellido en el segundo campo.
4. Presiona el boton `+`.
5. Revisa que el nombre completo aparezca en la lista.
6. Repite el proceso para agregar mas personas.

## Resumen

Este ejercicio refuerza como tomar informacion escrita por el usuario y mostrarla dinamicamente en una pagina. Tambien practica el uso de formularios, eventos, arreglos, template literals y modificacion del contenido HTML desde JavaScript.
