
package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class producto {
    public static void cargarProducto(Connection cx, String descripcion, String marca, float precio)throws Exception{
        PreparedStatement stm=cx.prepareStatement("INSERT INTO productos (descripcion, marca, precio, borrado) values (? ,?, ?, 0)");
        stm.setString(1, descripcion);
        stm.setString(2, marca);
        stm.setFloat(3, precio);
        try{
            stm.executeUpdate();
        }catch(SQLException e){
               JOptionPane.showMessageDialog(null,e.getMessage());  
        }
    }
    
    public static ResultSet verProducto(Connection cx, String descripcion)throws SQLException{
        ResultSet rs= null;
        PreparedStatement stm=cx.prepareStatement("SELECT codigo, descripcion, marca, precio from productos where descripcion like ? and borrado=0;");
        stm.setString (1, "%" + descripcion + "%");
        try{
           rs= stm.executeQuery();
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null,e.getMessage());  
        }
        return rs;
        
        
    }
    
     public static ResultSet verTodosProductos(Connection cx)throws Exception{
        ResultSet rs= null;
        PreparedStatement stm=cx.prepareStatement("SELECT descripcion, marca, precio from productos where borrado=0");
       
        try{
           rs= stm.executeQuery();
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null,e.getMessage());  
        }
        return rs;
        
        
    }
     
     public static void eliminarProducto(Connection cx, int codigo)throws Exception {
         PreparedStatement stm=cx.prepareStatement("UPDATE productos set borrado=1 where codigo = ?");
         stm.setInt(1, codigo);
         try{
             stm.executeUpdate();
         }catch(SQLException e){
               JOptionPane.showMessageDialog(null,e.getMessage());
         }
     }
     
     public static void updateProducto(Connection cx, String descripcion, String marca, float precio, int codigo)throws Exception{
         PreparedStatement stm= cx.prepareStatement("UPDATE productos set descripcion= ?, marca = ?, precio= ? where codigo = ?");
         stm.setString(1, descripcion);
         stm.setString(2, marca);
         stm.setFloat(3, precio);
         stm.setInt(4, codigo);
         try{
             stm.executeUpdate();
         }catch(SQLException e){
             JOptionPane.showMessageDialog(null,e.getMessage());
         }
     }
    
}
