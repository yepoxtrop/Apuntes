# Funciones (TypeScript)

Apuntes y ejercicios sobre funciones en TypeScript. Incluye ejemplos básicos, buenas prácticas y ejercicios para practicar.

## Archivos incluidos
- `funcion.ts` — ejemplo simple de función con parámetros y retorno.

## Objetivos
- Entender la sintaxis de funciones en TypeScript.
- Aprender a declarar tipos para parámetros y retorno.
- Ver patrones comunes: arrow functions, parámetros opcionales y rest.

## Ejemplo (original)

```ts
// funcion.ts
function mensaje(nombre: string, rol: any): string {
	return `Hola ${nombre}, eres ${rol}`;
}

console.log(mensaje("Juan", "Ingeniero"));
```

## Ejemplo (mejorado)

Versión recomendada evitando `any` y usando un tipo objeto para mayor claridad:

```ts
type Persona = { nombre: string; rol: string };

function mensajePersona(p: Persona): string {
	return `Hola ${p.nombre}, eres ${p.rol}`;
}

console.log(mensajePersona({ nombre: 'Juan', rol: 'Ingeniero' }));
```

Ventajas: firma más clara, fácil de extender y comprobar tipos en compilación.

## Cómo ejecutar

```bash
# Ejecutar con ts-node
npx ts-node TypeScript/Bases/Funciones/funcion.ts

# Compilar y ejecutar
npx tsc
node TypeScript/Bases/Funciones/funcion.js
```

## Buenas prácticas rápidas
- Evitar `any` salvo en prototipos rápidos; usa uniones o tipos/`interface`.
- Declarar tipos de retorno explícitos cuando la función forma parte de una API.
- Preferir funciones pequeñas y puras; mover lógica compleja a helpers.

## Ejercicios sugeridos
- Reescribir `mensaje` para aceptar un objeto `Persona` (ver ejemplo mejorado).
- Implementar `factorial` iterativo y recursivo con anotaciones de tipo.
- Crear una función `map` personalizada que reciba un arreglo y un callback.

