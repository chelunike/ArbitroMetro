package arbitrometro;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * En la jornada se almancenan los partidos jugados en el dia
 * 
 * @author chelunike
 */
public class Jornada implements Serializable {
    //Atributos
    private String title;
    private LocalDate fecha;
    private ArrayList<Partido> partidos;
    
    //Constructor
    public Jornada(String title){
        this.title = title;
        partidos = new ArrayList<>();
    }
    
    //Metodos
    public void addPartido(Partido p){
        partidos.add(p);
    }
    
    public int numPartidos(){
        return partidos.size();
    }
    
    public Partido getPartido(int index){
        return partidos.get(index);
    }
    
    public void eliminarPartido(int index){
        partidos.remove(index);
    }
    
    //Get y Set

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }
    
   
}
