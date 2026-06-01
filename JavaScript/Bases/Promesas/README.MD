# Promesas

Esta sección muestra cómo trabajar con promesas en JavaScript y cómo usar `async`/`await` para manejar código asíncrono.

## Archivos principales

- `promesa.js` - Crea una promesa con `new Promise` y usa `then`/`catch` para manejar el resultado.
- `promesa2.js` - Resuelve una promesa después de 3 segundos con `setTimeout`.
- `promesa3.js` - Define una función `async` que devuelve una promesa implícita y usa `then` para leer el resultado.
- `promesa4.js` - Usa `async`/`await` para esperar el resultado de una promesa antes de retornarlo.

## Conceptos que se practican

- Crear una promesa con `new Promise((resolve, reject) => ...)`.
- Manejar resultados exitosos con `resolve` y errores con `reject`.
- Usar `then` y `catch` para procesar la promesa.
- Ejecutar código asíncrono con `setTimeout`.
- Declarar funciones `async` y devolver valores desde ellas.
- Esperar promesas usando `await` dentro de funciones `async`.

## Cómo ejecutar

Desde esta carpeta ejecuta los archivos con Node.js:

```powershell
node promesa.js
node promesa2.js
node promesa3.js
node promesa4.js
```

## Resultado esperado

- `promesa.js` imprime `La promesa se ha cumplido exitosamente` si la condición es verdadera.
- `promesa2.js` imprime `Promesa resuelta después de 3 segundos` tras 3 segundos.
- `promesa3.js` imprime `Hola, soy una función asíncrona`.
- `promesa4.js` imprime `Hola, soy una promesa resuelta`.

## Notas importantes

- Una promesa representa una operación que puede completarse en el futuro.
- `resolve` devuelve un valor cuando la promesa se cumple.
- `reject` se usa para indicar que la promesa falló.
- `async` convierte una función en una que siempre devuelve una promesa.
- `await` pausa la ejecución dentro de una función `async` hasta que la promesa se resuelva.

## Ejercicios sugeridos

- Cambiar `promesa.js` para usar `reject` cuando la condición es falsa y manejar el error.
- Crear una promesa que simule una solicitud HTTP y resolverla después de 2 segundos.
- Usar `try/catch` con `async`/`await` para capturar errores en `promesa4.js`.
- Enlazar varias promesas con `Promise.all` o `Promise.race` para ver su comportamiento en conjunto.