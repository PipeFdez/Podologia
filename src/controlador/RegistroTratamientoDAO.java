package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RegistroTratamientoDAO {

    public void ingresarRegistroTratamiento(String codigo, ArrayList<String> tratamientos) {    
        try {
            Connection con = Conexion.getConexion();
            String query = "insert into registro_tratamiento (codigo, nombre) values(?, ?)";
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

    public ArrayList<String> obtenerTratamientosPorRegistro(String codigo) {
      ArrayList <String> idTratamiento = new ArrayList<>();

      String query = "SELECT nombre FROM registro_tratamiento WHERE codigo='"+codigo+"'";
      try {
          Connection con = Conexion.getConexion();
          PreparedStatement ps = con.prepareStatement(query);
          ResultSet rs = ps.executeQuery();

          while (rs.next()) {
              idTratamiento.add(rs.getString(1)); 
          }

          rs.close();
          ps.close();

      } catch (SQLException | ClassNotFoundException ex) {
          Logger.getLogger(RegistroTratamientoDAO.class.getName()).log(Level.SEVERE, null, ex);
      }
      return idTratamiento;
    
    }
}