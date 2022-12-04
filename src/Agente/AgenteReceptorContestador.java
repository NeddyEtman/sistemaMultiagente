package Agente;
import jade.core.Agent;
import jade.lang.acl.ACLMessage;
import javax.swing.JOptionPane;

public class AgenteReceptorContestador extends Agent 
{
        String m = "Se imprime el primer resultado ";
           
    
        
    public void setup()
    {
        ACLMessage mensajeRecibido = this.blockingReceive();
        ACLMessage respuesta;
        
        if(mensajeRecibido != null)
        {
            
            System.out.println("\t *****El mensaje recibido por el AgenteReceptorContestador es: " + mensajeRecibido.getContent());
            respuesta = mensajeRecibido.createReply();
            respuesta.setContent(m);
            System.out.println("\t *****Enviando respuesta desde AgenteReceptorContestador");
            this.send(respuesta);
            
        }else{
            System.out.println("AgenteReceptor informa: No recibi mensaje");
        }
        JOptionPane.showMessageDialog(null, m);
    }
          
}
