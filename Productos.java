package proyecto01;
//
//Programa       : Proyecto01.java
//Programador    : Daniel Barrera Quezada
//Descripción    : Proyecto POO
//Fecha Creación : 9 de junio de 2022
//Revisión       : Ninguna
//


// Implements Comparador le asigna metodos a Productos
public class Productos implements Comparador {
  
    private String nombre;
    private float precio;
    private int id;
    private int cantidad;
    private String tipo;
    private float higiene;
    private String Alimento;
    private String Accesorios;
    
    //insertar datos de productos
    public Productos(){
        
    }

    public Productos(int id, String nombre, float precio, int cantidad, String tipo, float higiene, String Alimento, String Accesorios) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.tipo = tipo;
        this.higiene = higiene;
        this.Alimento = Alimento;
        this.Accesorios = Accesorios;
    }

    public Productos(String nombre, float precio, int cantidad, String tipo, float higiene, String Alimento, String Accesorios) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.tipo = tipo;
        this.higiene = higiene;
        this.Alimento = Alimento;
        this.Accesorios = Accesorios;
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
    public void setPrecio(float _precio){
        this.precio = _precio;
    }
    //mostrar precio del producto
    public float getPrecio(){
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
    //modificar tipo de producto
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    //mostrar tipo de producto
     public String getTipo(){
        return this.tipo;
    }
     //mostrar id de producto
    public int getId() {
        return id;
    }
    //modificar id de producto
    public void setId(int id) {
        this.id = id;
    }
    //mostrar litros de producto
    public float getHigiene() {
        return higiene;
    }
    //modificar litros de producto
    public void setHigiene(float higiene) {
        this.higiene = higiene;
    }
    //mostrar caducidad de producto
    public String getAlimento() {
        return Alimento;
    }
    //modificar caducidad de producto
    public void setAlimento(String Alimento) {
        this.Alimento = Alimento;
    }
    //mostrar tipo de accesorio de producto
    public String getAccesorios() {
        return Accesorios;
    }
    //modificar tipo de accesorio de producto
    public void setAccesorios(String Accesorios) {
        this.Accesorios = Accesorios;
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
