
package proyecto01;

//
//Programa       : Proyecto01.java
//Programador    : José Elías Morales
//Descripción    : Proyecto POO
//Fecha Creación : 9 de febrero de 2022
//Revisión       : Ninguna
//
public final class Perros {
    //private int ID; este sera puesto de forma automatica en la base de datos
    private String nombre;
    private String raza;
    private String color;
    private String DescripcionFisica;
    
    //insertar datos de perros
    public Perros(){
     this.setNombre("Danger");
     this.setRaza("Chihuahua");
     this.setColor("Cafe");
     this.setDescripcionFisica("Es una animal que sufrio una quebradura de pie ya que fue atropellado y quedo con secuelas");
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
