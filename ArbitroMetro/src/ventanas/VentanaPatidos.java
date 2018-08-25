package ventanas;

import arbitrometro.*;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.event.ChangeListener;

/**
 * @author chelunike
 */
public class VentanaPatidos extends javax.swing.JFrame {
    //Atributos
    private Liga liga;
    private Jornada jornada;
    private int index;
    
    //Constructor
    public VentanaPatidos(java.awt.Frame parent, boolean modal, Liga l, int index) {
       // super(parent, modal);
        liga = l;
        jornada = l.getJornada(index);
        index = 0;
        
        
        //Inicializacion de Componentes
        initComponents();
        setLocationRelativeTo(parent);
        
        if(jornada.numPartidos() > 0)
            actualizaPartido(jornada.getPartido(index));
        
        this.setVisible(true);
    }

    /**
     * Codigo Generado
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinnerGoles = new javax.swing.JSpinner();
        jComBoxEquipo1 = new javax.swing.JComboBox<>();
        jComBoxEquipo2 = new javax.swing.JComboBox<>();
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
        jScrollPane2 = new javax.swing.JScrollPane();
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

        jSpinnerGoles.setMinimumSize(new java.awt.Dimension(31, 38));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(201, 31, 167));
        setMinimumSize(new java.awt.Dimension(315, 325));

        jLabelVS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVS.setText("vs");

        jLabelGoles1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelGoles1.setText("Goles");

        jLabelGoles2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelGoles2.setText("Goles");

        jButtonGoles1Add.setText("+");
        jButtonGoles1Add.setMaximumSize(new java.awt.Dimension(31, 31));
        jButtonGoles1Add.setMinimumSize(new java.awt.Dimension(31, 31));

        jButtonGoles1Remove.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jButtonGoles1Remove.setText("-");
        jButtonGoles1Remove.setMaximumSize(new java.awt.Dimension(31, 31));
        jButtonGoles1Remove.setMinimumSize(new java.awt.Dimension(31, 31));

        jButtonGoles2Remove.setText("-");
        jButtonGoles2Remove.setMaximumSize(new java.awt.Dimension(31, 31));
        jButtonGoles2Remove.setMinimumSize(new java.awt.Dimension(31, 31));

        jButtonGoles2Add.setText("+");
        jButtonGoles2Add.setMaximumSize(new java.awt.Dimension(31, 31));
        jButtonGoles2Add.setMinimumSize(new java.awt.Dimension(31, 31));

        jScrollPaneEquipo1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanelEquipo1.setBackground(new java.awt.Color(254, 254, 254));
        jPanelEquipo1.setLayout(new java.awt.GridBagLayout());
        jScrollPaneEquipo1.setViewportView(jPanelEquipo1);

        jScrollPaneEquipo2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneEquipo2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanelEquipo2.setBackground(new java.awt.Color(254, 254, 254));
        jPanelEquipo2.setLayout(new java.awt.GridBagLayout());
        jScrollPaneEquipo2.setViewportView(jPanelEquipo2);

        jLabelTarj1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTarj1.setText("Tarjetas");

        jLabelTarj2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTarj2.setText("Tarjetas");

        jScrollPaneTarj1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanelTarj1.setBackground(new java.awt.Color(254, 254, 254));
        jPanelTarj1.setLayout(new java.awt.GridBagLayout());
        jScrollPaneTarj1.setViewportView(jPanelTarj1);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanelTarj2.setBackground(new java.awt.Color(254, 254, 254));
        jPanelTarj2.setLayout(new java.awt.GridBagLayout());
        jScrollPane2.setViewportView(jPanelTarj2);

        jButtonTarj1Add.setText("+");
        jButtonTarj1Add.setMaximumSize(new java.awt.Dimension(31, 31));
        jButtonTarj1Add.setMinimumSize(new java.awt.Dimension(31, 31));

        jButtonTarj1Remove.setText("-");
        jButtonTarj1Remove.setMaximumSize(new java.awt.Dimension(31, 31));
        jButtonTarj1Remove.setMinimumSize(new java.awt.Dimension(31, 31));

        jButtonTarj2Add.setText("+");
        jButtonTarj2Add.setMaximumSize(new java.awt.Dimension(31, 31));
        jButtonTarj2Add.setMinimumSize(new java.awt.Dimension(31, 31));

        jButtonTarj2Remove.setText("-");
        jButtonTarj2Remove.setMaximumSize(new java.awt.Dimension(31, 31));
        jButtonTarj2Remove.setMinimumSize(new java.awt.Dimension(31, 31));

        jButtonAdelante.setText(">");
        jButtonAdelante.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAdelante.setMaximumSize(new java.awt.Dimension(50, 50));
        jButtonAdelante.setMinimumSize(new java.awt.Dimension(50, 50));

        jButtonAtras.setText("<");
        jButtonAtras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAtras.setMaximumSize(new java.awt.Dimension(50, 50));
        jButtonAtras.setMinimumSize(new java.awt.Dimension(50, 50));

        jButtonEliminar.setText("Eliminar");

        jButtonNuevo.setText("Nuevo");

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

        jCheckBoxE2.setText("Ausente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addComponent(jScrollPane2)
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
                .addContainerGap()
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
                    .addComponent(jScrollPaneEquipo2, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(jScrollPaneEquipo1))
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
                    .addComponent(jScrollPaneTarj1, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonTarj1Add, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTarj1Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTarj2Add, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTarj2Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanelBotonera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Metodos
    
    public void actualizaPartido(Partido p){
        enableEquipo1(true);
        enableEquipo2(true);
        
        //jComBoxEquipo1 = new JComboBox(liga.getArrayEquipos());
        //jComBoxEquipo2 = new JComboBox(liga.getArrayEquipos());
        jComBoxEquipo1.removeAllItems();
        jComBoxEquipo2.removeAllItems();
        for(String e: liga.getArrayEquipos()){
            jComBoxEquipo1.addItem(e);
            jComBoxEquipo2.addItem(e);
        }
            
        jComBoxEquipo1.setSelectedItem(p.getEquipo1().toString());
        jComBoxEquipo2.setSelectedItem(p.getEquipo2().toString());
        
        if(p.isAusente1() || p.isAusente2()){
            jCheckBoxE1.setSelected(p.isAusente1());
            jCheckBoxE2.setSelected(p.isAusente2());
            
            enableEquipo1(false);
            enableEquipo2(false);
        }
        actualizarGoles1(p);
        actualizaGoles2(p);
        
    }
    
    public void actualizarGoles1(Partido p){
        jPanelEquipo1.removeAll();
        repaint();
        
        String[] head = {"Jugador", "Goles"};
        String[] jugadores = p.getEquipo1().getArrayNomJugadores();
        
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
            
            if(p.isAusente1()){
                cb = new JComboBox();
                cb.setEnabled(false);
                s.setEnabled(false);
            }else{
                cb = new JComboBox(jugadores);
                cb.setSelectedItem(g.getPepe().getNombre());
            }
            jPanelEquipo1.add(cb, gbc);
            gbc.gridx++;
            
            s.setValue(g.getGoles());
            //jSpinnerGoles.setValue(g.getGoles());
            
            jPanelEquipo2.add(s, gbc);
            
            gbc.weighty*=100;
            gbc.gridx = 0;
            gbc.gridy++;
        }
    }
    
    public void actualizaGoles2(Partido p){
        jPanelEquipo2.removeAll();
        repaint();
        
        String[] head = {"Jugador", "Goles"};
        String[] jugadores = p.getEquipo2().getArrayNomJugadores();
        
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
            
            if(p.isAusente2()){
                cb = new JComboBox();
                cb.setEnabled(false);
                s.setEnabled(false);
            }else{
                cb = new JComboBox(jugadores);
                cb.setSelectedItem(g.getPepe().getNombre());
            }
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
    
    public void actualizaTarj1(){
    
    }
    
    public void actualizaTarj2(){
    
    }
    
    public void enableEquipo1(boolean enable){
        jButtonGoles1Add.setEnabled(enable);
        jButtonGoles1Remove.setEnabled(enable);
        jButtonTarj1Add.setEnabled(enable);
        jButtonTarj1Remove.setEnabled(enable);
    }
    
    public void enableEquipo2(boolean enable){
        jButtonGoles2Add.setEnabled(enable);
        jButtonGoles2Remove.setEnabled(enable);
        jButtonTarj2Add.setEnabled(enable);
        jButtonTarj2Remove.setEnabled(enable);
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
    private javax.swing.JLabel jLabelTarj1;
    private javax.swing.JLabel jLabelTarj2;
    private javax.swing.JLabel jLabelVS;
    private javax.swing.JPanel jPanelBotonera;
    private javax.swing.JPanel jPanelEquipo1;
    private javax.swing.JPanel jPanelEquipo2;
    private javax.swing.JPanel jPanelTarj1;
    private javax.swing.JPanel jPanelTarj2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPaneEquipo1;
    private javax.swing.JScrollPane jScrollPaneEquipo2;
    private javax.swing.JScrollPane jScrollPaneTarj1;
    private javax.swing.JSpinner jSpinnerGoles;
    // End of variables declaration//GEN-END:variables
}
