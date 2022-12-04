
package Controllers;

import Models.BaseDao;
import Models.Base;
import Models.Tables;
import Views.PanelAdmin;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener; // para el menu
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class BaseControllers implements ActionListener, MouseListener  { 
    private Base bs;
    private BaseDao bsDao;
    private PanelAdmin views;
    DefaultTableModel modelo = new DefaultTableModel();
    
public BaseControllers(Base bs, BaseDao bsDao, PanelAdmin views) {
    this.bs = bs;
    this.bsDao = bsDao;
    this.views = views;
    this.views.btnRegistrarBas.addActionListener(this);
    this.views.btnModificarBas.addActionListener(this);
    this.views.btnNuevoBas.addActionListener(this);
    this.views.TablaBase.addMouseListener(this);
    this.views.JLabelAnalisisDescriptivo.addMouseListener(this); // para el menu lateral
    this.views.JLabelIngresoBD.addMouseListener(this);
    listarBase();
    
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== views.btnRegistrarBas) {
            if(views.txtIdBas.getText().equals("") 
                || views.txtNandinaBas.getText().equals("")
                || views.txtComentarioBas.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
        }else{
            bs.setId(Integer.parseInt(views.txtIdBas.getText()));
            bs.setNandina(Integer.parseInt(views.txtNandinaBas.getText()));
            bs.setComentario(Integer.parseInt(views.txtComentarioBas.getText()));
        if(bsDao.registrar(bs)){
            limpiarTable();
            listarBase();
            JOptionPane.showMessageDialog(null, "Datos registrados");
        }else{
            JOptionPane.showMessageDialog(null, "Error al registrar");
        }                  
    }
        } else if (e.getSource()== views.btnModificarBas) {
            if(views.txtIdBas.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Selecciones una fila");
            }else{
               if(views.txtIdBas.getText().equals("") 
                || views.txtNandinaBas.getText().equals("")
                || views.txtComentarioBas.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
        }else{
            bs.setId(Integer.parseInt(views.txtIdBas.getText()));
            bs.setNandina(Integer.parseInt(views.txtNandinaBas.getText()));
            bs.setComentario(Integer.parseInt(views.txtComentarioBas.getText()));
        if(bsDao.modificar(bs)){
            limpiarTable();
            listarBase();
            JOptionPane.showMessageDialog(null, "Cliente Modificado");
        }else{
            JOptionPane.showMessageDialog(null, "Error al modificar");
            } 
                
            }
        }
    }

   }
            
    public void listarBase(){
        Tables color = new Tables();
        views.TablaBase.setDefaultRenderer(views.TablaBase.getColumnClass(0), color);
        List<Base>lista = bsDao.ListaBase(views.txtBuscarBas.getText());
        modelo = (DefaultTableModel) views.TablaBase.getModel();
        Object[] ob = new Object[3];
        for(int i = 0; i < lista.size() ; i++){
            ob[0] = lista.get(i).getId();
            ob[1] = lista.get(i).getNandina();
            ob[2] = lista.get(i).getComentario();
            modelo.addRow(ob);
        }
        views.TablaBase.setModel(modelo);
        JTableHeader header = views.TablaBase.getTableHeader();
        header.setOpaque(false);
        header.setBackground(Color.blue);
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
        if (e.getSource() == views.TablaBase){
        int fila = views.TablaBase.rowAtPoint(e.getPoint());
        views.txtIdBas.setText(views.TablaBase.getValueAt(fila, 0).toString());
        views.txtNandinaBas.setText(views.TablaBase.getValueAt(fila, 1).toString());
        views.txtComentarioBas.setText(views.TablaBase.getValueAt(fila, 2).toString());
        }else if(e.getSource() == views.JLabelAnalisisDescriptivo){ // aumente
            views.jTabbedPane12.setSelectedIndex(2); // para conectar el menu lateral con las pestanas
        } else if(e.getSource() == views.JLabelIngresoBD){ // aumente
            views.jTabbedPane12.setSelectedIndex(4); // para conectar el menu lateral con las pestanas
        } // aumente// aumente
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
    
    
}

   

  

