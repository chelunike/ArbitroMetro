package ventanas;

import arbitrometro.*;

/**
 * @author chelunike
 */
public class VentanaPatidos extends javax.swing.JDialog {
    //Atributos
    private Jornada jornada;
    private int index;
    
    //Constructor
    public VentanaPatidos(java.awt.Frame parent, boolean modal, Jornada j) {
        super(parent, modal);
        jornada = j;
        index = 0;
        
        
        //Inicializacion de Componentes
        initComponents();
        
        if(jornada.numPartidos() > 0)
            actualizaPartido(jornada.getPartido(index));
    }

    /**
     * Codigo Generado
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jButtonGuardar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonNuevo = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();

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

        jButtonGoles1Remove.setText("-");

        jButtonGoles2Remove.setText("-");

        jButtonGoles2Add.setText("+");

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

        jButtonTarj1Remove.setText("-");

        jButtonTarj2Add.setText("+");

        jButtonTarj2Remove.setText("-");

        jButtonAdelante.setText(">");
        jButtonAdelante.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAdelante.setMaximumSize(new java.awt.Dimension(50, 50));
        jButtonAdelante.setMinimumSize(new java.awt.Dimension(50, 50));

        jButtonAtras.setText("<");
        jButtonAtras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAtras.setMaximumSize(new java.awt.Dimension(50, 50));
        jButtonAtras.setMinimumSize(new java.awt.Dimension(50, 50));

        jButtonGuardar.setText("Guardar");

        jButtonCancelar.setText("Cancelar");

        jButtonEliminar.setText("Eliminar");

        jButtonNuevo.setText("Nuevo");

        javax.swing.GroupLayout jPanelBotoneraLayout = new javax.swing.GroupLayout(jPanelBotonera);
        jPanelBotonera.setLayout(jPanelBotoneraLayout);
        jPanelBotoneraLayout.setHorizontalGroup(
            jPanelBotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotoneraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonNuevo)
                .addGap(18, 18, 18)
                .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(jButtonGuardar)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonEliminar)
                    .addComponent(jButtonNuevo))
                .addContainerGap())
        );

        jCheckBox1.setText("Ausente");

        jCheckBox2.setText("Ausente");

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
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                            .addComponent(jCheckBox2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2))
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
                    .addComponent(jButtonGoles1Add)
                    .addComponent(jButtonGoles1Remove)
                    .addComponent(jButtonGoles2Add)
                    .addComponent(jButtonGoles2Remove))
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
                    .addComponent(jButtonTarj1Add)
                    .addComponent(jButtonTarj1Remove)
                    .addComponent(jButtonTarj2Add)
                    .addComponent(jButtonTarj2Remove))
                .addGap(18, 18, 18)
                .addComponent(jPanelBotonera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Metodos
    
    public void actualizaPartido(Partido p){
        
    }
    
    public void actualizarGoles1(){
        
    }
    
    public void actualizaGoles2(){
    
    }
    
    public void actualizaTarj1(){
    
    }
    
    public void actualizaTarj2(){
    
    }
    
    //Atributos de la Ventana
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdelante;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGoles1Add;
    private javax.swing.JButton jButtonGoles1Remove;
    private javax.swing.JButton jButtonGoles2Add;
    private javax.swing.JButton jButtonGoles2Remove;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JButton jButtonTarj1Add;
    private javax.swing.JButton jButtonTarj1Remove;
    private javax.swing.JButton jButtonTarj2Add;
    private javax.swing.JButton jButtonTarj2Remove;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
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
    // End of variables declaration//GEN-END:variables
}
