package proyecto01;

//
//Programa       : Proyecto01.java
//Programador    : José Elías Morales
//Descripción    : Proyecto POO
//Fecha Creación : 9 de junio de 2022
//Revisión       : Ninguna
//
public class Voluntarios {
    private int ID;
    private String nombres;
    private String apellidos;
    private int edad;
    private String numeroDeTelefono;
    
    //insertar datos de voluntarios

    public Voluntarios(int ID, String nombres, String apellidos, int edad, String numeroDeTelefono) {
        this.ID = ID;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.numeroDeTelefono = numeroDeTelefono;
    }

    public Voluntarios(String nombres, String apellidos, int edad, String numeroDeTelefono) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.numeroDeTelefono = numeroDeTelefono;
    }

    public Voluntarios() {
    }
    
    
    public int getID(){
        return ID;
    }

    //Modificar el nombre del voluntario
    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNombres(String Nombre) {
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
