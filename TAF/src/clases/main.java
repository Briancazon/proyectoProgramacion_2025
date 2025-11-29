
package clases;

import Formulario2.login_iniciarSesion;
import com.formdev.flatlaf.intellijthemes.FlatGrayIJTheme;


public class main {
    public static void main(String[] args) {
   //      UIManager.setLookAndFeel(new FlatLightLaf());
              FlatGrayIJTheme.setup();
         login_iniciarSesion login = new login_iniciarSesion();  
        login.setVisible(true);
    }
}
