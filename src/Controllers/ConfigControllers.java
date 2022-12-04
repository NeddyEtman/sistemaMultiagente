
package Controllers;

import Views.PanelAdmin;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ConfigControllers implements MouseListener{
    
    private PanelAdmin views;

    public ConfigControllers(PanelAdmin views) {
        this.views = views;
        this.views.JLabelAnalisisDescriptivo.addMouseListener(this);
        this.views.JLabelAnalisisPredictivo.addMouseListener(this);
        this.views.JLabelConfig.addMouseListener(this);
        this.views.JLabelInfoGeneral.addMouseListener(this);
        this.views.JLabelIngresoBD.addMouseListener(this);
        this.views.JLabelNotificaciones.addMouseListener(this);
        this.views.JLabelUsuarios.addMouseListener(this);
        this.views.JLabelSalir.addMouseListener(this);
        this.views.JLabelUsers.addMouseListener(this);       
    }
    
    @Override
    public void mouseClicked(MouseEvent me) {
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource() == views.JLabelAnalisisDescriptivo){
            views.JPanelAnalisisDescriptivo.setBackground(new Color(87,115,153));//efecto cambio de color
        }else if (e.getSource() == views.JLabelAnalisisPredictivo){
            views.JPanelAnalisisPredictivo.setBackground(new Color(87,115,153));//efecto cambio de color
        }else if (e.getSource() == views.JLabelConfig){
            views.JPanelConfig.setBackground(new Color(87,115,153));//efecto cambio de color
        }else if (e.getSource() == views.JLabelInfoGeneral){
            views.JPanelInfoGene.setBackground(new Color(87,115,153));//efecto cambio de color
        }else if (e.getSource() == views.JLabelIngresoBD){
            views.JPanelIngresoDatos.setBackground(new Color(87,115,153));//efecto cambio de color
        }else if (e.getSource() == views.JLabelNotificaciones){
            views.JPanelMedidas.setBackground(new Color(87,115,153));//efecto cambio de color
        }else if (e.getSource() == views.JLabelUsuarios){
            views.JPanelProveedores.setBackground(new Color(87,115,153));//efecto cambio de color
        }else if (e.getSource() == views.JLabelSalir){
            views.JPanelSalir.setBackground(new Color(87,115,153));//efecto cambio de color
        }else if (e.getSource() == views.JLabelUsers){
            views.JPanelUsers.setBackground(new Color(87,115,153));//efecto cambio de color
        } 
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource() == views.JLabelAnalisisDescriptivo){
            views.JPanelAnalisisDescriptivo.setBackground(new Color(254,95,85));//efecto cambio de color, regresa al color original
        }else if (e.getSource() == views.JLabelAnalisisPredictivo){
            views.JPanelAnalisisPredictivo.setBackground(new Color(254,95,85));//efecto cambio de color, regresa al color original
        }else if (e.getSource() == views.JLabelConfig){
            views.JPanelConfig.setBackground(new Color(254,95,85));//efecto cambio de color
        }else if (e.getSource() == views.JLabelInfoGeneral){
            views.JPanelInfoGene.setBackground(new Color(254,95,85));//efecto cambio de color
        }else if (e.getSource() == views.JLabelIngresoBD){
            views.JPanelIngresoDatos.setBackground(new Color(254,95,85));//efecto cambio de color
        }else if (e.getSource() == views.JLabelNotificaciones){
            views.JPanelMedidas.setBackground(new Color(254,95,85));//efecto cambio de color
        }else if (e.getSource() == views.JLabelUsuarios){
            views.JPanelProveedores.setBackground(new Color(254,95,85));//efecto cambio de color
        }else if (e.getSource() == views.JLabelSalir){
            views.JPanelSalir.setBackground(new Color(254,95,85));//efecto cambio de color
        }else if (e.getSource() == views.JLabelUsers){
            views.JPanelUsers.setBackground(new Color(254,95,85));//efecto cambio de color
        } 
   }
    
}
