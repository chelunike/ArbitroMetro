/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herramientas;

import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import javax.swing.JTable;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

/**
 * @author yo
 */
public class Tabla {
    //Atributos 
    private JTable tabla;
    private String[] cabecera;
    private String[][] datos;
    private boolean editable=true;
    private DefaultTableModel modelo; 
    private TableModelListener eventos;
    
    //Constructores
    public Tabla(){
        modelo = new DefaultTableModel();
        tabla = new JTable();
    }
    
    public Tabla(String[] cabecera, String[][] datos){
        this.cabecera = cabecera;
        this.datos = datos;
        modelo = new DefaultTableModel(datos, cabecera);
        tabla = new JTable(modelo);
    }
    
    private void initTabla(){
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        modelo.addTableModelListener(eventos);
        tabla.setModel(modelo);
    }
    
    //Metodos
    public JTable getTabla(){
        return tabla;
    }
    
    public boolean rentablaLaTabla(String[] cabecera, String[][] datos){
        boolean s = true;
        this.cabecera = cabecera;
        this.datos = datos;
        try{
            /*
            int l = modelo.getRowCount();
            for(int n:new int[l])
                modelo.removeRow(n);
            modelo.addRow(cabecera);
            for(int i=0; i<datos.length; i++)
                modelo.addRow(datos[i]);
            */
            modelo = new DefaultTableModel(datos, cabecera){
                public boolean isCellEditable(int row, int column) {
                    return editable;
                }
            };
            initTabla();
        }catch(Exception e){
            s = false;
        }
        return s;
    }
    
    
    public void setTableChangeListener(TableModelListener oido){
        eventos = oido;
        initTabla();
    }

    public String[] getCabecera() {
        return cabecera;
    }

    public String[][] getDatos() {
        return datos;
    }
    
    public void deleteRow(int row){
        modelo.removeRow(row);
    }
    
    public void insertRow(String[] data){
        modelo.addRow(data);
    }
    
    public String getCellData(int col, int row){
        return modelo.getValueAt(row, col)!=null?modelo.getValueAt(row, col).toString():"";
    }
    
    public void setCellData(int col, int row, String data){
        datos[row][col] = data;
    }
    
    public int getSelectedRow(){
        return tabla.getSelectedRow();
    }
    
    public void setResaizable(boolean c){
        if(c)
            tabla.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
        else
            tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    }
    
    public void setEditable(boolean c){
        editable = c;
        rentablaLaTabla(cabecera, datos);
    }
    
    public void addMouseListener(MouseListener l){
        tabla.addMouseListener(l);
    }
    
    public void addKeyListener(KeyListener l){
        tabla.addKeyListener(l);
    }
    
    public boolean empty(){
        return datos.length==0;
    }
    
    public boolean addRow(int previousRow){
        if(empty())
            datos = new String[1][cabecera.length];
        else if(previousRow>=-1 && previousRow<datos.length){
            String[][] datosNew = new String[this.datos.length+1][cabecera.length];
            for(int i=0; i<datosNew.length; i++)
                if(i!=previousRow)
                    if(i<previousRow)
                        datosNew[i] = datos[i];
                    else
                        datosNew[i] = datos[i-1];
            
//            if(previousRow>-1 && !empty()){
//                for(int i=0; i<=previousRow; i++){
//                    for(int j=0; j<cabecera.length; j++)
//                        datosNew[i][j]=datos[i][j];
//                }
//            }
//            if(empty())
//                datos = new String[1][cabecera.length];
//            else
//                for(int i=previousRow+1; i<datosNew.length;i++)
//                    for(int j=0; j<cabecera.length; j++)
//                            datosNew[i][j]=datos[i-1][j];
            datos = datosNew;
            rentablaLaTabla(cabecera, datos);
            return true;
        }
        return false;
    }
    
    public void avanzaAdelante(){
        int n=getSelectedRow()+1;
        if(n>=datos.length)
            n=0;
        if(!empty())
            tabla.setRowSelectionInterval(n, n);
    }
    
    public void avanzaAtras(){
        int n=getSelectedRow()-1;
        if(n<0)
            n=datos.length-1;
        if(!empty())
            tabla.setRowSelectionInterval(n, n);
    }
    
    public void avanceInicio(){
        if(!empty())
            tabla.setRowSelectionInterval(0, 0);
    }
    
    public void avanceFin(){
        if(!empty())
            tabla.setRowSelectionInterval(datos.length-1, datos.length-1);
    }
    
    public void selectRow(int index){
        if(index>-1 && index<datos.length && !empty())
            tabla.setRowSelectionInterval(index, index);
    }
    
    public int size(){
        return datos.length;
    }
    
    public String toString(){
        String s="";
        for(String[] line:datos){
            for(String p:line)
                s+=p+"\t";
            s+="\n";
        }
        return s;
    }
    
    
}
