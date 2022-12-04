package Agente;

import Models.Datos;
import Views.FrmLogin;
import Views.PanelAdmin;
import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.core.behaviours.OneShotBehaviour;
import jade.gui.GuiAgent;
import jade.gui.GuiEvent;
import jade.lang.acl.ACLMessage;

import Agente.TercerAgente;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
import Views.*;

public class Agente extends GuiAgent 
{
    private FrmLogin gui;
    ACLMessage mensaje;
    ACLMessage mensajeRespuesta;
    public void setup() 
    {
        System.out.println("Bienvenido! Agente-Reactivo "+getAID().getName()+" se esta ejecutando ");
        System.out.println("Creado por Neddy Etman Choque Flores");
        gui = new FrmLogin(this);
        gui.setVisible(true);
        addBehaviour(new TercerAgente(this));

    }
       
    protected void takeDown() 
    {
        System.out.println("Agente Reactivo "+getAID().getName()+" terminado.");
        System.out.println("Gracias");
    }

    @Override
    protected void onGuiEvent(GuiEvent ge) { 
    }
}