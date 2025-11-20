
package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class devolucion {
    
    ///metodo que nos trae el total de voluciones sumadas de un preventista en un mes y alo en particular..
    public static ResultSet verDevolucionesPreventtista(Connection cx, int id_preventista, int año, int mes)throws Exception{
        ResultSet rs=null;
        PreparedStatement stm=cx.prepareStatement("select sum(ren.total_devoluciones) from rendicion as ren inner join preventista as pre on ren.id_preventista=pre.codigo where pre.codigo=? and year(ren.fecha)=? and month(ren.fecha)=?");
        stm.setInt(1, id_preventista);
        stm.setInt(2, año);
        stm.setInt(3, mes);
        rs=stm.executeQuery();
        return rs;
    }
}
