package arbitrometro;

import java.util.ArrayList;

/**
 *
 * @author chelunike
 */
public class Clasificacion {
    // Atributos
    private ArrayList <Equipo> equipos;
    private ArrayList <Jornada> jornadas;
    
    // Constructor
    public Clasificacion(){
        equipos = new ArrayList();
        jornadas = new ArrayList();
    }
    
    
    //Metodos
    
    
    public void insertarEquipo(String nombre){
        Equipo pepe = new Equipo(nombre);
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
    
    
    public String toString(){
        String s="";
        for(Equipo e:equipos)
            s+= e.toString()+"\n";
        return s;
    }
}
