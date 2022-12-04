
package Controllers;

import Models.UsuarioDao;
import Models.Usuarios;
import Views.FrmLogin;
import Views.Mensaje_1;
import Views.PanelAdmin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class LoginControllers implements ActionListener {
    private Usuarios us;
    private UsuarioDao usDao;
    private FrmLogin views;

    public LoginControllers(Usuarios us, UsuarioDao usDao, FrmLogin views) {
        this.us = us;
        this.usDao = usDao;
        this.views = views;
        this.views.btnLogin.addActionListener(this);
        this.views.btnCancelar.addActionListener(this);
        this.views.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == views.btnLogin){
            if(views.txtusuario.getText().equals("") 
                || String.valueOf(views.txtClave.getPassword()).equals("")){
                JOptionPane.showMessageDialog(null, "Los campos estan vacios ");
        }else{
             String usuario = views.txtusuario.getText();
             String clave = String.valueOf(views.txtClave.getPassword());
             us = usDao.login(usuario, clave);
             if(us.getUsuario() != null){
                PanelAdmin admin = new PanelAdmin();
                admin.setVisible(true);
                Mensaje_1 mens = new Mensaje_1();
                mens.setVisible(true);
                this.views.dispose();
             }else{
                JOptionPane.showMessageDialog(null, "Usuario o contrasena incorrecta ");
             }
        }
    }else{
        int pregunta = JOptionPane.showConfirmDialog(null, "Esta seguro que desea salir?", "Pregunta", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE); // primer parametro para centrar
        if(pregunta == 0 ){
            System.exit(0); // para salir del sistema            
        }
    } 
    }
}
