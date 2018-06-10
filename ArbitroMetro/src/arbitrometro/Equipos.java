package arbitrometro;

import java.util.ArrayList;

/**
 * @author yo
 */
public class Equipos {
    // Atributos
    private ArrayList <Equipo> equipos;
    
    // Constructor
    public Equipos(){
        equipos = new ArrayList();
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
    
}
