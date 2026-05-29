# Clases en JavaScript

Esta carpeta contiene ejercicios basicos para practicar clases en JavaScript: constructores, metodos, getters, setters, herencia, sobrescritura y miembros estaticos.

## Como ejecutar los ejercicios

Desde esta carpeta puedes ejecutar cualquier archivo con Node.js:

```bash
node Clase.js
node Clase2.js
node Clase3.js
...
node Clase7.js
```

Cada archivo imprime resultados en consola para comprobar el comportamiento de la clase.

## Resumen de ejercicios

| Archivo | Tema principal | Que practica |
| --- | --- | --- |
| `Clase.js` | Clase basica | Crear una clase con `class`, definir un `constructor` e instanciar un objeto con `new`. |
| `Clase2.js` | Getters y setters | Usar metodos `get` y `set` para leer y modificar propiedades de una instancia. |
| `Clase3.js` | Herencia | Crear una clase hija con `extends`, llamar al constructor padre con `super` y agregar propiedades propias. |
| `Clase4.js` | Sobrescritura de metodos | Redefinir un metodo en la clase hija y reutilizar el metodo padre con `super`. |
| `Clase5.js` | Herencia de `Object` y `toString` | Mostrar que las clases heredan de `Object` y sobrescribir el metodo `toString`. |
| `Clase6.js` | Metodos estaticos | Crear metodos `static` que pertenecen a la clase y no a las instancias. |
| `Clase7.js` | Atributos estaticos | Crear un contador estatico compartido por la clase para contar instancias. |

## Conceptos clave

### Crear una clase

Una clase es un molde para crear objetos con la misma estructura:

```js
class Persona {
    constructor(nombre, apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
}

let persona = new Persona("Neo", "Mendez");
```

`constructor` se ejecuta automaticamente cuando se crea una nueva instancia con `new`.

### Propiedades internas con guion bajo

En varios ejercicios se usan propiedades como `_nombre` y `_apellido`:

```js
this._nombre = nombre;
this._apellido = apellido;
```

El guion bajo `_` es una convencion para indicar que la propiedad deberia usarse internamente. No hace que la propiedad sea privada de verdad. Para propiedades privadas reales en JavaScript moderno se usa `#nombre`.

### Getters y setters

Los getters y setters permiten controlar como se lee o modifica una propiedad:

```js
get nombre() {
    return this._nombre;
}

set nombre(nombre) {
    this._nombre = nombre;
}
```

Uso:

```js
console.log(persona.nombre);
persona.nombre = "Javier";
```

Aunque parecen propiedades normales, internamente ejecutan metodos.

### Hoisting en clases

Las clases no se pueden usar antes de declararlas:

```js
let persona = new Persona("Neo", "Mendez"); // Error si Persona aun no existe

class Persona {
    constructor(nombre, apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
```

Por eso primero se declara la clase y despues se crean sus objetos.

### Herencia con `extends`

Una clase puede heredar propiedades y metodos de otra:

```js
class Empleado extends Persona {
    constructor(nombre, apellido, departamento) {
        super(nombre, apellido);
        this._departamento = departamento;
    }
}
```

`extends` indica la clase padre. `super()` llama al constructor de la clase padre y debe ejecutarse antes de usar `this` en la clase hija.

### Sobrescritura de metodos

Una clase hija puede redefinir un metodo heredado:

```js
nombreCompleto() {
    return super.nombreCompleto() + " " + this._departamento;
}
```

`super.nombreCompleto()` ejecuta la version del metodo que existe en la clase padre.

### Sobrescribir `toString`

Todas las clases heredan de `Object`, por eso pueden sobrescribir metodos como `toString`:

```js
toString() {
    return this.nombreCompleto();
}
```

Esto permite definir como se representa el objeto cuando se convierte a texto.

### Metodos estaticos

Los metodos estaticos pertenecen a la clase, no a los objetos creados con esa clase:

```js
class Persona {
    static saludar() {
        console.log("Hi, BRO");
    }
}

Persona.saludar();
```

No se llaman desde una instancia como `persona.saludar()`.

### Atributos estaticos

Un atributo estatico tambien pertenece a la clase:

```js
class Persona {
    static contadorPersonas = 0;

    constructor(nombre, apellido) {
        this._nombre = nombre;
        this._apellido = apellido;
        Persona.contadorPersonas += 1;
    }
}
```

En el ejercicio `Clase7.js`, `contadorPersonas` aumenta cada vez que se crea una nueva instancia de `Persona` o de una clase hija que llama a `super()`.

## Orden recomendado de estudio

1. `Clase.js`
2. `Clase2.js`
3. `Clase3.js`
4. `Clase4.js`
5. `Clase5.js`
6. `Clase6.js`
7. `Clase7.js`