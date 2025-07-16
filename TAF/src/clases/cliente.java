
package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class cliente {
    
    public static void insertarCliente(Connection cx, String nombre, String apellido, String telefono, String direccion, int borrado)throws Exception {
        PreparedStatement stm=cx.prepareStatement("insert into clientes (nombre, apellido, telefono, direccion, borrado) values (?, ?, ?, ?, ?);");
        stm.setString(1,nombre);
        stm.setString(2,apellido);
        stm.setString(3,telefono);
        stm.setString(4,direccion);
        stm.setInt(5,borrado);
        
        try{
            stm.executeUpdate();
            
        }catch(SQLException e){
              JOptionPane.showMessageDialog(null,e.getMessage());
        }
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
    
     
     
     public static ResultSet verCliente(Connection cx, String apellido)throws Exception{
         ResultSet rs=null;
         PreparedStatement stm=cx.prepareStatement("SELECT nombre, apellido, telefono, direccion from clientes  where apellido like ? and borrado=0 ");
         stm.setString(1, "%"+apellido+"%");
         try{
             rs=stm.executeQuery();
         }catch(SQLException e){
              JOptionPane.showMessageDialog(null,e.getMessage());
         }
         return rs;
     }
     
      public static ResultSet verTodosClientes (Connection cx)throws Exception{
         ResultSet rs=null;
         PreparedStatement stm=cx.prepareStatement("SELECT nombre, apellido, telefono, direccion from clientes where borrado=0");
      
         try{
             rs=stm.executeQuery();
         }catch(Exception e){
              JOptionPane.showMessageDialog(null, "Ha ocurrido buscar el cliente","ERROR",ERROR_MESSAGE);
         }
         return rs;
     }
      
      
      public static int obtenerCodigoCliente(Connection cx, String nombre, String apellido)throws Exception{
          ResultSet rs=null;
          int codigo=0;
          PreparedStatement stm=cx.prepareStatement("SELECT codigo from clientes where nombre=? and apellido=?");
          stm.setString(1,nombre);
          stm.setString(2,apellido);
          
          try{
              rs=stm.executeQuery();
              if (rs.next())
                 codigo= rs.getInt("codigo");
              
              
          }catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getMessage());
          }
          return codigo;
      }
      
      public static void updateCliente(Connection cx, String nombre, String apellido, String telefono, String direccion, int codigo)throws Exception{
          PreparedStatement stm=cx.prepareStatement("UPDATE clientes set nombre=?, apellido=?, telefono=?, direccion=? where codigo=?");
          stm.setString(1, nombre);
          stm.setString(2, apellido);
          stm.setString(3, telefono);
          stm.setString(4, direccion);
          stm.setInt(5, codigo);
          
          try{
              stm.executeUpdate();
          }catch(Exception  e){
               JOptionPane.showMessageDialog(null,e.getMessage());
          }
             
      }
      
      public static void eliminarCliente(Connection cx, String nombre, String apellido)throws Exception{
          PreparedStatement stm=cx.prepareStatement("UPDATE clientes set borrado=1 where nombre=? and apellido=?");
          stm.setString(1, nombre);
          stm.setString(2, apellido);
          
          try{
              stm.executeUpdate();
          }catch(Exception e){
               JOptionPane.showMessageDialog(null,e.getMessage());
          }
          
         
          
          
      }
}


