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
    private String caducidad;
    public Alimento(){
        super();
    }
    public Alimento(String nombre,int precio,int cantidad,String tipo){
        super();
    }
    
    //Metodo utilizado para saber la disponibilidad de productos Alimenticios

    
    public String getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(String caducidad) {
        this.caducidad = caducidad;
    }
    
    
    
}
