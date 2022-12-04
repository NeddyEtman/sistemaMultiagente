
package Models;

import Views.FrmGraficas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class DEstadistica2 {
    
    
    Connection cn = DConexion.getConnection();
    
    public DefaultTableModel mostrarPersona1(){
        
        DefaultTableModel miModelo3 = null;
        try{
            String titulos []= {"TONELADA","PUERTO","NÚMERO"};
            String dts [] = new String[3];
            miModelo3 = new DefaultTableModel(null, titulos);
            String sql = "select * from pibimp";
            PreparedStatement pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
               dts[2] = rs.getString("id");
               dts[1] = rs.getString("ano");
               dts[0] = rs.getString("tonaladas");
               miModelo3.addRow(dts);
               
            }
        //Views.FrmGraficas.tblConsultas2(miModelo2);    
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return miModelo3;
    }
    
public DefaultTableModel agruparPersona1(){
        
        DefaultTableModel miModelo3 = null;
        try{
            String titulos []= {"SALDO","IMPORTACIONES","PERIODO"};
            String dts [] = new String[3];
            miModelo3 = new DefaultTableModel(null, titulos);
            String sql = "select * from bcomer";
            PreparedStatement pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
               dts[2] = rs.getString("id");
               dts[0] = rs.getString("ano");
               dts[1] = rs.getString("importaciones");
               
               miModelo3.addRow(dts);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return miModelo3;
    }   
    
    public DefaultTableModel mostrarGenero1(){
        
        DefaultTableModel miModelo3 = null;
        try{
            String titulos []= {"NANDINA","IMP","EXP"};
            String dts [] = new String[3];
            miModelo3 = new DefaultTableModel(null, titulos);
            String sql = "select Cantidad, Genero, Dia from Cuantos";
            PreparedStatement pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
               dts[0] = rs.getString("Cantidad");
               dts[1] = rs.getString("Genero");
               dts[2] = rs.getString("Dia");
               miModelo3.addRow(dts);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return miModelo3;
    }       

}