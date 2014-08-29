package datos;
import entidades.Television;
import entidades.Lavarropas;

import java.util.ArrayList;

import entidades.Electrodomestico;

public class CatalogoElectrodomesticos {

	private static CatalogoElectrodomesticos ce;

	ArrayList<Electrodomestico> electrodomesticos = new ArrayList<Electrodomestico>();
	
	
	public static CatalogoElectrodomesticos getCatalogoElectrodomesticos() {
		if(ce == null) {
			ce = new CatalogoElectrodomesticos();
		}
		return ce;
	}
	
	private CatalogoElectrodomesticos() {
		for(int i=0; i < 10; i++) {
			this.addElectrodomestico(GeneradorElectrodomesticos.generar("lavarropas"));
			this.addElectrodomestico(GeneradorElectrodomesticos.generar("television"));
		}
	}
	
	public Electrodomestico crearElectrodomestico(double precioBase, double peso, String descripcion, String color, String consumo, double resolucion, boolean tdt) {

		return new Television(precioBase, peso, color, consumo, resolucion, tdt, descripcion);
		
		
	}

	public Electrodomestico crearElectrodomestico(double precioBase, double peso, String color, String consumo, String descripcion, double carga) {
		return new Lavarropas(precioBase, peso, color, consumo, carga, descripcion);
	
	}

	public void addElectrodomestico(Electrodomestico e) {
		this.electrodomesticos.add(e);
	}
	
	public ArrayList<Electrodomestico> getElectrodomesticos() {
		return this.electrodomesticos;
	}
}