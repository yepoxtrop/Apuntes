# Errores en JavaScript

Esta sección enseña cómo manejar errores con `try`, `catch`, `finally` y cómo crear errores personalizados.

## Archivos principales

- `error.js` - Usa `try/catch/finally` para atrapar un `ReferenceError` cuando se intenta usar una variable no declarada.
- `error2.js` - Muestra cómo lanzar un error personalizado con `throw new Error(...)` dentro de `catch`.

## Conceptos que se practican

- Manejo de errores con `try`, `catch` y `finally`.
- Conocer los tipos de errores comunes como `ReferenceError`.
- Usar `console.error()` para mostrar información del error.
- Lanzar errores personalizados con `throw new Error(...)`.
- Entender que el bloque `finally` se ejecuta siempre.

## Cómo ejecutar

Desde esta carpeta ejecuta los archivos con Node.js:

```powershell
node error.js
node error2.js
```

## Resultado esperado

- En `error.js`, el código en `try` provoca un error por `x = 10` sin declarar `x`.
- El bloque `catch` captura el error y lo imprime en consola.
- El bloque `finally` se ejecuta siempre, incluso cuando hay un error.
- En `error2.js`, el bloque `catch` lanza un nuevo error personalizado con `throw`.

## Notas importantes

- `try` contiene el código que puede fallar.
- `catch` recibe el objeto `error` y permite manejarlo de forma segura.
- `finally` es útil para ejecutar limpieza o mensajes finales, sin importar si hubo error.
- `throw` permite crear errores propios cuando se detecta una condición inesperada.

## Ejercicios sugeridos

- Declarar `x` con `let` antes de asignarlo para evitar el error y ver cómo cambia el flujo.
- Probar `try/catch` con otros errores, como `TypeError` o `SyntaxError`.
- Añadir lógica dentro de `catch` para reintentar la operación o registrar el error en un archivo.
- Crear una función que lance un `Error` cuando reciba un argumento inválido.
