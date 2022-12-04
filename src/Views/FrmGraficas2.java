
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
import Models.DEstadistica2;

public class FrmGraficas2 extends javax.swing.JFrame {
   
    public FrmGraficas2() {
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        setLocation(new java.awt.Point(400, 140));
        setUndecorated(true);

        btnEjecutar.setText("Ejecutar");
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });

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

        tblConsultas.setBackground(new java.awt.Color(247, 247, 255));
        tblConsultas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblConsultas);

        cmbConsultas.setBackground(new java.awt.Color(189, 213, 234));
        cmbConsultas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Selecciona una consulta --", "Proyección de importaciones por Puerto Arica /2024", "Balanza Comercial", "Balanza Comercial desglosado" }));

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(87, 115, 153));
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

        btnEstadistica2.setText("Descriptiva");
        btnEstadistica2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadistica2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel miModelo3;
        DEstadistica2 miGrafica = new DEstadistica2();
        int op = cmbConsultas.getSelectedIndex();
        switch(op){
            case 1:
                miModelo3 = miGrafica.mostrarPersona1();
                tblConsultas.setModel(miModelo3);
                break;
            case 2:
                miModelo3 = miGrafica.agruparPersona1();
                tblConsultas.setModel(miModelo3); 
                break;
            case 3:
                miModelo3 = miGrafica.mostrarGenero1();
                tblConsultas.setModel(miModelo3); 
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
            JFreeChart ch = ChartFactory.createBarChart3D("BALANZA COMERCIAL", "AÑOS", "SALDO", dtsc,PlotOrientation.VERTICAL, true, true, false);
            ChartPanel cp = new ChartPanel(ch);
            add(cp);
            cp.setBounds(500,40,500,400);
            
        }
        if(rb2D.isSelected() && rbBarra.isSelected()){
            DefaultCategoryDataset dtsc = new DefaultCategoryDataset();
            
            for(int i = 0; i < tblConsultas.getRowCount(); i++){
                dtsc.setValue(Integer.parseInt(tblConsultas.getValueAt(i, 0).toString()), tblConsultas.getValueAt(i, 1).toString(), tblConsultas.getValueAt(i, 2).toString());
            }
            JFreeChart ch = ChartFactory.createBarChart("BALANZA COMERCIAL", "PERIODO", "SALDO", dtsc,PlotOrientation.VERTICAL, true, true, false);
            ChartPanel cp = new ChartPanel(ch);
            add(cp);
            cp.setBounds(500,40,500,400);
            
        }        
        
        if(rb3D.isSelected() && rbCircular.isSelected()){
            DefaultPieDataset dtsc = new DefaultPieDataset();
            
            for(int i = 0; i < tblConsultas.getRowCount(); i++){
                dtsc.setValue(tblConsultas.getValueAt(i, 0).toString(), Integer.parseInt(tblConsultas.getValueAt(i, 1).toString()));
            }
            JFreeChart ch = ChartFactory.createPieChart3D("Grafica de barras 3D", dtsc,true, true, false);
            ChartPanel cp = new ChartPanel(ch);
            add(cp);
            cp.setBounds(500,40,500,400);
            
        }        
        if(rb2D.isSelected() && rbCircular.isSelected()){
            DefaultPieDataset dtsc = new DefaultPieDataset();
            
            for(int i = 0; i < tblConsultas.getRowCount(); i++){
                dtsc.setValue(tblConsultas.getValueAt(i, 0).toString(), Integer.parseInt(tblConsultas.getValueAt(i, 1).toString()));
            }
            JFreeChart ch = ChartFactory.createPieChart("Grafica de barras 3D", dtsc,true, true, false);
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
            java.util.logging.Logger.getLogger(FrmGraficas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGraficas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGraficas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGraficas2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGraficas2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEjecutar;
    public javax.swing.JButton btnEstadistica2;
    private javax.swing.JButton btnGraficar;
    private javax.swing.JComboBox<String> cmbConsultas;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rb2D;
    private javax.swing.JRadioButton rb3D;
    private javax.swing.JRadioButton rbBarra;
    private javax.swing.JRadioButton rbCircular;
    public javax.swing.JTable tblConsultas;
    // End of variables declaration//GEN-END:variables
}
