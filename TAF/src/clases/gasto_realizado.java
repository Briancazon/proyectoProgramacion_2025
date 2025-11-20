
package clases;




import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class gasto_realizado {
    
    public static ResultSet verGastosPreventista(Connection cx, int id_preventista, int año, int mes)throws Exception{
       ResultSet rs=null;
       PreparedStatement stm=cx.prepareStatement("SELECT sum(gr.monto) from gastos_realizados as gr inner join rendicion as ren on gr.id_rendicion=ren.id_rendicion inner join preventista as pre on ren.id_preventista=pre.codigo where pre.codigo=? and year(ren.fecha)=? and month(ren.fecha)=?");
       stm.setInt(1, id_preventista);
       stm.setInt(2,año);
       stm.setInt(3 , mes);
       rs=stm.executeQuery();
       return rs;
       
    }
    
}
