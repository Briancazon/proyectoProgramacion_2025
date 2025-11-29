
package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class cliente {
    
    public static void insertarCliente(Connection cx, String apenom, String telefono, String direccion, int borrado)throws Exception {
        PreparedStatement stm=cx.prepareStatement("insert into clientes (apenom, telefono, direccion, borrado) values (?, ?, ?, ?);");
        stm.setString(1,apenom);
        stm.setString(2,telefono);
        stm.setString(3,direccion);
        stm.setInt(4,borrado);
        

            stm.executeUpdate();
            
      
    }
    
    
     public static ResultSet mostrarZonas(Connection cx )throws SQLException{
        ResultSet rs=null;
        PreparedStatement stm=cx.prepareStatement("SELECT nombre from zonas");
        try{
            rs=stm.executeQuery();
            
        }catch(SQLException ex){
              JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        return rs;
    }
     
     public static int obtenerIdZona(Connection cx, String zona)throws Exception{
         int id=0;
         ResultSet rs=null;
         PreparedStatement stm=cx.prepareStatement("SELECT id_zona from zonas where nombre = ?");
         stm.setString(1, zona);
         try{
             rs=stm.executeQuery();
             if (rs.next())
                 id=rs.getInt("id_zona");
            
         }catch(SQLException e){
              JOptionPane.showMessageDialog(null,e.getMessage());
         }
         return id;
     }
    
     
     
     public static ResultSet verCliente(Connection cx, String apenom)throws Exception{
         ResultSet rs=null;
         PreparedStatement stm=cx.prepareStatement("SELECT apenom,  telefono, direccion from clientes  where apenom like ? and borrado=0 ");
         stm.setString(1, "%"+apenom+"%");

             rs=stm.executeQuery();
       
         return rs;
     }
     
      public static ResultSet verTodosClientes (Connection cx)throws Exception{
         ResultSet rs=null;
         PreparedStatement stm=cx.prepareStatement("SELECT apenom , telefono, direccion from clientes where borrado=0");
      
        
             rs=stm.executeQuery();
        
         return rs;
     }
      
      
      public static int obtenerCodigoCliente(Connection cx, String apenom, String telefono)throws Exception{
          ResultSet rs=null;
          int codigo=0;
          PreparedStatement stm=cx.prepareStatement("SELECT codigo from clientes where apenom=? and telefono=? and borrado=0");
          stm.setString(1,apenom);
           stm.setString(2 ,telefono);
          
          

              rs=stm.executeQuery();
              if (rs.next())
                 codigo= rs.getInt("codigo");
              
         
          return codigo;
      }
      
      public static void updateCliente(Connection cx, String apenom, String telefono, String direccion, int codigo)throws Exception{
          PreparedStatement stm=cx.prepareStatement("UPDATE clientes set apenom=?, telefono=?, direccion=? where codigo=?");
          stm.setString(1, apenom);
          stm.setString(2, telefono);
          stm.setString(3, direccion);
          stm.setInt(4, codigo);
          
         
              stm.executeUpdate();
       
             
      }
      
      public static void eliminarCliente(Connection cx, String apenom, String telefono)throws Exception{
          PreparedStatement stm=cx.prepareStatement("UPDATE clientes set borrado=1 where apenom=? and telefono=?");
          stm.setString(1, apenom);
          stm.setString(2, telefono);
          
         
              stm.executeUpdate();
        
  
          
      }
}


