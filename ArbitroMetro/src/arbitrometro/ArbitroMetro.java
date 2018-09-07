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
    
    /* -- -- Notas -- -- 
        En los datos se almacenan las cosas una y otra vez pero teniendo 
    en cuenta que en java todo es paso por referencia no es necesario preocuparse  :)
    
    */
    
    
    public static void main(String[] args) {
        //NInio to empiesa aki :)
        System.out.println("Ventana de inicio");
        
        System.out.println("Arbitrometro to Profesional");
        System.out.println("\t Por chelunike y antoniocastilla (acc)");
        System.out.println("\t Team Potato :) ");
        
        setTheme();
                
        InitVentanilla init = new InitVentanilla("Liga Domingo Savio");
        init.setVisible(true);
        
        Liga c = new Liga("Liguilla");
        
        /*  --- Datos PreFabricados de Prueba --- */
        Equipo e1 = new Equipo("Potato");
        
        e1.añadirJugador("Antonio", LocalDate.now());
        e1.añadirJugador("Chema", LocalDate.now());
        e1.añadirJugador("Mario", LocalDate.now());
        e1.añadirJugador("Montes", LocalDate.now());
        
        Equipo e2 = new Equipo("Dream Team");
        
        e2.añadirJugador("Juan Carlos", LocalDate.now());
        
        c.addEquipo(e1);
        c.addEquipo(e2);
        
        Jugador yo = new Jugador("Yo", LocalDate.now());
        
        Jornada j1 = new Jornada("Jornada 1");
        Jornada j2 = new Jornada("Jornada 2");
        
        j1.setFecha(LocalDate.now());
        j2.setFecha(LocalDate.now());
        
        Partido p1 = new Partido(c.getEquipo(0), c.getEquipo(1));
        Partido p2 = new Partido(c.getEquipo(1), c.getEquipo(0));
        
        Goles g1 = new Goles(e1.getJugador(1), 2);
        Goles g2 = new Goles(e1.getJugador(2), 5);
        
        p2.addTarjeta1(new Tarjeta(e1.getJugador(0), "Roja"));
        
        p1.addGolEquipo1(g1);
        p1.addGolEquipo2(g2);
        p2.addGolEquipo2(g2);
        
        j1.addPartido(p1);
        j1.addPartido(p2);
        j1.addPartido(p2);
        j2.addPartido(p2);
        
        p1.equipo1Ausente(true);
        //p1.equipo2Ausente(true);
        j1.addPartido(p2);
        
        c.addJornada(j1);
        c.addJornada(j2);
        
        //*/
        
        /*for(String cell: Liga.HEADCLASI)
            System.out.print(cell+"\t");
        System.out.println("");
        for(String[] row: c.getClasificacion()){
            for(String cell: row)
                System.out.print(cell+"\t");
            System.out.println("");
        }*/
        
        //Serializacion.serializarObjeto(c, "ligaTes.liga");
        
        //VentanaPrincipal vp = new VentanaPrincipal(c);
        
        //vp.setVisible(true);
        
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
            UIManager.setLookAndFeel(str6);
            //SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
            System.out.println("Error aplicar estilos: "+e);
        }
        JFrame.setDefaultLookAndFeelDecorated(true);
        
    }
    
}
