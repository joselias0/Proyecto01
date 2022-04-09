package proyecto01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Clase creada para establecer conexión con la base de datos
public class cnx {
    
    private static final String URL  = "jdbc:mysql://localhost:3306/proyecto";
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASS = "";
    private static Connection   cx = null;
    public static Connection getConexion(){
        try{
            if(cx ==null){
                Class.forName(DRIVER);
                cx=DriverManager.getConnection(URL, USER , PASS);
            }
        } catch (ClassNotFoundException | SQLException e){
            System.out.println("Error: " + e);
        }
    return cx;
}
}
