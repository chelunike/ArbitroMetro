package ventanas;

import arbitrometro.Liga;
import herramientas.IO;
import herramientas.Tabla;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * @author chelunike
 */
public class VentanaClasificacion extends javax.swing.JFrame {
    // Atributos
    private Liga liga;
    private Tabla tabla;
    
    // Constructor
    public VentanaClasificacion(Liga liga) {
        this.liga = liga;
        
        // Iniciar Componentes
        tabla = new Tabla(Liga.HEADCLASI, liga.getClasificacion());
        tabla.setResaizable(false);
        tabla.setEditable(false);
        initComponents();
        setLocationRelativeTo(null);
        
        //pack();
        repaint();
    }

    // -- Generated Code --
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanelBotones = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClasi = tabla.getTabla();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Clasificación");

        jButton1.setText("Exportar a CSV");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotonesLayout = new javax.swing.GroupLayout(jPanelBotones);
        jPanelBotones.setLayout(jPanelBotonesLayout);
        jPanelBotonesLayout.setHorizontalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBotonesLayout.setVerticalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jTableClasi);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // --- Eventos ---
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // Cerrar ventanas
        setVisible(false);
    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Exportar a CSV
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos CSV", "csv");
        fc.setFileFilter(filtro);
        String ruta="";
        boolean resultado=true;
        try{
            if(fc.showSaveDialog(null)==fc.APPROVE_OPTION){
                System.out.println("Exportando a CSV");
                ruta = fc.getSelectedFile().getAbsolutePath();
                if(ruta.lastIndexOf(".csv")==-1)
                    ruta += ".csv";
                if(IO.escribe(ruta, exportToCSV()))
                    System.out.println("Hecho");
                else
                    System.out.println("No tan hecho");
            }
        }catch (Exception ex){
            System.out.println(ex);    
        }
        for(String cell: Liga.HEADGOLES)
            System.out.print(cell+"\t");
        System.out.println("");
        for(String[] row: liga.getGoleadores(5)){
            for(String cell: row)
                System.out.print(cell+"\t");
            System.out.println("");
        }
        System.out.println(exportToCSV());
    }//GEN-LAST:event_jButton1ActionPerformed
    
    // --- Metodos ---
    public String exportToCSV(){
        String doc="";
        // Header
        for(String s: Liga.HEADCLASI)
            doc +="\" "+s+"\";";
        doc +=System.lineSeparator();
        //Body
        for(String[] row:tabla.getDatos()){
            for(String col: row)
                doc +="\" "+col+"\";";
            doc +=System.lineSeparator();
        }
        return doc;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableClasi;
    // End of variables declaration//GEN-END:variables
}
