package proyecto01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class HigieneBase implements oper_tpro <Higiene> {
    private ResultSet rs;
    private PreparedStatement ps;
    private Connection cx;
    private static final String SQL_CREATE = "INSERT INTO productos (nombre, precio, cantidad, tipo, litros, caducidad, tipoAccesorio) VALUES (?,?,?,?,?,null,null)";
    private static final String SQL_DISP = "SELECT cantidad FROM productos WHERE ID=?";

    //Metodo para crear nuevos datos de la subclase Higiene de la clase Productos en la base de datos.
    @Override
    public int createw(Higiene t) {
         int x=0;
        try{
            cx=cnx.getConexion();
            ps=cx.prepareStatement(SQL_CREATE);
            ps.setString(1, t.getNombre());
            ps.setFloat(2, t.getPrecio());
            ps.setInt(3, t.getCantidad());
            ps.setString(4, t.getTipo());
            ps.setFloat(5, t.getLitros());
            x=ps.executeUpdate();
        }catch(Exception e){
            System.out.println("Error: " +e);
        }
        return x;
    }

    //Metodo creado para verificar disponibilidad en la subclase Higiene en la base de datos. 
    @Override
    public int dispo(int key) {
        int x=0;
        try{
           cx=cnx.getConexion();
           ps=cx.prepareStatement(SQL_DISP);
           ps.setInt(1,key);
           rs=ps.executeQuery();
           rs.next();
            String d = rs.getString(1);    
           x=Integer.parseInt(d);

        } catch (Exception e){
            System.out.println("Error: "+e);
        }
        return x;
    }
    
}
