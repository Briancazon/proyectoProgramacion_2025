
package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class zona {
    
    public static void cargarZona(Connection cx, String nombre, int borrado) throws Exception{
        PreparedStatement stm=cx.prepareStatement("INSERT INTO zonas (nombre_zona,borrado) values (?,?)");
        stm.setString(1, nombre);
        stm.setInt(2, borrado);

            stm.executeUpdate();
      
            
    }
    
    
    public static ResultSet verZona(Connection cx, String nombre) throws Exception {
        ResultSet rs=null;
        PreparedStatement stm=cx.prepareStatement("SELECT id_zona, nombre_zona from zonas where nombre_zona like ? and borrado= 0");
        stm.setString(1, "%"+nombre+"%");
       
            rs=stm.executeQuery();
     
        return rs;
    }
    
    public static ResultSet verTodasZonas(Connection cx) throws Exception {
        ResultSet rs=null;
        PreparedStatement stm=cx.prepareStatement("SELECT nombre_zona from zonas where borrado= 0");
        
        
            rs=stm.executeQuery();
      
        return rs;
    }
    
   
    
    public static void updateZona(Connection cx, String nombre,int id_zona) throws Exception{
        PreparedStatement stm=cx.prepareStatement("UPDATE zonas set nombre_zona=? where id_zona =? ");
    stm.setString(1, nombre);
        stm.setInt(2, id_zona);
        

            stm.executeUpdate();
     
    } 
    
    public static void eliminarZona(Connection cx, int id_zona)throws Exception{
        PreparedStatement stm=cx.prepareStatement("UPDATE zonas set borrado=1 where id_zona = ?");
        stm.setInt(1,id_zona);

            stm.executeUpdate();
      
    }
    
    
    public static int obtenerId(Connection cx, String nombre)throws Exception{
        ResultSet rs=null;
        int id=0;
        
        PreparedStatement stm=cx.prepareStatement("SELECT id_zona from zonas where nombre_zona=? and borrado=0");
        stm.setString(1, nombre);
     
            rs=stm.executeQuery();
            if(rs.next()){
                  id =rs.getInt("id_zona");
            }
       
        return id;
    }
    
   
    
    
    
}
