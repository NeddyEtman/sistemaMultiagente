
package Views;

import Models.DEstadistica;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import Models.DGraficar;

public class FrmGraficas extends javax.swing.JFrame {
   
    public FrmGraficas() {
        initComponents();
    }
                
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEjecutar = new javax.swing.JButton();
        btnGraficar = new javax.swing.JButton();
        rb3D = new javax.swing.JRadioButton();
        rb2D = new javax.swing.JRadioButton();
        rbBarra = new javax.swing.JRadioButton();
        rbCircular = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblConsultas = new javax.swing.JTable();
        cmbConsultas = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnEstadistica2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        mediaR = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mediaR2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Jmoda = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jVarianza = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        dEstandar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(87, 115, 153));
        setLocation(new java.awt.Point(400, 140));
        setUndecorated(true);

        btnEjecutar.setBackground(new java.awt.Color(87, 115, 153));
        btnEjecutar.setForeground(new java.awt.Color(247, 247, 255));
        btnEjecutar.setText("Ejecutar");
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });

        btnGraficar.setBackground(new java.awt.Color(87, 115, 153));
        btnGraficar.setForeground(new java.awt.Color(247, 247, 255));
        btnGraficar.setText("Graficar");
        btnGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficarActionPerformed(evt);
            }
        });

        rb3D.setText("3D");

        rb2D.setText("2D");

        rbBarra.setText("Barra");

        rbCircular.setText("Circular");

        tblConsultas.setBackground(new java.awt.Color(189, 213, 234));
        tblConsultas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblConsultas);

        cmbConsultas.setBackground(new java.awt.Color(189, 213, 234));
        cmbConsultas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Selecciona una consulta --", "Datos por puertos de ingreso de carga en toneladas", "Datos de importación por país en toneladas", "Balanza Comercial" }));

        jButton1.setBackground(new java.awt.Color(87, 115, 153));
        jButton1.setForeground(new java.awt.Color(247, 247, 255));
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(189, 213, 234));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
        );

        btnEstadistica2.setBackground(new java.awt.Color(87, 115, 153));
        btnEstadistica2.setForeground(new java.awt.Color(247, 247, 255));
        btnEstadistica2.setText("Descriptiva");
        btnEstadistica2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadistica2ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(87, 115, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        mediaR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(247, 247, 255));
        jLabel1.setText("Suma Total        :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(247, 247, 255));
        jLabel2.setText("ESTADISTICA DESCRIPTIVA");

        mediaR2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(247, 247, 255));
        jLabel3.setText("Media                 :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(247, 247, 255));
        jLabel4.setText("Moda       :");

        Jmoda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(247, 247, 255));
        jLabel5.setText("Varianza   :");

        jVarianza.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(247, 247, 255));
        jLabel6.setText("Des. Estandar     :");

        dEstandar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mediaR2)
                            .addComponent(mediaR, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Jmoda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jVarianza, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(375, 375, 375)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addGap(137, 137, 137)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(51, 51, 51)
                .addComponent(dEstandar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mediaR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(Jmoda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(dEstandar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mediaR2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jVarianza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        mediaR.getAccessibleContext().setAccessibleName("");
        Jmoda.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rb3D)
                                        .addGap(13, 13, 13)
                                        .addComponent(rb2D)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbBarra)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbCircular))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnEjecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnEstadistica2)
                                        .addGap(8, 8, 8)
                                        .addComponent(btnGraficar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(26, 26, 26)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb3D)
                            .addComponent(rb2D)
                            .addComponent(rbBarra)
                            .addComponent(rbCircular))
                        .addGap(65, 65, 65)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnEjecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnGraficar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnEstadistica2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel miModelo;
        DGraficar miGrafica = new DGraficar();
        int op = cmbConsultas.getSelectedIndex();
        switch(op){
            case 1:
                miModelo = miGrafica.mostrarPersona();
                tblConsultas.setModel(miModelo);
                break;
            case 2:
                miModelo = miGrafica.agruparPersona();
                tblConsultas.setModel(miModelo); 
                break;
            case 3:
                miModelo = miGrafica.mostrarGenero();
                tblConsultas.setModel(miModelo); 
                break; 
            default: JOptionPane.showMessageDialog(rootPane, "Sigue Asi!!!!");
        }
        
    }//GEN-LAST:event_btnEjecutarActionPerformed

    private void btnGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficarActionPerformed
        // TODO add your handling code here:   
        if(rb3D.isSelected() && rbBarra.isSelected()){
            DefaultCategoryDataset dtsc = new DefaultCategoryDataset();
            
            for(int i = 0; i < tblConsultas.getRowCount(); i++){
                dtsc.setValue(Integer.parseInt(tblConsultas.getValueAt(i, 0).toString()), tblConsultas.getValueAt(i, 1).toString(), tblConsultas.getValueAt(i, 2).toString());
            }
            JFreeChart ch = ChartFactory.createBarChart3D("PUERTOS DE INGRESO DE MERCADERIA", "PUERTOS", "TONELADAS / PERIODO", dtsc,PlotOrientation.VERTICAL, true, true, false);
            ChartPanel cp = new ChartPanel(ch);
            add(cp);
            cp.setBounds(500,40,500,400);
            
        }
        if(rb2D.isSelected() && rbBarra.isSelected()){
            DefaultCategoryDataset dtsc = new DefaultCategoryDataset();
            
            for(int i = 0; i < tblConsultas.getRowCount(); i++){
                dtsc.setValue(Integer.parseInt(tblConsultas.getValueAt(i, 0).toString()), tblConsultas.getValueAt(i, 1).toString(), tblConsultas.getValueAt(i, 2).toString());
            }
            JFreeChart ch = ChartFactory.createBarChart("PUERTOS DE INGRESO DE MERCADERIA", "PUERTOS", "TONELADAS / PERIODO", dtsc,PlotOrientation.VERTICAL, true, true, false);
            ChartPanel cp = new ChartPanel(ch);
            add(cp);
            cp.setBounds(500,40,500,400);
            
        }        
        
        if(rb3D.isSelected() && rbCircular.isSelected()){
            DefaultPieDataset dtsc = new DefaultPieDataset();
            
            for(int i = 0; i < tblConsultas.getRowCount(); i++){
                dtsc.setValue(tblConsultas.getValueAt(i, 0).toString(), Integer.parseInt(tblConsultas.getValueAt(i, 1).toString()));
            }
            JFreeChart ch = ChartFactory.createPieChart3D("BALANZA COMERCIAL", dtsc,true, true, false);
            ChartPanel cp = new ChartPanel(ch);
            add(cp);
            cp.setBounds(500,40,500,400);
            
        }        
        if(rb2D.isSelected() && rbCircular.isSelected()){
            DefaultPieDataset dtsc = new DefaultPieDataset();
            
            for(int i = 0; i < tblConsultas.getRowCount(); i++){
                dtsc.setValue(tblConsultas.getValueAt(i, 0).toString(), Integer.parseInt(tblConsultas.getValueAt(i, 1).toString()));
            }
            JFreeChart ch = ChartFactory.createPieChart("BALANZA COMERCIAL", dtsc ,true , false, false);
            ChartPanel cp = new ChartPanel(ch);
            add(cp);
            cp.setBounds(500,40,500,400);
            
        }           
        
        
    }//GEN-LAST:event_btnGraficarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       PanelAdmin PAdmin=new PanelAdmin();
       PAdmin.setVisible(true);
       dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEstadistica2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadistica2ActionPerformed

        int numrow = tblConsultas.getRowCount();
        double n = 0;
        double tot = 0;
        double tot1 = 0;
        double val1 = 0;
        double mod = 0;
        double var = 0;
        double dstan = 0;
        for(int i = 0; i<numrow; i++){
            double val = Double.valueOf(tblConsultas.getValueAt(i, 0).toString());
            
            tot += val;
            tot1 = tot/numrow;
            mod = tot/2;
            var = mod/2;
            dstan = var/2;
        }
        mediaR.setText(Double.toString(tot));
        mediaR2.setText(Double.toString(tot1));
        Jmoda.setText(Double.toString(mod));
        jVarianza.setText(Double.toString(var));
        dEstandar.setText(Double.toString(dstan));
    }//GEN-LAST:event_btnEstadistica2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmGraficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGraficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGraficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGraficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGraficas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField Jmoda;
    private javax.swing.JButton btnEjecutar;
    public javax.swing.JButton btnEstadistica2;
    private javax.swing.JButton btnGraficar;
    private javax.swing.JComboBox<String> cmbConsultas;
    public javax.swing.JTextField dEstandar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jVarianza;
    public javax.swing.JTextField mediaR;
    public javax.swing.JTextField mediaR2;
    private javax.swing.JRadioButton rb2D;
    private javax.swing.JRadioButton rb3D;
    private javax.swing.JRadioButton rbBarra;
    private javax.swing.JRadioButton rbCircular;
    public javax.swing.JTable tblConsultas;
    // End of variables declaration//GEN-END:variables
}
