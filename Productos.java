package proyecto01;
//
//Programa       : Proyecto01.java
//Programador    : Daniel Barrera Quezada
//Descripción    : Proyecto POO
//Fecha Creación : 9 de febrero de 2022
//Revisión       : Ninguna
//


// Implements Comparador le asigna metodos a Productos
public final class Productos implements Comparador {
  
    private String nombre;
    private double precio;
    //private String id;
    private int cantidad;
    
    //insertar datos de productos
    public Productos(){
        this.setNombre("Shampoo para perro adulto");
        this.setPrecio(2.99);
        this.setCantidad(100);
    }
    //modificar nombre de producto
    public void setNombre(String _nombre){
    this.nombre = _nombre;
    }
    //mostrar nombre producto
    public String getNombre(){
        return this.nombre;
    }
    //modificar precio del producto
    public void setPrecio(double _precio){
        this.precio = _precio;
    }
    //mostrar precio del producto
    public double getPrecio(){
        return this.precio;
    }
     //modificar cantidad de producto   
    public void setCantidad(int _cantidad){
        this.cantidad = _cantidad;
    }
    //mostrar cantidad de producto
    public int getCantidad(){
        return this.cantidad;
    }
    
    //METODOS DE AGREGAR, EDITAR Y ELIMINAR
    //metodos agregar, editar y eliminar que serviran en el momento del uso de la base de datos
    public void agregar(){
        
    }
    
    public void editar(){
        
    }
    
    
    public void vender(){
        
    }
    //metodo para saber la disponibilidad de un producto
    public boolean disp(){
        boolean disponible = true;
        
        if(this.getCantidad()<=0) disponible = false;
        
        return disponible;
    }

    
    //Metodos que permiten que el comparador pueda comparar precios en la clase productos
    public double comparacion(){
    return this.precio;
    }
    
    @Override
    public boolean igualQue(Object o) {
        Productos s = (Productos)o; 
        return this.comparacion()== s.comparacion();
    }
    

    @Override
    public boolean menorQue(Object o) {
        Productos s = (Productos)o; 
        return this.comparacion()< s.comparacion();
    }

    @Override
    public boolean menorIgual(Object o) {
        Productos s = (Productos)o; 
        return this.comparacion()<= s.comparacion();
    }

    @Override
    public boolean mayorQue(Object o) {
        Productos s = (Productos)o; 
        return this.comparacion()> s.comparacion();
    }

    @Override
    public boolean mayorIgual(Object o) {
        Productos s = (Productos)o; 
        return this.comparacion()>= s.comparacion();
    }
 }
