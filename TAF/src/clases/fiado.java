
package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class fiado {
    
    //metodo que nos trare el total de fiados sumados de un preventista de un alo y mes en particular...
    public static ResultSet verFiadosPreventista(Connection cx, int id_preventista, int año, int mes)throws Exception {
        ResultSet rs=null;
        PreparedStatement stm=cx.prepareStatement("select sum(fi.monto_fiado-fi.monto_entregado) from rendicion as ren inner join preventista as pre on ren.id_preventista=pre.codigo inner join fiados as fi on fi.id_rendicion=ren.id_rendicion where pre.codigo=? and year(ren.fecha)=? and month(ren.fecha)=? and fi.estado='pendiente'");
        stm.setInt(1, id_preventista);
        stm.setInt(2, año);
        stm.setInt(3, mes);
        rs=stm.executeQuery();
        return rs;
    }
}
