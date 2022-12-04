
package Models;

import Models.BaseA;
import Models.Conexion;
//import Models.Datos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class BaseADao { 
    Conexion cn= new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;   
    
    
    
public List ListaBase2(String valor){
        List<BaseA> listaBase = new ArrayList();
        String sql = "SELECT a.id, a.nandina, a.kilos - b.kilos2 FROM aduana1 a INNER JOIN aduana2 b ON a.id = b.id WHERE (a.kilos - b.kilos2) > (a.kilos - b.kilos2)*.10 ";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();     
            while(rs.next()){
                BaseA bsa = new BaseA();
                bsa.setId2(rs.getInt("id"));
                bsa.setNandina2(rs.getInt("nandina"));
                bsa.setComentario2(rs.getInt("a.kilos - b.kilos2"));
                listaBase.add(bsa);                
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return listaBase;
    }    
    

}   
    
    
      
