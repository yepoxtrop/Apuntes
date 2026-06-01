# Funciones Flecha

Esta sección muestra la diferencia entre una función tradicional, una función anónima y una función flecha en JavaScript.

## Archivos principales

- `funcionFlecha.js` - Contiene ejemplos de:
  - función normal declarada con `function`
  - función anónima asignada a una constante
  - función flecha con la sintaxis `=>`

## Conceptos que se practican

- Sintaxis de funciones tradicionales.
- Uso de funciones anónimas.
- Creación de funciones flecha.
- Diferencias de escritura entre las tres formas de definir funciones.
- Ejecución de funciones con `()`.

## Cómo ejecutar

Desde esta carpeta ejecuta el archivo con Node.js:

```powershell
node funcionFlecha.js
```

## Resultado esperado

- `mensaje()` imprime `Hola mundo`.
- `mensajeAnonimo()` imprime `Hola mundo desde la función anónima`.
- `mensajeFlecha()` imprime `Hola mundo desde la función flecha`.

## Notas importantes

- Las funciones flecha tienen una sintaxis más corta y son útiles para funciones breves.
- Las funciones anónimas se usan frecuentemente como callbacks o valores de variables.
- Las funciones tradicionales son útiles cuando necesitas hoisting o definiciones de métodos más completas.

## Ejercicios sugeridos

- Convertir una función que recibe parámetros a versión flecha.
- Probar una función flecha con retorno implícito en una sola línea.
- Comparar el comportamiento de `this` dentro de una función tradicional y una flecha.
- Usar una función flecha como callback en un arreglo con `map` o `forEach`.
