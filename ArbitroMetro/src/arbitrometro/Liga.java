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
    public static final String[] HEADCLASI = {"Equipo", "PG", "PE", "PP", "Ptos", " GF", "GC", "PJ"};
    public static final String[] HEADGOLES = {"Jugadores", "Goles"};
    
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
    
    public String getNombre(){
        return nombre;
    }

    public void setJornadas(ArrayList<Jornada> jornadas) {
        this.jornadas = jornadas;
    }

    public ArrayList<Jornada> getJornadas() {
        return jornadas;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }
    
    
    // Clasificacion
    public int[] getEstadisticaPorEquipo(Equipo e){
        int n[] = new int[5];
        int pg=0;// 0 Partidos Ganados
        int pe=0;// 1 Partidos Empatados
        int pp=0;// 2 Partidos Perdidos
        int gf=0;// 3 Goles favor
        int gc=0;// 4 Goles contra
        int gp, gv;
        for(Jornada j:jornadas)
            for(Partido p: j.getPartidos()){
                if(p.getEquipo1() == e){
                    gp = p.totalGoles1();
                    gv = p.totalGoles2();
                }else if (p.getEquipo2() == e){
                    gp = p.totalGoles2();
                    gv = p.totalGoles1();
                }else
                    continue;
        
                    System.out.println("Search 2 "+e.getNombre()+" Find: "+p.getEquipo2().getNombre()+" - "+gp+"-"+gv );        if(gp > gv){
                    pg ++;
                    gf += pg;
                    gc += gv;
                }else if(gp < gv){
                    pp ++;
                    gf += pg;
                    gc += gv;
                }else
                    if ( !p.isAusente1() && !p.isAusente2())
                        pe++;
            }
        n[0] = pg;
        n[1] = pe;
        n[2] = pp;
        n[3] = gf;
        n[4] = gc;
        return n;   
    }
    
    public ArrayList<Jugador> getEstadisticasJugadores(){
        ArrayList<Jugador> jugadores = new ArrayList<>();
        for(Equipo e: equipos)
            jugadores.addAll(e.getJugadores());
        for(Jornada j:jornadas)
            for(Partido p: j.getPartidos()){
                int n=0;
                for(Goles g:p.getGoles1()){
                    n = jugadores.indexOf(g.getPepe());
                    if(n>=0)
                        jugadores.get(n).addGol(g.getGoles());
                }
                for(Goles g:p.getGoles2()){
                    n = jugadores.indexOf(g.getPepe());
                    if(n>=0)
                        jugadores.get(n).addGol(g.getGoles());
                }
            }
        jugadores.sort(new JugGoles());
        return jugadores;
    }
    
    public String[][] getClasificacion(){
        String[][] tabla = new String[equipos.size()][8];
        for(int i=0; i<tabla.length; i++){
            String[] column = tabla[i];
            Equipo e = equipos.get(i);
            //Sacamos los datos
            int[] s = getEstadisticaPorEquipo(e);

            //Intruduciomos los datos
            column[0] = e.getNombre();
            column[1] = ""+s[0];
            column[2] = ""+s[1];
            column[3] = ""+s[2];
            column[4] = ""+((s[0]*3)+(s[1]*2));
            column[5] = ""+s[3];
            column[6] = ""+s[4];
            column[7] = ""+(s[0]+s[1]+s[2]);
        }
       return tabla;
    }
    
    public String[][] getGoleadores(int n){
        ArrayList<Jugador> jugs = getEstadisticasJugadores();
        if(n>jugs.size())
            n = jugs.size();
        
        String[][] gols = new String[n][2];
        for(int i=0; i<n; i++){
            gols[i][0] = jugs.get(i).getNombre();
            gols[i][1] = ""+jugs.get(i).getGoles();
        }
        return gols;
    }
    
    public String toString(){
        String s="";
        for(Equipo e:equipos)
            s+= e.toString()+"\n";
        return s;
    }
    
}
