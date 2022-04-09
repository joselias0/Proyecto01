package proyecto01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VoluntariosBase implements Interface_voluntarios <Voluntarios>, Interface_operadores<Voluntarios>{
    private ResultSet rs;
    private PreparedStatement ps;
    private Connection cx;
    private static final String SQL_READALL = "SELECT * FROM voluntarios";
    private static final String SQL_CREATE = "INSERT INTO voluntarios (nombres, apellidos,edad,nTelefono) VALUES (?,?,?,?)";
    private static final String SQL_READ = "SELECT * FROM voluntarios WHERE ID = ?";
    private static final String SQL_DELETE = "DELETE FROM voluntarios WHERE ID = ?";

    //Metodo para crear nuevos datos de la clase Voluntarios en la base de datos.
    @Override
    public int create(Voluntarios t) {
        int x=0;
        try{
            cx=cnx.getConexion();
            ps=cx.prepareStatement(SQL_CREATE);
            ps.setString(1, t.getNombres());
            ps.setString(2, t.getApellidos());
            ps.setInt(3, t.getEdad());
            ps.setString(4, t.getNumeroDeTelefono());
            x=ps.executeUpdate();
        }catch(Exception e){
            System.out.println("Error: " +e);
        }
        return x;
    }

    //Metodo creado para actualizar los datos de la clase Voluntarios en la base de datos.
    @Override
    public int update(int id, String nombres, String apellidos, int edad, String nTelefono) {
       
        int x=0;
        String SQL_UPDATE = "UPDATE voluntarios SET nombres ='"+nombres+"',apellidos ='"+apellidos+"',edad ='"+edad+"',nTelefono ='"+nTelefono+"' Where ID="+id;
        try{
            cx=cnx.getConexion();
            ps=cx.prepareStatement(SQL_UPDATE);
            x=ps.executeUpdate();
        }catch(Exception e){
            System.out.println("Error: " +e);
        }
        return x;
    }

    //Metodo creado para eliminar los datos de la clase Voluntarios en la base de datos.
    @Override
    public int delete(int key) {
         int x=0;
        try{
           cx=cnx.getConexion();
           ps=cx.prepareStatement(SQL_DELETE);
           ps.setInt(1,key);
           x=ps.executeUpdate();
        } catch (Exception e){
            System.out.println("Error: "+e);
        }
        return x;
    }

    //Metodo creado para buscar un ID en especifico en los datos de la clase Voluntarios en la base de datos.
    @Override
    public List<Voluntarios> read(int key) {
        
        Voluntarios bases = new Voluntarios();
       List<Voluntarios> lista=new ArrayList<>();
       try{
           cx = cnx.getConexion();
           ps = cx.prepareStatement(SQL_READ);
           ps.setInt(1, key);
           rs = ps.executeQuery();
           while(rs.next()){
               bases.setID(rs.getInt(1));
               bases.setNombres(rs.getString(2));
               bases.setApellidos(rs.getString(3));
               bases.setEdad(rs.getInt(4));
               bases.setNumeroDeTelefono(rs.getString(5));
               lista.add(bases);
               
           }
           }catch(Exception e){
                   System.out.println("Error: " +e);
           }
           return lista;
        
    }

    //Metodo creado para leer todos los datos de la clase Voluntarios en la base de datos.
    @Override
    public List<Voluntarios> readAll() {
        
        List<Voluntarios> lista=new ArrayList<>();
        try{
            cx=cnx.getConexion();
            ps=cx.prepareStatement(SQL_READALL);
            rs = ps.executeQuery();
            while(rs.next()){
                Voluntarios base = new Voluntarios();
               base.setID(rs.getInt(1));
               base.setNombres(rs.getString(2));
               base.setApellidos(rs.getString(3));
               base.setEdad(rs.getInt(4));
               base.setNumeroDeTelefono(rs.getString(5));
               
                lista.add(base);
            } 
        }catch  (SQLException e){
            System.out.println("Error: " +e);
        }
     return lista; 
        
    }
}
