package ventanas;

import arbitrometro.*;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.time.format.DateTimeFormatter;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * @author chelunike
 */
public class VentanaPatidos extends javax.swing.JFrame {
    //Atributos
    private Liga liga;
    private Jornada jornada;
    
    private int index;
    private boolean load;
    
    private int selectionIndex1;
    private int selectionIndex2;
    private int selectionIndexT1;
    private int selectionIndexT2;
    
    //Constructor
    public VentanaPatidos(java.awt.Frame parent, boolean modal, Liga l, int index) {
       // super(parent, modal);
        liga = l;
        jornada = l.getJornada(index);
        index = 0;
        
        load = true;
        //Inicializacion de Componentes
        initComponents();
        setLocationRelativeTo(parent);
        setTitle(jornada.getTitle()+" | Administrador Jornadas | Fecha: "+
                jornada.getFecha().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        
        if(jornada.numPartidos() > 0)
            actualizaPartido(jornada.getPartido(index));
        else
            sinPartido();
        
        this.setVisible(true);
        load = false;
    }

    /**
     * Codigo Generado
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinnerGoles = new javax.swing.JSpinner();
        jComBoxEquipo1 = new javax.swing.JComboBox<>(liga.getArrayEquipos());
        jComBoxEquipo2 = new javax.swing.JComboBox<>(liga.getArrayEquipos());
        jLabelVS = new javax.swing.JLabel();
        jLabelGoles1 = new javax.swing.JLabel();
        jLabelGoles2 = new javax.swing.JLabel();
        jButtonGoles1Add = new javax.swing.JButton();
        jButtonGoles1Remove = new javax.swing.JButton();
        jButtonGoles2Remove = new javax.swing.JButton();
        jButtonGoles2Add = new javax.swing.JButton();
        jScrollPaneEquipo1 = new javax.swing.JScrollPane();
        jPanelEquipo1 = new javax.swing.JPanel();
        jScrollPaneEquipo2 = new javax.swing.JScrollPane();
        jPanelEquipo2 = new javax.swing.JPanel();
        jLabelTarj1 = new javax.swing.JLabel();
        jLabelTarj2 = new javax.swing.JLabel();
        jScrollPaneTarj1 = new javax.swing.JScrollPane();
        jPanelTarj1 = new javax.swing.JPanel();
        jScrollPaneTarj2 = new javax.swing.JScrollPane();
        jPanelTarj2 = new javax.swing.JPanel();
        jButtonTarj1Add = new javax.swing.JButton();
        jButtonTarj1Remove = new javax.swing.JButton();
        jButtonTarj2Add = new javax.swing.JButton();
        jButtonTarj2Remove = new javax.swing.JButton();
        jPanelBotonera = new javax.swing.JPanel();
        jButtonAdelante = new javax.swing.JButton();
        jButtonAtras = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonNuevo = new javax.swing.JButton();
        jCheckBoxE1 = new javax.swing.JCheckBox();
        jCheckBoxE2 = new javax.swing.JCheckBox();
        jLabelPartido = new javax.swing.JLabel();

        jSpinnerGoles.setMinimumSize(new java.awt.Dimension(31, 38));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(201, 31, 167));
        setMinimumSize(new java.awt.Dimension(315, 325));

        jComBoxEquipo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComBoxEquipo1ActionPerformed(evt);
            }
        });

        jComBoxEquipo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComBoxEquipo2ActionPerformed(evt);
            }
        });

        jLabelVS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVS.setText("vs");

        jLabelGoles1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelGoles1.setText("Goles");

        jLabelGoles2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelGoles2.setText("Goles");

        jButtonGoles1Add.setText("+");
        jButtonGoles1Add.setMaximumSize(new java.awt.Dimension(31, 31));
        jButtonGoles1Add.setMinimumSize(new java.awt.Dimension(31, 31));
        jButtonGoles1Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGoles1AddActionPerformed(evt);
            }
        });

        jButtonGoles1Remove.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jButtonGoles1Remove.setText("-");
        jButtonGoles1Remove.setMaximumSize(new java.awt.Dimension(31, 31));
        jButtonGoles1Remove.setMinimumSize(new java.awt.Dimension(31, 31));
        jButtonGoles1Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGoles1RemoveActionPerformed(evt);
            }
        });

        jButtonGoles2Remove.setText("-");
        jButtonGoles2Remove.setMaximumSize(new java.awt.Dimension(31, 31));
        jButtonGoles2Remove.setMinimumSize(new java.awt.Dimension(31, 31));
        jButtonGoles2Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGoles2RemoveActionPerformed(evt);
            }
        });

        jButtonGoles2Add.setText("+");
        jButtonGoles2Add.setMaximumSize(new java.awt.Dimension(31, 31));
        jButtonGoles2Add.setMinimumSize(new java.awt.Dimension(31, 31));
        jButtonGoles2Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGoles2AddActionPerformed(evt);
            }
        });

        jScrollPaneEquipo1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneEquipo1.setAutoscrolls(true);

        jPanelEquipo1.setAutoscrolls(true);
        jPanelEquipo1.setLayout(new java.awt.GridBagLayout());
        jScrollPaneEquipo1.setViewportView(jPanelEquipo1);

        jScrollPaneEquipo2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneEquipo2.setToolTipText("");
        jScrollPaneEquipo2.setAutoscrolls(true);

        jPanelEquipo2.setAutoscrolls(true);
        jPanelEquipo2.setLayout(new java.awt.GridBagLayout());
        jScrollPaneEquipo2.setViewportView(jPanelEquipo2);

        jLabelTarj1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTarj1.setText("Tarjetas");

        jLabelTarj2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTarj2.setText("Tarjetas");

        jScrollPaneTarj1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanelTarj1.setLayout(new java.awt.GridBagLayout());
        jScrollPaneTarj1.setViewportView(jPanelTarj1);

        jScrollPaneTarj2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanelTarj2.setLayout(new java.awt.GridBagLayout());
        jScrollPaneTarj2.setViewportView(jPanelTarj2);

        jButtonTarj1Add.setText("+");
        jButtonTarj1Add.setMaximumSize(new java.awt.Dimension(31, 31));
        jButtonTarj1Add.setMinimumSize(new java.awt.Dimension(31, 31));
        jButtonTarj1Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTarj1AddActionPerformed(evt);
            }
        });

        jButtonTarj1Remove.setText("-");
        jButtonTarj1Remove.setMaximumSize(new java.awt.Dimension(31, 31));
        jButtonTarj1Remove.setMinimumSize(new java.awt.Dimension(31, 31));
        jButtonTarj1Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTarj1RemoveActionPerformed(evt);
            }
        });

        jButtonTarj2Add.setText("+");
        jButtonTarj2Add.setMaximumSize(new java.awt.Dimension(31, 31));
        jButtonTarj2Add.setMinimumSize(new java.awt.Dimension(31, 31));
        jButtonTarj2Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTarj2AddActionPerformed(evt);
            }
        });

        jButtonTarj2Remove.setText("-");
        jButtonTarj2Remove.setMaximumSize(new java.awt.Dimension(31, 31));
        jButtonTarj2Remove.setMinimumSize(new java.awt.Dimension(31, 31));
        jButtonTarj2Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTarj2RemoveActionPerformed(evt);
            }
        });

        jButtonAdelante.setText(">");
        jButtonAdelante.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAdelante.setMaximumSize(new java.awt.Dimension(50, 50));
        jButtonAdelante.setMinimumSize(new java.awt.Dimension(50, 50));
        jButtonAdelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdelanteActionPerformed(evt);
            }
        });

        jButtonAtras.setText("<");
        jButtonAtras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAtras.setMaximumSize(new java.awt.Dimension(50, 50));
        jButtonAtras.setMinimumSize(new java.awt.Dimension(50, 50));
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonNuevo.setText("Nuevo");
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotoneraLayout = new javax.swing.GroupLayout(jPanelBotonera);
        jPanelBotonera.setLayout(jPanelBotoneraLayout);
        jPanelBotoneraLayout.setHorizontalGroup(
            jPanelBotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotoneraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(jButtonNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(jButtonAdelante, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelBotoneraLayout.setVerticalGroup(
            jPanelBotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotoneraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelBotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdelante, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEliminar)
                    .addComponent(jButtonNuevo))
                .addContainerGap())
        );

        jCheckBoxE1.setText("Ausente");
        jCheckBoxE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxE1ActionPerformed(evt);
            }
        });

        jCheckBoxE2.setText("Ausente");
        jCheckBoxE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxE2ActionPerformed(evt);
            }
        });

        jLabelPartido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPartido.setText("Partido");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPartido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelBotonera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBoxE1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPaneTarj1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTarj1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelGoles1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPaneEquipo1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonTarj1Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonTarj1Add, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonGoles1Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonGoles1Add, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jComBoxEquipo1, javax.swing.GroupLayout.Alignment.LEADING, 0, 264, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addComponent(jLabelVS, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPaneTarj2)
                            .addComponent(jScrollPaneEquipo2)
                            .addComponent(jLabelGoles2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelTarj2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComBoxEquipo2, javax.swing.GroupLayout.Alignment.TRAILING, 0, 264, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonGoles2Add, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonGoles2Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonTarj2Add, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonTarj2Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jCheckBoxE2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComBoxEquipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComBoxEquipo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelVS, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxE1)
                    .addComponent(jCheckBoxE2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelGoles1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabelGoles2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneEquipo2)
                    .addComponent(jScrollPaneEquipo1, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGoles1Add, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGoles1Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGoles2Add, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGoles2Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTarj1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTarj2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneTarj1, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                    .addComponent(jScrollPaneTarj2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonTarj1Add, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTarj1Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTarj2Add, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTarj2Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelBotonera, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    // --- Eventos ---
    
    private void jButtonAdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdelanteActionPerformed
        // Adelante
        if(index+1 < jornada.numPartidos())
            index++;
        else
            index = 0;
        this.actualizaPartido(jornada.getPartido(index));
    }//GEN-LAST:event_jButtonAdelanteActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        // Atras
        if(index-1 >= 0)
            index--;
        else
            index = jornada.numPartidos()-1;
        this.actualizaPartido(jornada.getPartido(index));
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        // Nuevo
        if(liga.getEquipos().size()>1){
            Partido p = new Partido(liga.getEquipo(0), liga.getEquipo(1));
            jornada.addPartido(p);
            index = jornada.numPartidos()-1;
            actualizaPartido(jornada.getPartido(index));
        }else
            JOptionPane.showMessageDialog(this, 
                    " Debe haber dos o más equipos para jugar un partido",
                    "Info Básica :)",
                    JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        // Eliminar
        Partido p = jornada.getPartido(index);
        int s = JOptionPane.showConfirmDialog(this, 
                    "¿Seguro que quieres eliminar el partido de "
                            +(p.getEquipo1()!=null?p.getEquipo1().getNombre():" - ")
                            +" contra "
                            +(p.getEquipo2()!=null?p.getEquipo2().getNombre():" - ")
                            +" ?", ":(", 
                    JOptionPane.YES_NO_OPTION);
        if(s == 0)
            jornada.eliminarPartido(index);
        if(jornada.numPartidos()>0){
            index = 0;
            actualizaPartido(jornada.getPartido(index));
        }else
            sinPartido();
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jComBoxEquipo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComBoxEquipo1ActionPerformed
        // Seleccion Equipo 1
        int n = jComBoxEquipo1.getSelectedIndex();
        if(n>=0 && !load){
            Partido p  = jornada.getPartido(index);
            p.setEquipo1(liga.getEquipo(n));
            actualizaGoles1(p);
        }
    }//GEN-LAST:event_jComBoxEquipo1ActionPerformed

    private void jComBoxEquipo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComBoxEquipo2ActionPerformed
        // Seleccion Equipo 2
        int n = jComBoxEquipo2.getSelectedIndex();
        if(n>=0 && !load){
            Partido p  = jornada.getPartido(index);
            p.setEquipo2(liga.getEquipo(n));
            actualizaGoles2(p);
        }
    }//GEN-LAST:event_jComBoxEquipo2ActionPerformed

    private void jCheckBoxE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxE1ActionPerformed
        // Ausente 1 xd
        Partido p  = jornada.getPartido(index);
        p.equipo1Ausente(jCheckBoxE1.isSelected());
        actualizaPartido(p);
    }//GEN-LAST:event_jCheckBoxE1ActionPerformed

    private void jCheckBoxE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxE2ActionPerformed
        // Ausente 1 xd
        Partido p  = jornada.getPartido(index);
        p.equipo2Ausente(jCheckBoxE2.isSelected());
        actualizaPartido(p);
    }//GEN-LAST:event_jCheckBoxE2ActionPerformed

    private void jButtonGoles1AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGoles1AddActionPerformed
        // Equipo 1 Añadir Gol
        Partido p = jornada.getPartido(index);
        p.addGolEquipo1(new Goles(Liga.yo, 0));
        actualizaGoles1(p);
    }//GEN-LAST:event_jButtonGoles1AddActionPerformed

    private void jButtonGoles1RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGoles1RemoveActionPerformed
        // Eliminar Gol 1
        Partido p = jornada.getPartido(index);
        if(selectionIndex1 != -1){
            int s = JOptionPane.showConfirmDialog(this, 
                        "¿Seguro que quieres eliminar el "+(selectionIndex1+1)+"º gol ?", ":(", 
                        JOptionPane.YES_NO_OPTION);
            if(s == 0)
                p.eliminaGol1(selectionIndex1);
            actualizaGoles1(p);
        }
    }//GEN-LAST:event_jButtonGoles1RemoveActionPerformed

    private void jButtonGoles2RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGoles2RemoveActionPerformed
        // Eliminar Gol 2
        Partido p = jornada.getPartido(index);
        if(selectionIndex2 != -1){
            int s = JOptionPane.showConfirmDialog(this, 
                        "¿Seguro que quieres eliminar el "+(selectionIndex2+1)+"º gol ?", ":(", 
                        JOptionPane.YES_NO_OPTION);
            if(s == 0)
                p.eliminaGol2(selectionIndex2);
            actualizaGoles2(p);
        }
    }//GEN-LAST:event_jButtonGoles2RemoveActionPerformed

    private void jButtonGoles2AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGoles2AddActionPerformed
        // Equipo 2 Añadir Gol
        Partido p = jornada.getPartido(index);
        p.addGolEquipo2(new Goles(Liga.yo, 0));
        actualizaGoles2(p);
    }//GEN-LAST:event_jButtonGoles2AddActionPerformed

    private void jButtonTarj1AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTarj1AddActionPerformed
        // Add Tarjetas 1
        System.out.println("Add Tarj1");
        Partido p = jornada.getPartido(index);
        p.addTarjeta1(new Tarjeta(Liga.yo, "Amarilla"));
        actualizaTarj1(p);
    }//GEN-LAST:event_jButtonTarj1AddActionPerformed

    private void jButtonTarj1RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTarj1RemoveActionPerformed
        // Remove Tarjeta 1
        Partido p = jornada.getPartido(index);
        if(selectionIndexT1 != -1){
            int s = JOptionPane.showConfirmDialog(this, 
                        "¿Seguro que quieres eliminar la "+(selectionIndexT1+1)+"ª tarjeta ?", ":(", 
                        JOptionPane.YES_NO_OPTION);
            if(s == 0)
                p.removeTarjeta1(selectionIndexT1);
            actualizaTarj1(p);
        }
    }//GEN-LAST:event_jButtonTarj1RemoveActionPerformed

    private void jButtonTarj2AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTarj2AddActionPerformed
        // Add Tarjetas 2
        System.out.println("Add Tarj2");
        Partido p = jornada.getPartido(index);
        p.addTarjeta2(new Tarjeta(Liga.yo, "Amarilla"));
        actualizaTarj2(p);
    }//GEN-LAST:event_jButtonTarj2AddActionPerformed

    private void jButtonTarj2RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTarj2RemoveActionPerformed
        // Remove Tarjeta 2
        Partido p = jornada.getPartido(index);
        if(selectionIndexT2 != -1){
            int s = JOptionPane.showConfirmDialog(this, 
                        "¿Seguro que quieres eliminar la "+(selectionIndexT2+1)+"ª tarjeta ?", ":(", 
                        JOptionPane.YES_NO_OPTION);
            if(s == 0)
                p.removeTarjeta1(selectionIndexT2);
            actualizaTarj2(p);
        }
    }//GEN-LAST:event_jButtonTarj2RemoveActionPerformed
    
    private void golSpinner1(Goles g, int num, int n){
        System.out.println("Spinner1: "+num+" Index: "+n);
        g.setGoles(num);
    }
    
    private void golJugador1(Goles g, JComboBox cb, int n){
        System.out.println("Jugador1 Combo: "+cb.getSelectedIndex()+" Index: "+n);
        Partido p = jornada.getPartido(index);
        g.setPepe(p.getEquipo1().getJugador(cb.getSelectedIndex()));
    }
    
    private void golSpinner2(Goles g, int num, int n){
        System.out.println("Spinner2: "+num+" Index: "+n);
        g.setGoles(num);
    }
    
    private void golJugador2(Goles g, JComboBox cb, int n){
        System.out.println("Jugador2 Combo: "+cb.getSelectedIndex()+" Index: "+n);
        Partido p = jornada.getPartido(index);
        g.setPepe(p.getEquipo2().getJugador(cb.getSelectedIndex()));
    }
    
    // --- Metodos ---
    
    public void sinPartido(){
        System.out.println("Sin partidos");
        enablePartido(false);
        enableEquipo1(false);
        enableEquipo2(false);
    }
    
    public void actualizaPartido(Partido p){
        load = true;
        jLabelPartido.setText("Partido "+(index+1));
        enablePartido(true);
        enableEquipo1(true);
        enableEquipo2(true);
        
        jComBoxEquipo1.removeAllItems();
        jComBoxEquipo2.removeAllItems();
        for(String e: liga.getArrayEquipos()){
            jComBoxEquipo1.addItem(e);
            jComBoxEquipo2.addItem(e);
        }
            
        jComBoxEquipo1.setSelectedItem(p.getEquipo1().toString());
        jComBoxEquipo2.setSelectedItem(p.getEquipo2().toString());
        
        jCheckBoxE1.setSelected(p.isAusente1());
        jCheckBoxE2.setSelected( p.isAusente2());
        if(p.isAusente1() || p.isAusente2()){
            enableEquipo1(false);
            enableEquipo2(false);
        }
        actualizaGoles1(p);
        actualizaGoles2(p);
        
        actualizaTarj1(p);
        actualizaTarj2(p);
        
        load = false;
    }
    
    public void actualizaGoles1(Partido p){
        jPanelEquipo1.removeAll();
        repaint();
        
        String[] head = {"Jugador", "Goles"};
        String[] jugadores = p.getEquipo1().getArrayNomJugadores();
        selectionIndex1 = -1;
        
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
            jPanelEquipo1.add(new JLabel(col), gbc);
            gbc.gridx++;
        }
        gbc.gridy++;
        gbc.gridx=0;
        gbc.weighty=100;
        for(Goles g:p.getGoles1()){
            JComboBox cb;
            JSpinner s = new JSpinner();
            
            if(p.isAusente2()){
                cb = new JComboBox();
                cb.setEnabled(false);
                s.setEnabled(false);
            }else{
                cb = new JComboBox(jugadores);
                cb.setSelectedItem(g.getPepe().getNombre());
            }
            
            //Creacion de eventos
            MouseAdapter selectionEvt = new java.awt.event.MouseAdapter() {
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    VentanaPatidos.this.selectionIndex1 = gbc.gridy-2;
                    System.out.println("Clicked 1: "+selectionIndex1);
                }
            };
            
            ActionListener comboBox = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    VentanaPatidos.this.golJugador1(g, cb, gbc.gridy-2);
                    VentanaPatidos.this.selectionIndex1 = gbc.gridy-2;
                }
            };
            
            ChangeListener spinner = new ChangeListener() {
                @Override
                public void stateChanged(ChangeEvent e) {
                    if((int)s.getValue()<0)
                        s.setValue(0);
                    VentanaPatidos.this.golSpinner1(g, (int)s.getValue(), gbc.gridy-2);
                    VentanaPatidos.this.selectionIndex1 = gbc.gridy-2;
                }
            };
            
            //Asignacion de eventos 
            cb.addActionListener(comboBox);
            cb.addMouseListener(selectionEvt);
            s.addMouseListener(selectionEvt);
            s.addChangeListener(spinner);
            
            jPanelEquipo1.add(cb, gbc);
            gbc.gridx++;
            
            s.setValue(g.getGoles());
            
            jPanelEquipo1.add(s, gbc);
            
            gbc.weighty*=100;
            gbc.gridx = 0;
            gbc.gridy++;
        }
        pack(); 
    }
    
    public void actualizaGoles2(Partido p){
        jPanelEquipo2.removeAll();
        repaint();
        
        String[] head = {"Jugador", "Goles"};
        String[] jugadores = p.getEquipo2().getArrayNomJugadores();
        selectionIndex2 = -1;
        
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
            jPanelEquipo2.add(new JLabel(col), gbc);
            gbc.gridx++;
        }
        gbc.gridy++;
        gbc.gridx=0;
        gbc.weighty=100;
        for(Goles g:p.getGoles2()){
            JComboBox cb;
            JSpinner s = new JSpinner();
            s.setValue(0);
            
            if(p.isAusente1()){
                cb = new JComboBox();
                cb.setEnabled(false);
                s.setEnabled(false);
            }else{
                cb = new JComboBox(jugadores);
                cb.setSelectedItem(g.getPepe().getNombre());
            }
            
            
            //Creacion de eventos
            MouseAdapter selectionEvt = new java.awt.event.MouseAdapter() {
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    VentanaPatidos.this.selectionIndex2 = gbc.gridy-2;
                    System.out.println("Clicked 2: "+selectionIndex2);
                }
            };
            
            ActionListener comboBox = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    VentanaPatidos.this.golJugador2(g, cb, gbc.gridy-2);
                    VentanaPatidos.this.selectionIndex2 = gbc.gridy-2;
                }
            };
            
            ChangeListener spinner = new ChangeListener() {
                @Override
                public void stateChanged(ChangeEvent e) {
                    if((int)s.getValue()<0)
                        s.setValue(0);
                    VentanaPatidos.this.golSpinner2(g, (int)s.getValue(), gbc.gridy-2);
                    VentanaPatidos.this.selectionIndex2 = gbc.gridy-2;
                }
            };
            
            //Asignacion de eventos
            cb.addActionListener(comboBox);
            cb.addMouseListener(selectionEvt);
            s.addMouseListener(selectionEvt);
            s.addChangeListener(spinner);
            
            jPanelEquipo2.add(cb, gbc);
            gbc.gridx++;
            
            s.setValue(g.getGoles());
            //jSpinnerGoles.setValue(g.getGoles());
            
            jPanelEquipo2.add(s, gbc);
            
            gbc.weighty*=100;
            gbc.gridx = 0;
            gbc.gridy++;
        }
    }
    
    public void actualizaTarj1(Partido p){
        jPanelTarj1.removeAll();
        repaint();
        
        String[] head = {"Jugador", "Tarjeta"};
        String[] jugadores = p.getEquipo1().getArrayNomJugadores();
        String[] colores = {"Amarilla", "Roja"};
        
        selectionIndexT1 = -1;
        
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
            jPanelTarj1.add(new JLabel(col), gbc);
            gbc.gridx++;
        }
        gbc.gridy++;
        gbc.gridx=0;
        gbc.weighty=100;
        for(Tarjeta t:p.getTarjetas1()){
            JComboBox cj;
            JComboBox cl = new JComboBox(colores);
            System.out.println("Tarjetas :( ");
            cj = new JComboBox(jugadores);
            
            cj.setSelectedItem(t.getJugador().getNombre());
            cl.setSelectedItem(t.getColor());
            
            //Creacion de eventos
            MouseAdapter selectionEvt = new java.awt.event.MouseAdapter() {
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    VentanaPatidos.this.selectionIndexT1 = gbc.gridy-2;
                    System.out.println("Clicked 1: "+selectionIndexT1);
                }
            };
            
            ActionListener comboBox = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //VentanaPatidos.this
                    System.out.println("Combo num: "+gbc.gridy);
                    VentanaPatidos.this.selectionIndexT1 = gbc.gridy-2;
                }
            };
            
            
            //Asignacion de eventos
            cj.addActionListener(comboBox);
            cj.addMouseListener(selectionEvt);
            cj.addMouseListener(selectionEvt);
            cl.addActionListener(comboBox);
            
            jPanelTarj1.add(cj, gbc);
            gbc.gridx++;
            
            jPanelTarj1.add(cl, gbc);
            
            gbc.weighty*=100;
            gbc.gridx = 0;
            gbc.gridy++;
        }
    }
    
    public void actualizaTarj2(Partido p){
        jPanelTarj2.removeAll();
        repaint();
        
        String[] head = {"Jugador", "Tarjeta"};
        String[] jugadores = p.getEquipo2().getArrayNomJugadores();
        String[] colores = {"Amarilla", "Roja"};
        
        selectionIndexT2 = -1;
        
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
            jPanelTarj2.add(new JLabel(col), gbc);
            gbc.gridx++;
        }
        gbc.gridy++;
        gbc.gridx=0;
        gbc.weighty=100;
        for(Tarjeta t:p.getTarjetas2()){
            JComboBox cj;
            JComboBox cl = new JComboBox(colores);
            System.out.println("Tarjetas 2 :( ");
            cj = new JComboBox(jugadores);
            
            cj.setSelectedItem(t.getJugador().getNombre());
            cl.setSelectedItem(t.getColor());
            
            //Creacion de eventos
            MouseAdapter selectionEvt = new java.awt.event.MouseAdapter() {
                public void mousePressed(java.awt.event.MouseEvent evt) {
                    VentanaPatidos.this.selectionIndexT2 = gbc.gridy-2;
                    System.out.println("Clicked 2: "+selectionIndexT2);
                }
            };
            
            ActionListener comboBox = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //VentanaPatidos.this
                    System.out.println("Combo num: "+gbc.gridy);
                    VentanaPatidos.this.selectionIndexT2 = gbc.gridy-2;
                }
            };
            
            //Asignacion de eventos
            cj.addActionListener(comboBox);
            cj.addMouseListener(selectionEvt);
            cj.addMouseListener(selectionEvt);
            cl.addActionListener(comboBox);
            
            jPanelTarj2.add(cj, gbc);
            gbc.gridx++;
            
            jPanelTarj2.add(cl, gbc);
            
            gbc.weighty*=100;
            gbc.gridx = 0;
            gbc.gridy++;
        }
    }
    
    public void enablePartido(boolean e){
        jButtonAdelante.setEnabled(e);
        jButtonAtras.setEnabled(e);
        jButtonEliminar.setEnabled(e);
        jCheckBoxE1.setEnabled(e);
        jCheckBoxE2.setEnabled(e);
        jComBoxEquipo1.setEnabled(e);
        jComBoxEquipo2.setEnabled(e);
        if(!e){
            jCheckBoxE1.setSelected(e);
            jCheckBoxE2.setSelected(e);
            jComBoxEquipo1.removeAllItems();
            jComBoxEquipo2.removeAllItems();
            jLabelPartido.setText("Sin Partidos");
        }
    }
    
    public void enableEquipo1(boolean enable){
        jButtonGoles1Add.setEnabled(enable);
        jButtonGoles1Remove.setEnabled(enable);
        jButtonTarj1Add.setEnabled(enable);
        jButtonTarj1Remove.setEnabled(enable);
        if(!enable){
            jPanelEquipo1.removeAll();
            jPanelTarj1.removeAll();
            repaint();
        }
    }
    
    public void enableEquipo2(boolean enable){
        jButtonGoles2Add.setEnabled(enable);
        jButtonGoles2Remove.setEnabled(enable);
        jButtonTarj2Add.setEnabled(enable);
        jButtonTarj2Remove.setEnabled(enable);
        if(!enable){
            jPanelEquipo2.removeAll();
            jPanelTarj2.removeAll();
            repaint();
        }
    }
    
    //Atributos de la Ventana
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdelante;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGoles1Add;
    private javax.swing.JButton jButtonGoles1Remove;
    private javax.swing.JButton jButtonGoles2Add;
    private javax.swing.JButton jButtonGoles2Remove;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JButton jButtonTarj1Add;
    private javax.swing.JButton jButtonTarj1Remove;
    private javax.swing.JButton jButtonTarj2Add;
    private javax.swing.JButton jButtonTarj2Remove;
    private javax.swing.JCheckBox jCheckBoxE1;
    private javax.swing.JCheckBox jCheckBoxE2;
    private javax.swing.JComboBox<String> jComBoxEquipo1;
    private javax.swing.JComboBox<String> jComBoxEquipo2;
    private javax.swing.JLabel jLabelGoles1;
    private javax.swing.JLabel jLabelGoles2;
    private javax.swing.JLabel jLabelPartido;
    private javax.swing.JLabel jLabelTarj1;
    private javax.swing.JLabel jLabelTarj2;
    private javax.swing.JLabel jLabelVS;
    private javax.swing.JPanel jPanelBotonera;
    private javax.swing.JPanel jPanelEquipo1;
    private javax.swing.JPanel jPanelEquipo2;
    private javax.swing.JPanel jPanelTarj1;
    private javax.swing.JPanel jPanelTarj2;
    private javax.swing.JScrollPane jScrollPaneEquipo1;
    private javax.swing.JScrollPane jScrollPaneEquipo2;
    private javax.swing.JScrollPane jScrollPaneTarj1;
    private javax.swing.JScrollPane jScrollPaneTarj2;
    private javax.swing.JSpinner jSpinnerGoles;
    // End of variables declaration//GEN-END:variables
}
