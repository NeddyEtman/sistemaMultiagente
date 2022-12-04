/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agente;

import Agente.CWakerEmisor;
import jade.core.Agent;
/**
 *
 * @author neddy
 */
public class AgenteEmisorCWaker extends Agent
{
    public long t = 25000; //25 segundos
    public void setup()
    {
        addBehaviour(new CWakerEmisor(this, t));
    }
}
