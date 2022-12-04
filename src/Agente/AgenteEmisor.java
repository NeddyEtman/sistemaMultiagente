
package Agente;
import Views.Mensaje_1;
import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;
import jade.lang.acl.ACLMessage;
import javax.swing.JOptionPane;


    
            
public class AgenteEmisor extends Agent
{
        
    ACLMessage mensaje;
    ACLMessage mensajeRespuesta;
    public void setup()
    {
        addBehaviour(new TickerBehaviour(this, 90000) {
        protected void onTick() {
        Mensaje_1 tl = new Mensaje_1();
        tl.setVisible(true);
        System.out.println("Soy el segundo agente y estoy iniciando");
        //JOptionPane.showMessageDialog(null, "Segundo agente");
        
        
        }
    });    
        
//        int a=Integer.parseInt(JOptionPane.showInputDialog(" ingrese el numero 1: "));
//        int b=Integer.parseInt(JOptionPane.showInputDialog(" ingrese el numero 2: "));
    
        int suma = 50;
        
        
            
        
        ACLMessage mensaje = new ACLMessage(ACLMessage.INFORM);
        mensaje.addReceiver(new AID(("AgenteReceptor" ),AID.ISLOCALNAME));
        mensaje.setContent("Se envia el resultado la suma : " + suma );
        this.send(mensaje);
        System.out.println("Mensaje enviado por agente Emisor");
        mensajeRespuesta = this.blockingReceive();
        if(mensajeRespuesta != null){
        System.out.println("Mensaje de respuesta recibido en AgenteEmisor: "+ mensajeRespuesta.getContent());
        
        
        
        }
    }  
}



