
package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class preventista {
    
    public static void cargarPreventista(Connection cx, String nombre, String apellido, int dni, String telefono, int añoIngreso)throws Exception {
        PreparedStatement stm=cx.prepareStatement(" insert into preventista (nombre, apellido, dni, telefono, año_ingreso, borrado) values (?, ?, ?, ?, ?, 0) ");
        stm.setString(1, nombre);
        stm.setString(2, apellido);
        stm.setInt(3, dni);
        stm.setString(4, telefono);
        stm.setInt(5, añoIngreso);
        
        try{
            stm.executeUpdate();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
            
        }
    
    
    public static ResultSet verPreventista(Connection cx, int dni)throws Exception{
        ResultSet rs=null;
        PreparedStatement stm= cx.prepareStatement("select codigo, nombre, apellido, dni, telefono, año_ingreso from preventista where dni= ? and borrado=0");
        stm.setInt(1, dni);
        try{
            rs = stm.executeQuery();
        }catch(Exception e){
              JOptionPane.showMessageDialog(null,e.getMessage());   
            
        }
        return rs;
        
    }
    
    
    public static ResultSet listarPreventistas(Connection cx)throws Exception{
        ResultSet rs=null;
        PreparedStatement stm= cx.prepareStatement("select nombre, apellido, dni, telefono, año_ingreso from preventista where borrado=0");
        try{
            rs = stm.executeQuery();
        }catch(Exception e){
              JOptionPane.showMessageDialog(null,e.getMessage());   
            
        }
        return rs;
        
    }
    
    public static void updatePreventista(Connection cx, String nombre, String apellido, int dni, String telefono, int año_ingreso, int codigo)throws Exception{
        PreparedStatement stm= cx.prepareStatement("UPDATE preventista set nombre=?, apellido=?, dni=?, telefono=?, año_ingreso=? where codigo=?");
        stm.setString(1, nombre);
        stm.setString(2, apellido);
        stm.setInt(3, dni);
        stm.setString(4, telefono);
        stm.setInt(5, año_ingreso);
        stm.setInt(6, codigo);
        
        try{
            stm.executeUpdate();
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null,e.getMessage());  
            
        }
        
    }
    
    
    public static void eliminarPreventista(Connection cx, int dni)throws Exception {
        PreparedStatement stm=cx.prepareStatement("UPDATE preventista set borrado = 1 where dni =? ");
        stm.setInt(1, dni);
        try{
            stm.executeUpdate();
        }catch(SQLException e){
              JOptionPane.showMessageDialog(null,e.getMessage());  
        }
    }
    
    public static int obetnerId(Connection cx, String apellido)throws Exception{
        int id=0;
        ResultSet rs=null;
        PreparedStatement stm=cx.prepareStatement("SELECT codigo from preventista where apellido=?");
        stm.setString(1, apellido);
        try{
            rs=stm.executeQuery();
            while(rs.next()){
                id=rs.getInt("codigo");
            }
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null,e.getMessage());  
        }
        return id;
    }
    
      public static int obtenerID(Connection cx, String apellido, int dni)throws Exception{
        int id=0;
        ResultSet rs=null;
        PreparedStatement stm=cx.prepareStatement("SELECT codigo from preventista where apellido=? and dni=? and borrado=0");
        stm.setString(1, apellido);
        stm.setInt(2, dni);
        try{
            rs=stm.executeQuery();
            while(rs.next()){
                id=rs.getInt("codigo");
            }
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null,e.getMessage());  
        }
        return id;
    }
    
}
