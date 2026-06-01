# Funciones Callback

Esta sección explica cómo funcionan las funciones callback en JavaScript y muestra ejemplos de uso síncrono y asíncrono.

## Archivos principales

- `callBack.js` - Usa una función callback para imprimir el resultado de una suma.
- `callback2.js` - Muestra la diferencia entre procesos síncronos y un callback asíncrono con `setTimeout`.
- `callBack3.js` - Usa `setInterval` para ejecutar una función cada segundo.

## Conceptos que se practican

- Funciones callback como funciones que se pasan como argumentos.
- Ejecución de código después de que una operación se complete.
- Diferencia entre procesos síncronos y asíncronos.
- Uso de `setTimeout` y `setInterval`.
- Reutilización de funciones en diferentes contextos.

## Cómo ejecutar

Desde esta carpeta ejecuta los archivos con Node.js:

```powershell
node callBack.js
node callback2.js
node callBack3.js
```

## Resultado esperado

- `callBack.js` imprime el resultado de la suma usando la función callback `impremirMensaje`.
- `callback2.js` ejecuta primero las funciones síncronas y luego llama a la suma con callback. También muestra el mensaje asíncrono después de 3 segundos.
- `callBack3.js` muestra la hora actual en consola cada segundo.

## Notas importantes

- Un callback es una función que se pasa como parámetro a otra función.
- Los callbacks permiten ejecutar código después de que se complete una tarea.
- En JavaScript, muchas APIs asíncronas usan callbacks para notificar resultados.
- `setTimeout` ejecuta una función una sola vez después de un tiempo determinado.
- `setInterval` ejecuta una función repetidamente cada intervalo de tiempo.

## Ejercicios sugeridos

- Modificar `sumar` para usar una función callback que formatee el resultado antes de imprimirlo.
- Crear un callback que calcule el producto de dos números en lugar de la suma.
- Usar `setTimeout` para simular una operación de carga y mostrar un mensaje cuando termine.
- Detener `setInterval` después de algunos segundos usando `clearInterval`.
