package arbitrometro;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * La clasificación consiste en una serie de partidos eliminatorios
 * donde juegan los 8 mejores equipos de la liga, los emparejamientos
 * primeros tienen un orden pero los de semifinales se realizan por sorteo
 * 
 * @author chelunike
 */
public class Clasificatorio implements Serializable {
    // Atributos
    private ArrayList <Equipo> equipos;
    private ArrayList <Jornada> jornadas;
    
    // Constructor
    public Clasificatorio(){
        equipos = new ArrayList();
        jornadas = new ArrayList();
    }
    
     
    //Metodos
    
    
}
