package Controllers;


import Models.BaseA;
import Models.BaseADao;
import Models.Tables;
import Views.Mensaje_1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import Agente.Mensaje_2;




public class BaseAControllers2 implements ActionListener { 
    private BaseA bsa;
    private BaseADao bsDaoa;
    private Mensaje_2 viewsa;
    DefaultTableModel modeloa = new DefaultTableModel();
        
public BaseAControllers2(BaseA bsa, BaseADao bsDaoa, Mensaje_2 viewsa) {
    this.bsa = bsa;
    this.bsDaoa = bsDaoa;
    this.viewsa = viewsa;
        
    listarBasea();
    }

    
   
   public void listarBasea(){
        List<BaseA>lista = bsDaoa.ListaBase2(viewsa.txtBuscarBas2.getText());
        modeloa = (DefaultTableModel) viewsa.TablaMensaje.getModel();
        Object[] ob = new Object[3];
        for(int i = 0; i < lista.size() ; i++){
            ob[0] = lista.get(i).getId2();
            ob[1] = lista.get(i).getNandina2();
            ob[2] = lista.get(i).getComentario2();
            modeloa.addRow(ob);
        }
        viewsa.TablaMensaje.setModel(modeloa);
        
    }


    @Override
    public void actionPerformed(ActionEvent e) {
       
    }
    
}

   

  




