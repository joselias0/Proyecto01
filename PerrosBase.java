
package proyecto01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class PerrosBase implements interface_perros<Perros>, Interface_operadores<Perros>{
    private ResultSet rs;
    private PreparedStatement ps;
    private Connection cx;
    private static final String SQL_READALL = "SELECT * FROM perros";
    private static final String SQL_CREATE = "INSERT INTO perros (nombre,raza,color,descripcionFisica) VALUES (?,?,?,?)";
    private static final String SQL_READ = "SELECT * FROM perros WHERE ID = ?";
    private static final String SQL_DELETE = "DELETE FROM perros WHERE ID = ?";

    //Metodo para crear nuevos datos de la clase Perros en la base de datos.
    @Override
    public int create(Perros t) {
        int x=0;
        try{
            cx=cnx.getConexion();
            ps=cx.prepareStatement(SQL_CREATE);
            ps.setString(1, t.getNombre());
            ps.setString(2, t.getRaza());
            ps.setString(3, t.getColor());
            ps.setString(4, t.getDescripcionFisica());
            x=ps.executeUpdate();
        }catch(Exception e){
            System.out.println("Error: " +e);
        }
        return x;
        
    }

    //Metodo creado para actualizar los datos de la clase Perros en la base de datos.
    @Override
    public int update(int id, String nombre, String raza, String color,String dFisica) {
        int x=0;
        String SQL_UPDATE = "UPDATE perros SET nombre ='"+nombre+"',raza ='"+raza+"',color ='"+color+"',descripcionFisica ='"+dFisica+"' Where ID="+id;
        try{
            cx=cnx.getConexion();
            ps=cx.prepareStatement(SQL_UPDATE);
            x=ps.executeUpdate();
        }catch(Exception e){
            System.out.println("Error: " +e);
        }
        return x;
    }

    //Metodo creado para eliminar los datos de la clase Perros en la base de datos.
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

    //Metodo creado para buscar un ID en especifico en los datos de la clase Perros en la base de datos.
    @Override
    public List<Perros> read(int key) {
         Perros base = new Perros();
       List<Perros> lista=new ArrayList<>();
       try{
           cx = cnx.getConexion();
           ps = cx.prepareStatement(SQL_READ);
           ps.setInt(1, key);
           rs = ps.executeQuery();
           while(rs.next()){
               base.setID(rs.getInt(1));
               base.setNombre(rs.getString(2));
               base.setRaza(rs.getString(3));
               base.setColor(rs.getString(4));
               base.setDescripcionFisica(rs.getString(5));
               lista.add(base);
               
           }
           }catch(Exception e){
                   System.out.println("Error: " +e);
           }
           return lista;
    }

    //Metodo creado para leer todos los datos de la clase Perros en la base de datos.
    @Override
    public List<Perros> readAll() {
               List<Perros> lista=new ArrayList<>();
        try{
            cx=cnx.getConexion();
            ps=cx.prepareStatement(SQL_READALL);
            rs = ps.executeQuery();
            while(rs.next()){
                Perros base = new Perros();
                base.setID(rs.getInt(1));
                base.setNombre(rs.getString(2));
                base.setRaza(rs.getString(3));
                base.setColor(rs.getString(4));
                base.setDescripcionFisica(rs.getString(5));
                lista.add(base);
            } 
        }catch  (SQLException e){
            System.out.println("Error: " +e);
        }
        return lista;
    }






    
 
    
}
