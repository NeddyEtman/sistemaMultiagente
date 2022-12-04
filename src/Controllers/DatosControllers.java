
package Controllers;

import Models.Datos;
import Models.DatosDao;
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

public class DatosControllers implements ActionListener, MouseListener, KeyListener  { //parte de las tres clases nuevas para clientes se incrementa despues el action listener
    private Datos dt;
    private DatosDao dtDao;
    private PanelAdmin views;
    DefaultTableModel modelo = new DefaultTableModel();

public DatosControllers(Datos dt, DatosDao dtDao, PanelAdmin views) {
    this.dt = dt;
    this.dtDao = dtDao;
    this.views = views;
    this.views.btnRegistrarRUs.addActionListener(this);
    this.views.btnModificarRUs.addActionListener(this);
    this.views.btnNuevoRUs.addActionListener(this);
    this.views.TableRUs.addMouseListener(this);
    this.views.JMenuEliminarAduana.addActionListener(this);
    this.views.JMenuModificarAduana.addActionListener(this);
    this.views.txtBuscarRUs.addKeyListener(this);
    this.views.JLabelInfoGeneral.addMouseListener(this);
    this.views.JLabelUsers.addMouseListener(this);
    this.views.JLabelAnalisisPredictivo.addMouseListener(this);
    listarDatos();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btnRegistrarRUs){
            if(views.txtGestionRUs.getText().equals("") 
                    || views.txtNandinaRUs.getText().equals("")
                    || views.txtMesRUs.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Todo los campos son obligados");
            }else{
                dt.setGestion(Integer.parseInt(views.txtGestionRUs.getText()));
                dt.setNandina(Integer.parseInt(views.txtNandinaRUs.getText()));
                dt.setMes(Integer.parseInt(views.txtMesRUs.getText()));
                if(dtDao.registrar(dt)){
                    limpiarTable();
                    listarDatos();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Cliente registrado");
                }else{
                    JOptionPane.showMessageDialog(null, "Error al registrar");
                }
            }
        }else if (e.getSource() == views.btnModificarRUs){
            if(views.txtIdRUs.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Seleccione una fila");
            }else{
                if(views.txtGestionRUs.getText().equals("") 
                    || views.txtNandinaRUs.getText().equals("")
                    || views.txtMesRUs.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Todo los campos son obligados");
            }else{
                dt.setGestion(Integer.parseInt(views.txtGestionRUs.getText()));
                dt.setNandina(Integer.parseInt(views.txtNandinaRUs.getText()));
                dt.setMes(Integer.parseInt(views.txtMesRUs.getText()));
                dt.setId(Integer.parseInt(views.txtIdRUs.getText()));
                if(dtDao.modificar(dt)){
                    limpiarTable();
                    listarDatos();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Cliente modificado");
                }else{
                    JOptionPane.showMessageDialog(null, "Error al modificar");
                }
            }
            }
        }else if(e.getSource() == views.JMenuEliminarAduana){
            if (views.txtIdRUs1.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Selecciones una fila");
            }else{
                int id = Integer.parseInt(views.txtIdRUs.getText());
                if (dtDao.accion("Inactivo", id)) {
                    limpiarTable();
                    listarDatos();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Producto eliminado ");
                }else{
                JOptionPane.showMessageDialog(null, "Error al eliminar producto");   
                }
            }
        
        }else if(e.getSource() == views.JMenuModificarAduana){
            if (views.txtIdRUs.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Selecciones una fila");
            }else{
                int id = Integer.parseInt(views.txtIdRUs.getText());
                if (dtDao.accion("Activo", id)) {
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
        views.TableRUs.setDefaultRenderer(views.TableRUs.getColumnClass(0), color);
        List<Datos>lista = dtDao.ListaDatos(views.txtBuscarRUs.getText());
        modelo = (DefaultTableModel) views.TableRUs.getModel();
        Object[] ob = new Object[14];
        for(int i = 0; i < lista.size() ; i++){
            ob[0] = lista.get(i).getId();
            ob[1] = lista.get(i).getGestion();
            ob[2] = lista.get(i).getMes();
            ob[3] = lista.get(i).getAduana();
            ob[4] = lista.get(i).getDepto();
            ob[5] = lista.get(i).getVia();
            ob[6] = lista.get(i).getMedio();
            ob[7] = lista.get(i).getPais();
            ob[8] = lista.get(i).getNandina();
            ob[9] = lista.get(i).getKilos();
            ob[10] = lista.get(i).getFob();
            ob[11] = lista.get(i).getAdu();
            ob[12] = lista.get(i).getCusi();
            ob[13] = lista.get(i).getIdent();                        
            modelo.addRow(ob);
        }
        views.TableRUs.setModel(modelo);
        JTableHeader header = views.TableRUs.getTableHeader();
        header.setOpaque(false);
        header.setBackground(new Color(225,173,152));
        header.setForeground(Color.white);
    }
    public void limpiarTable(){
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i-1;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == views.TableRUs) {
            int fila = views.TableRUs.rowAtPoint(e.getPoint());
            views.txtIdRUs.setText(views.TableRUs.getValueAt(fila, 0).toString());
            views.txtGestionRUs.setText(views.TableRUs.getValueAt(fila, 1).toString());
            views.txtMesRUs.setText(views.TableRUs.getValueAt(fila, 2).toString());
            views.txtAduanaRus.setText(views.TableRUs.getValueAt(fila, 3).toString());
            views.txtDeptoRUs.setText(views.TableRUs.getValueAt(fila, 4).toString());
            views.txtViaRUs.setText(views.TableRUs.getValueAt(fila, 5).toString());
            views.txtMedioRUs.setText(views.TableRUs.getValueAt(fila, 6).toString());
            views.txtPaisRUs.setText(views.TableRUs.getValueAt(fila, 7).toString());
            views.txtNandinaRUs.setText(views.TableRUs.getValueAt(fila, 8).toString());
            views.txtKilosRUs.setText(views.TableRUs.getValueAt(fila, 9).toString());
            views.txtFobRUs.setText(views.TableRUs.getValueAt(fila, 10).toString());
            views.txtAduRUs.setText(views.TableRUs.getValueAt(fila, 11).toString());
            views.txtCusiRus.setText(views.TableRUs.getValueAt(fila, 12).toString());
            views.txtIdentRUs.setText(views.TableRUs.getValueAt(fila, 13).toString());
        }else if(e.getSource() == views.JLabelAnalisisPredictivo){
            views.jTabbedPane12.setSelectedIndex(3);
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
        views.txtGestionRUs.setText("");
        views.txtMesRUs.setText("");
        views.txtAduanaRus.setText("");
        views.txtDeptoRUs.setText("");
        views.txtViaRUs.setText("");
        views.txtMedioRUs.setText("");
        views.txtPaisRUs.setText("");
        views.txtNandinaRUs.setText("");
        views.txtKilosRUs.setText("");
        views.txtFobRUs.setText("");
        views.txtAduRUs.setText("");
        views.txtCusiRus.setText("");
        views.txtIdentRUs.setText("");
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        }

    @Override
    public void keyPressed(KeyEvent ke) {
        }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getSource() == views.txtBuscarRUs) {
            limpiarTable();
            listarDatos();
            
        }
    
       }
}
