
package proyecto01;

import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductoBase implements Interface_productos,Interface_operadores <Productos> {
    
    private ResultSet rs;
    private PreparedStatement ps;
    private Connection cx;
    private static final String SQL_READALL = "SELECT * FROM productos";
    private static final String SQL_CREATE = "INSERT INTO productos (nombre, precio, cantidad, tipo, litros, caducidad, tipoAccesorio) VALUES (?,?,?,?,?,?,?)";
    private static final String SQL_READ = "SELECT * FROM productos WHERE ID = ?";
    private static final String SQL_DELETE = "DELETE FROM productos WHERE ID = ?";
    private static final String SQL_DISP = "SELECT cantidad FROM productos WHERE ID=?";
    private static final String SQL_UPDTE="UPDATE productos set nombre=?, precio=?, cantidad=?, tipo=?,litros=?,caducidad=?,tipoAccesorio=? where ID=?";

   
    
    @Override
    public int create(Productos t) {
        int x=0;
        return x;
    }

    //Metodo creado para actualizar los datos de la clase Productos en la base de datos.
    @Override
    public int update(int id, String nombre, float precio, int cantidad, String tipo, float higiene, String Alimento, String Accesorios) {
        
        int x=0;
        String SQL_UPDATE = "UPDATE productos SET nombre ='"+nombre+"',precio ='"+precio+"',cantidad ='"+cantidad+"',tipo ='"+tipo+"',litros ='"+higiene+"',caducidad ='"+Alimento+"',tipoAccesorio ='"+Accesorios+"' Where ID="+id;
        try{
            cx=cnx.getConexion();
            ps=cx.prepareStatement(SQL_UPDATE);
            x=ps.executeUpdate();
        }catch(Exception e){
            System.out.println("Error: " +e);
        }
        return x;
    }

    //Metodo creado para eliminar los datos de la clase Productos en la base de datos.
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

    //Metodo creado para buscar un ID en especifico en los datos de la clase Productos en la base de datos.
    @Override
    public List<Productos> read(int key) {
        
       Productos bases = new Productos();
       List<Productos> lista=new ArrayList<>();
       try{
           cx = cnx.getConexion();
           ps = cx.prepareStatement(SQL_READ);
           ps.setInt(1, key);
           rs = ps.executeQuery();
           while(rs.next()){
               bases.setId(rs.getInt(1));
               bases.setNombre(rs.getString(2));
               bases.setPrecio(rs.getFloat(3));
               bases.setCantidad(rs.getInt(4));
               bases.setTipo(rs.getString(5));
               bases.setHigiene(rs.getFloat(6));
               bases.setAlimento(rs.getString(7));
               bases.setAccesorios(rs.getString(8));
               lista.add(bases);
               
           }
           }catch(Exception e){
                   System.out.println("Error: " +e);
           }
           return lista;
       }
        
    

    //Metodo creado para leer todos los datos de la clase Productos en la base de datos.
    @Override
    public List<Productos> readAll() {
        
        List<Productos> lista=new ArrayList<>();
        try{
            cx=cnx.getConexion();
            ps=cx.prepareStatement(SQL_READALL);
            rs = ps.executeQuery();
            while(rs.next()){
                Productos base = new Productos();
                base.setId(rs.getInt(1));
                base.setNombre(rs.getString(2));
                base.setPrecio(rs.getFloat(3));
                base.setCantidad(rs.getInt(4));
                base.setTipo(rs.getString(5));
                base.setHigiene(rs.getFloat(6));
                base.setAlimento(rs.getString(7));
                base.setAccesorios(rs.getString(8));
                lista.add(base);
            } 
        }catch  (SQLException e){
            System.out.println("Error: " +e);
        }
     return lista;  
    }

    
}
