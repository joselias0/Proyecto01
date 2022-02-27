/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto01;

//
//Programa       : Proyecto01.java
//Programador    : José Elías Morales
//Descripción    : Proyecto POO
//Fecha Creación : 9 de febrero de 2022
//Revisión       : Ninguna
//
public final class Voluntarios {
    //private int ID; Este sera colocado de forma automatica en la base de datos
    private String nombres;
    private String apellidos;
    private int edad;
    private String numeroDeTelefono;
    
    //insertar datos de voluntarios
    public Voluntarios(){
     this.setNombres("José Elías");
     this.setApellidos("Morales Contreras");
     this.setEdad(32);
     this.setNumeroDeTelefono("7145-4567");
    }
    
    //Modificar el nombre del voluntario
    public void setNombres(String Nombre){
    this.nombres=Nombre;
    }
    //Mostrar el nombre del voluntario
    public String getNombres(){
    return this.nombres;
    }
    //Modificar el apellido del voluntario
    public void setApellidos(String Apellidos){
    this.apellidos=Apellidos;
    }
    //Mostrar el apellido del voluntario
    public String getApellidos(){
    return this.apellidos;
    }
    //Modificar la edad del voluntario
    public void setEdad(int edad){
    this.edad=edad;
    }
    //Mostrar la edad del voluntario
    public int getEdad(){
    return this.edad;
    }
    //Modificar el numero de telefono del voluntario
    public void setNumeroDeTelefono(String numeroDeTelefono){
    this.numeroDeTelefono=numeroDeTelefono;
    }
    //Mostrar el numero de telefono de telefono del voluntario
    public String getNumeroDeTelefono(){
    return this.numeroDeTelefono;
    }
    //Eliminar informacion del voluntario de la base de datos
    public void EliminarDatosVoluntario(){
    
    }
    
}
