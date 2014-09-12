package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

	private static Connection conexion;
	private static String bd      = "jelectrodomesticos";
	private static String usuario = "root";
	private static String pass    = "64586458";
	
	public static Connection getConexion() {
		if(conexion == null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conexion = DriverManager.getConnection("jdbc:mysql://localhost/" + bd, usuario, pass);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return conexion;
		}
		else {
			return conexion;
		}
	}
}
