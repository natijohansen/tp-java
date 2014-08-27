package datos;
import entidades.Television;
import entidades.Lavarropas;

import java.util.ArrayList;

import entidades.Electrodomestico;

public class CatalogoElectrodomesticos {

	ArrayList<Electrodomestico> electrodomesticos = new ArrayList<Electrodomestico>();
	
	
	public Electrodomestico crearElectrodomestico(double precioBase, double peso, String descripcion, String color, String consumo, double resolucion, boolean tdt) {

		return new Television(precioBase, peso, color, consumo, resolucion, tdt, descripcion);
		
		
	}
<<<<<<< HEAD
	
=======

>>>>>>> 33f1d93c1d552b11d6bf46fd0e1332e0de42079a
	public Electrodomestico crearElectrodomestico(double precioBase, double peso, String color, String consumo, String descripcion, double carga) {
		return new Lavarropas(precioBase, peso, color, consumo, carga, descripcion);
	
	}

	public void addElectrodomestico(Electrodomestico e) {
		this.electrodomesticos.add(e);
	}
}