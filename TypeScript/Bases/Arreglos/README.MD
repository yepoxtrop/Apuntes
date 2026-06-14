# Arreglos (TypeScript)

Carpeta de apuntes y ejercicios sobre arreglos en TypeScript. Contenido inspirado en los README de JavaScript: explicación breve, ejemplos prácticos y ejercicios para repasar.

## Archivos incluidos
- `arreglo.ts` — ejemplos mínimos de declaración y uso (números, strings, booleanos).

## Qué aprenderás aquí
- Declarar arreglos con tipos (`number[]`, `string[]`, `boolean[]`).
- Operaciones básicas: creación, lectura, modificación y visualización.
- Métodos comunes: `push`, `pop`, `map`, `filter`, `reduce`, `forEach`, `slice`, `splice`.

## Ejemplos (extraídos de `arreglo.ts`)

```ts
// Arreglo de números
var arregloNum: number[] = [0];

// Arreglo de cadenas
var arregloStr: string[] = ["2D"];

// Arreglo de booleanos
var arregloBool: boolean[] = [true, false];

console.table(arregloBool);
```

Consejo: en TypeScript usa los tipos primitivos (`number`, `string`, `boolean`) y evita `Number`/`String`/`Boolean` cuando no necesitas objetos envueltos.

## Cómo ejecutar los ejemplos

1. Ejecutar directamente con `ts-node` (rápido para pruebas):

```bash
npx ts-node TypeScript/Bases/Arreglos/arreglo.ts
```

2. Compilar con `tsc` y ejecutar con `node`:

```bash
npx tsc
node TypeScript/Bases/Arreglos/arreglo.js
```

## Buenas prácticas (resumen)
- Declara tipos en las variables de arreglo para evitar errores.
- Prefiere operaciones inmutables (`map`, `filter`) cuando no quieras modificar el arreglo original.
- Usa nombres claros para los arreglos y prueba `console.table` con objetos para depuración.

## Ejercicios sugeridos
- Inicializa `arregloNum` con varios números y calcula la suma con `reduce`.
- Dado un arreglo de objetos `{ nombre, edad }`, filtra mayores de 18 y ordénalos por edad.
- Experimenta con `slice` vs `splice` y observa la diferencia en mutabilidad.
