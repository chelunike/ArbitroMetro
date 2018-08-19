package arbitrometro;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Pues esto no tiene mucha siensia un puñao de personas detras de una pelota,
 * aun asi tenemos que saber quien marca los goles para los goleadores :W
 * 
 * @author chelunike
 */
public class Partido implements Serializable {
    //Atributos
    private Equipo equipo1;
    private Equipo equipo2;

    private ArrayList<Goles> goles1;
    private ArrayList<Goles> goles2;

    private ArrayList <Tarjeta> tarjetas1;
    private ArrayList <Tarjeta> tarjetas2;

    //Constructores
    public Partido(Equipo local, Equipo visitante){
        equipo1 = local;
        equipo2 = visitante;
        
        //Instanciar atributos
        goles1 = new ArrayList();
        goles2 = new ArrayList();
        
        tarjetas1 = new ArrayList();
        tarjetas2 = new ArrayList();
        
    }
        
    //Metodos
    public void addGolEquipo1(Goles g){
        goles1.add(g);
    }
    
    public void addGolEquipo2(Goles g){
        goles2.add(g);
    }
    
    
    //Get y Set

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }
    
    public int getNumGoles1(){
        int n=0;
        for(Goles g:goles1)
            n += g.getGoles();
        return n;
    }
    
    public int getNumGoles2(){
        int n=0;
        for(Goles g:goles2)
            n += g.getGoles();
        return n;
    }
    
    public ArrayList<Goles> getGoles1() {
        return goles1;
    }

    public ArrayList<Goles> getGoles2() {
        return goles2;
    }

    public ArrayList<Tarjeta> getTarjetas1() {
        return tarjetas1;
    }

    public void setTarjetas1(ArrayList<Tarjeta> tarjetas1) {
        this.tarjetas1 = tarjetas1;
    }

    public ArrayList<Tarjeta> getTarjetas2() {
        return tarjetas2;
    }

    public void setTarjetas2(ArrayList<Tarjeta> tarjetas2) {
        this.tarjetas2 = tarjetas2;
    }
    
}
