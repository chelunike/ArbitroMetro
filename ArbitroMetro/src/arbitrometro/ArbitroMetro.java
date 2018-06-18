package arbitrometro;

import ventanas.InitDesing;

/**
 * @author chelunike
 */
public class ArbitroMetro {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Arbitrometro to Profesional");
        //new InitDesing().setVisible(true);
        
        Clasificacion c = new Clasificacion();
        
        c.insertarEquipo("Dream Team");
        c.insertarEquipo("Urban Futsal");
        
        
        System.out.println("Clasificación:\n"+c.toString());
        
    }
    
    
}
