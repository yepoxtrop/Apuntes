# Clases en TypeScript

Guía de apuntes basada en los ejemplos de la carpeta `TypeScript/Bases/Clases`.

## Archivos incluidos

- `clase.ts` — clase básica `Persona` con constructor y atributos.
- `clase2.ts` — herencia: `Estudiante` extiende `Persona`.
- `clase3.ts` — definición de una interfaz `PlantillaObjPersona`.
- `clase4.ts` — clase que implementa la interfaz.

## Qué aprenderás

- Cómo declarar una clase y sus atributos.
- Cómo usar el constructor y asignar `this`.
- Cómo heredar de otra clase con `extends` y `super`.
- Qué es una interfaz y cómo definir propiedades obligatorias/opcionales.
- Cómo hacer que una clase implemente una interfaz con `implements`.

## Resumen de ejemplos

### `clase.ts`

Ejemplo básico de clase:

```ts
class Persona {
  nombre;
  apellido;

  constructor(nombre: String, apellido: String) {
    this.nombre = nombre;
    this.apellido = apellido;
  }
}

let persona1 = new Persona('Neo', 'Mendez');
console.log(persona1);
```

Notas:

- El constructor recibe los datos y los asigna a `this`.
- En TypeScript es mejor usar `string` en minúscula para tipos primitivos.

### `clase2.ts`

Herencia básica:

```ts
class Persona {
  nombre;
  edad;
  genero;

  constructor(nombre: String, edad: number, genero: String) {
    this.nombre = nombre;
    this.edad = edad;
    this.genero = genero;
  }
}

class Estudiante extends Persona {
  colegio;

  constructor(nombre: String, edad: number, genero: String, colegio: String) {
    super(nombre, edad, genero);
    this.colegio = colegio;
  }
}

console.log(new Estudiante('Juan', 21, 'M', 'Restrepo Millan'));
```

Notas:

- `extends` crea una subclase.
- `super(...)` llama al constructor de la clase padre.

### `clase3.ts`

Definición de interfaz:

```ts
interface PlantillaObjPersona {
  Nombre: string;
  Apellido: string;
  Edad: number;
  Ciudad?: string; // propiedad opcional
}

const persona1: PlantillaObjPersona = {
  Nombre: 'Pepe',
  Apellido: 'Lopez',
  Edad: 12,
};

console.log(persona1);
```

Notas:

- `interface` define la forma de un objeto.
- `Ciudad?` indica que la propiedad es opcional.

### `clase4.ts`

Clase que implementa una interfaz:

```ts
interface PlantillaObjPersona {
  Nombre: string;
  Apellido: string;
  Edad: number;
  Ciudad?: string;
}

class Persona implements PlantillaObjPersona {
  Nombre: string;
  Apellido: string;
  Edad: number;
  Ciudad?: string | undefined;
  Educacion: string;

  constructor(nombre: string, apellido: string, edad: number, educacion: string, ciudad?: string) {
    this.Nombre = nombre;
    this.Apellido = apellido;
    this.Edad = edad;
    this.Educacion = educacion;
    this.Ciudad = ciudad;
  }
}

console.log(new Persona('Luis', 'Raimundo', 19, 'Universidad'));
```

Notas:

- `implements` obliga a la clase a tener las propiedades de la interfaz.
- Se pueden agregar propiedades adicionales, como `Educacion`.

## Cómo ejecutar

Para ejecutar un archivo específico:

```bash
npx ts-node TypeScript/Bases/Clases/clase.ts
npx ts-node TypeScript/Bases/Clases/clase2.ts
npx ts-node TypeScript/Bases/Clases/clase3.ts
npx ts-node TypeScript/Bases/Clases/clase4.ts
```

O compilar y ejecutar con Node.js:

```bash
npx tsc
node TypeScript/Bases/Clases/clase.js
node TypeScript/Bases/Clases/clase2.js
node TypeScript/Bases/Clases/clase3.js
node TypeScript/Bases/Clases/clase4.js
```