
package clientedesktop;
import com.sun.awt.AWTUtilities;

/**
 *
 * @author Andres Garcia
 */
public class ClienteDesktop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        login desktop = new login();
        AWTUtilities.setWindowOpaque(desktop, false);
        desktop.setVisible(true);
        
    }
    
}
