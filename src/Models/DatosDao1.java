
package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DatosDao1 { //copia de la clase UsuarioDao.java
    Conexion cn= new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;   
    
    public boolean registrar(Datos1 dt1){ //copia dela clase UsuarioDao.java ademas se cambia el parametro de Usuarios a Clientes cl
        String sql = "INSERT INTO aduana2 (gestion, mes, aduana, depto, via, medio, pais, nandina, kilos2, fob, adu, cusi, ident) VALUE (?,?,?,?,?,?,?,?,?,?,?,?,?)"; //se adecua la tabla 
        try{    
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, dt1.getGestion1());
            ps.setInt(2, dt1.getMes1());
            ps.setInt(3, dt1.getAduana1());
            ps.setInt(4, dt1.getDepto1());
            ps.setInt(5, dt1.getVia1());
            ps.setInt(6, dt1.getMedio1());
            ps.setInt(7, dt1.getPais1());
            ps.setInt(8, dt1.getNandina1());
            ps.setInt(9, dt1.getKilos1());
            ps.setInt(10, dt1.getFob1());
            ps.setInt(11, dt1.getAdu1()); // valor cif
            ps.setInt(12, dt1.getCusi1());
            ps.setInt(13, dt1.getIdent1());
            ps.execute();
            return true;            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
    public List ListaDatos1(String valor){ //copiado y pegado del panel admin
        List<Datos1> listaDat1 = new ArrayList();
        String sql = "SELECT * FROM aduana2 ORDER BY gestion ASC";
        String buscar = "SELECT * FROM aduana2 WHERE nandina LIKE '%"+valor+"%'" ; //OR nandina LIKE '%"+valor+"%
        try {
            con = cn.getConexion();
            if(valor.equalsIgnoreCase("")){
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery(); 
            }else{
            ps = con.prepareStatement(buscar);
            rs = ps.executeQuery();
            }            
            while(rs.next()){
                Datos1 dt1 = new Datos1();
                dt1.setId1(rs.getInt("id"));
                dt1.setGestion1(rs.getInt("gestion"));
                dt1.setMes1(rs.getInt("mes"));
                dt1.setAduana1(rs.getInt("aduana"));
                dt1.setDepto1(rs.getInt("depto"));
                dt1.setVia1(rs.getInt("via"));
                dt1.setMedio1(rs.getInt("medio"));
                dt1.setPais1(rs.getInt("pais"));
                dt1.setNandina1(rs.getInt("nandina"));
                dt1.setKilos1(rs.getInt("kilos2"));
                dt1.setFob1(rs.getInt("fob"));
                dt1.setAdu1(rs.getInt("adu"));
                dt1.setCusi1(rs.getInt("cusi"));
                dt1.setIdent1(rs.getInt("ident"));
                listaDat1.add(dt1);                
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return listaDat1;
    }   
    
    
    //copiar aqui em metodo lisat
    
    
    
    public boolean modificar(Datos1 dt1){
        String sql = "UPDATE aduana2 gestion = ?, mes = ?, nandina = ? WHERE id = ?";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql); //revizar al hacer la prueba
            ps.setInt(1, dt1.getGestion1());
            ps.setInt(2, dt1.getMes1());
            ps.setInt(3, dt1.getNandina1());
            ps.setInt(4, dt1.getId1());
            ps.execute();
            return true;            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    } 
    
    public boolean accion(String estado, int id1){ //para eliminar
        String sql = "UPDATE aduana2 SET nandina = ? WHERE id = ? ";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, estado);
            ps.setInt(2, id1);
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
}
