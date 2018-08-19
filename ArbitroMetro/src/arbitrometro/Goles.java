package arbitrometro;

import java.io.Serializable;

/**
 * Clase para saber quien marca un gol y ya xd
 *
 * @author chelunike
 */

public class Goles implements Serializable {
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
