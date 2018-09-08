package ventanas;

import arbitrometro.Liga;
import herramientas.IO;
import herramientas.Serializacion;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * @author chelunike
 */
public class NuevaLiga extends javax.swing.JFrame {
    //Atributos
    
    //Constructor
    public NuevaLiga() {
        
        // Inicializacion Componentes
        initComponents();
        setLocationRelativeTo(null);
        jPanelDatos.setVisible(false);
        
    }

    // Generated Code
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelArchivo = new javax.swing.JLabel();
        jLabelNomLiga = new javax.swing.JLabel();
        jTextNomLiga = new javax.swing.JTextField();
        jTextArchivo = new javax.swing.JTextField();
        jButtonAbrir = new javax.swing.JButton();
        jCheckBoxDatos = new javax.swing.JCheckBox();
        jLabelDatos = new javax.swing.JLabel();
        jPanelDatos = new javax.swing.JPanel();
        jLabelTituloDatos = new javax.swing.JLabel();
        jTextDatos = new javax.swing.JTextField();
        jButtonAbrirDatos = new javax.swing.JButton();
        jLabelOrigen = new javax.swing.JLabel();
        jLabelImportar = new javax.swing.JLabel();
        jCheckBoxEquipos = new javax.swing.JCheckBox();
        jCheckBoxJornadas = new javax.swing.JCheckBox();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Nueva liga :)");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Nueva Liga");

        jLabelArchivo.setText("Archivo: ");

        jLabelNomLiga.setText("Nombre de la Liga:");

        jButtonAbrir.setText("Guardar");
        jButtonAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbrirActionPerformed(evt);
            }
        });

        jCheckBoxDatos.setText("Importar datos");
        jCheckBoxDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxDatosActionPerformed(evt);
            }
        });

        jLabelDatos.setText("Importar datos: Implica crear la Liga a partir de los datos de otra. Ej: A partir de los Equipos de una hacer otra :)");

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabelArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAbrir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelNomLiga, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextNomLiga, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jCheckBoxDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomLiga, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextNomLiga))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxDatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabelTituloDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTituloDatos.setText("Importar Datos");

        jButtonAbrirDatos.setText("Abrir");
        jButtonAbrirDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbrirDatosActionPerformed(evt);
            }
        });

        jLabelOrigen.setText("Origen:");

        jLabelImportar.setText("Datos a Importar:");

        jCheckBoxEquipos.setText("Equipos");

        jCheckBoxJornadas.setText("Jornadas");

        javax.swing.GroupLayout jPanelDatosLayout = new javax.swing.GroupLayout(jPanelDatos);
        jPanelDatos.setLayout(jPanelDatosLayout);
        jPanelDatosLayout.setHorizontalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTituloDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addComponent(jLabelOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAbrirDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelImportar, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                .addComponent(jCheckBoxEquipos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jCheckBoxJornadas))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelDatosLayout.setVerticalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTituloDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAbrirDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelImportar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxEquipos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxJornadas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCancelar)
                .addGap(18, 18, 18)
                .addComponent(jButtonAceptar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAceptar)
                    .addComponent(jButtonCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // --- Eventos ----
    
    private void jButtonAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbrirActionPerformed
        // Abrir Archivo Liga
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de liga", "liga");
        fc.setFileFilter(filtro);
        String ruta="";
        boolean resultado=true;
        
        if(fc.showSaveDialog(null)==fc.APPROVE_OPTION){
            ruta = fc.getSelectedFile().getAbsolutePath();
            if(ruta.lastIndexOf(".liga")==-1)
                ruta += ".liga";
        }
        jTextArchivo.setText(ruta);
    }//GEN-LAST:event_jButtonAbrirActionPerformed

    private void jButtonAbrirDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbrirDatosActionPerformed
        // Abrir Archivo Datos
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de liga", "liga");
        fc.setFileFilter(filtro);
        String ruta="";
        boolean resultado=true;
        
        if(fc.showOpenDialog(null)==fc.APPROVE_OPTION){
            ruta = fc.getSelectedFile().getAbsolutePath();
            if(ruta.lastIndexOf(".liga")==-1)
                ruta += ".liga";
            try{
                Liga l = (Liga)Serializacion.desSerializaObjeto(ruta);
            }catch(Exception e){
                System.out.println("Error al abrir datos "+e);
                JOptionPane.showMessageDialog(this, "Error al abrir el archivo liga", "Error :(", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        jTextDatos.setText(ruta);
    }//GEN-LAST:event_jButtonAbrirDatosActionPerformed

    private void jCheckBoxDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxDatosActionPerformed
        // CheckBos Datos
        jPanelDatos.setVisible(jCheckBoxDatos.isSelected());
    }//GEN-LAST:event_jCheckBoxDatosActionPerformed

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        // Aceptar
        if(jTextNomLiga.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "No se puede dejar el nombre en blanco", "Error :(", JOptionPane.ERROR_MESSAGE);
        else if(jTextArchivo.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "Es necesario indicar el archivo \n donde se almacenará", "Error :(", JOptionPane.ERROR_MESSAGE);
        else if(jCheckBoxDatos.isSelected() && jTextDatos.getText().isEmpty())
            JOptionPane.showMessageDialog(this, 
                        "Debe indicarse el nombre de archivo del que importar los datos", "Error :(", JOptionPane.ERROR_MESSAGE);
        else{
            if(crearLiga()){
                JOptionPane.showMessageDialog(this, "Liga creada Correctamente \n"
                        + "Ya solo hay que abrir el archivo y a pasar el rato :)", "A jugar :D", JOptionPane.INFORMATION_MESSAGE);
                this.setVisible(false);
            }else
                JOptionPane.showMessageDialog(this, "Error al crear liga", "Error :(", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // Cancelar
        formWindowClosing(null);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // Salir
        int s = JOptionPane.showConfirmDialog(this, 
                    "¿Seguro que quieres salir sin guardar ?", "Y se marcho", 
                    JOptionPane.YES_NO_OPTION);
        if(s == 0)
            this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing

    
    //Metodoss
    
    public boolean crearLiga(){
        //Obtenemos Los datos
        String nombre = jTextNomLiga.getText();
        String ruta = jTextArchivo.getText();
        
        //Creamos la liga :)
        Liga liga = new Liga(nombre);
        
        if(jCheckBoxDatos.isSelected()){
            Liga datos = (Liga)Serializacion.desSerializaObjeto(jTextDatos.getText());
            if(jCheckBoxEquipos.isSelected())
                liga.setEquipos(datos.getEquipos());
            if(jCheckBoxJornadas.isSelected())
                liga.setJornadas(datos.getJornadas());
        }
        
        try{
            Serializacion.serializarObjeto(liga, ruta);
        }catch(Exception e){
            System.out.println("Error al Serializar nueva liga: "+e);
            return false;
        }
        return true;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAbrir;
    private javax.swing.JButton jButtonAbrirDatos;
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JCheckBox jCheckBoxDatos;
    private javax.swing.JCheckBox jCheckBoxEquipos;
    private javax.swing.JCheckBox jCheckBoxJornadas;
    private javax.swing.JLabel jLabelArchivo;
    private javax.swing.JLabel jLabelDatos;
    private javax.swing.JLabel jLabelImportar;
    private javax.swing.JLabel jLabelNomLiga;
    private javax.swing.JLabel jLabelOrigen;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTituloDatos;
    private javax.swing.JPanel jPanelDatos;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JTextField jTextArchivo;
    private javax.swing.JTextField jTextDatos;
    private javax.swing.JTextField jTextNomLiga;
    // End of variables declaration//GEN-END:variables
}
