package ventanas;

import arbitrometro.*;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

/**
 * @author chelunike
 */
public class VentanaEquipos extends javax.swing.JFrame {
    //Atributos
    private Liga liga;
    private int index;
    private ArrayList<JCheckBox> jugadoresSelect;
    
    //Constructor
    public VentanaEquipos(Liga liga) {
        this.liga = liga;
        
        jugadoresSelect = new ArrayList<>();
        
        // Inicializacion Ventana
        initComponents();
        setLocationRelativeTo(null);
        actualizaListaEquipos();
        
        //Inicializacion del equipo
        if(liga.getEquipos().size()>0){
            index=0;
            jListEquipos.setSelectedIndex(index);
            actualizaEquipo(liga.getEquipo(index));
        }else
            enabledEquipo(false);
        
        this.setVisible(true);
    }

    /**
     * Generated Code
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPanelEquipos = new javax.swing.JScrollPane();
        jListEquipos = new javax.swing.JList<>();
        jButtonAddEquipo = new javax.swing.JButton();
        jButtonRemoveEquipo = new javax.swing.JButton();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelCapitan = new javax.swing.JLabel();
        jComboBoxCapi = new javax.swing.JComboBox<>();
        jLabelTelefono = new javax.swing.JLabel();
        jTextFieldTelefono = new javax.swing.JTextField();
        jLabelCorreo = new javax.swing.JLabel();
        jTextFieldCorreo = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jScrollPaneJugadores = new javax.swing.JScrollPane();
        jPanelJugadores = new javax.swing.JPanel();
        jButtonAddJugador = new javax.swing.JButton();
        jButtonRemoveJugador = new javax.swing.JButton();
        jLabelJugadores = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Administrar Equipos");
        setMinimumSize(new java.awt.Dimension(385, 530));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jListEquipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListEquiposMouseClicked(evt);
            }
        });
        jListEquipos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jListEquiposKeyPressed(evt);
            }
        });
        jScrollPanelEquipos.setViewportView(jListEquipos);

        jButtonAddEquipo.setText("Añadir");
        jButtonAddEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddEquipoActionPerformed(evt);
            }
        });

        jButtonRemoveEquipo.setText("Eliminar");
        jButtonRemoveEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveEquipoActionPerformed(evt);
            }
        });

        jLabelNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombre.setText("Nombre");

        jLabelCapitan.setText("Capitan");

        jLabelTelefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTelefono.setText("Telefono/s");

        jLabelCorreo.setText("Correo");

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jPanelJugadores.setLayout(new java.awt.GridBagLayout());
        jScrollPaneJugadores.setViewportView(jPanelJugadores);

        jButtonAddJugador.setText("Añadir");
        jButtonAddJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddJugadorActionPerformed(evt);
            }
        });

        jButtonRemoveJugador.setText("Eliminar");
        jButtonRemoveJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveJugadorActionPerformed(evt);
            }
        });

        jLabelJugadores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelJugadores.setText("Jugadores");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPanelEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonAddEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonRemoveEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneJugadores, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNombre)
                            .addComponent(jTextFieldTelefono))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelCapitan, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxCapi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCorreo))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabelJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(166, 166, 166)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonAddJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonRemoveJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCapitan, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxCapi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelJugadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPaneJugadores))
                    .addComponent(jScrollPanelEquipos, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonAddJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonRemoveJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonAddEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonRemoveEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // --- Eventos ---
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // Cerrar Ventana
        this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing

    private void jListEquiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListEquiposMouseClicked
        // Lista Mouse Clicked
        listaEquiposSelect();
    }//GEN-LAST:event_jListEquiposMouseClicked

    private void jListEquiposKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jListEquiposKeyPressed
        // Lista Key Press
        listaEquiposSelect();
    }//GEN-LAST:event_jListEquiposKeyPressed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        // Guardar Equipo
        Equipo e = liga.getEquipo(index);
        if(!jTextFieldNombre.getText().isEmpty()){
            e.setNombre(jTextFieldNombre.getText());
            e.setCorreo(jTextFieldCorreo.getText());
            e.setTelefono(jTextFieldTelefono.getText());
            int i = e.buscaJugador((String) jComboBoxCapi.getSelectedItem());
            if(i>0)
                e.setCapitan(e.getJugador(i));
            actualizaListaEquipos();
        }else
            JOptionPane.showMessageDialog(this, 
                    "Error: Nombre no introducido\n Introduce un nombre ", "Tampoco es tanto:v", 
                    JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonAddJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddJugadorActionPerformed
        // Añadir Jugador
        VentanaJugador vj = new VentanaJugador(this, null);
        Jugador j = vj.getJugador();
        Equipo e = liga.getEquipo(index);
        if(j!=null){
            e.addJugador(j);
            actualizaJugadores(e);
        }
    }//GEN-LAST:event_jButtonAddJugadorActionPerformed

    private void jButtonRemoveJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveJugadorActionPerformed
        // Eliminar
        Equipo e = liga.getEquipo(index);
        String s = "Jugadores seleccionados: ";
        ArrayList<Integer> borrador = new ArrayList<>();
        for(int i=0; i<jugadoresSelect.size(); i++){
            if(jugadoresSelect.get(i).isSelected()){
                s += e.getJugador(i).getNombre()+", ";
                borrador.add(i);
            }
        }
        int n = JOptionPane.showConfirmDialog(this, 
                    "¿Seguro que quieres borrar al jugador/es?\n"+s, "Y se fue", 
                    JOptionPane.YES_NO_OPTION);
        if(n == 0)
            for(int j:borrador)
                e.eliminarJugador(e.getJugador(j));
        actualizaJugadores(e);
    }//GEN-LAST:event_jButtonRemoveJugadorActionPerformed

    private void jButtonAddEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddEquipoActionPerformed
        // Añadir Equipoç
        Equipo e = new Equipo("Equipo "+(liga.getEquipos().size()+1));
        if(liga.getEquipos().size()<=0)
            index=0;
        liga.addEquipo(e);
        actualizaEquipo(liga.getEquipo(index));
        
        actualizaListaEquipos();
    }//GEN-LAST:event_jButtonAddEquipoActionPerformed

    private void jButtonRemoveEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveEquipoActionPerformed
        // Eliminar Equipo
        Equipo e = liga.getEquipo(index);
        int n = JOptionPane.showConfirmDialog(this, 
                    "¿Seguro que quieres borrar al equipo "+e.getNombre()+" ?\n", "Y uno menos", 
                    JOptionPane.YES_NO_OPTION);
        if(n == 0){
            liga.eliminarEquipo(e);
            if(liga.getEquipos().size()>0){
                index=0;
                jListEquipos.setSelectedIndex(index);
                actualizaEquipo(liga.getEquipo(index));
            }else
                enabledEquipo(false);
            actualizaListaEquipos();
        }
    }//GEN-LAST:event_jButtonRemoveEquipoActionPerformed
    
    
    public void listaEquiposSelect(){
        index = jListEquipos.getSelectedIndex();
        //System.out.println("Index: "+index+" Value "+jListEquipos.getSelectedValue());
        actualizaEquipo(liga.getEquipo(index));
    }
    
    //Metodos
    
    public void actualizaListaEquipos(){
        jListEquipos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = VentanaEquipos.this.liga.getArrayEquipos();
            public int getSize() { return strings.length; }
            public String getElementAt(int i) {   return strings[i];    }
        });
        pack();
    }
    
    public void actualizaEquipo(Equipo e){
        enabledEquipo(true);
        jTextFieldCorreo.setText(e.getCorreo());
        jTextFieldNombre.setText(e.getNombre());
        jTextFieldTelefono.setText(e.getTelefono());
        
        actualizaJugadores(e);
    }
    
    public void actualizaJugadores(Equipo e){
        jugadoresSelect = new ArrayList<>();
        jButtonRemoveJugador.setEnabled(!e.getJugadores().isEmpty());
        
        jComboBoxCapi.removeAllItems(); 
        for(Jugador j: e.getJugadores())
            jComboBoxCapi.addItem(j.getNombre());
        jComboBoxCapi.setSelectedItem(e.getCapitan().getNombre());
        
        jPanelJugadores.removeAll();
        
        String[] head = {"", "Nombre", "Apellidos", "FechaNac", "LugarNac", "Editar"};
        
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
            jPanelJugadores.add(new JLabel(col), gbc);
            gbc.gridx++;
        }
        gbc.gridy++;
        gbc.gridx=0;
        gbc.weighty=100;
        for(Jugador j: e.getJugadores()){
            JButton editBt = new JButton("Edit");
            JCheckBox select = new JCheckBox();
            editBt.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    VentanaEquipos.this.editarJugador(j);
                }
            });
            jugadoresSelect.add(select);
            
            jPanelJugadores.add(select, gbc);
            gbc.gridx++;
            jPanelJugadores.add(new JLabel(j.getNombre()), gbc);
            gbc.gridx++;
            jPanelJugadores.add(new JLabel(j.getApellidos()), gbc);
            gbc.gridx++;
            jPanelJugadores.add(new JLabel(j.getFechaNaci().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))), gbc);
            gbc.gridx++;
            jPanelJugadores.add(new JLabel(j.getLugarNaci()), gbc);
            gbc.gridx++;
            jPanelJugadores.add(editBt, gbc);
            
            gbc.weighty*=100;
            gbc.gridx = 0;
            gbc.gridy++;
        }
        repaint();
        pack();
    }
    
    public void editarJugador(Jugador j){
        Equipo e = liga.getEquipo(index);
        int i = e.buscaJugador(j.getNombre());
        VentanaJugador vj = new VentanaJugador(this, j);
        
        if(vj.getJugador()!=null){
            e.setJugador(i, vj.getJugador());
            actualizaJugadores(e);
        }
    }
    
    public void enabledEquipo(boolean e){
        jButtonAddJugador.setEnabled(e);
        jButtonRemoveJugador.setEnabled(e);
        jButtonGuardar.setEnabled(e);
        jButtonRemoveEquipo.setEnabled(e);
        jTextFieldCorreo.setEnabled(e);
        jTextFieldNombre.setEnabled(e);
        jTextFieldTelefono.setEnabled(e);
        jComboBoxCapi.setEnabled(e);
        if(!e){
            jTextFieldCorreo.setText("");
            jTextFieldNombre.setText("");
            jTextFieldTelefono.setText("");
            jPanelJugadores.removeAll();
            jComboBoxCapi.removeAllItems();
        }
        repaint();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddEquipo;
    private javax.swing.JButton jButtonAddJugador;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonRemoveEquipo;
    private javax.swing.JButton jButtonRemoveJugador;
    private javax.swing.JComboBox<String> jComboBoxCapi;
    private javax.swing.JLabel jLabelCapitan;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelJugadores;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JList<String> jListEquipos;
    private javax.swing.JPanel jPanelJugadores;
    private javax.swing.JScrollPane jScrollPaneJugadores;
    private javax.swing.JScrollPane jScrollPanelEquipos;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
