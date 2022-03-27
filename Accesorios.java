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
    private String tAccesorio;
    public Accesorios(){
        super();
    }
    public Accesorios(String nombre,int precio,int cantidad,String tipo){
        super();
    }
    
    //Metodo utilizado para saber la disponibilidad de productos del tipo Accesorios

    public String gettAccesorio() {
        return tAccesorio;
    }

    public void settAccesorio(String tAccesorio) {
        this.tAccesorio = tAccesorio;
    }
    
}
