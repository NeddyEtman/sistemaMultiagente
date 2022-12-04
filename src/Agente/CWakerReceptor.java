
package Agente;

import jade.core.Agent;
import jade.core.behaviours.WakerBehaviour;
import jade.lang.acl.ACLMessage;
/**
 *
 * @author neddy
 */
public class CWakerReceptor extends WakerBehaviour
{
    long t = 0;
    public CWakerReceptor(Agent a, long t)
    {
        super(a, t);
    }
    public void onWake()
    {
        ACLMessage mensajeRecibido = myAgent.blockingReceive();
        ACLMessage respuesta;
        if(mensajeRecibido != null)
        {
            System.out.println("\t******El mensaje recibido por AgenteReceptorContestador es: " + mensajeRecibido.getContent());
            respuesta = mensajeRecibido.createReply();
            respuesta.setContent("Esta cadena es el mensaje de respuesta del AgenteReceptorContestador");
            myAgent.send(respuesta);
        }else{
            System.out.println("AgenteReceptor informa: No recibi mensaje");
        }
        
    }
}
