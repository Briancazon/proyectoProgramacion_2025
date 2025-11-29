
package clases;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class sueldo {
    
    public static void actualizar(Connection cx, float sueldo)throws Exception{
        PreparedStatement stm=cx.prepareStatement("update sueldo set sueldo=?");
        stm.setFloat(1, sueldo);
        stm.executeUpdate();
    }
    
    public static ResultSet ver(Connection cx)throws Exception{
        ResultSet rs=null;
        PreparedStatement stm=cx.prepareStatement("SELECT sueldo from sueldo");
        rs=stm.executeQuery();
        return rs;
    }
    
}
