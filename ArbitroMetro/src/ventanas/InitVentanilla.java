package ventanas;

import arbitrometro.Liga;
import herramientas.Serializacion;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * @author chelunike
 */
public class InitVentanilla extends JFrame{
    //Atributos
    private NuevaLiga ventanaNueva;
    
    //Atributos Componentes
    private javax.swing.JButton abrirBt;
    private javax.swing.JButton nuevoBt;
    private javax.swing.JLabel titleLb;
    private javax.swing.JLabel imageArbi;
    private javax.swing.JPanel panelArbi;
    
    
    //Constructor
    public InitVentanilla(String titulo){
        super(titulo);
        
        ventanaNueva = new NuevaLiga();
        
        initComponents();
        setLocationRelativeTo(null);
        
    }
    
    public void initComponents(){
        //Instanciamos los componentes
        titleLb = new javax.swing.JLabel();
        nuevoBt = new javax.swing.JButton();
        abrirBt = new javax.swing.JButton();
        imageArbi = new JLabel();
        panelArbi = new JPanel();
    
        //Configuramos Ventana
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ArbitroMetro");
        //setAlwaysOnTop(true);
        setIconImage(new ImageIcon("src/img/icon.png").getImage());
        setBackground(new java.awt.Color(204, 204, 204));
        setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        //Configuramos Componentes
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

        abrirBt.setBackground(java.awt.Color.lightGray);
        abrirBt.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        abrirBt.setForeground(new java.awt.Color(102, 102, 255));
        abrirBt.setText("Abrir");
        abrirBt.setToolTipText("Abrir desde un archivo de Liga");
        abrirBt.setBorder(null);
        abrirBt.setBorderPainted(false);
        abrirBt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        abrirBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirBtActionPerformed(evt);
            }
        });
        
        //Configuramos Layout y Añadimos Componentes
        panelArbi.setLayout(new java.awt.BorderLayout());

        StretchIcon image = new StretchIcon(getClass().getResource("/img/arbitro.png"));
        imageArbi.setIcon(image);
        panelArbi.add(imageArbi, java.awt.BorderLayout.CENTER);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imageArbi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titleLb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(abrirBt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(nuevoBt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 219, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(375, 375, 375)
                    .addComponent(panelArbi, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(376, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLb, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(nuevoBt, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(abrirBt, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(imageArbi, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(236, Short.MAX_VALUE)
                    .addComponent(panelArbi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(237, Short.MAX_VALUE)))
        );
        //Empaquetamos :)
        pack();
    }
    
    //Metodos
    public String getRutaFichero(){
        JFileChooser fc = new JFileChooser();
        
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*Archivos de Liga .liga", "liga");
        fc.setFileFilter(filtro);
        
        String ruta="";
        try{
            if(fc.showOpenDialog(this)==fc.APPROVE_OPTION)
                ruta = fc.getSelectedFile().getAbsolutePath();
        }catch (Exception ex){
            System.out.println("Error getRutaFichero: "+ex);
        }
        return ruta;
    }
    
    //Eventos
    public void abrirBtActionPerformed(ActionEvent evt){

        String ruta = this.getRutaFichero();
        if(ruta!="")
            try{
                if(new File(ruta).isDirectory())
                    throw new Exception("Ruta de un fichero");

                Liga l = (Liga)Serializacion.desSerializaObjeto(ruta);

                VentanaPrincipal p = new VentanaPrincipal(l, ruta);

                this.setVisible(false);
                p.setVisible(true);

            }catch (Exception ex){
                System.out.println("Error alabrir liga: "+ex);
                JOptionPane.showMessageDialog(this, "Error al abrir el archivo liga", "Error :(", JOptionPane.ERROR_MESSAGE);
                //this.abrirBtActionPerformed(evt);
            }
    }
    
    public void nuevoBtActionPerformed(ActionEvent evt){
        if(!ventanaNueva.isVisible())
            ventanaNueva.setVisible(true);
    }
    
}
