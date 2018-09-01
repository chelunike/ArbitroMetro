package arbitrometro;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * En una liga se juegan una serie de dias (jornadas) los equipos entre si.
 * Por cada jornada se saca una clasificacion de los equipos con: 
 * Partidos ganados, empatados, perdidos , puntos (Partido ganado son 3 pts, 
 * empatado es 1 y perdido 0 xd), Goles a favor, goles en contra, diferencia
 * de goles y partidos jugados.
 * Luego se ordenan por: Puntos, DifGoles,   partidos ganados,   GolesAfavor, goles en contra , orden alfabetico
 * 
 * Esta clase se encarga de sacar dicha clasificación y almacenar los datos
 * restpecto a jornadas y equipos.
 * 
 * @author chelunike
 */
public class Liga implements Serializable {
    //Constantes
    public static final Jugador yo = new Jugador("Yo", LocalDate.now());
    
    //Atributos
    private String nombre;
    
    private ArrayList<Jornada> jornadas;
    private ArrayList<Equipo> equipos;
    
    
    //Constructor
    public Liga(String nombre){
        this.nombre = nombre;
        
        //Instanciamos las cosillas
        jornadas = new ArrayList<>();
        equipos = new ArrayList<>();
    }
    
    //Metodos
    
    public void addJornada(Jornada j){
        jornadas.add(j);
    }
    
    public int numJornadas(){
        return jornadas.size();
    }
    
    public Jornada getJornada(int index){
        return jornadas.get(index);
    }
    
    public void eliminarJornada(int index){
        jornadas.remove(index);
    }
    
    public void addEquipo(Equipo pepe){
        equipos.add(pepe);
    }
    
    public Equipo getEquipo(int index){
        return equipos.get(index);
    }
    
    public void eliminarEquipo(Equipo equipo){
        equipos.remove(equipo);
    }
    
    public ArrayList <Equipo> getEquipos(){
        return equipos;
    }
    
    public String[] getArrayEquipos(){
        String[] l = new String[equipos.size()];
        for(int i=0; i<l.length; i++)
            l[i] = equipos.get(i).toString();
        return l;
    }
    
    public String toString(){
        String s="";
        for(Equipo e:equipos)
            s+= e.toString()+"\n";
        return s;
    }
    
}
