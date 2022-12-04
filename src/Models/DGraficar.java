/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Enrique
 */
public class DGraficar {
    
    Connection cn = DConexion.getConnection();
    
    public DefaultTableModel mostrarPersona(){
        
        DefaultTableModel miModelo = null;
        try{
            String titulos []= {"TONELADA","PUERTO","NÚMERO"};
            String dts [] = new String[3];
            miModelo = new DefaultTableModel(null, titulos);
            String sql = "select * from Persona";
            PreparedStatement pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
               dts[2] = rs.getString("IdP");
               dts[1] = rs.getString("Nombre");
               dts[0] = rs.getString("Tonelada");
               miModelo.addRow(dts);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return miModelo;
    }
    
    public DefaultTableModel agruparPersona(){
        
        DefaultTableModel miModelo = null;
        try{
            String titulos []= {"PAIS DE ORIGEN","TONELADAS","NÚMERO"};
            String dts [] = new String[3];
            miModelo = new DefaultTableModel(null, titulos);
            String sql = "select * from origen";
            PreparedStatement pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
               dts[2] = rs.getString("NiO");
               dts[0] = rs.getString("pais");
               dts[1] = rs.getString("tonelada");
               miModelo.addRow(dts);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return miModelo;
    }   
    
    public DefaultTableModel mostrarGenero(){
        
        DefaultTableModel miModelo = null;
        try{
            String titulos []= {"SALDO","IMP / EXP","AÑO"};
            String dts [] = new String[3];
            miModelo = new DefaultTableModel(null, titulos);
            String sql = "select Cantidad, Genero, Dia from Cuantos";
            PreparedStatement pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
               dts[0] = rs.getString("Cantidad");
               dts[1] = rs.getString("Genero");
               dts[2] = rs.getString("Dia");
               miModelo.addRow(dts);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return miModelo;
    }       
    
    
}
