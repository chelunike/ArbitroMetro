package arbitrometro;

import java.util.ArrayList;

/**
 * Pues esto no tiene mucha siensia un puñao de personas detras de una pelota,
 * aun asi tenemos que saber quien marca los goles para los goleadores :W
 * 
 * @author chelunike
 */
public class Partido {
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
