package arbitrometro;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @author yo
 */
public class Jugador {
    //Atributos
    private String nombre;
    private String apellidos;
    private LocalDate fechaNaci;
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
    
    
}
