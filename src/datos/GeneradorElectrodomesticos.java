package datos;

import entidades.Electrodomestico;
import entidades.Television;
import entidades.Lavarropas;

public class GeneradorElectrodomesticos {
	
	private static String[] marcas = {"Phillips", "Sony", "Drean", "Noblex", "Telefunken", "Hogar"}; 
	
	public static Electrodomestico generar(String tipo) {
		
		double precio = Math.round(Math.random()*500) + 500;
		double peso = Math.round(Math.random()*30) + 10;
		int marca = (int) Math.floor(Math.random()*6);
		
		Electrodomestico e;
		
		if(tipo.equalsIgnoreCase("television")) {
			boolean tdt = Math.random() > 0.5 ? true : false;
			double resolucion = Math.round(Math.random()*40) + 10;

			e = new Television(precio, peso, "blanco", "F", resolucion, tdt, marcas[marca]);
		}
		
		else {
			double carga = Math.round(Math.random()*9) + 3;
			e = new Lavarropas(precio, peso, "blanco", "F", carga, marcas[marca]);
		}		
		
		return e;
	}
}
