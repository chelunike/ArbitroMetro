package arbitrometro;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * De cada equipo se almacena: el nombre y los jugadores.
 * También una serie de datos, que aunque sean calculados, sirven para tener
 * dos puntos de comparacion y asi comprobar posibles errores en los datos.
 * 
 * @author chelunike
 */
public class Equipo  implements Serializable {
    //Atributos
    private String nombre;
    private ArrayList <Jugador> jugadores;
    
    private int partGanados;
    private int partPerdidos;
    private int partEmpatados;
    private int golesFavor;
    private int golesContra;
    private int partJugados;
    // Los partidos no presentados son iguales que un partido perdidos, pero
    // guardamos este dato de consulta :)
    private int partNoPresentado;
    
    //Constructor
    public Equipo(String equipo){
        jugadores = new ArrayList();
        nombre = equipo;
    }
    
    //Metodos
    
    public void añadirJugador(String nombre, LocalDate fechaNacimiento){
        Jugador j = new Jugador(nombre, fechaNacimiento);
        jugadores.add(j);
    }
    
    public void eliminarJugador(Jugador j){
        jugadores.remove(j);
    }
    
    public Jugador getJugador(int index){
        return jugadores.get(index);
    }
    
    public ArrayList <Jugador> getListaJugadores(){
        return jugadores;
    }
    
    public int getNumJugadores(){
        return jugadores.size();
    }
    
    public void actualiza(){
        partJugados = partEmpatados +partGanados +partPerdidos;
    }
    
    public void ganan(){
        partGanados++;
        actualiza();
    }
    
    public void pierden(){
        partPerdidos++;
        actualiza();
    }
    
    public void empatan(){
        partEmpatados++;
        actualiza();
    }
    
    public void añadeGolesAfavor(int goles){
        golesFavor += goles;
        actualiza();
    }
    
    public void añadeGolesContra(int goles){
        golesContra += goles;
        actualiza();
    }
    
    // -- Get --
    public int getPartGanados() {
        return partGanados;
    }

    public int getPartPerdidos() {
        return partPerdidos;
    }

    public int getPartEmpatados() {
        return partEmpatados;
    }

    public int getGolesFavor() {
        return golesFavor;
    }

    public int getGolesContra() {
        return golesContra;
    }

    public int getPartJugados() {
        return partJugados;
    }

    public int getPartNoPresentado() {
        return partNoPresentado;
    }

    public int getPuntos() {
        return partGanados*3+partEmpatados;
    }
    
    public String toString(){        
        return nombre;
    }
}
