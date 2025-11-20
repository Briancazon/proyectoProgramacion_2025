package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class semana {
    
    public static void insertar(Connection cx, int id_objetivo, int semana_num, String fecha_desde, String fecha_hasta)throws Exception {
        PreparedStatement stm=cx.prepareStatement("INSERT INTO semanas (id_objetivo, semana_num, fecha_desde, fecha_hasta) values (?, ?, ?, ?)");
        stm.setInt(1, id_objetivo);
        stm.setInt(2, semana_num);
        stm.setString(3, fecha_desde);
        stm.setString(4, fecha_hasta);
        
        stm.executeUpdate();
    }
    
    
    
    ///metodo que perimite ver cuanto lleva ventido, cuantos pdv y cuantos dias hizo un preventista de la semana 1 del mes tanto del año tanto, recordemos que el id_objetivo serian los objetivos que se le asiganraon a un preventista en mes determinado de un año determinado..
    public static ResultSet verRendimientoSemana1(Connection cx, int id_objetivo)throws Exception {
        ResultSet rs=null;
        PreparedStatement stm=cx.prepareStatement("select sum(ren.total_ventido), sum(ren.cantidad_ventas), count(ren.id_rendicion) from rendicion as ren inner join preventista as pre \n" +
"on ren.id_preventista=pre.codigo inner join objetivos as ob on ob.id_preventista=pre.codigo inner join semanas as se on \n" +
"se.id_objetivo=ob.id_objetivo where ob.id_objetivo=? and se.semana_num=1  and ren.fecha between se.fecha_desde and se.fecha_hasta");
        stm.setInt(1, id_objetivo);
       rs= stm.executeQuery();
       return rs;
    }
    
      ///metodo que perimite ver cuanto lleva ventido, cuantos pdv y cuantos dias hizo un preventista de la semana 2 del mes tanto del año tanto, recordemos que el id_objetivo serian los objetivos que se le asiganraon a un preventista en mes determinado de un año determinado..
    public static ResultSet verRendimientoSemana2(Connection cx, int id_objetivo)throws Exception {
        ResultSet rs=null;
        PreparedStatement stm=cx.prepareStatement("select sum(ren.total_ventido), sum(ren.cantidad_ventas), count(ren.id_rendicion) from rendicion as ren inner join preventista as pre \n" +
"on ren.id_preventista=pre.codigo inner join objetivos as ob on ob.id_preventista=pre.codigo inner join semanas as se on \n" +
"se.id_objetivo=ob.id_objetivo where ob.id_objetivo=? and se.semana_num=2  and ren.fecha between se.fecha_desde and se.fecha_hasta");
        stm.setInt(1, id_objetivo);
       rs= stm.executeQuery();
       return rs;
    }
    
      ///metodo que perimite ver cuanto lleva ventido, cuantos pdv y cuantos dias hizo un preventista de la semana 3 del mes tanto del año tanto, recordemos que el id_objetivo serian los objetivos que se le asiganraon a un preventista en mes determinado de un año determinado..
    public static ResultSet verRendimientoSemana3(Connection cx, int id_objetivo)throws Exception {
        ResultSet rs=null;
        PreparedStatement stm=cx.prepareStatement("select sum(ren.total_ventido), sum(ren.cantidad_ventas), count(ren.id_rendicion) from rendicion as ren inner join preventista as pre \n" +
"on ren.id_preventista=pre.codigo inner join objetivos as ob on ob.id_preventista=pre.codigo inner join semanas as se on \n" +
"se.id_objetivo=ob.id_objetivo where ob.id_objetivo=? and se.semana_num=3  and ren.fecha between se.fecha_desde and se.fecha_hasta");
        stm.setInt(1, id_objetivo);
       rs= stm.executeQuery();
       return rs;
    }
    
    
      ///metodo que perimite ver cuanto lleva ventido, cuantos pdv y cuantos dias hizo un preventista de la semana 4 del mes tanto del año tanto, recordemos que el id_objetivo serian los objetivos que se le asiganraon a un preventista en mes determinado de un año determinado..
    public static ResultSet verRendimientoSemana4(Connection cx, int id_objetivo)throws Exception {
        ResultSet rs=null;
        PreparedStatement stm=cx.prepareStatement("select sum(ren.total_ventido), sum(ren.cantidad_ventas), count(ren.id_rendicion) from rendicion as ren inner join preventista as pre \n" +
"on ren.id_preventista=pre.codigo inner join objetivos as ob on ob.id_preventista=pre.codigo inner join semanas as se on \n" +
"se.id_objetivo=ob.id_objetivo where ob.id_objetivo=? and se.semana_num=4  and ren.fecha between se.fecha_desde and se.fecha_hasta");
        stm.setInt(1, id_objetivo);
       rs= stm.executeQuery();
       return rs;
    }
    
    
}
