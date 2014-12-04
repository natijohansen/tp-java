package logica;

import java.util.ArrayList;

import datos.CatalogoElectrodomesticos;

import entidades.Electrodomestico;

public class ControladorListado {
	private CatalogoElectrodomesticos ce;
	
	public ControladorListado() {
		this.ce = CatalogoElectrodomesticos.getCatalogoElectrodomesticos();
	}
	
	public ArrayList<Electrodomestico> buscar(double min, double max, String consumo) {
		return ce.getElectrodomesticos(min, max, consumo);
	}
	
	public ArrayList<Electrodomestico> buscar(double min, double max) {
		return ce.getElectrodomesticos(min, max);

	}
	
	public ArrayList<Electrodomestico> buscar(String consumo) {
		return ce.getElectrodomesticos(consumo);
	}
	
	public ArrayList<Electrodomestico> buscar() {
		return ce.getElectrodomesticos();
	}
}
