# 📝 Variables en TypeScript

En esta sección aprenderás sobre las variables, que son contenedores para almacenar valores en TypeScript.

## ¿Qué es una Variable?

Una variable es un espacio en memoria que almacena un valor. En TypeScript, las variables deben tener un **tipo de dato** asociado, lo que hace el código más seguro y mantenible.

**Sintaxis básica:**
```typescript
var nombreVariable: tipoDato = valor;
```

---

## 🔢 Tipos de Variables

### 1. **Variables Numéricas** (number)

Se utilizan para almacenar números enteros y decimales.

```typescript
var numero: number = 1;
var numero2: number = 2;
var total: number = numero + numero2;
console.log(total); // Output: 3
```

**Características:**
- Soportan operaciones matemáticas básicas (+, -, *, /, %)
- Pueden ser positivos o negativos
- Incluyen decimales (puntos flotantes)

---

### 2. **Variables String** (cadenas de texto)

Se utilizan para almacenar texto.

```typescript
var cadena: String = "Me llamo yepoxtrop";
console.log(cadena); // Output: Me llamo yepoxtrop
```

**Características:**
- Se encierran entre comillas ("" o '')
- Soportan concatenación
- Pueden contener caracteres especiales

---

### 3. **Variables Booleanas** (boolean)

Se utilizan para almacenar valores verdadero (true) o falso (false).

```typescript
var estado: Boolean = false;
console.log(estado ? cadena : "No me llamo yepoxtrop");
// Output: No me llamo yepoxtrop
```

**Características:**
- Solo pueden tener dos valores: `true` o `false`
- Se utilizan en condicionales y bucles
- En el ejemplo se usa un operador ternario (condición ? valor_si_true : valor_si_false)

---

### 4. **Variables Undefined** (no definidas)

Tipo de dato para variables que no han sido inicializadas.

```typescript
var desconocido: undefined = undefined;
```

**Características:**
- Tiene un único valor: `undefined`
- No se puede cambiar su tipo de dato a futuro
- Se usa cuando no se conoce el valor inicial

---

### 5. **Variables Null** (nulas)

Tipo de dato que representa la ausencia intencional de un valor.

```typescript
var vacio: null = null;
```

**Características:**
- Tiene un único valor: `null`
- No se puede cambiar su tipo de dato a futuro
- Se usa para indicar que una variable está vacía intencionalmente

---

## 📌 Diferencia entre `var`, `let` y `const`

Aunque el ejemplo usa `var`, en TypeScript moderno se recomienda:

| Palabra clave | Scope | Reasignable | Redeclarable |
|---|---|---|---|
| `var` | Función | ✅ Sí | ✅ Sí |
| `let` | Bloque | ✅ Sí | ❌ No |
| `const` | Bloque | ❌ No | ❌ No |

**Ejemplo:**
```typescript
let edad: number = 25;
edad = 26; // ✅ Permitido

const nombre: string = "Juan";
nombre = "Pedro"; // ❌ Error: no se puede reasignar
```

---

## 🎯 Buenas Prácticas

1. **Siempre especifica el tipo de dato** para mayor seguridad
2. **Usa `let` en lugar de `var`** para evitar problemas de scope
3. **Usa `const` por defecto**, solo usa `let` si necesitas reasignar
4. **Nombres descriptivos**: `let userAge` en lugar de `let a`
5. **Sigue convenciones**: camelCase para variables (`myVariable`, `userName`)

---

## 📂 Archivos en esta sección

- **variable.ts** - Ejemplos de todos los tipos de variables básicas

