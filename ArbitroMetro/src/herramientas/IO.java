package herramientas;

//import com.opencsv.CSVWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Antonio
 */
public class IO {
    //Constantes
    static final String ANSI_CODI = "Cp1252";

    
    // -- -- -- Metodos Estaticos -- -- --
    public static String leerTexto(String ruta) {
        FileReader entrada;
        String cadena="";
        
        try {
            entrada = new FileReader(ruta);
            BufferedReader miBuffer = new BufferedReader(entrada);
            
            while ((cadena = miBuffer.readLine()) != null) {
                cadena += miBuffer.readLine();
            }
            miBuffer.close();
        } catch (FileNotFoundException ex) {
            System.out.println("No se  ha encontrado el archivo.");
        } catch (IOException ex) {
            System.out.println("Error de lectura. " + ex.getMessage());
        }

        return cadena;
    }

    public static boolean escribeTexto(String nombre, String texto) {
        File archivo = new File(nombre);
        boolean result = false;
        try {
            BufferedWriter miBuffer;
            if (archivo.exists()) {
                int opcion = JOptionPane.showConfirmDialog(null,
                        "El fichero ya existe. ¿Desea sobreescribirlo?", "Alerta",
                        JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (opcion == 0) {
                    miBuffer = new BufferedWriter(new FileWriter(archivo));
                    miBuffer.write(texto);
                    miBuffer.close();
                }
            } else {
                miBuffer = new BufferedWriter(new FileWriter(archivo));
                miBuffer.write(texto);
                miBuffer.close();
            }
            result =  true;
        } catch (IOException ex) {
            System.out.println("Error IOException en escribe()\n" + ex.toString());
        }
        return result;
    }
    
}
