package arbitrometro;

import java.io.Serializable;

/**
 * @author chelunike
 */
public class Tarjeta implements Serializable {
    //Atributos
    private Jugador jugador;
    private String color;
    
    //Constructor
    public Tarjeta(Jugador j, String color){
        jugador = j;
        this.color = color;
    }
    
    //Get y Set

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
