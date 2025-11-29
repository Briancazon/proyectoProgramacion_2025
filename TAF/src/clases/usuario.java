
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
    
    //metodo que retorna aquel registro que tenga el nombre de usuario tanto y este activo...sirve para validar al registrar, si alguien se pone de usuario brian10, y brian10 es un usuario activo, no le permitirá, en caso de que este inactivo sí se lo permitirá
      public static int consultarSiExisteUsuario(Connection cx, String nombre)throws Exception{
        ResultSet rs=null;
        int existe=0;
        PreparedStatement stm=cx.prepareStatement("SELECT * from usuario where nombre_usuario= ? and borrado=0 ");
        stm.setString(1, nombre);
        
        rs=stm.executeQuery();
        while(rs.next()){
            existe=1;
        }
      
        return existe;
            
    }
      
      //metodo que retornará aquel regisro que sea igual a un usuario y contraseña, en caso de que coincida retornará 1, si no existe retornara 0
      public static int consultarSiCoincideUsuarioYContraseña(Connection cx, String nombre, String contraseña)throws Exception{
        ResultSet rs=null;
        int existe=0;
        PreparedStatement stm=cx.prepareStatement("SELECT * from usuario where nombre_usuario= ? and contraseña_usuario=? and borrado=0 ");
        stm.setString(1, nombre);
        stm.setString(2, contraseña);
        
        rs=stm.executeQuery();
        while(rs.next()){
            existe=1;
        }
      
        return existe;
            
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
    
 
     
     public static void update(Connection cx, String nombre, String contraseña, int codigo)throws Exception{
         PreparedStatement stm=cx.prepareStatement("UPDATE usuario set nombre_usuario=?, contraseña_usuario=? where codigo= ?");
         stm.setString(1, nombre);
         stm.setString(2, contraseña);
         stm.setInt(3, codigo);
     
             stm.executeUpdate();
       
         
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
     
      
    public static int obtenerCodigo(Connection cx, String nombre)throws Exception{
        ResultSet rs=null;
        int codigo=0;
        PreparedStatement stm=cx.prepareStatement("SELECT codigo from usuario where nombre_usuario=? and borrado=0");
        stm.setString(1, nombre);
        rs=stm.executeQuery();
        if(rs.next()){
            codigo=rs.getInt("codigo");
        }

       
        return codigo;
            
        
    } 
    
    
}
