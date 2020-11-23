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
    private String telefono;
    private String correo;
    private Jugador capitan;
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
        capitan = Liga.yo;
    }
    
    //Metodos
    public void addJugador(Jugador j){
        jugadores.add(j);
    }
    
    public void añadirJugador(String nombre, LocalDate fechaNacimiento){
        Jugador j = new Jugador(nombre, fechaNacimiento);
        jugadores.add(j);
    }
    
    public void setJugador(int index, Jugador j){
        jugadores.set(index, j);
    }
    
    public void eliminarJugador(Jugador j){
        jugadores.remove(j);
    }
    
    public Jugador getJugador(int index){
        return jugadores.get(index);
    }
    
    public int buscaJugador(String name){
        for(Jugador j:jugadores)
            if(j.getNombre().compareToIgnoreCase(name)==0)
                return jugadores.indexOf(j);
        return -1;
    }
    
    public String[] getArrayNomJugadores(){
        String[] lista = new String[jugadores.size()];
        for(int i=0; i<lista.length; i++)
            lista[i] = jugadores.get(i).getNombre();
        return lista;
    }
    
    public int getNumJugadores(){
        return jugadores.size();
    }
    
    public int getIndexJugador(String nombre){
        for(Jugador j: jugadores)
            if(j.getNombre().compareToIgnoreCase(nombre)==0)
                return jugadores.indexOf(j);
        return -1;
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
    
    // -- Set --

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setCapitan(Jugador capitan) {
        this.capitan = capitan;
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

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public Jugador getCapitan() {
        return capitan;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }
    
    
    public String toString(){        
        return nombre;
    }
}
