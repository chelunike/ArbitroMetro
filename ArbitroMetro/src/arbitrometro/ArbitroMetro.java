package arbitrometro;

import Herramientas.IO;
import ventanas.InitDesing;

/**
 * @author chelunike
 */
public class ArbitroMetro {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Arbitrometro to Profesional");
        //new InitDesing().setVisible(true);

        Clasificacion c = new Clasificacion();

        c.insertarEquipo("Dream Team");
        c.insertarEquipo("Urban Futsal");

        System.out.println("Clasificación:\n" + c.toString());
//        String csv = "Año,Marca,Modelo,Descripción,Precio\n"
//                + "1997,Ford,E350,\"ac, abs, moon\",3000.00\n"
//                + "1999,Chevy,\"Venture \"\"Extended Edition\"\"\",\"\",4900.00\n"
//                + "1999,Chevy,\"Venture \"\"Extended Edition, Very Large\"\"\",,5000.00\n"
//                + "1996,Jeep,Grand Cherokee,\"MUST SELL!\n"
//                + "air, moon roof, loaded\",4799.00";
//        
        IO.escribeCsv("csv.csv", "");

    }

}
