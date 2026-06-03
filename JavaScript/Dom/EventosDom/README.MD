# Eventos DOM en JavaScript

Esta seccion contiene ejercicios practicos para aprender como JavaScript responde a acciones del usuario dentro de una pagina HTML usando eventos del DOM.

## Que son los eventos DOM?

Los eventos DOM son acciones que ocurren en una pagina web y que JavaScript puede detectar para ejecutar una funcion. Algunos ejemplos comunes son hacer clic en un boton, mover el mouse sobre un elemento, escribir en un formulario, cambiar el valor de un campo o esperar a que la pagina termine de cargar.

Gracias a los eventos, una pagina deja de ser estatica y puede reaccionar a la interaccion del usuario.

## Archivos de practica

| Archivo | Tema principal | Que se practica |
| --- | --- | --- |
| `eventoDom.html` | Evento `onclick` en HTML | Uso de un evento directamente en una etiqueta HTML y paso de `this` a una funcion. |
| `eventoDom2.html` | Formas de asociar eventos | Comparacion entre usar `onclick` en HTML y asignar una funcion desde JavaScript con `.onclick`. |
| `eventoDom3.html` | Evento de carga | Uso de `onload`, `window.alert` y `navigator.cookieEnabled` al cargar la pagina. |
| `eventoDom4.html` | Evento `onchange` | Conversion del texto de un input a mayusculas cuando cambia su valor. |
| `eventoDom5.html` | Eventos de mouse | Uso de `onmouseover`, `onmouseout`, `onmousedown`, `onmouseup` y `onclick` para cambiar estilos. |
| `eventoDom6.html` | Eventos de foco | Uso de `onfocus` y `onblur` para cambiar el color de fondo de un campo de texto. |
| `eventoDom7.html` | `addEventListener` | Registro de eventos con `addEventListener`, uso del objeto `event` y acceso a `event.target`. |

## Eventos usados

- `onclick`: se ejecuta cuando el usuario hace clic sobre un elemento.
- `onload`: se ejecuta cuando la pagina o un elemento termina de cargar.
- `onchange`: se ejecuta cuando cambia el valor de un campo.
- `onmouseover`: se ejecuta cuando el mouse pasa sobre un elemento.
- `onmouseout`: se ejecuta cuando el mouse sale de un elemento.
- `onmousedown`: se ejecuta cuando el usuario mantiene presionado el clic sobre un elemento.
- `onmouseup`: se ejecuta cuando el usuario suelta el clic sobre un elemento.
- `onfocus`: se ejecuta cuando un campo recibe el foco.
- `onblur`: se ejecuta cuando un campo pierde el foco.

## Formas de asociar eventos

### Desde HTML

El evento se escribe directamente como atributo de la etiqueta:

```html
<button onclick="mostrar(this)">Click Me</button>
```

```js
function mostrar(objeto) {
  objeto.innerHTML = "Dont Click Me";
}
```

### Desde JavaScript con `.onclick`

El evento se asigna despues de seleccionar el elemento:

```js
document.getElementById("boton2").onclick = cambiarTexto;

function cambiarTexto() {
  document.getElementById("boton2").innerHTML = "Click Me More";
}
```

### Desde JavaScript con `addEventListener`

Esta forma permite registrar eventos de manera mas flexible:

```js
document.getElementById("titulo").addEventListener("click", mensaje);

function mensaje(evento) {
  evento.target.innerHTML = "Se hizo click";
}
```

## Conceptos importantes

- `this`: hace referencia al elemento HTML que ejecuto el evento cuando se usa desde el atributo HTML.
- `event` o `evento`: objeto con informacion sobre el evento ejecutado.
- `event.target`: elemento que genero el evento.
- `.onclick`: propiedad usada para asignar una funcion a un evento de clic.
- `addEventListener()`: metodo recomendado para escuchar eventos desde JavaScript.
- `.style`: permite cambiar estilos CSS desde JavaScript como respuesta a un evento.
- `.value`: permite leer o modificar el valor de un campo de formulario.

## Como probar los ejemplos

1. Abre cualquiera de los archivos `.html` en el navegador.
2. Interactua con los botones, titulos o campos de texto segun el ejemplo.
3. Observa como cambia el texto, el color o el contenido de la pagina.
4. Abre la consola del navegador con `F12` o `Ctrl + Shift + I` si quieres revisar errores o probar codigo adicional.

## Resumen

El objetivo de esta seccion es aprender a:

- Detectar acciones del usuario.
- Ejecutar funciones al ocurrir un evento.
- Modificar contenido y estilos desde eventos.
- Trabajar con eventos de formularios, mouse, carga y foco.
- Usar `addEventListener` y el objeto `event`.
