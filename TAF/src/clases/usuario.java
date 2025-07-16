
package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class usuario {
    
    public static void insertar(Connection cx, String nombre, String contraseña)throws Exception {
        PreparedStatement stm=cx.prepareStatement("INSERT INTO usuario (nombre_usuario, contraseña_usuario, borrado) values (?,?, 0)");
        stm.setString(1,nombre);
        stm.setString(2, contraseña);
        try{
            stm.executeUpdate();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
    
    public static ResultSet verUsuario(Connection cx, String nombre)throws Exception{
        ResultSet rs=null;
        PreparedStatement stm=cx.prepareStatement("SELECT codigo, nombre_usuario, contraseña_usuario from usuario where nombre_usuario= ? and borrado=0");
        stm.setString(1, nombre);
        try{
            rs=stm.executeQuery();
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return rs;
            
        
    } 
    
     public static ResultSet verTodosUsuarios(Connection cx)throws Exception{
        ResultSet rs=null;
        PreparedStatement stm=cx.prepareStatement("SELECT nombre_usuario from usuario where borrado=0");
        
        try{
            rs=stm.executeQuery();
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return rs;
            
        
    }
     
     public static void update(Connection cx, String nombre, String contraseña, int codigo)throws Exception{
         PreparedStatement stm=cx.prepareStatement("UPDATE usuario set nombre_usuario=?, contraseña_usuario=? where codigo= ?");
         stm.setString(1, nombre);
         stm.setString(2, contraseña);
         stm.setInt(3, codigo);
         try{
             stm.executeUpdate();
         }catch(SQLException e){
             JOptionPane.showMessageDialog(null,e.getMessage());
         }
         
     }
     
     public static void eliminar(Connection cx, int codigo)throws Exception{
         PreparedStatement stm=cx.prepareStatement("UPDATE usuario set borrado= 1 where codigo = ?");
         stm.setInt(1, codigo);
         try{
             stm.executeUpdate();
         }catch(SQLException e){
             JOptionPane.showMessageDialog(null,e.getMessage());
         }
     }
    
}
