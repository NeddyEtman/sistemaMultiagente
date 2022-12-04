
package Controllers;

import Models.Datos1;
import Models.DatosDao1;
import Models.Tables;
import Views.PanelAdmin;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class Datos1Controllers implements ActionListener, MouseListener, KeyListener  { //parte de las tres clases nuevas para clientes se incrementa despues el action listener
    private Datos1 dt1;
    private DatosDao1 dtDao1;
    private PanelAdmin views1;
    DefaultTableModel modelo1 = new DefaultTableModel();

    public Datos1Controllers(Datos1 dt1, DatosDao1 dtDao1, PanelAdmin views1) {
        this.dt1 = dt1;
        this.dtDao1 = dtDao1;
        this.views1 = views1;
        this.views1.btnRegistrarRUs1.addActionListener(this);
        this.views1.btnModificarRUs1.addActionListener(this);
        this.views1.btnNuevoRUs1.addActionListener(this);
        this.views1.TableRUs1.addMouseListener(this);
        this.views1.JMenuEliminarAduana.addActionListener(this);
        this.views1.JMenuModificarAduana.addActionListener(this);
        this.views1.txtBuscarRUs1.addKeyListener(this);
        this.views1.JLabelInfoGeneral.addMouseListener(this);
        this.views1.JLabelUsuarios.addMouseListener(this);
        this.views1.JLabelUsers.addMouseListener(this);
        listarDatos();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views1.btnRegistrarRUs1){
            if(views1.txtGestionRUs1.getText().equals("") 
                    || views1.txtNandinaRUs1.getText().equals("")
                    || views1.txtMesRUs1.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Todo los campos son obligados");
            }else{
                dt1.setGestion1(Integer.parseInt(views1.txtGestionRUs1.getText()));
                dt1.setNandina1(Integer.parseInt(views1.txtNandinaRUs1.getText()));
                dt1.setMes1(Integer.parseInt(views1.txtMesRUs1.getText()));
                if(dtDao1.registrar(dt1)){
                    limpiarTable();
                    listarDatos();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Cliente registrado");
                }else{
                    JOptionPane.showMessageDialog(null, "Error al registrar");
                }
            }
        }else if (e.getSource() == views1.btnModificarRUs1){
            if(views1.txtIdRUs1.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Seleccione una fila");
            }else{
                if(views1.txtGestionRUs1.getText().equals("") 
                    || views1.txtNandinaRUs1.getText().equals("")
                    || views1.txtMesRUs1.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Todo los campos son obligados");
            }else{
                dt1.setGestion1(Integer.parseInt(views1.txtGestionRUs1.getText()));
                dt1.setNandina1(Integer.parseInt(views1.txtNandinaRUs1.getText()));
                dt1.setMes1(Integer.parseInt(views1.txtMesRUs1.getText()));
                dt1.setId1(Integer.parseInt(views1.txtIdRUs1.getText()));
                if(dtDao1.modificar(dt1)){
                    limpiarTable();
                    listarDatos();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Cliente modificado");
                }else{
                    JOptionPane.showMessageDialog(null, "Error al modificar");
                }
            }
            }
        }else if(e.getSource() == views1.JMenuEliminarAduana){
            if (views1.txtIdRUs1.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Selecciones una fila");
            }else{
                int id1 = Integer.parseInt(views1.txtIdRUs1.getText());
                if (dtDao1.accion("Inactivo", id1)) {
                    limpiarTable();
                    listarDatos();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Producto eliminado ");
                }else{
                JOptionPane.showMessageDialog(null, "Error al eliminar producto");   
                }
            }
        
        }else if(e.getSource() == views1.JMenuModificarAduana){
            if (views1.txtIdRUs1.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Selecciones una fila");
            }else{
                int id1 = Integer.parseInt(views1.txtIdRUs1.getText());
                if (dtDao1.accion("Activo", id1)) {
                    limpiarTable();
                    listarDatos();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Producto re ingresado ");
                }else{
                JOptionPane.showMessageDialog(null, "Error al re ingresar producto");   
                }
            }
        }else{
            limpiar();        
        }
    }
    public void listarDatos(){
        Tables color = new Tables();
        views1.TableRUs1.setDefaultRenderer(views1.TableRUs1.getColumnClass(0), color);
        List<Datos1>lista = dtDao1.ListaDatos1(views1.txtBuscarRUs1.getText());
        modelo1 = (DefaultTableModel) views1.TableRUs1.getModel();
        Object[] ob = new Object[14];
        for(int i = 0; i < lista.size() ; i++){
            ob[0] = lista.get(i).getId1();
            ob[1] = lista.get(i).getGestion1();
            ob[2] = lista.get(i).getMes1();
            ob[3] = lista.get(i).getAduana1();
            ob[4] = lista.get(i).getDepto1();
            ob[5] = lista.get(i).getVia1();
            ob[6] = lista.get(i).getMedio1();
            ob[7] = lista.get(i).getPais1();
            ob[8] = lista.get(i).getNandina1();
            ob[9] = lista.get(i).getKilos1();
            ob[10] = lista.get(i).getFob1();
            ob[11] = lista.get(i).getAdu1();
            ob[12] = lista.get(i).getCusi1();
            ob[13] = lista.get(i).getIdent1();                        
            modelo1.addRow(ob);
        }
        views1.TableRUs1.setModel(modelo1);
        JTableHeader header = views1.TableRUs1.getTableHeader();
        header.setOpaque(false);
        header.setBackground(new Color(225,173,152));
        header.setForeground(Color.white);
    }
    public void limpiarTable(){
        for (int i = 0; i < modelo1.getRowCount(); i++) {
            modelo1.removeRow(i);
            i = i-1;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == views1.TableRUs1) {
            int fila = views1.TableRUs1.rowAtPoint(e.getPoint());
            views1.txtIdRUs1.setText(views1.TableRUs1.getValueAt(fila, 0).toString());
            views1.txtGestionRUs1.setText(views1.TableRUs1.getValueAt(fila, 1).toString());
            views1.txtMesRUs1.setText(views1.TableRUs1.getValueAt(fila, 2).toString());
            views1.txtAduanaRus1.setText(views1.TableRUs1.getValueAt(fila, 3).toString());
            views1.txtDeptoRUs1.setText(views1.TableRUs1.getValueAt(fila, 4).toString());
            views1.txtViaRUs1.setText(views1.TableRUs1.getValueAt(fila, 5).toString());
            views1.txtMedioRUs1.setText(views1.TableRUs1.getValueAt(fila, 6).toString());
            views1.txtPaisRUs1.setText(views1.TableRUs1.getValueAt(fila, 7).toString());
            views1.txtNandinaRUs1.setText(views1.TableRUs1.getValueAt(fila, 8).toString());
            views1.txtKilosRUs1.setText(views1.TableRUs1.getValueAt(fila, 9).toString());
            views1.txtFobRUs1.setText(views1.TableRUs1.getValueAt(fila, 10).toString());
            views1.txtAduRUs1.setText(views1.TableRUs1.getValueAt(fila, 11).toString());
            views1.txtCusiRus1.setText(views1.TableRUs1.getValueAt(fila, 12).toString());
            views1.txtIdentRUs1.setText(views1.TableRUs1.getValueAt(fila, 13).toString());
        }else if(e.getSource() == views1.JLabelInfoGeneral){
            views1.jTabbedPane12.setSelectedIndex(0);
        }else if(e.getSource() == views1.JLabelUsuarios){
            views1.jTabbedPane12.setSelectedIndex(1);
        }
            
        }

    @Override
    public void mousePressed(MouseEvent me) {
   }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
   }

    @Override
    public void mouseExited(MouseEvent me) {
 }

   


    
    
    private void limpiar(){
        views1.txtGestionRUs1.setText("");
        views1.txtMesRUs1.setText("");
        views1.txtAduanaRus1.setText("");
        views1.txtDeptoRUs1.setText("");
        views1.txtViaRUs1.setText("");
        views1.txtMedioRUs1.setText("");
        views1.txtPaisRUs1.setText("");
        views1.txtNandinaRUs1.setText("");
        views1.txtKilosRUs1.setText("");
        views1.txtFobRUs1.setText("");
        views1.txtAduRUs1.setText("");
        views1.txtCusiRus1.setText("");
        views1.txtIdentRUs1.setText("");
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        }

    @Override
    public void keyPressed(KeyEvent ke) {
        }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getSource() == views1.txtBuscarRUs1) {
            limpiarTable();
            listarDatos();
            
        }
    
       }
}