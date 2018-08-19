package arbitrometro;

import java.io.Serializable;

/**
 * @author chelunike
 */
public class Tarjeta implements Serializable {
    //Atributos
    private String color;
    
    //Constructor
    public Tarjeta(String color){
        this.color = color;
    }
    
    //Metodo
    public String getColor(){
        return color;
    }
    
}
