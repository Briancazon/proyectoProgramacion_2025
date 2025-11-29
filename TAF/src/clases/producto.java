
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

            stm.executeUpdate();
      
    }
    
    public static ResultSet verProducto(Connection cx, String descripcion)throws SQLException{
        ResultSet rs= null;
        PreparedStatement stm=cx.prepareStatement("SELECT codigo, descripcion, marca, precio from productos where descripcion like ? and borrado=0;");
        stm.setString (1, "%" + descripcion + "%");

           rs= stm.executeQuery();
      
        return rs;
        
        
    }
    
     public static ResultSet verTodosProductos(Connection cx)throws Exception{
        ResultSet rs= null;
        PreparedStatement stm=cx.prepareStatement("SELECT codigo, descripcion, marca, precio from productos where borrado=0");
       
 
           rs= stm.executeQuery();
       
        return rs;
        
        
    }
     
     public static void eliminarProducto(Connection cx, int codigo)throws Exception {
         PreparedStatement stm=cx.prepareStatement("UPDATE productos set borrado=1 where codigo = ?");
         stm.setInt(1, codigo);

             stm.executeUpdate();
        
     }
     
     public static void updateProducto(Connection cx, String descripcion, String marca, float precio, int codigo)throws Exception{
         PreparedStatement stm= cx.prepareStatement("UPDATE productos set descripcion= ?, marca = ?, precio= ? where codigo = ?");
         stm.setString(1, descripcion);
         stm.setString(2, marca);
         stm.setFloat(3, precio);
         stm.setInt(4, codigo);
    
             stm.executeUpdate();
        
     }
     
     
     public static int obtenerCodigo(Connection cx, String descripcion)throws Exception {
         int codigo=0;
         ResultSet rs=null;
         PreparedStatement stm=cx.prepareStatement("SELECT codigo from productos where descripcion =?");
         stm.setString(1, descripcion);

             rs=stm.executeQuery();
             while(rs.next()){
                 codigo=rs.getInt("codigo");
             }
         
         return codigo;
     }
     
     public static float obtenerPrecioProducto(Connection cx, String descripcion)throws Exception {
         float precio=0;
         ResultSet rs=null;
         PreparedStatement stm=cx.prepareStatement("SELECT precio from productos where descripcion =?");
         stm.setString(1, descripcion);

             rs=stm.executeQuery();
             while (rs.next()){
                 precio=rs.getFloat("precio");
             }
         
         return precio;
     }
    
}
