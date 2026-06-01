# Mundo PC

Este ejercicio construye un pequeño sistema de ventas de computadoras usando clases e herencia en JavaScript.

## Archivos principales

- `app.js` - Punto de entrada. Crea monitores, teclados, ratones, computadoras y agrega las computadoras a una orden.
- `DispositivoEntrada.js` - Clase base para dispositivos de entrada con `tipoEntrada` y `marca`.
- `Teclado.js` - Clase que extiende `DispositivoEntrada` y agrega un identificador único.
- `Raton.js` - Clase que extiende `DispositivoEntrada` y agrega un identificador único.
- `Monitor.js` - Clase para representar monitores con marca, tamaño e identificador.
- `Computadora.js` - Clase que agrupa monitor, teclado y ratón, y crea objetos `Computadora` con un nombre y un id.
- `Orden.js` - Clase para gestionar una orden de computadoras y mostrar su contenido.

## Conceptos que se practican

- Clases e instancias en JavaScript.
- Herencia con `extends`.
- Uso de `super()` para inicializar la clase base.
- Getters y setters para propiedades privadas.
- Atributos estáticos como contadores únicos (`static contador...`).
- Composición de objetos: una `Computadora` contiene `Monitor`, `Teclado` y `Raton`.
- Manejo de arreglos de objetos y generación de texto con `toString()`.

## Cómo ejecutar

Desde esta carpeta, ejecuta el ejercicio con Node.js:

```powershell
node app.js
```

## Resultado esperado

- Se crean dos computadoras completas con sus respectivos monitor, teclado y ratón.
- Se agregan esas computadoras a una orden.
- Se imprime en consola la orden con las computadoras y sus dispositivos.

## Detalles importantes

- `DispositivoEntrada` es la clase base para `Teclado` y `Raton`.
- `Computadora` arma un equipo con monitor, teclado y ratón, y define su propio `idComputadora`.
- `Orden` almacena las computadoras en un arreglo y presenta la orden usando `mostrarOrden()`.
- Cada clase tiene un método `toString()` para representar el objeto como texto.

## Ideas para mejorar

- Agregar precio a cada computadora y calcular el total de la orden.
- Permitir eliminar una computadora de la orden.
- Añadir una clase `Cliente` y relacionarla con `Orden`.
- Expander `Monitor` con resolución o tasa de refresco.
