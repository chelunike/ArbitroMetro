package arbitrometro;

import java.util.Comparator;

/**
 * @author chelunike
 */
public class JugGoles implements Comparator<Jugador> {
    @Override
    public int compare(Jugador o1, Jugador o2) {
        return o2.getGoles()-o1.getGoles();
    }
}
