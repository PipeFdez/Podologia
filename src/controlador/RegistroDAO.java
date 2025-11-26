package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Registro;

public class RegistroDAO {
    
    public boolean ingresarRegistro(Registro registro) {
        boolean resultado = false;
    
        try {
            Connection con = Conexion.getConexion();
            String query="insert into registro(codigo, fecha, hora, nombreCliente) values(?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, registro.getCodigo());
            ps.setString(2, registro.getFecha());
            ps.setString(3, registro.getHora());
            ps.setString(4, registro.getNombreCliente());
            
            resultado = ps.executeUpdate()==1;
            ps.close();     

          } catch (SQLException | ClassNotFoundException ex){
              Logger.getLogger(RegistroDAO.class.getName()).log(Level.SEVERE, null, ex);
          }
          return resultado;
        }

  public boolean modificarRegistro(Registro registro) {
     boolean resultado = false;

    try {
        Connection con = Conexion.getConexion();
        String query="update registro set fecha=?, hora=?, nombreCliente=? where codigo=?";
        PreparedStatement ps = con.prepareStatement(query);
      
        ps.setString(1, registro.getFecha());
        ps.setString(2, registro.getHora());
        ps.setString(3, registro.getNombreCliente());
        ps.setString(4, registro.getCodigo());
        
        resultado = ps.executeUpdate() == 1;
        ps.close();
      
    }catch (SQLException ex){
      Logger.getLogger(RegistroDAO.class.getName()).log(Level.SEVERE, null, ex);
      
    }catch (ClassNotFoundException ex){
      Logger.getLogger(RegistroDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return resultado;
  }
  
  public boolean eliminarRegistro(String codigo) {
    boolean resultado = false;
    
    try {
      Connection con = Conexion.getConexion();
      String query="delete from registro where codigo='"+codigo+"'";
      PreparedStatement ps = con.prepareStatement(query);
      
      resultado = ps.executeUpdate()==1;
      ps.close();
      
    }catch (SQLException ex){
      Logger.getLogger(RegistroDAO.class.getName()).log(Level.SEVERE, null, ex);
      
    }catch (ClassNotFoundException ex){
      Logger.getLogger(RegistroDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return resultado;
  }
  
  public ArrayList <Registro> obtenerTodos() {
    ArrayList <Registro> pod=new ArrayList<>();
    
    try{
      Connection con = Conexion.getConexion();
      String query="Select * from registro";
      PreparedStatement ps = con.prepareStatement(query);
      
      ResultSet rs=ps.executeQuery();
      Registro po;
      
      while (rs.next()) {
        po=new Registro(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
        pod.add(po);
      }
      ps.close();      
    }catch (SQLException ex){
      Logger.getLogger(RegistroDAO.class.getName()).log(Level.SEVERE, null, ex);
    
    }catch (ClassNotFoundException ex){
      Logger.getLogger(RegistroDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return pod;
  }
  
  public Registro buscarRegistro(String codigo) {
    Registro pod=null;

    try{
      Connection con = Conexion.getConexion();
      String query="Select * from registro where codigo='"+codigo+"'";
      PreparedStatement ps = con.prepareStatement(query);
      
      ResultSet rs=ps.executeQuery();
      
      while (rs.next())      
        pod=new Registro(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
      ps.close();
    }catch (SQLException ex){
      Logger.getLogger(RegistroDAO.class.getName()).log(Level.SEVERE, null, ex);
      
    }catch (ClassNotFoundException ex){
      Logger.getLogger(RegistroDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return pod;
  }         
  
  //Metodos negocio
    public int cantidadDeHorasEntreFechas(String fechaInicio, String fechaFin) {
        int cantidad = 0;

        String sql = "SELECT COUNT(*) FROM `registro` WHERE  STR_TO_DATE(fecha, '%d-%m-%Y') BETWEEN STR_TO_DATE( ? , '%d-%m-%Y') AND STR_TO_DATE( ? , '%d-%m-%Y');";

        try {
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, fechaInicio);
            ps.setString(2, fechaFin);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                cantidad = rs.getInt(1);
            }

            rs.close();
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(RegistroDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cantidad;
    }
    
    public int cantidadCitasPrecioMayor(int monto){
        int cant = 0;
        
        String sql = "SELECT COUNT(*) FROM `registro` WHERE  precio > ?";

        try {
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, monto);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                cant = rs.getInt(1);
            }

            rs.close();
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(RegistroDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cant;       
    }
}