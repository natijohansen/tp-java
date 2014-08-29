package datos;
import entidades.Television;
import entidades.Lavarropas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

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
	
	public ArrayList<Electrodomestico> getElectrodomesticos(double min, double max, String consumo) {
		ArrayList<Electrodomestico> filtrado = (ArrayList<Electrodomestico>) electrodomesticos.clone();
		for(Electrodomestico e : filtrado) {
			if(e.getConsumo().getClasificacion().equalsIgnoreCase(consumo) && (e.precioFinal() >= min) && (e.precioFinal() <= max)) {
				continue;
			}
			else {
				filtrado.remove(e);
			}
		}

		this.ordenar(filtrado);
		return filtrado;
	}
	
	public ArrayList<Electrodomestico> getElectrodomesticos(double min, double max) {
		ArrayList<Electrodomestico> filtrado = (ArrayList<Electrodomestico>) electrodomesticos.clone();
		for(Electrodomestico e : filtrado) {
			if((e.precioFinal() >= min) && (e.precioFinal() <= max)) {
				continue;
			}
			else {
				filtrado.remove(e);
			}
		}
		
		this.ordenar(filtrado);
		return filtrado;
	}
	
	public ArrayList<Electrodomestico> getElectrodomesticos(String consumo) {
		ArrayList<Electrodomestico> filtrado = (ArrayList<Electrodomestico>) electrodomesticos.clone();
		for(Electrodomestico e : filtrado) {
			if(e.getConsumo().getClasificacion().equalsIgnoreCase(consumo)) {
				continue;
			}
			else {
				filtrado.remove(e);
			}
		}

		this.ordenar(filtrado);
		return filtrado;
	}
	
	public void borrarElectrodomestico(int index) {
		this.electrodomesticos.remove(index);
	}
	
	public void borrarElectrodomestico(Electrodomestico e) {
		this.electrodomesticos.remove(e);
	}
	
	public Electrodomestico getElectrodomestico(int index) {
		return this.electrodomesticos.get(index);
	}
	
	private void ordenar(ArrayList<Electrodomestico> filtrados) {
		Collections.sort(filtrados, new Comparator() {
			public int compare(Object e1, Object e2) {
				return new Integer(((Electrodomestico) e1).getDescripcion().compareTo(((Electrodomestico) e2).getDescripcion()));
			}
		});
	}
	
}