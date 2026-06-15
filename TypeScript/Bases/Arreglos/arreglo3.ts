//tuplas
let tupla:[number, string, boolean];
tupla = [1, "Petroski", false]
tupla.push("Otro valor");
console.log(tupla)

//tuplas de solo lectura
let tuplaLectura: readonly [number, string, boolean] = [2, "UribeParacoHp", true]; //No se puede modificar la tupla
console.log(tuplaLectura)