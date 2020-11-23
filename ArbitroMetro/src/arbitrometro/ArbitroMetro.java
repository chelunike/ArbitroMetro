package arbitrometro;

import herramientas.IO;
import herramientas.Serializacion;
import java.time.LocalDate;
import ventanas.*;
import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 * Clase principal
 * 
 * @author chelunike
 */
public class ArbitroMetro {
    
    /* -- -- Nota -- -- 
        En los datos se almacenan las cosas una y otra vez pero teniendo 
    en cuenta que en java todo es paso por referencia no es necesario preocuparse  :)
    */
    
    public static void main(String[] args) {
        //NInio to empiesa aki :)
        System.out.println("Ventana de inicio");
        
        System.out.println("Arbitrometro to Profesional");
        System.out.println("\t Por chelunike");
        System.out.println("\t Team Potato :) ");
        
        setTheme();
        
        try {
            InitVentanilla init = new InitVentanilla("Liga Domingo Savio");
            init.setVisible(true);
        }catch(Exception e) {
            System.out.println(""+e.getMessage());
            System.exit(1);
        }
        
        
        // Un poco de arte en el código ;)
           ;;  ;;
           ;;  ;;
        
        ;;        ;;
         ;;;;;;;;;; 
        
    }
    
    public static void setTheme(){
        
        String str1 = "javax.swing.plaf.metal.MetalLookAndFeel";
        String str2 = "javax.swing.plaf.nimbus.NimbusLookAndFeel";
        String str3 = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
        String str4 = "com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel";
        String str5 = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
        String str6 = "com.sun.java.swing.plaf.gtk.GTKLookAndFeel";//For Ubuntu :)
        
        try {
            UIManager.setLookAndFeel(str3);
        } catch (Exception e) {
            System.out.println("Error aplicar estilos Windows: "+e);
            try {
                UIManager.setLookAndFeel(str6);
            } catch (Exception ex) {
                System.out.println("Error aplicar estilos Linux: "+ex);
            }
        }
        JFrame.setDefaultLookAndFeelDecorated(true);
        
    }
    
}
