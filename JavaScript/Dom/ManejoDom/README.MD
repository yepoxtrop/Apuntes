# Manejo del DOM en JavaScript

Esta seccion contiene ejercicios basicos para practicar como JavaScript puede leer, modificar y reaccionar al contenido de una pagina HTML usando el DOM.

## Que es el DOM?

El DOM, o Document Object Model, es la representacion en forma de objetos de un documento HTML. Gracias al DOM, JavaScript puede acceder a etiquetas, cambiar textos, modificar atributos, leer formularios, aplicar estilos y responder a eventos del usuario.

## Archivos de practica

| Archivo | Tema principal | Que se practica |
| --- | --- | --- |
| `manejoDom.html` | Primer script | Uso basico de JavaScript dentro de HTML y salida por consola con `console.log`. |
| `manejoDom2.html` | Acceso por id | Uso de `document`, `getElementById`, `textContent`, `innerHTML` y modificacion de un parrafo. |
| `manejoDom3.html` | Acceso por etiqueta | Uso de `getElementsByTagName` para obtener varios elementos `<p>` y recorrerlos con `for`. |
| `manejoDom4.html` | Acceso por clase | Uso de `getElementsByClassName` y recorrido de colecciones con `for` y `for...of`. |
| `manejoDom5.html` | Selectores CSS | Uso de `querySelectorAll` con selectores como `p.parrafos`, `h1` y `h1#titulo2`. |
| `manejoDom6.html` | Formularios | Acceso a un formulario con `document.forms` y lectura de valores al hacer clic en un boton. |
| `manejoDom7.html` | Datos de formularios | Dos formas de leer inputs: recorriendo el formulario y accediendo por el nombre del campo. |
| `manejoDom8.html` | `document.write` | Escritura directa en el documento y advertencia sobre su uso. |
| `manejoDom9.html` | Cambio de contenido | Modificacion del contenido de un elemento usando `innerHTML`. |
| `manejoDom10.html` | Cambio de atributos | Cambio del `src` de una imagen y del texto de un titulo mediante un evento `onclick`. |
| `manejoDom11.html` | Cambio de estilos | Modificacion de propiedades CSS desde JavaScript con `.style`. |

## Metodos y propiedades usados

### Seleccion de elementos

- `document.getElementById("id")`: selecciona un elemento por su atributo `id`.
- `document.getElementsByTagName("etiqueta")`: obtiene una coleccion de elementos por nombre de etiqueta.
- `document.getElementsByClassName("clase")`: obtiene una coleccion de elementos por clase.
- `document.querySelectorAll("selector")`: obtiene elementos usando selectores CSS.
- `document.forms["idFormulario"]`: accede a un formulario por su id o name.

### Lectura y modificacion

- `innerHTML`: lee o cambia el contenido HTML interno de un elemento.
- `textContent`: lee o cambia solo el texto de un elemento.
- `.value`: obtiene o cambia el valor de un campo de formulario.
- `.src`: obtiene o cambia la ruta de una imagen.
- `.style.propiedad`: cambia estilos CSS directamente desde JavaScript.

### Eventos

En estos ejemplos se usa `onclick` para ejecutar una funcion cuando el usuario presiona un boton:

```html
<button onclick="mostrar()">Click Me</button>
```

```js
function mostrar() {
  document.getElementById("titulo").innerHTML = "Nuevo Titulo";
}
```

## Notas importantes

- `innerHTML` permite insertar etiquetas HTML, pero debe usarse con cuidado si el contenido viene del usuario.
- `textContent` es mas seguro cuando solo se necesita cambiar texto.
- `document.write()` no suele ser buena practica despues de cargar la pagina porque puede reemplazar el contenido del documento.
- Los metodos que devuelven colecciones, como `getElementsByTagName` o `getElementsByClassName`, se pueden recorrer con `for` o `for...of`.
- Para seleccionar elementos de forma flexible, `querySelectorAll` es muy util porque acepta selectores CSS.

## Como probar los ejemplos

1. Abre cualquiera de los archivos `.html` en el navegador.
2. Abre la consola del navegador con `F12` o `Ctrl + Shift + I`.
3. Interactua con los botones cuando el ejemplo los tenga.
4. Revisa los mensajes impresos con `console.log`.

## Resumen

El objetivo de esta seccion es aprender las bases del manejo del DOM:

- Buscar elementos dentro del HTML.
- Leer contenido y valores.
- Modificar texto, HTML, atributos y estilos.
- Recorrer colecciones de elementos.
- Ejecutar funciones mediante eventos.
