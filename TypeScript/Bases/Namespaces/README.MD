# Namespaces en TypeScript

Guía de apuntes basada en el archivo `namespace.ts` de esta carpeta.

## Qué es un namespace

Un `namespace` agrupa variables, constantes y funciones dentro de un espacio de nombres para evitar choques de nombres.

En TypeScript se usa sobre todo cuando no se trabaja con módulos ES, o para organizar código dentro de un mismo archivo o proyecto.

## Ejemplo principal

```ts
namespace variablesGenerales {
  export const servidor: string = "http://localhost:8000/";
  export const apiKey: string = "que_haces_qui_hijo_mio";
}

console.log(variablesGenerales.servidor);
```

### Qué hace el código

- Define un namespace llamado `variablesGenerales`.
- Dentro del namespace exporta dos constantes: `servidor` y `apiKey`.
- El prefijo `export` permite acceder a esas constantes fuera del namespace.
- La última línea usa `variablesGenerales.servidor` para mostrar el valor.

## Buenas prácticas rápidas

- Prefiere `string`, `number`, `boolean` en minúsculas cuando declares tipos.
- Usa `export` solo en los elementos que necesitas exponer fuera del namespace.
- Si tu proyecto usa módulos (`import`/`export`), considera reemplazar namespaces por módulos.

## Cómo ejecutar

```bash
npx ts-node TypeScript/Bases/Namespaces/namespace.ts
```

O bien compilar primero con TypeScript y ejecutar con Node:

```bash
npx tsc
node TypeScript/Bases/Namespaces/namespace.js
```