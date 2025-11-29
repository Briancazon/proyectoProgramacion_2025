
package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class rendicion {
    
    public static void insertarRendicion(Connection cx, int id_preventista, String fecha, int id_zona, float total_preventa, float total_venta, float total_fiado, float total_devolucion, float total_gastos, float diferencia, int cantidad_ventas, String observacion)throws Exception{
        PreparedStatement stm=cx.prepareStatement("insert into rendicion (id_preventista, fecha, id_zona, total_preventa, total_ventido, total_fiado, total_devoluciones, total_gastos, diferencia, cantidad_ventas, observacion) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        stm.setInt(1, id_preventista);
        stm.setString(2, fecha);
        stm.setInt(3, id_zona);
        stm.setFloat(4,total_preventa);
        stm.setFloat(5, total_venta);
        stm.setFloat(6, total_fiado);
        stm.setFloat(7, total_devolucion);
        stm.setFloat(8, total_gastos);
        stm.setFloat(9, diferencia);
        stm.setInt(10, cantidad_ventas);
        stm.setString(11, observacion);
        try{
            stm.executeUpdate();
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null,e.getMessage());
        }
    
    }
    
    public static boolean veficarDobleRendicion(Connection cx, String fecha, int id_preventista)throws Exception {
        ResultSet rs=null;
        boolean v=false;
        PreparedStatement stm=cx.prepareStatement("SELECT * from rendicion where fecha=? and id_preventista=?");
        stm.setString(1, fecha);
        stm.setInt(2, id_preventista );
        try{
            rs=stm.executeQuery();
            if(rs.next()){
                v=true;
            }
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null,e.getMessage());
        }
            return v;
    }
    
    
    
    
    
   public static void insertarFiado(Connection cx,  int id_cliente, float monto, int id_rendicion)throws Exception {
       PreparedStatement stm=cx.prepareStatement("INSERT INTO fiados (id_cliente, monto_fiado, id_rendicion, estado) values (?, ?,?, 'pendiente') ");
       stm.setInt(1, id_cliente);
       stm.setFloat(2, monto);
       stm.setInt(3, id_rendicion);
       try{
           stm.executeUpdate();
       }catch(SQLException e){
             JOptionPane.showMessageDialog(null,e.getMessage());
       }
   }
   
    public static void insertarTransferencia(Connection cx, String fecha, int id_cliente, float monto, int id_rendicion, String estado)throws Exception {
       PreparedStatement stm=cx.prepareStatement("INSERT INTO transferencias (fecha, id_cliente, monto, id_rendicion, estado) values (?, ?, ?, ?, ?)");
       stm.setString(1,fecha);    
       stm.setInt(2, id_cliente);
       stm.setFloat(3, monto);
       stm.setInt(4, id_rendicion);
       stm.setString(5, estado);
       try{
           stm.executeUpdate();
       }catch(SQLException e){
             JOptionPane.showMessageDialog(null,e.getMessage());
       }
   }
    
    
    public static int buscarIdRendicion(Connection cx, String fecha, int id_preventista)throws Exception {
        int id=0;
        ResultSet rs=null;
        PreparedStatement stm=cx.prepareStatement("SELECT id_rendicion from rendicion where fecha=? and id_preventista=?");
        stm.setString(1, fecha);
        stm.setInt(2, id_preventista);
        try{
            rs=stm.executeQuery();
            while(rs.next()){
                id=rs.getInt("id_rendicion");
            }
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return id;
    }
    
    
    //metodo para ver la rendicion de un preventista, de alguna fecha o de la fecha de un preventista....
    public static ResultSet verRendicion(Connection cx, String fecha, int id_preventista)throws Exception {
        ResultSet rs=null;
        
        // si la fecha esta vacia, entonces solo puso que quiere buscar todas la rendiciones de un preventista en particular...
        if(fecha==null){
                 PreparedStatement stm=cx.prepareStatement("SELECT pre.apellido, ren.fecha, zo.nombre_zona, ren.total_preventa, ren.total_ventido, ren.total_fiado, ren.total_devoluciones, ren.total_gastos, ren.diferencia, ren.cantidad_ventas, ren.observacion from rendicion as ren inner join preventista as pre on ren.id_preventista=pre.codigo inner join zonas as zo on ren.id_zona=zo.id_zona where pre.codigo=? order by ren.id_rendicion desc");
                 stm.setInt(1, id_preventista);
                 rs=  stm.executeQuery();
        }else if(id_preventista==0){//// si el id_preventista es 0, quiere decir que solo puso la fecha, por lo tanto quiere saber todas las rendiciones de esa fecha en particular
                 PreparedStatement stm=cx.prepareStatement("SELECT pre.apellido, ren.fecha, zo.nombre_zona, ren.total_preventa, ren.total_ventido, ren.total_fiado, ren.total_devoluciones, ren.total_gastos, ren.diferencia, ren.cantidad_ventas, ren.observacion from rendicion as ren inner join preventista as pre on ren.id_preventista=pre.codigo inner join zonas as zo on ren.id_zona=zo.id_zona where ren.fecha=? order by ren.id_rendicion desc");
                 stm.setString(1, fecha);
                 rs=  stm.executeQuery();
        
        }else{/// sino, quiere decir que puso los dos, por lo tanto el usuario quiere saber la rendicion de un preventista en alguna fecha en particular...
                 PreparedStatement stm=cx.prepareStatement("SELECT pre.apellido, ren.fecha, zo.nombre_zona, ren.total_preventa, ren.total_ventido, ren.total_fiado, ren.total_devoluciones, ren.total_gastos, ren.diferencia, ren.cantidad_ventas, ren.observacion from rendicion as ren inner join preventista as pre on ren.id_preventista=pre.codigo inner join zonas as zo on ren.id_zona=zo.id_zona where ren.fecha=? and pre.codigo=? ");
                 stm.setString(1, fecha);
                 stm.setInt(2, id_preventista);
                 rs=  stm.executeQuery();
        }
      
        
       
   
          

        return rs;
    }
    
    
    ///metodo para ver todas las rendiones en un orden descendente...
     public static ResultSet verRendiciones(Connection cx)throws Exception {
        ResultSet rs=null;
        
        PreparedStatement stm=cx.prepareStatement("SELECT pre.apellido, ren.fecha, zo.nombre_zona, ren.total_preventa, ren.total_ventido, ren.total_fiado, ren.total_devoluciones, ren.total_gastos, ren.diferencia, ren.cantidad_ventas, ren.observacion from rendicion as ren inner join preventista as pre on ren.id_preventista=pre.codigo inner join zonas as zo on ren.id_zona=zo.id_zona order by ren.id_rendicion desc");

        try{
          rs=  stm.executeQuery();
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return rs;
    }
    
    public static void insertarGastosRealizados(Connection cx, int id_gasto, int id_preventista, float monto, int id_rendicion)throws Exception {
        PreparedStatement stm=cx.prepareStatement("INSERT INTO gastos_realizados (id_gasto, id_preventista, monto, id_rendicion) values (?, ?, ?, ?)");
        stm.setInt(1, id_gasto);
        stm.setInt(2, id_preventista);
        stm.setFloat(3, monto);
        stm.setInt(4, id_rendicion);
        try{
            stm.executeUpdate();
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
    
    public static void insertarDevolucion(Connection cx, int id_cliente, float monto, String motivo, int id_rendicion)throws Exception {
        PreparedStatement stm=cx.prepareStatement("INSERT INTO devoluciones (id_cliente, monto, motivo, id_rendicion) values (?, ?, ?, ?)");
        stm.setInt(1, id_cliente);
        stm.setFloat(2, monto);
        stm.setString(3, motivo);
        stm.setInt(4, id_rendicion);
        try{
            stm.executeUpdate();
        }catch(SQLException e){
           JOptionPane.showMessageDialog(null,e.getMessage()); 
        }
        
    }
    
    
     public static void insertarProductosDevueltos(Connection cx, int id_producto ,int  cantidad, float monto, int id_rendicion)throws Exception {
        PreparedStatement stm=cx.prepareStatement("INSERT INTO productos_devueltos (id_productos,  cantidad, monto, id_rendicion) values (?, ?, ?, ?)");
        stm.setInt(1, id_producto);
        stm.setInt(2, cantidad);
        stm.setFloat(3, monto);
        stm.setInt(4, id_rendicion);
        try{
            stm.executeUpdate();
        }catch(SQLException e){
           JOptionPane.showMessageDialog(null,e.getMessage()); 
        }
        
    }
     
     public static ResultSet verTransferencias(Connection cx, int id_preventista)throws Exception {
         ResultSet rs=null;
         PreparedStatement stm=cx.prepareStatement("select tra.fecha, cli.apenom, cli.telefono,  tra.monto, pre.apellido, tra.estado  from transferencias as tra inner join clientes as cli on cli.codigo=tra.id_cliente inner join rendicion as ren on tra.id_rendicion=ren.id_rendicion inner join preventista as pre on ren.id_preventista=pre.codigo where pre.codigo=? and tra.estado='Pendiente' ");
         stm.setInt(1, id_preventista);
        
             rs=stm.executeQuery();
       
         return rs;
     }
     
     public static void actualizarTransferenciasPendientes(Connection cx, String estado,int id_rendicion, int id_cliente)throws Exception{
         PreparedStatement stm=cx.prepareStatement("UPDATE transferencias set estado=?  where id_rendicion=? and id_cliente=?");
         stm.setString(1, estado);
         stm.setInt(2, id_rendicion);
         stm.setInt(3, id_cliente);
         try{
             stm.executeUpdate();
         }catch(SQLException e){
               JOptionPane.showMessageDialog(null,e.getMessage()); 
         }
     }
     
     
     public static ResultSet verFiados(Connection cx, int id_preventista)throws Exception{
         ResultSet rs=null;
         PreparedStatement stm=cx.prepareStatement("select ren.fecha, cli.apenom, cli.telefono, fi.monto_fiado, pre.apellido, fi.estado, (fi.monto_fiado-fi.monto_entregado)   from fiados as fi inner join rendicion as ren on fi.id_rendicion=ren.id_rendicion inner join clientes as cli on fi.id_cliente=cli.codigo inner join preventista as pre on ren.id_preventista=pre.codigo where pre.codigo=? and fi.estado='pendiente' ");
         stm.setInt(1, id_preventista);
         try{
            rs= stm.executeQuery();
         }catch(SQLException e){
              JOptionPane.showMessageDialog(null,e.getMessage()); 
         }
         return rs;
         
     }
     
     
     ///obtiene el id de un fiado, lo hace en base al id cliente y a la rendicion que pertenece
     public static int obtenerIdFiado(Connection cx, int id_cliente, int id_rendicion)throws Exception {
         int id=0;
         ResultSet rs=null;
         PreparedStatement stm=cx.prepareStatement("SELECT id_fiado from fiados where id_cliente=? and id_rendicion=? and estado='pendiente' ");
         stm.setInt(1, id_cliente);
         stm.setInt(2, id_rendicion);
         try{
             rs=stm.executeQuery();
             while(rs.next()){
                 id=rs.getInt("id_fiado");
             }
         }catch(SQLException e){
             JOptionPane.showMessageDialog(null,e.getMessage()); 
         }
         return id;
             
     }
     
     public static void entregarMontoFiado(Connection cx, float monto_entregado,int id_fiado, int id_rendicion)throws Exception {
         PreparedStatement stm=cx.prepareStatement("UPDATE fiados set monto_entregado=monto_entregado+? where id_fiado=? and id_rendicion=?");
         stm.setFloat(1, monto_entregado);
         stm.setFloat(2, id_fiado);
         stm.setInt(3, id_rendicion);
         try{
             stm.executeUpdate();
         }catch(SQLException e){
              JOptionPane.showMessageDialog(null,e.getMessage()); 
         }
             
         
     }
     
     public static float consultarMontoPendienteFiado(Connection cx, int id_fiado, int id_rendicion)throws Exception {
        float estado=0;
         ResultSet rs=null;
         PreparedStatement stm=cx.prepareStatement("SELECT monto_fiado-monto_entregado from fiados where id_fiado=? and id_rendicion=?");
         stm.setInt(1, id_fiado);
         stm.setInt(2, id_rendicion);
         try{
             rs=stm.executeQuery();
             while (rs.next()){
                  estado=rs.getFloat("monto_fiado-monto_entregado");
             }
         }catch(SQLException e){
             JOptionPane.showMessageDialog(null,e.getMessage()); 
         }
         return estado;
     }
     
     
     public static void cambiarEstadoFiado(Connection cx, int id_fiado, int id_rendicion)throws Exception {
         PreparedStatement stm=cx.prepareStatement("UPDATE fiados set estado='pagado' where id_fiado=? and id_rendicion=?" );
         stm.setInt(1, id_fiado);
         stm.setInt(2, id_rendicion);
         try{
             stm.executeUpdate();
         }catch(SQLException e){
             JOptionPane.showMessageDialog(null,e.getMessage()); 
         }
     }
    
}
