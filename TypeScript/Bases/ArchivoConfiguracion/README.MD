# Archivo de configuración de TypeScript

Este directorio muestra cómo inicializar la configuración de TypeScript con `tsc --init` y qué significa el archivo `tsconfig.json` generado.

## ¿Qué hace `tsc --init`?

El comando `tsc --init` crea un archivo `tsconfig.json` en la carpeta actual. Ese archivo contiene las opciones del compilador de TypeScript que controlan:

- qué archivos incluir o excluir
- qué versión de JavaScript generar (`target`)
- qué módulos usar (`module`)
- si generar mapas de origen (`sourceMap`)
- opciones de verificación de tipos (`strict`, `noUnusedLocals`, etc.)

Esto permite compilar todo el proyecto con `npx tsc` sin tener que pasar opciones en la línea de comando.

## `tsconfig.json` actual

El archivo generado en esta carpeta es:

```json
{
  // Visit https://aka.ms/tsconfig to read more about this file
  "compilerOptions": {
    // File Layout
    // "rootDir": "./src",
    // "outDir": "./dist",

    // Environment Settings
    // See also https://aka.ms/tsconfig/module
    "module": "nodenext",
    "target": "esnext",
    "types": [],
    // For nodejs:
    // "lib": ["esnext"],
    // "types": ["node"],
    // and npm install -D @types/node

    // Other Outputs
    "sourceMap": true,
    "declaration": true,
    "declarationMap": true,

    // Stricter Typechecking Options
    "noUncheckedIndexedAccess": true,
    "exactOptionalPropertyTypes": true,

    // Style Options
    // "noImplicitReturns": true,
    // "noImplicitOverride": true,
    // "noUnusedLocals": true,
    // "noUnusedParameters": true,
    // "noFallthroughCasesInSwitch": true,
    // "noPropertyAccessFromIndexSignature": true,

    // Recommended Options
    "strict": true,
    "jsx": "react-jsx",
    "verbatimModuleSyntax": true,
    "isolatedModules": true,
    "noUncheckedSideEffectImports": true,
    "moduleDetection": "force",
    "skipLibCheck": true,
  }
}
```

### Opciones clave en este `tsconfig`

- `module: "nodenext"`: compila el código para el sistema de módulos moderno de Node.js.
- `target: "esnext"`: genera JavaScript moderno compatible con las últimas versiones de ECMAScript.
- `sourceMap: true`: crea archivos `.js.map` para depuración en navegadores o en editores.
- `declaration: true` / `declarationMap: true`: genera archivos `.d.ts` y sus mapas, útiles si tu código se publica como librería.
- `strict: true`: habilita el conjunto completo de comprobaciones estrictas de TypeScript.
- `noUncheckedIndexedAccess`: fuerza el control de acceso seguro en índices de arrays/objetos.
- `exactOptionalPropertyTypes`: trata las propiedades opcionales con mayor precisión.
- `skipLibCheck: true`: evita la comprobación de tipos de dependencias externas para acelerar compilaciones.

## Cómo usarlo

1. Desde esta carpeta, ejecuta:

```bash
npx tsc
```

2. Si quieres compilar solo un archivo o una carpeta específica, usa `tsc <archivo>.ts`.

3. Para leer más opciones, visita `https://aka.ms/tsconfig` o ejecuta:

```bash
tsc --init --help
```