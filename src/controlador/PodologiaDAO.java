package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Podologia;

public class PodologiaDAO {
    
    public boolean ingresarHora(Podologia podologia) {
        boolean resultado = false;
    
        try {
            Connection con = Conexion.getConexion();
            String query="insert into registro(codigo, fecha, hora, nombreCliente, problema, precio) values(?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, podologia.getCodigo());
            ps.setString(2, podologia.getFecha());
            ps.setString(3, podologia.getHora());
            ps.setString(4, podologia.getNombreCliente());
            ps.setString(5, podologia.getDetalleProblema());
            ps.setInt(6, podologia.getPrecio());
            
            resultado = ps.executeUpdate()==1;
            ps.close();     

          } catch (SQLException | ClassNotFoundException ex){
              Logger.getLogger(PodologiaDAO.class.getName()).log(Level.SEVERE, null, ex);
          }
          return resultado;
        }

  public boolean modificarHora(Podologia podologia) {
     boolean resultado = false;

    try {
        Connection con = Conexion.getConexion();
        String query="update registro set fecha=?, hora=?, nombreCliente=?, problema=?, precio=? where codigo=?";
        PreparedStatement ps = con.prepareStatement(query);
      
        ps.setString(1, podologia.getFecha());
        ps.setString(2, podologia.getHora());
        ps.setString(3, podologia.getNombreCliente());
        ps.setString(4, podologia.getDetalleProblema());
        ps.setInt(5, podologia.getPrecio());
        ps.setString(6, podologia.getCodigo());
        
        resultado = ps.executeUpdate() == 1;
        ps.close();
      
    }catch (SQLException ex){
      Logger.getLogger(PodologiaDAO.class.getName()).log(Level.SEVERE, null, ex);
      
    }catch (ClassNotFoundException ex){
      Logger.getLogger(PodologiaDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return resultado;
  }
  
  public boolean eliminarHora(String codigo) {
    boolean resultado = false;
    
    try {
      Connection con = Conexion.getConexion();
      String query="delete from registro where codigo='"+codigo+"'";
      PreparedStatement ps = con.prepareStatement(query);
      
      resultado = ps.executeUpdate()==1;
      ps.close();
      
    }catch (SQLException ex){
      Logger.getLogger(PodologiaDAO.class.getName()).log(Level.SEVERE, null, ex);
      
    }catch (ClassNotFoundException ex){
      Logger.getLogger(PodologiaDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return resultado;
  }
  
  public ArrayList <Podologia> obtenerTodos() {
    ArrayList <Podologia> pod=new ArrayList<>();
    
    try{
      Connection con = Conexion.getConexion();
      String query="Select * from registro";
      PreparedStatement ps = con.prepareStatement(query);
      
      ResultSet rs=ps.executeQuery();
      Podologia po;
      
      while (rs.next()) {
        po=new Podologia(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6));
        pod.add(po);
      }
      ps.close();      
    }catch (SQLException ex){
      Logger.getLogger(PodologiaDAO.class.getName()).log(Level.SEVERE, null, ex);
    
    }catch (ClassNotFoundException ex){
      Logger.getLogger(PodologiaDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return pod;
  }
  
  public Podologia buscarHora(String codigo) {
    Podologia pod=null;

    try{
      Connection con = Conexion.getConexion();
      String query="Select * from registro where codigo='"+codigo+"'";
      PreparedStatement ps = con.prepareStatement(query);
      
      ResultSet rs=ps.executeQuery();
      
      while (rs.next())      
        pod=new Podologia(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6));
      ps.close();
    }catch (SQLException ex){
      Logger.getLogger(PodologiaDAO.class.getName()).log(Level.SEVERE, null, ex);
      
    }catch (ClassNotFoundException ex){
      Logger.getLogger(PodologiaDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return pod;
  }         
}

