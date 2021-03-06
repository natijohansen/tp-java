package datos;
import entidades.Television;
import entidades.Lavarropas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import entidades.Electrodomestico;

public class CatalogoElectrodomesticos {

	private static CatalogoElectrodomesticos ce;

	private ArrayList<Electrodomestico> electrodomesticos = new ArrayList<Electrodomestico>();
	private ElectrodomesticoBD ebd;
	
	public static CatalogoElectrodomesticos getCatalogoElectrodomesticos() {
		if(ce == null) {
			ce = new CatalogoElectrodomesticos(ElectrodomesticoBD.getElectrodomesticoBD());
		}
		return ce;
	}
	
	private CatalogoElectrodomesticos(ElectrodomesticoBD ebd) {
		this.ebd = ebd;
//		for(int i=0; i < 15; i++) {
//			this.addElectrodomestico(GeneradorElectrodomesticos.generar("lavarropas"));
//			this.addElectrodomestico(GeneradorElectrodomesticos.generar("television"));
//		}
	}
	
	public Electrodomestico crearElectrodomestico(double precioBase, double peso, String descripcion, String color, String consumo, double resolucion, boolean tdt) {
		return new Television(precioBase, peso, color, consumo, resolucion, tdt, descripcion);	
	}

	public Electrodomestico crearElectrodomestico(double precioBase, double peso, String color, String consumo, String descripcion, double carga) {
		return new Lavarropas(precioBase, peso, color, consumo, carga, descripcion);
	
	}

	public void addElectrodomestico(Electrodomestico e) {
		this.electrodomesticos.add(e);
		ebd.addElectrodomestico(e);
	}
	
	public ArrayList<Electrodomestico> getElectrodomesticos() {
		this.electrodomesticos = this.ebd.getElectrodomesticos();
		this.ordenar(this.electrodomesticos);
		return this.electrodomesticos;
	}
	
	public ArrayList<Electrodomestico> getElectrodomesticos(double min, double max, String consumo) {
		this.electrodomesticos = this.ebd.getElectrodomesticos();
		ArrayList<Electrodomestico> filtrado = new ArrayList<Electrodomestico>();

		for(Electrodomestico e : this.electrodomesticos) {
			if(e.getConsumo().getClasificacion().equalsIgnoreCase(consumo) && (e.precioFinal() >= min) && (e.precioFinal() <= max)) {
				filtrado.add(e);
			}
		}

		this.ordenar(filtrado);
		return filtrado;
	}
	
	public ArrayList<Electrodomestico> getElectrodomesticos(double min, double max) {
		this.electrodomesticos = this.ebd.getElectrodomesticos();
		ArrayList<Electrodomestico> filtrado = new ArrayList<Electrodomestico>();
		
		for(Electrodomestico e : this.electrodomesticos) {
			if((e.precioFinal() >= min) && (e.precioFinal() <= max)) {
				filtrado.add(e);
			}
		}
		
		this.ordenar(filtrado);
		return filtrado;
	}
	
	public ArrayList<Electrodomestico> getElectrodomesticos(String consumo) {
		this.electrodomesticos = this.ebd.getElectrodomesticos();
		ArrayList<Electrodomestico> filtrado = new ArrayList<Electrodomestico>();
		
		for(Electrodomestico e : this.electrodomesticos) {
			if(e.getConsumo().getClasificacion().equals(consumo)) {
				filtrado.add(e);
			}
		}

		this.ordenar(filtrado);
		return filtrado;
	}
	
	public void borrarElectrodomestico(int index) {
		Electrodomestico e = electrodomesticos.get(index);
		ebd.borrarElectrodomestico(e);
		this.electrodomesticos.remove(index);
	}
	
	public void borrarElectrodomestico(Electrodomestico e) {
		ebd.borrarElectrodomestico(e);
		this.electrodomesticos.remove(e);
	}
	
	public void modificarElectrodomestico(Electrodomestico e, double precioBase, double peso, String descripcion, String color, String consumo, double carga) {
		this.electrodomesticos.remove(e);
		
		ebd.modificarElectrodomestico(e, precioBase, peso, descripcion, color, consumo, carga);
		
		e.setPrecioBase(precioBase);
		e.setPeso(peso);
		e.setDescripcion(descripcion);
		e.setColor(color);
		e.setConsumo(consumo);
		((Lavarropas) e).setCarga(carga);
		
		this.electrodomesticos.add(e);
	}

	public void modificarElectrodomestico(Electrodomestico e, double precioBase, double peso, String descripcion, String color, String consumo, double resolucion, boolean tdt) {
		this.electrodomesticos.remove(e);
		
		ebd.modificarElectrodomestico(e, precioBase, peso, descripcion, color, consumo, resolucion, tdt);
		
		e.setPrecioBase(precioBase);
		e.setPeso(peso);
		e.setDescripcion(descripcion);
		e.setColor(color);
		e.setConsumo(consumo);
		((Television) e).setResolucion(resolucion);
		((Television) e).setTdt(tdt);
		
		this.electrodomesticos.add(e);
	}
	
	public Electrodomestico getElectrodomestico(int index) {
		return this.electrodomesticos.get(index);
	}
	
	public Electrodomestico getElectrodomesticoPorIdBD(int idBD) {
		this.electrodomesticos = this.ebd.getElectrodomesticos();
		for(Electrodomestico e : electrodomesticos) {
			if(e.getIdBD() == idBD) {
				return e;
			}
		}
		return null;
	}
	
	private void ordenar(ArrayList<Electrodomestico> filtrados) {
		Collections.sort(filtrados, new Comparator<Electrodomestico>() {
			public int compare(Electrodomestico e1, Electrodomestico e2) {
				return new Integer(e1.toString().compareTo(e2.toString()));
			}
		});
	}
	
}