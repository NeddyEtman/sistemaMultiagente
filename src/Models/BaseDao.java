package Models;

import Models.Base;
import Models.Conexion;
import Models.Datos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class BaseDao { 
    Conexion cn= new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;   
    
   public boolean registrar(Base bd){
        String sql = "INSERT INTO base (id1, nandina1, comentario) VALUE (?,?,?) ";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, bd.getId());
            ps.setInt(2, bd.getNandina());
            ps.setInt(3, bd.getComentario());
            ps.execute();
            return true;            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }      
    
public List ListaBase(String valor){
        List<Base> listaBas = new ArrayList();
        String sql = "SELECT a.id, a.nandina, a.kilos - b.kilos2 FROM aduana1 a INNER JOIN aduana2 b ON a.id = b.id WHERE (a.kilos - b.kilos2) > (a.kilos - b.kilos2)*.10 ";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();     
            while(rs.next()){
                Base bs = new Base();
                bs.setId(rs.getInt("id"));
                bs.setNandina(rs.getInt("nandina"));
                bs.setComentario(rs.getInt("a.kilos - b.kilos2"));
                listaBas.add(bs);                
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return listaBas;
    }    
    
    public boolean modificar(Base bs){
        String sql = "UPDATE base SET id1 = ?, nandina1 = ?, comentario = ?";
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, bs.getId());
            ps.setInt(2, bs.getNandina());
            ps.setInt(3, bs.getComentario());
            ps.execute();
            return true;            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    } 
    
    public boolean accion(String estado, int id){ //para eliminar
        String sql = "UPDATE base SET nandina = ? WHERE id1 = ? ";
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
    
    
      
    
    

