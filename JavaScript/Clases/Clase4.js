// Crear clase
class Persona{
    constructor(nombre, apellido){
        this._nombre = nombre; // Encapsulamiento con #
        this._apellido = apellido;
    }
    get nombre(){ //metodo get
        return this._nombre;
    }
    set nombre(nombre){ //metodo set
        this._nombre = nombre;
    }
    get apellido(){
        return this._apellido;
    }
    set apellido(apellido){
        this._apellido = apellido;
    }
    nombreCompleto(){
        return this._nombre + ' ' + this._apellido;
    }
}

class Empleado extends Persona{ // herencia con extends
    constructor(nombre, apellido, departamento){
        super(nombre, apellido); // Envia los valores al metodo constrcutor de la clase padre
        this._departamento = departamento;
    }
    get departamento(){
        return this._departamento;
    }
    set departamento(departamento){
        this._departamento = departamento;
    }
    nombreCompleto(){// Sobreescritura
        return super.nombreCompleto() + ' ' + this._departamento;
    }
}

let persona = new Persona('Neo', 'Mendez');
let empleado = new Empleado('Neo', 'Mendez', 'IT'); 

// consultar atr de la clase hija
console.log(empleado.nombre);
console.log(empleado.apellido);
console.log(empleado.departamento);
console.log(empleado.nombreCompleto());
