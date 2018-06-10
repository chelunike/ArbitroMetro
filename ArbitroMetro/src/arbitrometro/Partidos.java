package arbitrometro;

import java.util.ArrayList;

/**
 * @author yo
 */
public class Partidos {
    
    
    public class Partido{
        //Atributos
        private Equipo equipo1;
        private Equipo equipo2;
        
        private Goles[] goles1;
        private Goles[] goles2;
        
        private ArrayList <Tarjeta> tarjetas1;
        private ArrayList <Tarjeta> tarjetas2;
        
        //Constructores
        public Partido(Equipo local, Equipo visitante){
            equipo1 = local;
            equipo2 = visitante;
        }
        
        
    }
    
    public class Goles{
        //Atributos
        private int goles;
        private Jugador pepe;
        
        //Contructor
        public Goles(Jugador jug, int goles){
            this.goles = goles;
            pepe = jug;
        }
        
        //Metodos
        public int getGoles() {
            return goles;
        }

        public void setGoles(int goles) {
            this.goles = goles;
        }

        public Jugador getPepe() {
            return pepe;
        }

        public void setPepe(Jugador pepe) {
            this.pepe = pepe;
        }
        
        
        
    }
    
}
