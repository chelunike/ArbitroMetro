package ventanas;

import arbitrometro.*;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.time.format.DateTimeFormatter;
import javax.swing.*;

/**
 * @author chelunike
 */
public class VentanaPrincipal extends javax.swing.JFrame {

   //Atributos
    private Liga liga;
    private int index;
    
    //Constructor
    public VentanaPrincipal(Liga l) {
        liga = l;
        index = 0;
        
        // Inicializacon de la ventana
        initComponents();
        this.setLocationRelativeTo(null);
        
        if(l.numJornadas()>0)
            this.actualizaJornada(l.getJornada(index));
        else
            sinJornada();
    }

    /**
     * Codigo generado
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelJornadas = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jButtonAdelante = new javax.swing.JButton();
        jButtonAtras = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonNueva = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        jPanelJornada = new javax.swing.JPanel();
        jButtonEliminar = new javax.swing.JButton();
        jPanelBotones = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("ArbitroMetro :)");
        setMinimumSize(new java.awt.Dimension(550, 500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Titulo");

        jLabelFecha.setText("Fecha:");

        jButtonAdelante.setText(">");
        jButtonAdelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdelanteActionPerformed(evt);
            }
        });

        jButtonAtras.setText("<");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonNueva.setText("Nueva");
        jButtonNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevaActionPerformed(evt);
            }
        });

        jScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanelJornada.setLayout(new java.awt.GridBagLayout());
        jScrollPane.setViewportView(jPanelJornada);

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelJornadasLayout = new javax.swing.GroupLayout(jPanelJornadas);
        jPanelJornadas.setLayout(jPanelJornadasLayout);
        jPanelJornadasLayout.setHorizontalGroup(
            jPanelJornadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJornadasLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelJornadasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jButtonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jButtonNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonAdelante, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(jPanelJornadasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane)
                .addContainerGap())
        );
        jPanelJornadasLayout.setVerticalGroup(
            jPanelJornadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJornadasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelJornadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addGap(24, 24, 24)
                .addGroup(jPanelJornadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelJornadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelJornadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonAdelante, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jButton1.setText("Equipos ");

        jButton2.setText("Clasificacion");

        javax.swing.GroupLayout jPanelBotonesLayout = new javax.swing.GroupLayout(jPanelBotones);
        jPanelBotones.setLayout(jPanelBotonesLayout);
        jPanelBotonesLayout.setHorizontalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBotonesLayout.setVerticalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelJornadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jPanelJornadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Eventos
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // Event Exit xd
        int s = JOptionPane.showConfirmDialog(this, 
                    "¿Seguro que quieres salir :( ?", "Y se marcho", 
                    JOptionPane.YES_NO_OPTION);
        if(s == 0)
            System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    private void jButtonAdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdelanteActionPerformed
        // Adelante
        System.out.println("Avanty");
        if(index+1 < liga.numJornadas())
            index++;
        else
            index = 0;
        this.actualizaJornada(liga.getJornada(index));
        System.out.println(""+index);
    }//GEN-LAST:event_jButtonAdelanteActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        // Atras
        System.out.println("R");
        if(index-1 >= 0)
            index--;
        else
            index = liga.numJornadas()-1;
        this.actualizaJornada(liga.getJornada(index));
        System.out.println(""+index);
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jButtonNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevaActionPerformed
        // Nueva Jornada
        NuevaJornada nj = new NuevaJornada(this, liga);
        nj.setVisible(true);
        if(nj.getJornada() != null)
            liga.addJornada(nj.getJornada());
        if(liga.numJornadas()>0){
            index = 0;
            actualizaJornada(liga.getJornada(index));
        }
    }//GEN-LAST:event_jButtonNuevaActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // Editar Jornada
        new VentanaPatidos(this, true, liga, index);
        
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        // Eliminar Jornada
        int s = JOptionPane.showConfirmDialog(this, 
                    "¿Seguro que quieres eliminar la Jornada:"+liga.getJornada(index)+" ?", ":(", 
                    JOptionPane.YES_NO_OPTION);
        if(s == 0)
            liga.eliminarJornada(index);
        if(liga.numJornadas()>0){
            index = 0;
            actualizaJornada(liga.getJornada(index));
        }else
            sinJornada();
    }//GEN-LAST:event_jButtonEliminarActionPerformed


    // Metodos
    public void sinJornada(){
        enableBotones(false);
    }
    
    public void actualizaJornada(Jornada j){
        enableBotones(true);
        jPanelJornada.removeAll();
        repaint();
        System.out.println("Actualizando Jornada");
        
        jLabelTitulo.setText( j.getTitle());
        jLabelFecha.setText("Fecha: "+j.getFecha().format(DateTimeFormatter.ISO_DATE));
        
        String[] head = {"Local", "Goles", " - ", "Goles", "Visitante"};
        String[] row = new String[5];
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0.9;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(0, 5, 10, 5);
        gbc.ipadx = 5;
        gbc.ipady = 5;
        gbc.gridx=0;
        gbc.gridy=0;
        
        for(String col: head){
            jPanelJornada.add(new JLabel(col), gbc);
            gbc.gridx++;
        }
        gbc.gridy++;
        gbc.gridx=0;
        gbc.weighty=100;
        for(Partido p:j.getPartidos()){
            row[0] = p.getEquipo1().toString();
            row[1] = ""+p.getNumGoles1();
            row[2] = " - ";
            row[3] = ""+p.getNumGoles2();
            row[4] = p.getEquipo2().toString();
            
            for(String col: row){
                jPanelJornada.add(new JLabel(col), gbc);
                gbc.gridx++;
            }
            gbc.weighty*=100;
            gbc.gridx = 0;
            gbc.gridy++;
        }
        pack();
    }
    
    public void enableBotones(boolean c){
        jButtonAdelante.setEnabled(c);
        jButtonAtras.setEnabled(c);
        jButtonEditar.setEnabled(c);
        jButtonEliminar.setEnabled(c);
        if(!c){
            jLabelFecha.setText("");
            jLabelTitulo.setText("");
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAdelante;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonNueva;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelJornada;
    private javax.swing.JPanel jPanelJornadas;
    private javax.swing.JScrollPane jScrollPane;
    // End of variables declaration//GEN-END:variables
}
