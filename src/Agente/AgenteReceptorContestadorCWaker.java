
package Agente;

import Agente.CWakerReceptor;
import jade.core.Agent;
/**
 *
 * @author neddy
 */
public class AgenteReceptorContestadorCWaker extends Agent
{
    public long t = 6000;
    public void setup()
    {
        addBehaviour(new CWakerReceptor(this, t));
    }
}
