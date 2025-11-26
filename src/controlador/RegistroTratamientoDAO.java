package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.RegistroTratamiento;

public class RegistroTratamientoDAO {

    public void ingresarRegistroTratamiento(String codigo, ArrayList<String> tratamientos) {    
        try {
            Connection con = Conexion.getConexion();
            String query = "insert into registro_tratamiento (codigo, idTratamiento) values(?, ?)";
            PreparedStatement ps = con.prepareStatement(query);

            for (int i = 0; i < tratamientos.size(); i++) {
                ps.setString(1, codigo);
                ps.setString(2, tratamientos.get(i));
                ps.executeUpdate();
            }

            ps.close();

        }catch (SQLException ex){
          Logger.getLogger(RegistroTratamientoDAO.class.getName()).log(Level.SEVERE, null, ex);

        }catch (ClassNotFoundException ex){
          Logger.getLogger(RegistroTratamientoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
  public boolean eliminarRegistroTratamiento(String codigo) {
    boolean resultado = false;
    
    try {
      Connection con = Conexion.getConexion();
      String query="delete from registro_tratamiento where codigo='"+codigo+"'";
      PreparedStatement ps = con.prepareStatement(query);
      
      resultado = ps.executeUpdate()==1;
      ps.close();
      
    }catch (SQLException ex){
      Logger.getLogger(RegistroTratamientoDAO.class.getName()).log(Level.SEVERE, null, ex);
      
    }catch (ClassNotFoundException ex){
      Logger.getLogger(RegistroTratamientoDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return resultado;
  }
  
  public ArrayList <RegistroTratamiento> obtenerTodos() {
    ArrayList <RegistroTratamiento> regisTratamientoArray = new ArrayList<>();
    
    try{
        Connection con = Conexion.getConexion();
        String query="Select * from registro_tratamiento";
        PreparedStatement ps = con.prepareStatement(query);

        ResultSet rs=ps.executeQuery();
        RegistroTratamiento registroTrata;

        while (rs.next()) {
          registroTrata = new RegistroTratamiento(rs.getString(1),rs.getString(2));
          regisTratamientoArray.add(registroTrata);
        }
        ps.close();      
    }catch (SQLException ex){
        Logger.getLogger(RegistroTratamientoDAO.class.getName()).log(Level.SEVERE, null, ex);

    }catch (ClassNotFoundException ex){
        Logger.getLogger(RegistroTratamientoDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return regisTratamientoArray;
  }
  
  public RegistroTratamiento buscarRegistroTratamiento(String codigo) {
    RegistroTratamiento registroTrata = null;

    try{
        Connection con = Conexion.getConexion();
        String query="Select * from registro_tratamiento where codigo='"+codigo+"'";
        PreparedStatement ps = con.prepareStatement(query);

        ResultSet rs=ps.executeQuery();
      
        while (rs.next())      
            registroTrata = new RegistroTratamiento(rs.getString(1),rs.getString(2));
        ps.close();
      
    }catch (SQLException ex){
      Logger.getLogger(RegistroTratamientoDAO.class.getName()).log(Level.SEVERE, null, ex);
      
    }catch (ClassNotFoundException ex){
      Logger.getLogger(RegistroTratamientoDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return registroTrata;
  }          
}