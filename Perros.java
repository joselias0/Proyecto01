/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto01;

//
//Programa       : Proyecto01.java
//Programador    : José Elías Morales
//Descripción    : Proyecto POO
//Fecha Creación : 9 de junio de 2022
//Revisión       : Ninguna
//
public class Perros {
    private int ID;
    private String nombre;
    private String raza;
    private String color;
    private String DescripcionFisica;
    
    //insertar datos de perros
    public Perros(int ID, String nombre, String raza, String color, String DescripcionFisica) {
        this.ID = ID;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.DescripcionFisica = DescripcionFisica;
    }
    
    //Insertar datos de perro excluyendo el ID
    public Perros(String nombre, String raza, String color, String DescripcionFisica) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.DescripcionFisica = DescripcionFisica;
    }

    //Metodo constructor sin parametros
    public Perros() {
    }
    
    
   
    //Mostrar el ID del perro
    public int getID() {
        return ID;
    }
    
    //Modificar el ID del perro
    public void setID(int ID) {
        this.ID = ID;
    }
   
    //Modificar el nombre del perro
    public void setNombre(String nombre){
     this.nombre=nombre;
    }
    
    //Mostrar el nombre del perro
    public String getNombre(){
    return this.nombre;
    }
    
    //Modificar la raza del perro
    public void setRaza(String raza){
     this.raza=raza;
    }
    //Mostrar la raza del perro
    public String getRaza(){
    return this.raza;
    }
    
    //Modificar el color del perro
    public void setColor(String color){
     this.color=color;
    }
    
    //Mostrar el color de perro
    public String getColor(){
    return this.color;
    }
    //Modificar descripcion fisica del perro
    public void setDescripcionFisica(String dFisica){
     this.DescripcionFisica=dFisica;
    }
    //Mostrar descripcion fisica del perro
    public String getDescripcionFisica(){
    return this.DescripcionFisica;
    }
    //Eliminar informacion del perro de la base de datos
    public void PerroAdoptado(){
     
    }
}
