
package Models;

import Views.FrmGraficas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class DEstadistica {
    
    
    Connection cn = DConexion.getConnection();
    
    public DefaultTableModel mostrarPersona(){
        
        DefaultTableModel miModelo2 = null;
        try{
            String titulos []= {"TONELADA","PUERTO","NÚMERO"};
            String dts [] = new String[3];
            miModelo2 = new DefaultTableModel(null, titulos);
            String sql = "select * from Persona";
            PreparedStatement pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
               dts[2] = rs.getString("IdP");
               dts[1] = rs.getString("Nombre");
               dts[0] = rs.getString("Tonelada");
               miModelo2.addRow(dts);
               
            }
        //Views.FrmGraficas.tblConsultas2(miModelo2);    
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return miModelo2;
    }
    
public DefaultTableModel agruparPersona(){
        
        DefaultTableModel miModelo2 = null;
        try{
            String titulos []= {"PAIS DE ORIGEN","TONELADAS","NÚMERO"};
            String dts [] = new String[3];
            miModelo2 = new DefaultTableModel(null, titulos);
            String sql = "select * from origen";
            PreparedStatement pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
               dts[2] = rs.getString("NiO");
               dts[0] = rs.getString("pais");
               dts[1] = rs.getString("tonelada");
               miModelo2.addRow(dts);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return miModelo2;
    }   
    
    public DefaultTableModel mostrarGenero(){
        
        DefaultTableModel miModelo2 = null;
        try{
            String titulos []= {"SALDO","IMP / EXP","PERIODO"};
            String dts [] = new String[3];
            miModelo2 = new DefaultTableModel(null, titulos);
            String sql = "select Cantidad, Genero, Dia from Cuantos";
            PreparedStatement pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
               dts[0] = rs.getString("Cantidad");
               dts[1] = rs.getString("Genero");
               dts[2] = rs.getString("Dia");
               miModelo2.addRow(dts);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return miModelo2;
    }       

}