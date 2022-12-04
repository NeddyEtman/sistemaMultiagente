
package Graficar;

import Models.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DGraficar {

    Conexion cn= new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;   
    
    public DefaultTableModel mostrarPersona(){
        
        DefaultTableModel miModelo = null;
        try{
            String titulos []= {"Id","Nombre"};
            String dts [] = new String[2];
            miModelo = new DefaultTableModel(null, titulos);
            String sql = "select * from Persona";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
               dts[0] = rs.getString("IdP");
               dts[1] = rs.getString("Nombre");
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
            String titulos []= {"Nombres","Cuantas personas"};
            String dts [] = new String[2];
            miModelo = new DefaultTableModel(null, titulos);
            String sql = "select Nombre, count(Nombre) from Persona group by Nombre";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
               dts[0] = rs.getString("Nombre");
               dts[1] = rs.getString("count(Nombre)");
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
            String titulos []= {"Cantidad","Genero","Dia"};
            String dts [] = new String[3];
            miModelo = new DefaultTableModel(null, titulos);
            String sql = "select Cantidad, Genero, Dia from Cuantos";
            PreparedStatement pst = con.prepareStatement(sql);
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
