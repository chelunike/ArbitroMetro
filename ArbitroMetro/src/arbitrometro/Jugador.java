package arbitrometro;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author yo
 */
public class Jugador implements Serializable, Comparable<Jugador> {
    //Atributos
    private String nombre;
    private String apellidos;
    private LocalDate fechaNaci;
    private String lugarNaci;
    private int numGoles;
    private ArrayList <Tarjeta> tarjetas;
    
    //Constructores
    public Jugador(String nombre, LocalDate fechaNacimiento){
        tarjetas = new ArrayList();
        this.nombre = nombre;
        fechaNaci = fechaNacimiento;
    }
    
    //Metodos
    public void addGol(int num){
        numGoles += num;
    }
    
    public void addTarjeta(Tarjeta tarj){
        tarjetas.add(tarj);
    }
    
    //Get y Set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNaci() {
        return fechaNaci;
    }
    
    public void setFechaNaci(LocalDate fechaNaci) {
        this.fechaNaci = fechaNaci;
    }

    public String getLugarNaci() {
        return lugarNaci;
    }

    public void setLugarNaci(String lugarNaci) {
        this.lugarNaci = lugarNaci;
    }
    
    public int getGoles(){
        return numGoles;
    }
    
    @Override
    public String toString(){
        return nombre+" "+apellidos+", "+fechaNaci.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))+", "+lugarNaci;
    }
    
    // --- Ordenacion ---
    
    @Override
    public int compareTo(Jugador o) {
        return nombre.compareToIgnoreCase(o.getNombre());
    }
    
}
