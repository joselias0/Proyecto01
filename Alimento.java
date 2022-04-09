package proyecto01;

//
//Programa       : Proyecto01.java
//Programador    : Daniel Alejandro Barrera Quezada
//Descripción    : Proyecto POO
//Fecha Creación : 26 de marzo de 2022
//Revisión       : Ninguna
//

//Clase hija que hereda de la clase padre Productos
public class Alimento extends Productos 
{   //variable unica para la sub clase Higiene
    private int id;
    private String nombre;
    private float precio;
    private int cantidad;
    private String tipo;
    private String caducidad;

    //Metodo constructor sin parametros
    public Alimento() {
    }

     //insertar datos excluyendo el ID
    public Alimento(String nombre, float precio, int cantidad, String tipo, String caducidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.tipo = tipo;
        this.caducidad = caducidad;
    }

     //insertar datos 
    public Alimento(int id, String nombre,float precio,int cantidad, String tipo, String caducidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.id = id;
        this.cantidad = cantidad;
        this.tipo = tipo;
        this.caducidad = caducidad;
    }
    
    
    //Mostrar el nombre
    @Override
    public String getNombre() {
        return nombre;
    }

    //Modificar el nombre
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Mostrar el precio
    @Override
    public float getPrecio() {
        return precio;
    }

    //Modificar el precio
    @Override
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    //Mostrar el ID 
    @Override
    public int getId() {
        return id;
    }

    //Modificar ID
    @Override
    public void setId(int id) {
        this.id = id;
    }

    //Mostrar la cantidad
    @Override
    public int getCantidad() {
        return cantidad;
    }

    //Modificar la cantidad
    @Override
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    //Mostrar el tipo
    @Override
    public String getTipo() {
        return tipo;
    }

    //Modificar el tipo
    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //Mostrar la caducidad
    public String getCaducidad() {
        return caducidad;
    }

    //Modificar la caducidad
    public void setCaducidad(String caducidad) {
        this.caducidad = caducidad;
    }
    
    
    
}
