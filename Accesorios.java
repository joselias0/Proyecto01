package proyecto01;

//
//Programa       : Proyecto01.java
//Programador    : Daniel Alejandro Barrera Quezada
//Descripción    : Proyecto POO
//Fecha Creación : 26 de marzo de 2022
//Revisión       : Ninguna
//

//Clase hija que hereda de la clase padre Productos
public class Accesorios extends Productos 
{   //variable unica para la sub clase Accesorio
    private int id;
    private String nombre;
    private float precio;
    private int cantidad;
    private String tipo;
    private String tAccesorio;

     //insertar datos excluyendo el ID
    public Accesorios(int id, String nombre, float precio, int cantidad, String tipo, String tAccesorio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.tipo = tipo;
        this.tAccesorio = tAccesorio;
    }

     //insertar datos 
    public Accesorios(String nombre, float precio, int cantidad, String tipo, String tAccesorio) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.tipo = tipo;
        this.tAccesorio = tAccesorio;
    }
    
    //Metodo constructor sin parametros
    public Accesorios(){
       
    }
    
    //Mostrar el ID
    public int getId() {
        return id;
    }

    //Modificar el ID
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
    
    //Mostrar el tipo de accesorio
    public String gettAccesorio() {
        return tAccesorio;
    }

    //Modificar el tipo de accesorio
    public void settAccesorio(String tAccesorio) {
        this.tAccesorio = tAccesorio;
    }
    
}
