//Alias -> Nombre alterno para tipos basicos
type Usuario = {
  nombre: string;
  edad: number;
  activo: boolean;
};

const user: Usuario = {
  nombre: "Ana",
  edad: 28,
  activo: true
};

console.log(user);