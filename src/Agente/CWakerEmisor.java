
package Agente;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.WakerBehaviour;
import jade.lang.acl.ACLMessage;
import javax.swing.JOptionPane;

public class CWakerEmisor extends WakerBehaviour
{
    public CWakerEmisor(Agent a, long t)
    {
    super(a, t);
    }
    public void onWake()
    {
       
        //int b = Integer.parseInt(JOptionPane.showInputDialog(" Ingrese la cantidad de kilos : "));
        
        ACLMessage mensaje, mensajeRespuesta;
        mensaje = new ACLMessage(ACLMessage.INFORM);
        mensaje.addReceiver(new AID(("AgenteReceptor"),AID.ISLOCALNAME));
        mensaje.setContent("Hola Agente Receptor" ); //+b para inicializar un dialogo
        myAgent.send(mensaje);
        System.out.println("Mensjae enviado por el Agente Emisor");
        mensajeRespuesta = myAgent.blockingReceive();
        if(mensajeRespuesta != null)
            {
            System.out.println("Mensaje de respuesta en AgenteEmisor: " + mensajeRespuesta.getContent());
            }   
    }

}
