# Ejercicio Herencia

Este ejercicio practica el uso de **Herencia en JavaScript** usando clases, constructores, metodos, getters, setters, propiedades estaticas y modulos ES.

## Objetivo

Crear una clase base llamada `Persona` y reutilizar sus atributos y metodos en clases hijas como `Cliente` y `Empleado`.

Con este ejercicio se busca entender como una clase puede heredar comportamiento de otra mediante `extends` y como se puede inicializar la clase padre usando `super()`.

## Estructura del ejercicio

```text
EjercicioHerencia/
├── app.js
├── persona.js
├── cliente.js
├── empleado.js
└── README.MD
```

## Archivos

### `persona.js`

Define la clase principal `Persona`.

Esta clase contiene:

- Una propiedad estatica `contadorPersona`, usada para generar un identificador.
- Un constructor que recibe `nombre`, `apellido` y `edad`.
- Getters y setters para acceder y modificar los datos.
- Un metodo `toString()` que devuelve la informacion de la persona.

Ejemplo:

```javascript
let persona = new Persona("Juan", "Toledo", 22);
console.log(persona.toString());
```

### `cliente.js`

Define la clase `Cliente`, que hereda de `Persona`.

Esta clase:

- Usa `extends Persona` para heredar propiedades y metodos.
- Llama al constructor de la clase padre con `super(nombre, apellido, edad)`.
- Agrega el atributo `_idCliente`.
- Agrega una fecha de registro con `new Date()`.
- Sobrescribe el metodo `toString()` para mostrar tambien la fecha de registro.

Ejemplo:

```javascript
let cliente = new Cliente("Anyie", "Aguirre", 32);
console.log(cliente.toString());
```

### `empleado.js`

Define la clase `Empleado`, que tambien hereda de `Persona`.

Esta clase:

- Usa `extends Persona`.
- Recibe un atributo adicional llamado `sueldo`.
- Agrega el atributo `_idEmpleado`.
- Sobrescribe el metodo `toString()` para incluir el sueldo.

Ejemplo:

```javascript
let empleado = new Empleado("Angel", "Diax", 19, "1SMLV");
console.log(empleado.toString());
```

### `app.js`

Es el archivo principal del ejercicio.

Aqui se importan las clases y se crean objetos a partir de ellas:

```javascript
import { Persona } from "./persona.js";
import { Cliente } from "./cliente.js";
import { Empleado } from "./empleado.js";
```

Luego se crean instancias de `Persona`, `Cliente` y `Empleado`, y se imprime su informacion en consola.

## Conceptos practicados

- Clases en JavaScript.
- Constructor.
- Herencia con `extends`.
- Uso de `super()`.
- Encapsulamiento mediante getters y setters.
- Propiedades estaticas.
- Sobrescritura de metodos.
- Modulos ES con `import` y `export`.

## Como ejecutar el ejercicio

Para ejecutar este ejercicio con Node.js, el proyecto debe permitir el uso de modulos ES.

Una forma sencilla es tener un archivo `package.json` con:

```json
{
  "type": "module"
}
```

Luego se puede ejecutar:

```bash
node app.js
```

Desde la carpeta del ejercicio:

```bash
cd JavaScript/EjerciciosPracticos/EjercicioHerencia
node app.js
```

## Resultado esperado

Al ejecutar `app.js`, se imprimen en consola los datos de:

- Una persona.
- Un cliente.
- Un empleado.

Cada objeto muestra la informacion heredada de `Persona` y, en el caso de `Cliente` y `Empleado`, tambien sus propios atributos adicionales.

## Resumen

La herencia permite reutilizar codigo de una clase padre en clases hijas. En este ejercicio, `Cliente` y `Empleado` heredan de `Persona`, lo que evita repetir atributos como `nombre`, `apellido` y `edad`.