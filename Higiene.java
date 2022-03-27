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
    private float litros;
    public Higiene(){
        super();
    }
    
    public Higiene(String nombre,int precio,int cantidad,String tipo){
        super();
    }
    
    //Metodo utilizado para saber la disponibilidad de productos de Higiene
    
    public float getLitros() {
        return litros;
    }

    public void setLitros(float litros) {
        this.litros = litros;
    }
    
    
    
}
