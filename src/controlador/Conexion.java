package controlador;

import com.mysql.jdbc.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Conexion {
    
    private static Connection con = null;
    public static Connection getConexion() throws SQLException,ClassNotFoundException{

    if(con == null) {
      Class.forName("com.mysql.jdbc.Driver");
      con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/bdColores","root","");
    }
    
    return con;
  }
    
}
