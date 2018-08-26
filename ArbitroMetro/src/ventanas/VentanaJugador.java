package ventanas;

import arbitrometro.Jugador;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 * @author chelunike
 */
public class VentanaJugador extends javax.swing.JDialog {
    //Atributos
    private Jugador jugador;
    
    //Constructor
    public VentanaJugador(java.awt.Frame parent, Jugador j) {
        super(parent, true);
        jugador = j;
        
        //Inicializacion Componentes
        initComponents();
        setLocationRelativeTo(parent);
        
        if(jugador != null){
            setTitle("Editar Jugador");
            actualizaJugador();
        }else
            setTitle("Nuevo Jugador");
        
        this.setVisible(true);
    }

    /**
     * Codigo Generado
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNombre = new javax.swing.JLabel();
        jLabelApellidos = new javax.swing.JLabel();
        jLabelFecNac = new javax.swing.JLabel();
        jLabelLugNac = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellidos = new javax.swing.JTextField();
        jTextFieldFecNac = new javax.swing.JTextField();
        jTextFieldLugNac = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabelNombre.setText("Nombre");

        jLabelApellidos.setText("Apellidos");

        jLabelFecNac.setText("Fecha Nacimiento");

        jLabelLugNac.setText("Lugar Nacimiento");

        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });

        jTextFieldApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApellidosActionPerformed(evt);
            }
        });

        jTextFieldFecNac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFecNacActionPerformed(evt);
            }
        });

        jTextFieldLugNac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLugNacActionPerformed(evt);
            }
        });

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelApellidos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelFecNac, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(jLabelNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelLugNac, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNombre)
                    .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(jTextFieldFecNac, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(jTextFieldLugNac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFecNac, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldFecNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLugNac, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLugNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //Eventos
    
    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // Nombre
        jTextFieldApellidos.requestFocus();
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextFieldApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApellidosActionPerformed
        // Apellidos
        jTextFieldFecNac.requestFocus();
    }//GEN-LAST:event_jTextFieldApellidosActionPerformed

    private void jTextFieldFecNacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFecNacActionPerformed
        // Fecha de Nacimiento
        jTextFieldLugNac.requestFocus();
    }//GEN-LAST:event_jTextFieldFecNacActionPerformed

    private void jTextFieldLugNacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLugNacActionPerformed
        // Lugar de Nacimiento
        jButtonGuardar.requestFocus();
    }//GEN-LAST:event_jTextFieldLugNacActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        // Guardar
        boolean c = false;
        LocalDate fecha=null;
        
        if(jTextFieldNombre.getText().isEmpty()){
            System.out.println("No se admite nombre vacio");
            JOptionPane.showMessageDialog(this, 
                    "Error: Nombre no introducido\n Introduce un nombre ", "Tampoco es tanto :v", 
                    JOptionPane.ERROR_MESSAGE);
        }else
            c = true;
        try{
            fecha = LocalDate.parse(jTextFieldFecNac.getText(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        }catch(java.time.format.DateTimeParseException e){
            JOptionPane.showMessageDialog(this, 
                    "Error: Fecha no valida\n Formato: día-mes-año ", ":v", 
                    JOptionPane.ERROR_MESSAGE);
            c = false;
        }
        
        if(c){
            jugador = new Jugador(jTextFieldNombre.getText(), fecha);
            jugador.setApellidos(jTextFieldApellidos.getText());
            jugador.setLugarNaci(jTextFieldLugNac.getText());
            this.setVisible(false);
            System.out.println(jugador.toString());
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // Cancelar
        int s = JOptionPane.showConfirmDialog(this, 
                    "¿Seguro que quieres salir sin guardar?", "Y se marcho", 
                    JOptionPane.YES_NO_OPTION);
        if(s == 0){
            jugador = null;
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // Salir
        int s = JOptionPane.showConfirmDialog(this, 
                    "¿Seguro que quieres salir sin guardar?", "Y se marcho", 
                    JOptionPane.YES_NO_OPTION);
        if(s == 0){
            jugador = null;
            this.setVisible(false);
        }
    }//GEN-LAST:event_formWindowClosing

    
    //Metodos
    public Jugador getJugador(){
        return jugador;
    }
    
    
    public void actualizaJugador(){
        jTextFieldNombre.setText(jugador.getNombre());
        jTextFieldApellidos.setText(jugador.getApellidos());
        jTextFieldFecNac.setText(jugador.getFechaNaci().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        jTextFieldLugNac.setText(jugador.getLugarNaci());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JLabel jLabelApellidos;
    private javax.swing.JLabel jLabelFecNac;
    private javax.swing.JLabel jLabelLugNac;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldFecNac;
    private javax.swing.JTextField jTextFieldLugNac;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
