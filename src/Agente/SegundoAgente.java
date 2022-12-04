
package Agente;
import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import javax.swing.JOptionPane;
import jade.core.behaviours.TickerBehaviour;
import jade.core.behaviours.WakerBehaviour;
import Views.Mensaje_1;
public class SegundoAgente extends Agent
{
    public void setup()
    {
    addBehaviour(new TickerBehaviour(this, 50000) {
        protected void onTick() {
        Mensaje_1 tl = new Mensaje_1();
        tl.setVisible(true);
    System.out.println("Hola mundo soy el segundo agente");
    
// segunda notificacion       Mensaje_2 tl2 = new Mensaje_2();
// segunda notificacion       tl2.setVisible(true);
    
//    sumar sumas = new sumar();
//    
//    
//Otro aviso que se desplega    JOptionPane.showMessageDialog(null, "La suma es: "+sumas);
//    
//    System.out.println("Esto imprime: " + sum);
    
//    MinMax mm = new MinMax();
//    System.out.println("Esto imprime: " + mm);
        
          
//        sumar s1 = new sumar();
//        s1.mostrarFatos();
        
    //JOptionPane.showMessageDialog(null, "Segundo agente");
  }
        });
    }
    
}