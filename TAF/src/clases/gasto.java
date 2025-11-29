
package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class gasto {
    
    public static void cargarGasto(Connection cx, String nombre)throws Exception {
        PreparedStatement stm=cx.prepareStatement("insert into gastos (nombre_gasto, borrado) values ( ? ,0)");
        stm.setString (1, nombre);

            stm.executeUpdate();
      
                
    }
    
    public static ResultSet verGasto(Connection cx, String nombre)throws Exception{
        ResultSet rs=null;
        PreparedStatement stm=cx.prepareStatement("SELECT id_gasto, nombre_gasto from gastos where nombre_gasto like ? and borrado=0");
        stm.setString(1, "%"+nombre+"%");
       
            rs=stm.executeQuery();
      
        return rs;
    }
    
     public static ResultSet verTodosGastos(Connection cx)throws Exception{
        ResultSet rs=null;
        PreparedStatement stm=cx.prepareStatement("SELECT nombre_gasto from gastos where borrado=0");
       
   
            rs=stm.executeQuery();

       
        return rs;
    }
   
     
     
    public static void updateGasto(Connection cx, String nombre, int id_gasto)throws Exception{
        PreparedStatement stm=cx.prepareStatement("UPDATE gastos set nombre_gasto= ? where id_gasto = ?");
        stm.setString(1, nombre);
        stm.setInt(2, id_gasto);

            stm.executeUpdate();
     
    }
    
    public static void eliminarGasto(Connection cx, int id_gasto)throws Exception{
        PreparedStatement stm=cx.prepareStatement("UPDATE gastos set borrado= 1 where id_gasto =?");
        stm.setInt(1, id_gasto);
  
            stm.executeUpdate();
      
    }
    
    public static int obtenerId(Connection cx, String gasto)throws Exception {
        int id=0;
        ResultSet rs=null;
        PreparedStatement stm=cx.prepareStatement("SELECT id_gasto from gastos where nombre_gasto=?");
        stm.setString(1, gasto);
     
            rs=stm.executeQuery();
            while(rs.next()){
                id=rs.getInt("id_gasto");
            }
      
        return id;
    }
    

}
