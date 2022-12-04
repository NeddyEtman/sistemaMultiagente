
package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DatosDao { //copia de la clase UsuarioDao.java
    Conexion cn= new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;   
    
    public boolean registrar(Datos dt){ //copia dela clase UsuarioDao.java ademas se cambia el parametro de Usuarios a Clientes cl
        String sql = "INSERT INTO aduana1 (gestion, mes, aduana, depto, via, medio, pais, nandina, kilos, fob, adu, cusi, ident) VALUE (?,?,?,?,?,?,?,?,?,?,?,?,?)"; //se adecua la tabla 
        try{    
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, dt.getGestion());
            ps.setInt(2, dt.getMes());
            ps.setInt(3, dt.getAduana());
            ps.setInt(4, dt.getDepto());
            ps.setInt(5, dt.getVia());
            ps.setInt(6, dt.getMedio());
            ps.setInt(7, dt.getPais());
            ps.setInt(8, dt.getNandina());
            ps.setInt(9, dt.getKilos());
            ps.setInt(10, dt.getFob());
            ps.setInt(11, dt.getAdu()); // valor cif
            ps.setInt(12, dt.getCusi());
            ps.setInt(13, dt.getIdent());
            ps.execute();
            return true;            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
    public List ListaDatos(String valor){ //copiado y pegado del panel admin
        List<Datos> listaDat = new ArrayList();
        String sql = "SELECT * FROM aduana1 ORDER BY gestion ASC";
        String buscar = "SELECT * FROM aduana1 WHERE nandina LIKE '%"+valor+"%'" ; //OR nandina LIKE '%"+valor+"%
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
                Datos dt = new Datos();
                dt.setId(rs.getInt("id"));
                dt.setGestion(rs.getInt("gestion"));
                dt.setMes(rs.getInt("mes"));
                dt.setAduana(rs.getInt("aduana"));
                dt.setDepto(rs.getInt("depto"));
                dt.setVia(rs.getInt("via"));
                dt.setMedio(rs.getInt("medio"));
                dt.setPais(rs.getInt("pais"));
                dt.setNandina(rs.getInt("nandina"));
                dt.setKilos(rs.getInt("kilos"));
                dt.setFob(rs.getInt("fob"));
                dt.setAdu(rs.getInt("adu"));
                dt.setCusi(rs.getInt("cusi"));
                dt.setIdent(rs.getInt("ident"));
                listaDat.add(dt);                
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return listaDat;
    }   
    
    
    //copiar aqui em metodo lisat
    
    
    
    public boolean modificar(Datos dt){
        String sql = "UPDATE aduana1 gestion = ?, mes = ?, nandina = ? WHERE id = ?";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql); //revizar al hacer la prueba
            ps.setInt(1, dt.getGestion());
            ps.setInt(2, dt.getMes());
            ps.setInt(3, dt.getNandina());
            ps.setInt(4, dt.getId());
            ps.execute();
            return true;            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    } 
    
    public boolean accion(String estado, int id){ //para eliminar
        String sql = "UPDATE aduana1 SET nandina = ? WHERE id = ? ";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, estado);
            ps.setInt(2, id);
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
}
