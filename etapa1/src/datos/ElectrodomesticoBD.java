package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import entidades.Electrodomestico;
import entidades.Lavarropas;
import entidades.Television;

public class ElectrodomesticoBD {
	private static ElectrodomesticoBD ebd;
	private Connection conexion;
	
	
	public static ElectrodomesticoBD getElectrodomesticoBD() {
		if(ebd == null) {
			ebd = new ElectrodomesticoBD(ConexionBD.getConexion());
		}
		
		return ebd;
	}
	
	private ElectrodomesticoBD(Connection conexion) {
		this.conexion = conexion;
	}
	
	public void addElectrodomestico(Electrodomestico e) {
		try {
			//creo consulta 
			PreparedStatement stmt = null;
			
			String sql = "INSERT INTO electrodomesticos " +
						 "(precio_base, peso, color, consumo, descripcion, carga, resolucion, tdt) " +
						 "VALUES " +
						 "(?, ?, ?, ?, ?, ?, ?, ?)";
			
			stmt = this.conexion.prepareStatement(sql);
			
			stmt.setDouble(1, e.getPrecioBase());
			stmt.setDouble(2, e.getPeso());
			stmt.setString(3, e.getColor().getNombre());
			stmt.setString(4, e.getConsumo().getClasificacion());
			stmt.setString(5, e.getDescripcion());
			
			if(e instanceof Lavarropas) {
				stmt.setDouble(6, ((Lavarropas) e).getCarga());
				stmt.setNull(7, java.sql.Types.REAL);
				stmt.setNull(8, java.sql.Types.BOOLEAN);
			}
			else {
				stmt.setNull(6, java.sql.Types.REAL);
				stmt.setDouble(7, ((Television) e).getResolucion());
				stmt.setBoolean(8, ((Television) e).getTdt());
			}
			
			stmt.executeUpdate();
			
			stmt.close();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
	}
	
	public ArrayList<Electrodomestico> getElectrodomesticos() {
		
		ArrayList<Electrodomestico> electrodomesticos = new ArrayList<Electrodomestico>();
		
		try {
			//creo consulta 
			Statement stmt = this.conexion.createStatement();
			
			String sql = "SELECT * " +
						 "FROM electrodomesticos";
					
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				double precio = rs.getDouble("precio_base");
				double peso = rs.getDouble("peso");
				String color = rs.getString("color");
				String consumo = rs.getString("consumo");
				String descripcion = rs.getString("descripcion");
				int idBD = rs.getInt("id_electrodomestico");
				
				Electrodomestico e = null;
				
				if(rs.getDouble("carga") != 0) {
					double carga = rs.getDouble("carga");
					e = new Lavarropas(precio, peso, color, consumo, carga, descripcion);
				}
				else {
					double resolucion = rs.getDouble("resolucion");
					boolean tdt = rs.getBoolean("tdt");
					
					e = new Television(precio, peso, color, consumo, resolucion, tdt, descripcion);
				}
				
				e.setIdBD(idBD);
				electrodomesticos.add(e);
			}
			
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return electrodomesticos;
	}
	
	public void borrarElectrodomestico(Electrodomestico e) {
		try {
		
			int idBD = e.getIdBD();
			
			Statement stmt = null;
			
			String sql = "DELETE FROM electrodomesticos WHERE id_electrodomestico = " + idBD;
			
			stmt = this.conexion.createStatement();
			stmt.executeUpdate(sql);
			
			stmt.close();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	
public void modificarElectrodomestico(Electrodomestico e, double precioBase, double peso, String descripcion, String color, String consumo, double carga) {
	try {
		//creo consulta 
		PreparedStatement stmt = null;
		
		String sql = "UPDATE electrodomesticos " +
					 "SET precio_base = ?, peso = ?, descripcion = ?, " +
					 "color = ?, consumo = ?, carga = ? " +
					 "WHERE id_electrodomestico = ?";
		
		stmt = this.conexion.prepareStatement(sql);
		
		stmt.setDouble(1, precioBase);
		stmt.setDouble(2, peso);
		stmt.setString(3, descripcion);
		stmt.setString(4, color);
		stmt.setString(5, consumo);
		stmt.setDouble(6, carga);
		stmt.setInt(7, e.getIdBD());
			
		stmt.executeUpdate();
		
		stmt.close();
	} catch (SQLException e1) {
		e1.printStackTrace();
	}
}
	
	public void modificarElectrodomestico(Electrodomestico e, double precioBase, double peso, String descripcion, String color, String consumo, double resolucion, boolean tdt) {
		try {
			//creo consulta
			PreparedStatement stmt = null;
			
			String sql = "UPDATE electrodomesticos " +
						 "SET precio_base = ?, peso = ?, descripcion = ?, " +
						 "color = ?, consumo = ?, resolucion = ?, tdt = ? " +
						 "WHERE id_electrodomestico = ?";
			
			stmt = this.conexion.prepareStatement(sql);
			
			stmt.setDouble(1, precioBase);
			stmt.setDouble(2, peso);
			stmt.setString(3, descripcion);
			stmt.setString(4, color);
			stmt.setString(5, consumo);
			stmt.setDouble(6, resolucion);
			stmt.setBoolean(7, tdt);
			stmt.setInt(8, e.getIdBD());
				
			stmt.executeUpdate();
			
			stmt.close();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
}
