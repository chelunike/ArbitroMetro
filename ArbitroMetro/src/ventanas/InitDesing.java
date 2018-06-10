package ventanas;

/**
 * @author chelunike
 */
public class InitDesing extends javax.swing.JFrame {

    /**
     * Creates new form InitDesing
     */
    public InitDesing() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLb = new javax.swing.JLabel();
        nuevoBt = new javax.swing.JButton();
        abrirBt1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ArbitroMetro");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(204, 204, 204));
        setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        titleLb.setFont(new java.awt.Font("Consolas", 0, 48)); // NOI18N
        titleLb.setForeground(new java.awt.Color(75, 75, 231));
        titleLb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLb.setText("ArbitroMetro");
        titleLb.setFocusable(false);

        nuevoBt.setBackground(java.awt.Color.lightGray);
        nuevoBt.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        nuevoBt.setForeground(new java.awt.Color(102, 102, 255));
        nuevoBt.setText("Nuevo");
        nuevoBt.setToolTipText("Abrir desde un archivo de Liga");
        nuevoBt.setBorder(null);
        nuevoBt.setBorderPainted(false);
        nuevoBt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nuevoBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoBtActionPerformed(evt);
            }
        });

        abrirBt1.setBackground(java.awt.Color.lightGray);
        abrirBt1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        abrirBt1.setForeground(new java.awt.Color(102, 102, 255));
        abrirBt1.setText("Abrir");
        abrirBt1.setToolTipText("Abrir desde un archivo de Liga");
        abrirBt1.setBorder(null);
        abrirBt1.setBorderPainted(false);
        abrirBt1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        abrirBt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirBt1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLb, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(abrirBt1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(nuevoBt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titleLb, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevoBt, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(abrirBt1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 190, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoBtActionPerformed
        // Nuevo 
        System.out.println("Nueva Liga :)");
    }//GEN-LAST:event_nuevoBtActionPerformed

    private void abrirBt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirBt1ActionPerformed
        // Abrir
        System.out.println("A trabajar en la  Liga :W ");
        
    }//GEN-LAST:event_abrirBt1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abrirBt1;
    private javax.swing.JButton nuevoBt;
    private javax.swing.JLabel titleLb;
    // End of variables declaration//GEN-END:variables
}
