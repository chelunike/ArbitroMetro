package ventanas;

import arbitrometro.Liga;
import herramientas.Serializacion;
import java.awt.event.ActionEvent;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
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
        
        //Configuramos Ventana
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ArbitroMetro");
        //setAlwaysOnTop(true);
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
                .addComponent(abrirBt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(abrirBt, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 190, Short.MAX_VALUE))
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

                VentanaPrincipal p = new VentanaPrincipal(l);

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
