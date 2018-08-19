package arbitrometro;

import ventanas.*;
import herramientas.Serializacion;
import java.time.LocalDate;

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
        
        //InitVentanilla init = new InitVentanilla("Liga Domingo Savio");
        //init.setVisible(true);
        
        Liga c = new Liga("Liguilla");
        
        c.insertarEquipo("Dream Team");
        c.insertarEquipo("Urban Futsal");
        
        Jugador yo = new Jugador("Yo", LocalDate.now());
        
        Jornada j1 = new Jornada("Jornada 1");
        j1.setFecha(LocalDate.now());
        
        Partido p1 = new Partido(c.getEquipo(0), c.getEquipo(1));
        Partido p2 = new Partido(c.getEquipo(1), c.getEquipo(0));
        
        Goles g1 = new Goles(yo, 2);
        
        p1.addGolEquipo1(g1);
        p1.addGolEquipo2(g1);
        
        j1.addPartido(p1);
        j1.addPartido(p2);
        j1.addPartido(p2);
        j1.addPartido(p2);
        j1.addPartido(p2);
        j1.addPartido(p2);
        j1.addPartido(p2);
        j1.addPartido(p2);
        j1.addPartido(p2);
        
        
        VentanaPrincipal vp = new VentanaPrincipal(c);
        
        vp.actualizaJornada(j1);
        
        vp.setVisible(true);
        
           ;;  ;;
           ;;  ;;
        
        ;;        ;;
         ;;;;;;;;;; 
        
    }
    
    
}
