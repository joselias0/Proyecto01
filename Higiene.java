package proyecto01;

//
//Programa       : Proyecto01.java
//Programador    : José Elías Morales Contreras
//Descripción    : Proyecto POO
//Fecha Creación : 26 de marzo de 2022
//Revisión       : Ninguna
//

//Clase hija que hereda de la clase padre Productos
public class Higiene extends Productos 
{   //variable unica para la sub clase Higiene
    private int id;
    private String nombre;
    private float precio;
    private int cantidad;
    private String tipo;
    private float litros;
   
    
    //insertar datos 
    public Higiene(int id, String nombre, float precio, int cantidad, String tipo, float litros) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.tipo = tipo;
        this.litros = litros;
    }

    //insertar datos excluyendo el ID
    public Higiene(String nombre, float precio, int cantidad, String tipo, float litros) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.tipo = tipo;
        this.litros = litros;
    }

    //Metodo constructor sin parametros
    public Higiene() {
    }

    //Mostrar el ID 
    public int getId() {
        return id;
    }
    
    //Modificar ID
    public void setId(int id) {
        this.id = id;
    }

    //Mostrar el nombre
    public String getNombre() {
        return nombre;
    }

    //Modificar el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Mostrar el precio
    public float getPrecio() {
        return precio;
    }

    //Modificar el precio
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    //Mostrar la cantidad
    public int getCantidad() {
        return cantidad;
    }

    //Modificar la cantidad
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    //Mostrar el tipo
    public String getTipo() {
        return tipo;
    }

    //Modificar el tipo
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //Mostrar los litros
    public float getLitros() {
        return litros;
    }

    //Modificar los litros
    public void setLitros(float litros) {
        this.litros = litros;
    }

   
    
    
    

    
    
    
}
