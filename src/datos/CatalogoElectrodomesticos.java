package datos;

import java.util.ArrayList;

import entidades.Electrodomestico;

public class CatalogoElectrodomesticos {

	ArrayList<Electrodomestico> electrodomesticos = new ArrayList<Electrodomestico>();
	
	public Electrodomestico crearElectrodomestico(double precioBase, double peso, String color, String consumo, String descripcion) {
		return null;
	}
	
	public Electrodomestico crearElectrodomestico(double precioBase, double peso, String descripcion, String color, String consumo, double resolucion, boolean tdt) {
		return null;
		
	}
	
	public Electrodomestico crearElectrodomestico(double precioBase, double peso, String color, String consumo, String descripcion, double carga) {
		return null;
	
	}

	public void addElectrodomestico(Electrodomestico e) {
		this.electrodomesticos.add(e);
	}
}