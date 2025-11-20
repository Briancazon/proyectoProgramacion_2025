
package clases;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class objetivo {
     
    public static void insertar(Connection cx, int id_preventista, int año, int mes, float objetivo_monto, int objetivo_pdv, int objetivo_dias)throws Exception{
        PreparedStatement stm=cx.prepareStatement("INSERT INTO objetivos (id_preventista, año, mes, objetivo_monto, objetivo_pdv, objetivo_dias) values (?, ?, ?, ? ,?, ?)");
        stm.setInt(1,id_preventista);
        stm.setInt(2, año);
        stm.setInt(3, mes);
        stm.setFloat(4, objetivo_monto);
        stm.setInt(5, objetivo_pdv);
        stm.setInt(6, objetivo_dias);
        
        stm.executeUpdate();
    }
    
    
    
    
    ///metodo para obtener el ultimo obetivo registrado de un preventista...
    public static int obtenerUltimoIdObjetivo(Connection cx, int id_preventista)throws Exception {
        ResultSet rs=null;
        int ID=0;
        PreparedStatement stm=cx.prepareStatement("SELECT id_objetivo from objetivos where id_preventista=?  order by id_objetivo desc limit 1"); 
        stm.setInt(1, id_preventista);
        rs= stm.executeQuery();
        while (rs.next()){
            ID=rs.getInt("id_objetivo");
        }
        return ID;
    }
    
    
   
      ///metodo para obtener el id objetivo dado el preventista , el mes y el año
    public static int obtenerIDporMesYAño(Connection cx, int id_preventista, int año, int mes)throws Exception {
        ResultSet rs=null;
        int ID=0;
        PreparedStatement stm=cx.prepareStatement("SELECT id_objetivo from objetivos where id_preventista=?  and año=? and mes=?"); 
        stm.setInt(1, id_preventista);
        stm.setInt(2, año);
        stm.setInt(3, mes);
        rs= stm.executeQuery();
        while (rs.next()){
            ID=rs.getInt("id_objetivo");
        }
        return ID;
    }
    
    
    //metodo para ver ciertos datos de un objetivo en particular
    public static ResultSet verObjetivosPreventista(Connection cx, int id_objetivo)throws Exception {
        ResultSet rs=null;
        PreparedStatement stm=cx.prepareStatement("select objetivo_monto, objetivo_pdv, objetivo_dias from objetivos where id_objetivo =?");
        stm.setInt(1, id_objetivo);
        rs=stm.executeQuery();
        return rs;
    }
    
    
    
    
}
