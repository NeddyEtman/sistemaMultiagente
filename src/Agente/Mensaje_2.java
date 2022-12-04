//import javax.management.Notification;
package Agente;

import Views.*;
import Agente.TercerAgente;
import Controllers.BaseAControllers;
import Controllers.BaseAControllers2;
import Models.BaseA;
import Models.BaseADao;
import com.sun.java.swing.plaf.windows.resources.windows;
import java.util.ArrayList;
import java.util.Collections;
import net.sf.jcarrierpigeon.Notification;
import net.sf.jcarrierpigeon.NotificationQueue;
import net.sf.jcarrierpigeon.WindowPosition;

//import javax.management.Notification;

public class Mensaje_2 extends javax.swing.JFrame {
    BaseA bs = new BaseA();
    BaseADao bsDao = new BaseADao();
  
    public Mensaje_2() {
 

          initComponents(); // componente que hace iniciar el cuadro sin agente
          Notification obj = new Notification(this, WindowPosition.BOTTOMRIGHT, 0, 0, 5000);
          NotificationQueue val = new NotificationQueue();
          val.add(obj);
          BaseAControllers2 base = new BaseAControllers2(bs, bsDao, this); // pone informacion al cuadro
    }
  
//    public int suma(){
//        int contar = TablaMensaje.getRowCount();
//        int suma = 0;
//        for(int i = 0; i < contar; i++){
//            suma = suma+Integer.parseInt(TablaMensaje.getValueAt(i, 0).toString());
//        
//        }
//    return suma;
//    
//    }
    
    public int suma(){
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i= 0;i < TablaMensaje.getRowCount(); i++){
            list.add(Integer.parseInt(TablaMensaje.getValueAt(i, 0).toString()));
        }
        int suma = Collections.max(list);
        return suma;
    
    }
    
    
    
    
    
    
    
//    public int MinMax(){
//        int MinMax = 0;
//        ArrayList<Integer> list =new ArrayList<Integer>();
//        for(int i=0; i < TablaMensaje.getRowCount(); i++){
//            list.add(Integer.parseInt(TablaMensaje.getValueAt(i, 1).toString()));
//        }
//        int max=Collections.max(list);
//        System.out.println("El maximo es " + max);
//        return MinMax;
//    }
    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaMensaje = new javax.swing.JTable();
        txtBuscarBas2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(247, 247, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 51, 255));
        jPanel1.setForeground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(102, 153, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PRODUCTOS QUE SUFRIERON IMPORTANTES CAMBIOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        TablaMensaje.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nandina", "Resultado", "Comentarios"
            }
        ));
        jScrollPane1.setViewportView(TablaMensaje);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 480, 150));
        jPanel1.add(txtBuscarBas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 20, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Mensaje_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Mensaje_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Mensaje_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Mensaje_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//               new Mensaje_1().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable TablaMensaje;
    public javax.swing.JButton jButton1;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField txtBuscarBas2;
    // End of variables declaration//GEN-END:variables
}
