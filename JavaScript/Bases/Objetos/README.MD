# Objetos en JavaScript

Esta carpeta contiene ejercicios basicos para practicar la creacion, lectura, modificacion y reutilizacion de objetos en JavaScript.

## Como ejecutar los ejercicios

Desde esta carpeta puedes ejecutar cualquier archivo con Node.js:

```bash
node Objeto.js
node Objeto2.js
node Objeto3.js
...
node Objeto10.js
```

Tambien puedes abrir cada archivo en el editor y revisar la salida esperada en la consola.

## Resumen de ejercicios

| Archivo | Tema principal | Que practica |
| --- | --- | --- |
| `Objeto.js` | Objeto literal | Crear un objeto con propiedades y metodos, modificar una propiedad y acceder a sus valores. |
| `Objeto2.js` | `new Object()` | Crear un objeto usando la clase `Object`, agregar propiedades manualmente y acceder con punto o corchetes. |
| `Objeto3.js` | Recorrido con `for in` | Recorrer todas las propiedades de un objeto e imprimir su nombre y valor. |
| `Objeto4.js` | Agregar y eliminar propiedades | Agregar una propiedad nueva con asignacion directa y eliminarla con `delete`. |
| `Objeto5.js` | Getters y setters | Definir un metodo `get` para obtener el nombre completo y un metodo `set` para cambiar el nombre. |
| `Objeto6.js` | Funcion constructora | Crear objetos reutilizables usando una funcion constructora y la palabra reservada `new`. |
| `Objeto7.js` | Formas de crear objetos | Comparar tres formas de crear objetos: funcion constructora, `new Object()` y objeto literal. |
| `Objeto8.js` | `prototype` | Agregar una propiedad al prototipo de una funcion constructora para compartirla entre objetos. |
| `Objeto9.js` | Metodo `call` | Usar un metodo de un objeto con los datos de otro objeto y pasar argumentos individuales. |
| `Objeto10.js` | Metodo `apply` | Usar un metodo de un objeto con los datos de otro objeto y pasar argumentos como arreglo. |

## Conceptos clave

### Objeto literal

Un objeto literal se crea con llaves `{}` y permite agrupar propiedades y metodos:

```js
let persona = {
    nombre: "Neo",
    apellido: "Mendez",
    edad: 19,
    nombreCompleto: function() {
        return `${this.nombre} ${this.apellido}`;
    }
};
```

`this` hace referencia al objeto que esta ejecutando el metodo.

### Acceso a propiedades

Hay dos formas comunes de acceder a una propiedad:

```js
persona.nombre;
persona["apellido"];
```

La notacion con punto es la mas comun. La notacion con corchetes es util cuando el nombre de la propiedad esta guardado en una variable.

### Modificar, agregar y eliminar propiedades

Los objetos pueden cambiar despues de ser creados:

```js
persona.nombre = "Javier";
persona.telefono = "+57 xxx-xxx-xx-xx";
delete persona.telefono;
```

### Recorrer un objeto

Con `for in` se pueden recorrer las propiedades enumerables de un objeto:

```js
for (propiedad in persona) {
    console.log(propiedad);
    console.log(persona[propiedad]);
}
```

Se usa `persona[propiedad]` porque `propiedad` contiene el nombre dinamico de cada clave.

### Getters y setters

Los metodos `get` y `set` permiten leer o modificar datos usando sintaxis de propiedad:

```js
get nombreCompleto() {
    return `${this.nombre} ${this.apellido}`;
}

set nuevoNombre(nuevoNombre) {
    this.nombre = nuevoNombre;
}
```

Uso:

```js
console.log(persona.nombreCompleto);
persona.nuevoNombre = "Michael";
```

### Funcion constructora

Una funcion constructora sirve como molde para crear varios objetos con la misma estructura:

```js
function Persona(nombre, apellido, email, edad) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.edad = edad;
}

let persona = new Persona("neo", "mendez", "neo@example.com", 15);
```

Por convencion, las funciones constructoras empiezan con mayuscula.

### Prototype

`prototype` permite agregar propiedades o metodos compartidos por los objetos creados con una funcion constructora:

```js
Persona.prototype.telefono = "+57 XXX-XXX-XX-XX";
```

Si un objeto no tiene esa propiedad directamente, JavaScript la busca en su prototipo.

### `call` y `apply`

`call` y `apply` permiten ejecutar un metodo indicando manualmente que objeto sera `this`.

Con `call`, los argumentos se pasan uno por uno:

```js
persona.profesion.call(persona2, "Ingeniero de sistemas");
```

Con `apply`, los argumentos se pasan dentro de un arreglo:

```js
persona.profesion.apply(persona2, ["Ingeniero de sistemas"]);
```

## Orden recomendado de estudio

1. `Objeto.js`
2. `Objeto2.js`
3. `Objeto3.js`
4. `Objeto4.js`
5. `Objeto5.js`
6. `Objeto6.js`
7. `Objeto7.js`
8. `Objeto8.js`
9. `Objeto9.js`
10. `Objeto10.js`