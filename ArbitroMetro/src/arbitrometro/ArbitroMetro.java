package arbitrometro;

import ventanas.*;
import herramientas.IO;

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
        
        InitDesing inicio = new InitDesing();
        inicio.setVisible(true);
        
        System.out.println("Arbitrometro to Profesional");
        System.out.println("\t Por chelunike y antoniocastilla (acc)");
        System.out.println("\t Team Potato :) ");
        
        // -- Prebas de las clases de Datos
        Liga c = new Liga("Liguilla");
        
        c.insertarEquipo("Dream Team");
        c.insertarEquipo("Urban Futsal");
        
        
        System.out.println("Clasificación:\n"+c.toString());
        
        
    }
    
    
}
