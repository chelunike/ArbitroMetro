/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herramientas;

import com.opencsv.CSVWriter;
import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Antonio
 */
public class IO {
    
    static final String ANSI_CODI = "Cp1252";

    public static String lee(String ruta) {

        FileReader entrada = null;
        String cadena = "";
        try {

            entrada = new FileReader(ruta);
            BufferedReader miBuffer = new BufferedReader(entrada);
//            reader = new BufferedReader(new InputStreamReader(new FileInputStream(csvFile), ANSI_CODI));

            while ((cadena = miBuffer.readLine()) != null) {
                cadena += miBuffer.readLine();
            }
            miBuffer.close();

        } catch (FileNotFoundException ex) {
            System.out.println("No se  ha encontrado el archivo.");
        } catch (IOException ex) {
            System.out.println("Error de lectura. " + ex.getMessage());
        }

        return "";
    }

    public static void escribe(String nombre, String texto) {

        File archivo = new File(nombre);
        try {

            BufferedWriter miBuffer;
            if (archivo.exists()) {
                int opcion = JOptionPane.showConfirmDialog(null,
                        "El fichero ya existe. ¿Desea sobreescribirlo?", "Alerta",
                        JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

                if (opcion == 0) {
                    miBuffer = new BufferedWriter(new FileWriter(archivo));
                    miBuffer.write(texto);
                } else {
                    return;
                }
            } else {
                miBuffer = new BufferedWriter(new FileWriter(archivo));
                //writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo), ANSI_CODI));
                miBuffer.write(texto);
            }
            miBuffer.close();

        } catch (IOException ex) {
            //Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error IOException en escribe()\n" + ex.toString());
        }
    }

    public static void escribeCsv(String nombre, Object datos) {

        try {
            //Creo mi lista de países (los sacaría de algún lado, aquí los creamos a mano para el ejemplo)
            String [] pais = {"ESPAÑA", "ES", "ESP", "724", "Yes"};
            
            CSVWriter writer = new CSVWriter(new FileWriter(nombre));
            
            writer.writeNext(pais);
            
            writer.close();
        } catch (IOException ex) {
            //Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error csv:\n" + ex);
        }
    }

}
