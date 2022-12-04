
package Controllers;

import Models.Tables;
import Models.UsuarioDao;
import Models.Usuarios;
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

public class UsuariosControllers implements ActionListener, MouseListener, KeyListener {
    
    private Usuarios us;
    private UsuarioDao usDao;
    private PanelAdmin views;
    
    DefaultTableModel modelo = new DefaultTableModel();

    public UsuariosControllers(Usuarios us, UsuarioDao usDao, PanelAdmin views) {
        this.us = us;
        this.usDao = usDao;
        this.views = views;
        this.views.btnRegistrarUser.addActionListener(this);
        this.views.btnModificarUser.addActionListener(this);
        this.views.JMenuEliminarUsers.addActionListener(this);
        this.views.JMenuReingresarUser.addActionListener(this);
        this.views.btnNuevoUser.addActionListener(this);
        this.views.TableUser.addMouseListener(this);
        this.views.txtBuscarUsers.addKeyListener(this);
        this.views.JLabelUsers.addMouseListener(this); // para escuchar el menu lateral
        listarUsuarios();
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == views.btnRegistrarUser){
            if(views.txtUsuarioUser.getText().equals("") 
            || views.txtNombreUser.getText().equals("")
            || String.valueOf(views.txtClaveUser.getPassword()).equals("")) {
        JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            }else{
                us.setUsuario(views.txtUsuarioUser.getText());
                us.setNombre(views.txtNombreUser.getText());
                us.setClave(String.valueOf(views.txtClaveUser.getPassword()));
                us.setCaja(views.cbxCajaUser.getSelectedItem().toString());
                us.setRol(views.cbxRolUser.getSelectedItem().toString());
                if(usDao.registrar(us)){
                    limpiarTable();
                    listarUsuarios();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Usuario registrado con exito ");
                }else{
                    JOptionPane.showMessageDialog(null, "Error al registrar el usuario ");
                }
            }
        }else if(e.getSource() == views.btnModificarUser){
            if(views.txtUsuarioUser.getText().equals("") 
            || views.txtNombreUser.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            }else{
                us.setUsuario(views.txtUsuarioUser.getText());
                us.setNombre(views.txtNombreUser.getText());
                us.setCaja(views.cbxCajaUser.getSelectedItem().toString());
                us.setRol(views.cbxRolUser.getSelectedItem().toString());
                us.setId(Integer.parseInt(views.txtIdUser.getText()));
                if(usDao.modificar(us)){
                    limpiarTable();
                    listarUsuarios();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Usuario modificado con exito ");
                }else{
                    JOptionPane.showMessageDialog(null, "Error al modificar el usuario ");
                }
            }
        }else if(e.getSource() == views.JMenuEliminarUsers){
            if (views.txtIdUser.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Seleecione una fila para eliminar ");
            }else{
                int id = Integer.parseInt(views.txtIdUser.getText());
                if (usDao.accion("Inactivo", id)) {
                    limpiarTable();
                    listarUsuarios();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Usuario eliminado ");
                }else{
                JOptionPane.showMessageDialog(null, "Error al eliminar usuario");   
                }
            }
        }else if(e.getSource() == views.JMenuReingresarUser){
            if (views.txtIdUser.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Seleecione una fila para reingresar ");
            }else{
                int id = Integer.parseInt(views.txtIdUser.getText());
                if (usDao.accion("Activo", id)) {
                    limpiarTable();
                    listarUsuarios();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Usuario reingrasado con exito ");
                }else{
                JOptionPane.showMessageDialog(null, "Error al reingresar usuario");   
                }
            }
        
        }else{
            limpiar();
        }
    }
    public void listarUsuarios(){
        Tables color = new Tables();
        views.TableUser.setDefaultRenderer(views.TableUser.getColumnClass(0), color);
        List<Usuarios>lista = usDao.ListaUsuarios(views.txtBuscarUsers.getText());
        modelo = (DefaultTableModel) views.TableUser.getModel();
        Object[] ob = new Object[6];
        for(int i = 0; i < lista.size() ; i++){
            ob[0] = lista.get(i).getId();
            ob[1] = lista.get(i).getUsuario();
            ob[2] = lista.get(i).getNombre();
            ob[3] = lista.get(i).getCaja();
            ob[4] = lista.get(i).getRol();
            ob[5] = lista.get(i).getEstado();
            modelo.addRow(ob);
        }
        views.TableUser.setModel(modelo);
        JTableHeader header = views.TableUser.getTableHeader();
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
        if(e.getSource() == views.TableUser) {
            int fila = views.TableUser.rowAtPoint(e.getPoint());
            views.txtIdUser.setText(views.TableUser.getValueAt(fila, 0).toString());
            views.txtUsuarioUser.setText(views.TableUser.getValueAt(fila, 1).toString());
            views.txtNombreUser.setText(views.TableUser.getValueAt(fila, 2).toString());
            views.cbxCajaUser.setSelectedItem(views.TableUser.getValueAt(fila, 3).toString());
            views.cbxRolUser.setSelectedItem(views.TableUser.getValueAt(fila, 4).toString());
            views.txtClaveUser.setEnabled(false);
            views.btnRegistrarUser.setEnabled(false);
        }else if(e.getSource() == views.JLabelUsers){
            views.jTabbedPane12.setSelectedIndex(1); // para conectar el menu lateral con las pestanas
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

    @Override
    public void keyTyped(KeyEvent ke) {
   }

    @Override
    public void keyPressed(KeyEvent ke) {
   }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getSource() == views.txtBuscarUsers){
            limpiarTable();
            listarUsuarios();
        }
   }
private void limpiar(){
        views.txtIdUser.setText("");
        views.txtUsuarioUser.setText("");
        views.txtNombreUser.setText("");
        views.txtClaveUser.setText("");
    }
}
