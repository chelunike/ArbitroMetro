package herramientas;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class Serializacion {
    
    //Atributos
    private ArrayList<Object> lista;
    
    
    //Constructor
    public Serializacion(){
        lista = new ArrayList<>();
    }
    
    public Serializacion(ArrayList<Object> lista){
        this.lista=lista;
    }
    
    public boolean serializa(String ruta){
        return serializarObjeto(lista, ruta);
    }
    
    public static ArrayList<Object> desSerializa(String ruta){
        try{
            ArrayList<Object> lista = (ArrayList)desSerializaObjeto(ruta);
            return lista;
        }catch(Exception e){
            System.out.println("Error desSerializacion: "+e);
            return null;
        }
    }
    
    //   --  --- Metodos Estaticos de Serializacion ---   --
    public static boolean serializarObjeto(Object data, String ruta) {
        try {
            // Serialización sin cabeceras
            //ObjectOutputStream objetoSalida = new ObjectOutputStream(new FileOutputStream(ruta, true)) {
            //    protected void writeStreamHeader() throws IOException {
            //        reset();
            //    }
            //};
            
            File archivo = new File(ruta);
            // Serializacion normal
            ObjectOutputStream objetoSalida = new ObjectOutputStream(new FileOutputStream(archivo, false));
            objetoSalida.writeObject(data);
            objetoSalida.close();
            return true;
        } catch (IOException e) {
            System.err.println("Error de Escritura: " + e);
            return false;
        }
    }

    public static Object desSerializaObjeto(String ruta) {
        Object aux = null;
        File archivo = new File(ruta);
        if (archivo.exists()) {
            ObjectInputStream ois = null;
            try {
                // Serialización sin cabeceras 
                //ois = new ObjectInputStream(new FileInputStream(archivo)) {
                //    protected void readStreamHeader() throws IOException {  
                //    }
                //};
                ois = new ObjectInputStream(new FileInputStream(archivo));
                aux = ois.readObject();
                ois.close();
            } catch (ClassNotFoundException ex) {
                System.out.println("No se encuentra clase");
                return null;
            } catch (EOFException x) {
                System.out.println("Fin del Fichero");
                return null;
            } catch (IOException ex) {
                System.err.println("Error Deserializa Objeto: " + ex.getMessage());
                return null;
            }
        }
        return aux;
    }
    
    
}
