# Sistema de Ventas

Este ejercicio crea un pequeño sistema de ventas usando clases en JavaScript y prácticas básicas de programación orientada a objetos.

## Archivos principales

- `producto.js` - Define la clase `Producto` con propiedades `precio`, `nombre` e `id`.
- `orden.js` - Define la clase `Orden`, permite agregar productos, calcular el total y listar los productos agregados.
- `app.js` - Instancia la orden, agrega varios productos y muestra el total junto con la lista de productos.

## Conceptos que se practican

- Clases e instancias en JavaScript.
- Constructor y propiedades privadas con guion bajo (`_precio`, `_nombre`).
- Getters y setters para acceder a los atributos.
- Atributos y contadores estáticos (`static`).
- Manejo de arreglos de objetos.
- Métodos para agregar elementos y calcular totales.
- Uso de `console.log` para mostrar resultados en consola.

## Cómo ejecutar

Desde esta carpeta puedes ejecutar el ejercicio con Node.js:

```powershell
node app.js
```

## Resultado esperado

- Se crean varios productos con precio y nombre.
- Se agregan a una orden hasta el límite permitido.
- Se muestra el total calculado de todos los productos.
- Se imprime la lista de productos agregados.

## Notas importantes

- La clase `Orden` limita la cantidad máxima de productos a 5 usando `static MAX_PRODUCTOS`.
- El método `calcularTotal()` recorre el arreglo `this._productos` y suma el precio de cada producto.
- El método `toString()` debe devolver una cadena o bien llamarse directamente si imprime en consola.

## Ejercicio para practicar

- Modificar `Orden` para permitir eliminar un producto.
- Agregar campos adicionales a `Producto`, por ejemplo `cantidad` o `categoria`.
- Mostrar el total en formato de moneda con separadores y símbolo.
