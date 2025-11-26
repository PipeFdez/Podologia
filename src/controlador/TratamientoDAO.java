package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Tratamiento;

public class TratamientoDAO {
    
    public ArrayList <Tratamiento> obtenerTodos() {
        ArrayList <Tratamiento> tratramiento = new ArrayList<>();

        try{
          Connection con = Conexion.getConexion();
          String query="Select * from tratamiento";
          PreparedStatement ps = con.prepareStatement(query);

          ResultSet rs=ps.executeQuery();
          Tratamiento tra;

          while (rs.next()) {
            tra=new Tratamiento(rs.getString(1),rs.getString(2),rs.getInt(3));
            tratramiento.add(tra);
          }
          ps.close();      
        }catch (SQLException ex){
          Logger.getLogger(TratamientoDAO.class.getName()).log(Level.SEVERE, null, ex);

        }catch (ClassNotFoundException ex){
          Logger.getLogger(TratamientoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tratramiento;
  }
 
    public boolean ingresarTratamiento(Tratamiento tratamiento) {
        boolean resultado = false;
    
        try {
            Connection con = Conexion.getConexion();
            String query="insert into tratamiento(idTratamiento, nombre, precio) values(?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, tratamiento.getIdTratamiento());
            ps.setString(2, tratamiento.getNombreTratamiento());
            ps.setInt(3, tratamiento.getPrecio());
            
            resultado = ps.executeUpdate()==1;
            ps.close();     

          } catch (SQLException | ClassNotFoundException ex){
              Logger.getLogger(TratamientoDAO.class.getName()).log(Level.SEVERE, null, ex);
          }
          return resultado;
        }

  public boolean modificarTratamiento(Tratamiento tratamiento) {
     boolean resultado = false;

    try {
        Connection con = Conexion.getConexion();
        String query="update tratamiento set precio=?, nombre=? where idTratamiento=?";
        PreparedStatement ps = con.prepareStatement(query);
      
        ps.setInt(1, tratamiento.getPrecio());
        ps.setString(2, tratamiento.getNombreTratamiento());
        ps.setString(3, tratamiento.getIdTratamiento());
        
        resultado = ps.executeUpdate() == 1;
        ps.close();
      
    }catch (SQLException ex){
      Logger.getLogger(TratamientoDAO.class.getName()).log(Level.SEVERE, null, ex);
      
    }catch (ClassNotFoundException ex){
      Logger.getLogger(TratamientoDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return resultado;
  }
  
  public boolean eliminarTratamiento(String codigo) {
    boolean resultado = false;
    
    try {
        Connection con = Conexion.getConexion();
        String query="delete from tratamiento where idTratamiento='"+codigo+"'";
        PreparedStatement ps = con.prepareStatement(query);

        resultado = ps.executeUpdate()==1;
        ps.close();

    }catch (SQLException ex){
        Logger.getLogger(TratamientoDAO.class.getName()).log(Level.SEVERE, null, ex);
      
    }catch (ClassNotFoundException ex){
        Logger.getLogger(TratamientoDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return resultado;
  }
  
  public Tratamiento buscarTratamiento(String codigo) {
    Tratamiento tratamiento=null;
    
    try{
        Connection con = Conexion.getConexion();
        String query="Select * from tratamiento where idTratamiento='"+codigo+"'";
        PreparedStatement ps = con.prepareStatement(query);

        ResultSet rs=ps.executeQuery();
      
        while (rs.next())      
            tratamiento=new Tratamiento(rs.getString(1),rs.getString(2),rs.getInt(3));
          ps.close();

    }catch (SQLException ex){
        Logger.getLogger(TratamientoDAO.class.getName()).log(Level.SEVERE, null, ex);

    }catch (ClassNotFoundException ex){
        Logger.getLogger(TratamientoDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return tratamiento;
  }
}
