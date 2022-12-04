
package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MetodosAgente {

public int id, nandina, kilos;
public int datos[];  
public int datos1[];
   Conexion cn=new Conexion();
        Connection c=cn.getConexion(); //ojo
        Statement st = null;
        PreparedStatement ps=null;
        ResultSet rs =null;
        
       
public int[] RecuperarDatos(){

    String sql = "SELECT id,nandina,kilos FROM aduana1 WHERE mes=1 and id=1 ";
    String sql1 = "SELECT id,nandina,kilos FROM aduana1 WHERE mes=1 and id=2 ";
    datos=new int[3];
    datos1=new int[3];
    int filas=0;
    try {
            ps=cn.getConexion().prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next())
            {
                datos[0]=rs.getInt("id");
                datos[1]=rs.getInt("nandina");
                datos[2]=rs.getInt("kilos");
                
                filas++;
                

            }
            
            ps=cn.getConexion().prepareStatement(sql1);
            rs=ps.executeQuery();
            while(rs.next())
            {
                datos1[0]=rs.getInt("id");
                datos1[1]=rs.getInt("nandina");
                datos1[2]=rs.getInt("kilos");
                
                filas++;
            }
            
        } 
        catch (SQLException e) 
        {
            System.out.print("Error al listar los datos:  "+e.getMessage());
        }

    return datos; // cambiar despues
    }

public void Mostrar_datos() 
    {
        //System.out.println("*** " + datos[0][0] + " ***");
        
        for (int i = 0; i < datos.length; i++) 
        {
            System.out.print("[ " + datos[i]+ " ]");
            
            System.out.println();
        }
    }

public static void main(String[] args) {
    
    MetodosAgente metodos = new MetodosAgente();
    metodos.Mostrar_datos();
        
    }


}
