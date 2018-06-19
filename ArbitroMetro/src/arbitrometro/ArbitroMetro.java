package arbitrometro;

import ventanas.InitDesing;

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
        // TODO code application logic here
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
