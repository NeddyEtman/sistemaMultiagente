
package Agente;

import Views.FrmLogin;
import Views.Mensaje_1;
//import Views.Mensaje_1;
import javax.swing.JOptionPane;
import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import jade.core.behaviours.SimpleBehaviour;
import Views.Bienv;

public class TercerAgente extends SimpleBehaviour
{
 
    public TercerAgente(Agent a){
        myAgent = a;
    }
//    public Mensaje_1 gui1; 
    public void action()
    
    {
    //      Mensaje_1 M1 = new Mensaje_1(); 
    //      M1.setVisible(true); 
            Bienv p1 = new Bienv();
            p1.setVisible(true);
          
  //        JOptionPane.showMessageDialog(null, );
          System.out.println("Soy el agente de apoyo y estoy iniciando");
  //      gui1 = new Mensaje_1(this);
  //      gui1.setVisible(true);

    }
    
    @Override
    public boolean done()
    {
        return true;
    }
}