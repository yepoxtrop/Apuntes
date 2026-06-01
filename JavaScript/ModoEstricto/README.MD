# Modo Estricto

Esta sección muestra cómo funciona el modo estricto (`"use strict"`) en JavaScript y por qué es útil para detectar errores.

## Archivos principales

- `modoEstricto.js` - Aplica `"use strict"` en todo el archivo y demuestra que no se pueden usar variables sin declararlas.
- `modoEstricto2.js` - Aplica `"use strict"` dentro de una función y muestra su alcance local.

## Conceptos que se practican

- Uso de `"use strict"` para activar el modo estricto en JavaScript.
- Prevención del uso de variables sin declarar.
- Mejora de la seguridad y detección temprana de errores.
- Diferencia entre usar `"use strict"` a nivel global y dentro de una función.

## Cómo ejecutar

Desde esta carpeta ejecuta cualquiera de los archivos con Node.js:

```powershell
node modoEstricto.js
node modoEstricto2.js
```

## Resultado esperado

- En `modoEstricto.js`, `let x = 10` funciona y se imprime `10`.
- Intentar asignar `y = 2` sin declarar la variable provoca un error en modo estricto.
- En `modoEstricto2.js`, el modo estricto está activo solo dentro de la función `contdor()` y también generará un error por no declarar `y`.

## Nota importante

- En modo estricto no se permiten variables implícitas como `y = 2`.
- El modo estricto ayuda a escribir código más limpio y evita errores difíciles de depurar.
- Cuando se usa dentro de una función, el modo estricto solo se aplica a esa función.

## Ejercicios sugeridos

- Declarar `y` con `let` o `var` para que el código funcione correctamente.
- Probar otros errores detectados en modo estricto, como asignar a una propiedad de solo lectura o usar `delete` en variables.
- Aplicar `"use strict"` en diferentes archivos y funciones para ver su comportamiento.
